let images = ["https://source.unsplash.com/random?landscape,mountain",
"https://source.unsplash.com/random?landscape,cars",
"https://source.unsplash.com/random?landscape,night",
"https://source.unsplash.com/random?landscape,city",
"https://source.unsplash.com/random?landscape,stars",
"https://source.unsplash.com/random?landscape,dessert"];

carousel = (function() {
    let cur = 0;
    let autoSlide = null;
    function el(selector) {
        return document.querySelectorAll(selector)[0];
    }
    function  create(tag) {
        return document.createElement(tag);
    }
    function holder() {return  document.createDocumentFragment();}

    function nextImage() {
        if(cur < images.length -1) {
            cur = cur + 1;
        } else {
            cur = 0;
        }
        setCurrentImage();
        setActiveButton();
    }
    function prevImage() {
        if(cur > 0) {
            cur = cur - 1;
        } else {
            cur = images.length -1;
        }
        setCurrentImage();
        setActiveButton();
    }
    function setCurrentImage() {
        let container = el('#slider-images')
        images= container.children;
        for(var i =0; i < images.length; i++) {
            images[i].id = '';
        }
        images[cur].id = 'current-image'
        images[cur].children[0].style.display='';
    }
    function setActiveButton() {
        let btnContainer = el("#slider-btns");
        let btns = btnContainer.children;
        for(var i = 0; i < btns.length; i++) {
            btns[i].classList.remove('active')
        }
        btns[cur].classList.add('active')
    }
    function setCurValue(e) {
        if(e.target.tagName == 'BUTTON') {
            let {id} = e.target.dataset;
            cur = id;
            setCurrentImage();
            setActiveButton();
            clearInterval(autoSlide)
        }
    }
    function addCarouselButtons() {
        let hold = holder();
        for(var i = 0; i < images.length; i++) {
            let btn = create('button');
            btn.dataset.id = i;
            btn.className = 'round-image-selector';
            hold.appendChild(btn);
        }
        let div = el('#slider-btns');
        div.appendChild(hold);
        div.addEventListener('click', setCurValue);
    }
    function addImages() {
        let hold = holder()
        images.forEach((img, i) => {
            let div = document.createElement('div');
            div.className = 'slider-image-container'
            div.id = i == 0 ? 'current-image':'';
            div.dataset.imgId = i;
            let imgEl = `<img src="${img}"  alt="" class='slider-image' loading='lazy'>`;
            div.innerHTML = imgEl;
            div.children[0].style.display = i == 0 ? 'block':'none';
            hold.appendChild(div);
        })
        let cont = el('#slider-images');
        cont.appendChild(hold);
        setActiveButton();
    }
    function startCarousel() {
       autoSlide = setInterval(nextImage, 2000);
    }
    function main() {
        el('#next-btn').addEventListener('click', nextImage);
        el('#prev-btn').addEventListener('click', prevImage);
        addCarouselButtons();
        addImages();
        startCarousel();
    }
    return {
        'main': main
    }
})()

carousel.main();