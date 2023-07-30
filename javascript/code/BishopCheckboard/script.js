const boardContainer = document.getElementsByClassName("board")[0];

// A chessboard normally is 8X8 size. But taking scalability into account we have introduced size parameter.
const size = 8; // You can make user input this.
generateBoard();

//Function for generating the board
function generateBoard() {
    boardContainer.style.gridTemplateColumns = `repeat(${size},80px)`;
    for(let i=1;i<=size;i++) {
        for(let j=1;j<=size;j++) {
            const newBlock = document.createElement("div");
            newBlock.id = `board${String(i)+String(j)}`; // adding id to block in "board[row][col] format"
            newBlock.classList.add("block");
            /*
                Lets take an example for the first row and second row.
                when first row last col index is 8 and the second row first col is index 0
                then (i%2 == j%2) becomes true and we print alternating fashion grid color
            */
            if(i%2 == j%2) {
                newBlock.classList.add("black");
            }
            else {
                newBlock.classList.add("white");
            }
            boardContainer.appendChild(newBlock);
        }
    }
}

//Attaching the mouseover event
boardContainer.addEventListener("mouseover", (e) => {
    let currentIndex = Array.from(boardContainer.children).indexOf(e.target);
    let currRow = Math.floor(currentIndex/size);
    let currCol = Math.floor(currentIndex%size);

    //Every time we hover over a block we remove pre-existing highlighted colors.
    for(let i=1;i<=size;i++) {
        for(let j=1;j<=size;j++) {
            let searchID = `board${i}${j}`;
            let searchBlock = document.getElementById(searchID);
            searchBlock.classList.remove("blue");
        }
    }
    
    /*
        In this step we will move to the diagonal elements to highlight the colors.
    */

    //Down-Right diagonal movement.
    for (let x = currRow, y = currCol; x < size && y < size; x++, y++) {
        addHoverColor(x+1, y+1)
    }

    //Up-Left diagonal movement.
    for (let x = currRow, y = currCol; x >= 0 && y >= 0; x--, y--) {
        addHoverColor(x+1, y+1)
    }

    //Up-Right diagonal movement.
    for (let x = currRow, y = currCol; x < size && y >= 0; x++, y--) {
        addHoverColor(x+1, y+1)
    }

    //Down-Left diagonal movement.
    for (let x = currRow, y = currCol; x >= 0 && y < size; x--, y++) {
        addHoverColor(x+1, y+1)
    }
});

//Function to add the highlight color to the block element
function addHoverColor(i,j) {
    let searchID = `board${i}${j}`;
    let searchBlock = document.getElementById(searchID);
    if(searchBlock) {
        searchBlock.classList.add("blue");
    }
}

//Remove the leftover highligh colors
boardContainer.addEventListener("mouseleave", () => {
    for(let i=1;i<=8;i++) {
        for(let j=1;j<=8;j++) {
            let searchID = `board${i}${j}`;
            let searchBlock = document.getElementById(searchID);
            searchBlock.classList.remove("blue");
        }
    }
})