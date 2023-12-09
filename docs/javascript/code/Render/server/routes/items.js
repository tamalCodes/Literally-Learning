const express = require('express');
const router = express.Router();
const itemsData = require('../data/items.json');

// GET /api/items
router.get('/', (req, res) => {
  res.json(itemsData);
});

module.exports = router;
