function toggleCheckboxes() {
    // Get the master checkbox
    const masterCheckbox = document.getElementById("masterCheckbox");
    
    // Get all the checkboxes with the class "subCheckbox"
    const subCheckboxes = document.getElementsByClassName("subCheckbox");
    
    // If the master checkbox is checked, check all sub checkboxes
    if (masterCheckbox.checked) {
        for (let i = 0; i < subCheckboxes.length; i++) {
            subCheckboxes[i].checked = true;
        }
    } else {
        // If the master checkbox is unchecked, uncheck all sub checkboxes
        for (let i = 0; i < subCheckboxes.length; i++) {
            subCheckboxes[i].checked = false;
        }
    }
}
