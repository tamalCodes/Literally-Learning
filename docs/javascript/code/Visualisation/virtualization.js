const data = [
    {
      id: 1,
      first_name: "Frazier",
      last_name: "Seabright",
      gender: "Male",
    },
    {
      id: 2,
      first_name: "Shae",
      last_name: "McCurtin",
      gender: "Agender",
    },
    {
      id: 3,
      first_name: "Marianna",
      last_name: "Egdale",
      gender: "Female",
    },
    {
      id: 4,
      first_name: "Letti",
      last_name: "Freiberg",
      gender: "Genderqueer",
    },
    {
      id: 5,
      first_name: "Kinna",
      last_name: "Licciardello",
      gender: "Non-binary",
    },
    {
      id: 6,
      first_name: "Frazer",
      last_name: "Marchington",
      gender: "Female",
    },
    {
      id: 7,
      first_name: "Rochester",
      last_name: "Larkkem",
      gender: "Genderfluid",
    },      
  ];
  
  function generateList(ref, data, start, end, rowHt) {
    ref.innerHTML = "";
    [...data].slice(start, end + 1).forEach((row, index) => {
      let div = document.createElement("div");
      div.classList.add("row");
      div.style.height = `${rowHt}px`;
      div.style.top = `${(start + index) * rowHt}px`;
  
      let span = null;
      Object.keys(row).forEach((key) => {
        span = document.createElement("span");
        span.innerText = row[key];
        div.appendChild(span);
      });
      ref.appendChild(div);
    });
  }
  
  function VirtualList(config) {
    const width = config.width;
    const height = config.height;
    const totalRows = config.totalRows || config.data.length;
    const data = config.data;
    const rowHt = config.rowHt;
    const buffer = config.buffer;
  
    let startIdx = 0;
    let lastIdx = Math.ceil(height / rowHt) + buffer - 1;
  
    let scrollBox = document.createElement("div");
    scrollBox.id = "scroll-box";
    scrollBox.style.height = `${height}px`;
    scrollBox.style.width = `${width}px`;
  
    let header = document.createElement("div");
    header.classList.add("header");
    header.style.height = `${rowHt}px`;
  
    let span = null;
  
    Object.keys(data[0]).forEach((key) => {
      span = document.createElement("span");
      span.innerText = key;
      header.appendChild(span);
    });
  
    scrollBox.appendChild(header);
  
    let container = document.createElement("div");
    container.id = "container";
    container.style.height = `${totalRows * rowHt}px`;
  
    generateList(container, data, startIdx, lastIdx, rowHt);
  
    scrollBox.onscroll = function (e) {
      const scrollTop = e.target.scrollTop;
      startIdx = Math.max(Math.floor(scrollTop / rowHt) - buffer, 0);
      lastIdx = Math.min(
        Math.ceil((height + scrollTop) / rowHt) + buffer - 1,
        totalRows - 1
      );
      generateList(container, data, startIdx, lastIdx, rowHt);
    };
  
    scrollBox.appendChild(container);
    return scrollBox;
  }
  
  const list = VirtualList({
    width: 600,
    height: 600,
    totalRows: data.length,
    data,
    rowHt: 40,
    buffer: 5,
  });
  
  document.getElementById("app").appendChild(list);