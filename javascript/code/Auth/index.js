const express = require('express');
const passport = require('passport');
const OAuth2Strategy = require('passport-oauth2');
const mongoose = require('mongoose');
require('dotenv').config();

// Connect to MongoDB
mongoose.connect(process.env.MONGODB_URI, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});
const User = mongoose.model('User', new mongoose.Schema({
  username: String,
  email: String,
}));

// Configure OAuth2 strategy
passport.use(new OAuth2Strategy({
  authorizationURL: process.env.OAUTH2_AUTH_URL,
  tokenURL: process.env.OAUTH2_TOKEN_URL,
  clientID: process.env.OAUTH2_CLIENT_ID,
  clientSecret: process.env.OAUTH2_CLIENT_SECRET,
  callbackURL: process.env.OAUTH2_CALLBACK_URL,
}, async (accessToken, refreshToken, profile, done) => {

  let user = await User.findOne({ email: profile.emails[0].value });
  if (!user) {
    user = new User({
      username: profile.displayName,
      email: profile.emails[0].value,
    });
    await user.save();
  }

  return done(null, user);
}));

const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Initialize Passport
app.use(passport.initialize());

// Define API routes
app.get('/api/users', passport.authenticate('oauth2', { session: false }), (req, res) => {
  User.find({}, (err, users) => {
    if (err) {
      return res.status(500).json({ error: 'Internal Server Error' });
    }
    res.json(users);
  });
});

// Start the server
app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
