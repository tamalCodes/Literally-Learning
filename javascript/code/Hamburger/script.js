function toggleMenu() {
  var menu = document.getElementById("menu");
  var icon = document.querySelector(".hamburger-icon");
  if (menu.style.display === "block") {
    menu.style.display = "none";
    icon.classList.remove("cross"); // Remove cross class to reset to hamburger shape
  } else {
    menu.style.display = "block";
    icon.classList.add("cross"); // Add cross class to change to cross shape
  }
}
