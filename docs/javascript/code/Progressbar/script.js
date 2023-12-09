const containerElement = document.querySelector(".container");
let count=0;

//While clicking the add button we want to have a count of how many times the user has clicked the button.
document.querySelector(".btn-add").addEventListener("click" , () => {
    //Initially fire the function becasue the count is zero.
    if(!count) {
        add();
    }
    //If the count is not zero then keep increasing the count.
    count++;
});

function add() {
    const prgBar = document.createElement("div");
    prgBar.classList.add("progress-bar");
    containerElement.appendChild(prgBar);
    //Start the transition after couple of seconds so that the transition kicks in.
    setTimeout(() => {
        prgBar.style.width = "100%";
    },500);
    //On transition end decease the count and if still the count is more than zero create another progressbar.
    prgBar.addEventListener("transitionend" , () => {
        count--;
        if(count) {
            add();
        }
    });
}
