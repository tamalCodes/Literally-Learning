let currentRating = 0;
const starNumber = 5;
const starContainerElement = document.querySelector(".star-container");

document.addEventListener("DOMContentLoaded" , () => {
    for(let i=1;i<=starNumber;i++) {
        starContainerElement.innerHTML += 
        `       
            <img src="half-star.png" height="100" class="left-half inactive-star star">
            <img src="half-star.png" height="100" class="right-half inactive-star star">
        `;
    }
})

function updateRating(event){
    const tillIndex = Array.prototype.indexOf.call(event.target.parentNode.children, event.target);
    currentRating = (tillIndex+1)/2;
    let starContainerChildren = document.querySelector(".star-container").children;
    for(let i=0;i<starContainerChildren.length;i++){
        if(i <= tillIndex){
            starContainerChildren[i].classList.remove("inactive-star");
            starContainerChildren[i].classList.add("active-star");
        }
        else {
            starContainerChildren[i].classList.remove("active-star");
            starContainerChildren[i].classList.add("inactive-star");
        } 
    }
    document.querySelector(".showrating-field").innerHTML = currentRating;
}