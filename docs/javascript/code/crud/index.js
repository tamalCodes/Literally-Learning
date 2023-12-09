const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

// MongoDB connection
mongoose.connect('mongodb+srv://jyotirmoyroy649:kqZNZLNKcdds4krH@cluster0.7knkxkk.mongodb.net/items?retryWrites=true&w=majority', { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => console.log('MongoDB connected'))
  .catch(err => console.log(err));

// Item schema
const itemSchema = new mongoose.Schema({
  name: String,
  description: String
});

const Item = mongoose.model('Item', itemSchema);

// Middleware
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Routes
const router = express.Router();

// GET all items
router.get('/items', (req, res) => {
  Item.find()
    .then(items => {
      res.json(items);
    })
    .catch(err => {
      res.status(500).send(err);
    });
});


// GET single item
router.get('/items/:id', (req, res) => {
  Item.findById(req.params.id)
    .then(item => {
      if (!item) {
        res.status(404).json({ message: 'Item not found' });
      } else {
        res.json(item);
      }
    })
    .catch(err => {
      res.status(500).send(err);
    });
});


// POST new item
router.post('/items', (req, res) => {
  const newItem = new Item(req.body);
  newItem.save()
    .then(item => {
      res.json(item);
    })
    .catch(err => {
      res.status(500).send(err);
    });
});


// PUT update item
router.put('/items/:id', (req, res) => {
  Item.findByIdAndUpdate(req.params.id, req.body, { new: true })
    .then(item => {
      if (!item) {
        res.status(404).json({ message: 'Item not found' });
      } else {
        res.json(item);
      }
    })
    .catch(err => {
      res.status(500).send(err);
    });
});


// DELETE item
router.delete('/items/:id', (req, res) => {
  Item.findByIdAndRemove(req.params.id)
    .then(() => {
      res.json({ message: 'Item deleted' });
    })
    .catch(err => {
      res.status(500).send(err);
    });
});


app.use('/api', router);

// Start the server
app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});
