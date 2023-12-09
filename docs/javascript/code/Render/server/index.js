const express = require('express');
const cors = require('cors');
const itemsRouter = require('./routes/items');

const app = express();
const port = 3001;

// Enable CORS
app.use(cors());

// Middleware to parse JSON request bodies
app.use(express.json());

// Routes
app.use('/api/items', itemsRouter);

// Add a catch-all route for handling undefined routes
app.get('*', (req, res) => {
  res.status(404).send('Not Found');
});

// Start the server
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
