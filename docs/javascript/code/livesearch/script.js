const users = document.querySelector('.user-list');
const userName = document.querySelector("#user");

const userArr = [];

const getUserData = async () => {
    console.log("Called")
    try {

        const res = await fetch('https://api.github.com/users');
        const data = await res.json();

        if (data) {
            users.innerHTML = ""
        }

        data.map((user) => {
            const li = document.createElement('li');

            userArr.push(li);

            li.insertAdjacentHTML('afterbegin',
                `
                <div class="user-data">
                    <img src=${user.avatar_url} alt=${user.avatar_url} srcset="">
                    <div>
                        <p>${user.login}</p>
                        <a href=${user.html_url} target="_blank">${user.html_url}</a>
                    </div>
                 </div>
                `
            )

            users.appendChild(li);

        })

    } catch (error) {
        console.log(error);
    }
}
getUserData();

//!----------------------------------------------------- DEBOUNCE LOGICS 👇 ---------------------------------------------------------------

const userInput = document.getElementById("userinput");

// this is your main function that will be doing tasks, api calls and what not
const filterElements = (targetValue) => {
    console.log("Hi, I was called 👉 ", targetValue);

    userArr.filter((curElem) => {
        curElem.innerText.toLowerCase().includes(targetValue.toLowerCase()) ?
            curElem.classList.remove('hide') :
            curElem.classList.add('hide')
    })
};

// this is the core logic
const debounce = (callback, delay) => {
    let timer;
    return (...args) => {
        clearTimeout(timer);
        timer = setTimeout(() => {
            callback(...args);
        }, delay);
    };
};

const debouncedFilter = debounce(filterElements, 1000);

// Add event listener with the debounced function
userInput.addEventListener("input", () => {
    const inputText = userInput.value.trim();
    debouncedFilter(inputText);
});
