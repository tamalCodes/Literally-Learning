// Function to toggle dark theme
function toggleDarkTheme() {
    const body = document.body;
    body.classList.toggle('dark-theme');
}

// Add event listener to the theme toggle checkbox
const themeToggle = document.getElementById('theme-toggle');
themeToggle.addEventListener('change', toggleDarkTheme);

// Check the current theme and set the checkbox accordingly
function setThemeBasedOnLocalStorage() {
    const body = document.body;
    const isDarkTheme = localStorage.getItem('darkTheme') === 'true';
    body.classList.toggle('dark-theme', isDarkTheme);
    themeToggle.checked = isDarkTheme;
}

// Set the initial theme based on local storage when the page loads
setThemeBasedOnLocalStorage();
