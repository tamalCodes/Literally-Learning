// Get all card elements
const cards = document.querySelectorAll(".card");

// Add click event listener to each card
cards.forEach((card) => {
  card.addEventListener("click", () => {
    // Remove "active" class from all cards
    cards.forEach((card) => {
      card.classList.remove("active");
    });

    // Add "active" class to the clicked card
    card.classList.add("active");
    console.log(card);
  });
});
