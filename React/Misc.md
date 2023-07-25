<!-- TOC -->

- [Are props immutable, if so , then why ?](#are-props-immutable-if-so--then-why-)
- [Now forget react, if we want to change props like mutate regardless of the state in parent, how can we do it , let's say in Js ?](#now-forget-react-if-we-want-to-change-props-like-mutate-regardless-of-the-state-in-parent-how-can-we-do-it--lets-say-in-js-)
- [Are objects passed by reference or by value ?](#are-objects-passed-by-reference-or-by-value-)
- [What is the difference between a controlled and uncontrolled component ?](#what-is-the-difference-between-a-controlled-and-uncontrolled-component-)
- [What is lazy loading (in depth) ?](#what-is-lazy-loading-in-depth-)
- [What is DOM ?](#what-is-dom-)
  - [Virtual DOM in react](#virtual-dom-in-react)
- [What is a HOC in react ?](#what-is-a-hoc-in-react-)
  - [How does hooks replace Higher order components ?](#how-does-hooks-replace-higher-order-components-)
- [What is a render prop in react ?](#what-is-a-render-prop-in-react-)
  - [How did it get replaced in mordern day react ?](#how-did-it-get-replaced-in-mordern-day-react-)

<!-- /TOC -->

# Are props immutable, if so , then why ? 

In React, props are typically passed down from parent components to child components, and they are considered immutable. This means that the value of a prop passed to a component cannot be changed by that component.

The reason for this immutability is that it helps to ensure that the flow of data within a React application is predictable and easy to reason about. When a parent component passes a prop to a child component, it can be confident that the value of that prop will not change unexpectedly. This makes it easier to understand how changes in the parent component can affect the child components.

Additionally, immutability can help to optimize performance in React applications. When a component receives a new prop, React can quickly determine whether the component needs to be re-rendered based on the new value of the prop. If the prop is mutable, React would need to perform additional checks to determine whether the value has actually changed, which could be more computationally expensive.

Overall, the immutability of props in React is an important design decision that helps to ensure the predictability and performance of React applications.

# Now forget react, if we want to change props like mutate regardless of the state in parent, how can we do it , let's say in Js ? 

In JavaScript, objects are mutable by default, including objects passed as props. This means that if a component receives an object as a prop, it can modify that object directly. However, this is generally not recommended, as it can make the flow of data within the application more difficult to reason about.

If you need to change a prop value in a way that does not affect the parent state, you can create a copy of the object and modify the copy instead of the original. This can be achieved using various techniques such as the spread operator or the Object.assign() method.

```js
function MyComponent(props) {
  const modifiedProps = { ...props, someProp: "new value" };
  // use modifiedProps in the component
}
```

In this example, a new object is created using the spread operator, with all the properties of the original props object and a new value for the someProp property.

It's important to note that while this approach can work in some cases, it can still make the flow of data more difficult to reason about. It's generally recommended to keep props immutable and rely on state management techniques such as React state or Redux for managing component state.

# Are objects passed by reference or by value ?

In JavaScript, objects are passed by reference. This means that when an object is passed to a function, the function receives a reference to the object, rather than a copy of the object.

This means that if the function modifies the object, the changes will be visible outside of the function. For example:

```js
const myObject = { name: "John" };

function modifyObject(obj) {
  obj.name = "Jane";
}

modifyObject(myObject);

console.log(myObject.name); // "Jane"
```

In this example, the modifyObject() function receives a reference to the myObject object. When the function modifies the name property of the object, the change is visible outside of the function.



# What is the difference between a controlled and uncontrolled component ?

In React, a controlled component is a component that manages its own state and renders based on that state. This means that the component's state is updated using the setState() method, and the component's render method is not called directly.

An uncontrolled component, on the other hand, is a component that does not manage its own state. Instead, the component's state is managed by the DOM, and the component's render method is called directly.


# What is lazy loading (in depth) ?

Lazy loading is a technique in web development where we defer loading of non-critical resources until they are needed. This can help to improve the performance of a web page, by reducing the amount of data that needs to be loaded initially, and allowing the page to load faster.

Lazy loading is particularly useful for web pages that have a lot of resources, such as large images, videos, or scripts, that are not needed immediately. By deferring the loading of these resources until they are needed, we can reduce the initial load time of the page, and improve the user experience.

There are several ways to implement lazy loading in web development:

- Lazy loading images: This involves deferring the loading of images until they are needed, such as when the user scrolls down to the part of the page where the image is located. This can be achieved using JavaScript libraries such as LazyLoad, which can automatically detect when an image is in the viewport and load it on demand.

- Lazy loading scripts: This involves deferring the loading of JavaScript files until they are needed, such as when a user interacts with a certain part of the page. This can be achieved using defer or async attributes on the script tag, or by using JavaScript libraries such as LoadJS.

- Lazy loading modules: This involves deferring the loading of JavaScript modules until they are needed, such as when a user navigates to a certain part of the website. This can be achieved using dynamic imports in JavaScript, which allow us to load a module on demand when it is needed.

By implementing lazy loading, we can improve the performance of our web pages and provide a better user experience for our users. However, it's important to be careful not to overdo it, as lazy loading can add complexity to our code and can also have negative effects on SEO if not implemented correctly.

# What is DOM ? 

DOM stands for Document Object Model. It's a programming interface for HTML and XML documents, which provides a structured representation of the document as a tree-like structure. In other words, the DOM is a way for programs to access and manipulate the content and structure of a web page.

When a web page is loaded into a web browser, the browser creates a DOM tree based on the HTML and CSS code in the page. The DOM tree is made up of a series of nodes, each of which represents an element, attribute, or piece of content in the web page.

The DOM provides a set of APIs that allow developers to interact with the web page through the DOM tree. For example, we can use the DOM API to read or modify the content of a web page, add or remove elements from the page, and respond to user interactions like clicks or keystrokes.

## Virtual DOM in react

The Virtual DOM in React is an abstraction of the HTML DOM that is managed by React. It's a lightweight copy of the actual DOM tree, which allows React to keep track of changes to the UI and update the actual DOM only when necessary.

When we use React to build a UI, we don't directly manipulate the actual HTML DOM tree. Instead, we write JSX code that describes the UI components and their relationships to each other. React then uses this JSX code to create a Virtual DOM tree, which is a plain JavaScript object that represents the structure of the UI.

When we make changes to the UI, **React first updates the Virtual DOM tree** by comparing the previous version of the tree to the new version of the tree. This process is known as reconciliation. React then figures out the minimum number of changes required to update the actual DOM to match the new Virtual DOM tree. Finally, React updates the actual DOM with the necessary changes.

**By using the Virtual DOM**, React can optimize the process of updating the UI and avoid unnecessary re-renders of components. Because the Virtual DOM is a lightweight copy of the actual DOM, it's faster to update and manipulate. Additionally, because React only updates the actual DOM when necessary, it can avoid expensive operations like reflow and repaint, which can improve performance.

Overall, the Virtual DOM is a key part of what makes React a high-performance and efficient framework for building UIs.


# What is a HOC in react ?

A higher-order component (HOC) is a function that takes a component as an argument and returns a new component. HOCs are commonly used to implement cross-cutting concerns such as logging, error handling, and authentication.

These are not much used in react now a days as we have hooks to do the same.

```js
import React from 'react';

function withLogging(WrappedComponent) {
  return function WithLogging(props) {
    console.log('Component render');
    return <WrappedComponent {...props} />;
  };
}

function MyComponent() {
  return <div>Hello</div>;
}

export default withLogging(MyComponent);
```

## How does hooks replace Higher order components ?

In React, Higher Order Components (HOCs) have been a popular way to share behavior between components or enhance component functionality. However, with the introduction of React Hooks, there is an alternative and more flexible approach to achieve similar results without the need for HOCs.

React Hooks allow you to add state and other React features to functional components, which were previously only possible with class components. Hooks are functions that let you "hook into" React state and lifecycle features from function components. The most commonly used hook is the useState hook, which allows you to add state to a functional component.

By using hooks, you can achieve the same functionality as HOCs, but with a simpler and more concise syntax. Hooks provide a way to reuse stateful logic between components without introducing unnecessary complexity. Hooks also promote a more functional programming style, making it easier to reason about the component's behavior and test it in isolation.

For example, let's say you have a component that needs to manage a local state and handle some side effects, such as fetching data from an API. With HOCs, you might need to create separate HOCs for state management and side effects and then wrap your component with those HOCs. This can lead to a higher level of nesting and harder-to-read code.

With hooks, you can achieve the same result using the useState and useEffect hooks directly within your functional component. The state can be managed using the useState hook, and side effects can be handled using the useEffect hook. This approach keeps the code self-contained and eliminates the need for extra layers of abstraction.

Here's an example to demonstrate how hooks can replace HOCs:

```js
// Higher Order Component (HOC) approach
const withDataFetching = (WrappedComponent) => {
  class WithDataFetching extends React.Component {
    // HOC manages state and side effects
    state = {
      data: null,
      isLoading: true,
      error: null,
    };

    componentDidMount() {
      // Fetch data and update state accordingly
      fetchData()
        .then(data => this.setState({ data, isLoading: false }))
        .catch(error => this.setState({ error, isLoading: false }));
    }

    render() {
      const { data, isLoading, error } = this.state;

      // Renders the wrapped component with the fetched data, loading state, and error
      return (
        <WrappedComponent data={data} isLoading={isLoading} error={error} />
      );
    }
  }

  return WithDataFetching;
};

// Usage of the HOC
const MyComponent = ({ data, isLoading, error }) => {
  // Render the component based on the fetched data, loading state, and error
  return (
    // JSX rendering here
  );
};

const WrappedComponent = withDataFetching(MyComponent);

// Functional Component with Hooks approach
const MyComponent = () => {
  const [data, setData] = useState(null);
  const [isLoading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    // Fetch data and update state accordingly
    fetchData()
      .then(data => {
        setData(data);
        setLoading(false);
      })
      .catch(error => {
        setError(error);
        setLoading(false);
      });
  }, []);

  // Render the component based on the fetched data, loading state, and error
  return (
    // JSX rendering here
  );
};
```

As you can see, the hooks approach eliminates the need for a separate HOC and provides a more straightforward way to manage state and side effects directly within the functional component. This simplification and encapsulation of logic make hooks a powerful replacement for HOCs in many cases.


# What is a render prop in react ?

Render props in React is a technique where a component accepts a function as a prop and uses that function to render its content. The function (render prop) is called by the component, passing it the necessary data and behavior, allowing the component's content to be dynamically generated by the function. It provides a flexible way to share code and pass behavior between components.

## How did it get replaced in mordern day react ?

In modern-day React, render props have been largely replaced by other patterns, such as React hooks and component composition. Render props were a popular technique in earlier versions of React to share behavior between components, but they can lead to complex nesting and boilerplate code.

With the introduction of React hooks, specifically the useContext and useReducer hooks, and the increased emphasis on component composition, developers now have more elegant and scalable alternatives to achieve similar results without relying on render props.

React hooks allow for encapsulating stateful logic and reusing it across components using custom hooks. This promotes a more modular and composable approach, where functionality can be encapsulated in custom hooks and easily shared between components.

Additionally, component composition patterns, such as the use of higher-order components (HOCs), renderless components, or even just plain function composition, offer cleaner and more flexible ways to share behavior and achieve code reuse compared to the render props pattern.

While render props are still a valid technique in React, the shift towards hooks and component composition patterns provides more concise and expressive alternatives that have become the preferred choices for code organization and sharing behavior in modern React applications.

