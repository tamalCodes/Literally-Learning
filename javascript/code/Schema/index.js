const mongoose = require('mongoose');
mongoose.connect('mongodb+srv://jyotirmoyroy649:kqZNZLNKcdds4krH@cluster0.7knkxkk.mongodb.net/?retryWrites=true&w=majority', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

const userSchema = new mongoose.Schema({
  username: String,
  email: String,
  age: Number,
});

const User = mongoose.model('User', userSchema);

function createUser(username, email, age) {
  const user = new User({
    username,
    email,
    age,
  });

  user.save()
    .then(() => console.log('User created successfully'))
    .catch((err) => console.error('Error creating user:', err));
}
