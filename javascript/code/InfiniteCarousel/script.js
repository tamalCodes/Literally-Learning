const contentContainer = document.getElementById("content-container");
let currentPage = 1;

function fetchContent(page) {
  // Replace this with your API endpoint or function to fetch data from the server.
  // For simplicity, we'll just use a placeholder function that returns mock data.
  const mockData = [
    `Item ${(page - 1) * 4 + 1}`,
    `Item ${(page - 1) * 4 + 2}`,
    `Item ${(page - 1) * 4 + 3}`,
    `Item ${(page - 1) * 4 + 4}`
  ];

  return new Promise((resolve) => {
    setTimeout(() => resolve(mockData), 500); // Simulate an API delay of 500ms
  });
}

async function loadNextPage() {
  const data = await fetchContent(currentPage);
  if (data.length === 0) {
    // No more data to load
    return;
  }

  data.forEach((item) => {
    const contentDiv = document.createElement("div");
    contentDiv.classList.add("content");
    contentDiv.textContent = item;
    contentContainer.appendChild(contentDiv);
  });

  currentPage++;
}

function handleScroll() {
  const {
    scrollTop,
    scrollHeight,
    clientHeight
  } = document.documentElement;

  if (scrollTop + clientHeight >= scrollHeight - 5) {
    // Load more content when the user is near the bottom
    loadNextPage();
  }
}

// Attach the handleScroll function to the scroll event
window.addEventListener("scroll", handleScroll);

// Load the initial page
loadNextPage();
