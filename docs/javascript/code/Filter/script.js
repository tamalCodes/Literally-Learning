document.getElementById("filterInput").addEventListener("keyup", filterTable);

function filterTable() {
    const input = document.getElementById("filterInput");
    const filter = input.value.toUpperCase();
    const table = document.getElementById("myTable");
    const rows = table.getElementsByTagName("tr");

    for (let i = 1; i < rows.length; i++) { // Start from 1 to skip the header row
        const nameCell = rows[i].getElementsByTagName("td")[0];
        if (nameCell) {
            const nameText = nameCell.textContent || nameCell.innerText;
            if (nameText.toUpperCase().indexOf(filter) > -1) {
                rows[i].style.display = "";
            } else {
                rows[i].style.display = "none";
            }
        }
    }
}
