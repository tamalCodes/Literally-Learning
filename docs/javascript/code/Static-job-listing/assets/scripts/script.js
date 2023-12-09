async function fetchData() {
  const response = await fetch("assets/scripts/data.json");
  const data = await response.json();
  console.log(data);
  return data;
}

function createListingNode(jobListing) {
  let listing = document.createElement("div");
  listing.classList.add("jobList");
  listing.id = jobListing.id;
  if (jobListing.featured) {
    listing.classList.add("darkBorderLeft");
  }
  let companyLogo = createCompanyLogo(jobListing);
  let jobDescription = createJobDescriptionElement(jobListing);
  let jobTags = createJobTagsElement(jobListing);
  listing.append(companyLogo, jobDescription, jobTags);

  return listing;
}

function createJobDescriptionElement(jobListing) {
  let jobDescription = document.createElement("div");
  jobDescription.classList.add("jobDescription");

  let companyDescription = createCompanyDescription(jobListing);

  let jobPosition = createCustomElement(
    "div",
    "jobPosition",
    jobListing.position
  );

  let aboutJob = createAboutJobElement(jobListing);
  jobDescription.append(companyDescription, jobPosition, aboutJob);

  return jobDescription;
}

function createCompanyDescription(jobListing) {
  let companyName = createCustomElement(
    "div",
    "companyName",
    jobListing.company
  );
  let companyDescription = createCustomElement("div", "companyDescription");
  companyDescription.appendChild(companyName);

  if (jobListing.new) {
    let newJobPost = createCustomElement("div", "newPosting pillShape", "NEW!");
    companyDescription.appendChild(newJobPost);
  }

  if (jobListing.featured) {
    let featuredPost = createCustomElement(
      "div",
      "featuredPosting pillShape",
      "FEATURED"
    );
    companyDescription.appendChild(featuredPost);
  }
  return companyDescription;
}

function createAboutJobElement(jobListing) {
  let aboutJob = createCustomElement("div", "aboutJob");

  let postedAt = createCustomElement(
    "div",
    "aboutJobDetail",
    jobListing.postedAt
  );
  let contract = createCustomElement(
    "div",
    "aboutJobDetail",
    jobListing.contract
  );
  let location = createCustomElement(
    "div",
    "aboutJobDetail",
    jobListing.location
  );
  let dotElement1 = createCustomElement("div", "dotElement", ".");
  let dotElement2 = createCustomElement("div", "dotElement", ".");

  aboutJob.append(postedAt, dotElement1, contract, dotElement2, location);
  return aboutJob;
}

function createJobTagsElement(jobListing) {
  let jobTags = createCustomElement("div", "jobTags");
  let roleTag = createTag(jobListing.role);
  let levelTag = createTag(jobListing.level);
  let languagesTags = jobListing.languages.map((listing) => createTag(listing));
  let toolsTags = jobListing.tools.map((listing) => createTag(listing));
  jobTags.append(roleTag, levelTag, ...toolsTags, ...languagesTags);
  return jobTags;
}

function createTag(content) {
  let tag = createCustomElement("div", "jobTag", content);
  tag.addEventListener("click", (e) => {
    App.setState(() => {
      if (!App.state.filterTags.includes(content)) {
        App.state.filterTags.push(content);
      }
    });
  });
  return tag;
}

function createCustomElement(tagName, className, innerText) {
  let element = document.createElement(tagName);
  if (className) {
    let classNames = className.split(" ");
    classNames.forEach((cssClass) => {
      element.classList.add(cssClass);
    });
  }
  if (innerText) {
    element.innerText = innerText;
  }
  return element;
}

function createCompanyLogo(jobListing) {
  let companyLogo = createCustomElement("div", "companyLogo");
  let img = document.createElement("img");
  img.src = `assets/${jobListing.logo}`;
  companyLogo.append(img);
  return companyLogo;
}

function createFilterNode(tagContent) {
  let tag = createCustomElement("div", "filterTag");
  let filterContent = createCustomElement("div", "filterContent", tagContent);
  let filterCross = createCustomElement("div", "filterCross", "X");
  filterCross.addEventListener("click", (e) => {
    App.setState(() => {
      let filters = App.state.filterTags;
      App.state.filterTags = filters.filter((filter) => filter != tagContent);
    });
  });
  tag.append(filterContent, filterCross);
  return tag;
}

function createfilterContainer(filters) {
  let filtertagsContainer = createCustomElement("div", "filterContainer");

  let filtertagsBox = createCustomElement("div", "filterBox");
  filtertagsBox.append(...filters);
  let clearFilterBox = createCustomElement("div", "clearBox");
  let clearFilter = createCustomElement("div", "clearFilter", "Clear");
  clearFilter.addEventListener("click", (e) => {
    App.setState(() => {
      App.state.filterTags = [];
    });
  });
  clearFilterBox.append(clearFilter);
  filtertagsContainer.append(filtertagsBox, clearFilterBox);
  return filtertagsContainer;
}
const App = {
  state: {},
  async init() {
    const listings = await fetchData();
    this.setState(() => {
      this.state.listings = listings;
      this.state.filterTags = [];
    });
  },
  setState(callback) {
    callback();
    this.render();
  },
  render() {
    const listing = this.state.listings;
    const filteredList = listing.filter((jobListing) => {
      let tags = [
        jobListing.role,
        jobListing.level,
        ...jobListing.languages,
        ...jobListing.tools,
      ];
      return this.state.filterTags.every((t) => tags.includes(t));
    });

    const nodes = filteredList.map(createListingNode);
    const listingContainer = document.getElementById("jobListingContainer");
    listingContainer.replaceChildren(...nodes);

    const filterTags = this.state.filterTags.map(createFilterNode);
    let filterContent = createfilterContainer(filterTags);
    const filterContainer = document.getElementById("jobListingFilter");
    filterContainer.replaceChildren(filterContent);
    if (this.state.filterTags.length == 0) {
      filterContainer.style.visibility = "hidden";
    } else {
      filterContainer.style.visibility = "";
    }
  },
};

App.init();
