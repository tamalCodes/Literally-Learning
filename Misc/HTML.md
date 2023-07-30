# HTML

### Difference between "async" and "defer" in JavaScript

Both "async" and "defer" are attributes used in HTML script tags to control the loading and execution of external JavaScript files.

"async" in JavaScript:

- The "async" attribute allows a script to be downloaded asynchronously, which means it won't block the page rendering and will execute as soon as it's available, potentially disrupting the loading order.

"defer" in JavaScript:

- The "defer" attribute also loads the script asynchronously, but it ensures the script execution occurs after the entire document has been parsed, maintaining the order of appearance in the HTML and preventing rendering interruption.

---

### What are semantic tags in HTML and its benefits.

Semantic tags in HTML are elements that carry meaning and convey the structure of the content they enclose. Unlike non-semantic tags like div and span, which are generic containers, semantic tags provide contextual information about the content they wrap.

Some examples:

< header >, < nav >, < main >, < article >, < section >, < aside >, < footer >

---

### Use of !Doctype.

The <!DOCTYPE> declaration is an instruction used in HTML documents to specify the version of HTML being used and the document type definition (DTD) to which the markup adheres, essential for browsers to understand how to interpret the HTML document correctly.

---

### Unique tags and features in HTML 5

< canvas >, < video >, < audio >, < svg >, < article >, < section >, < aside >, < header >, < footer >, < nav >, < progress >

---

### Differentiate between div and span?

| Aspect          | `<div>`                                                                                                                       | `<span>`                                                                                                     |
| --------------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------ |
| Purpose         | It is utilized for separating the elements that are block-line, line break before and after it.                               | Span is utilized for grouping inline elements in the HTML document.                                          |
| Attributes      | It contains global attributes for certain elements in HTML documents.                                                         | It includes certain, global, and event attributes.                                                           |
| Usage with Para | At times `<p>` tag is utilized for the inner side of the `<div>` tag.                                                         | In a paragraph, `<span>` tag is utilized to apply a CSS style for certain words with the selected font sets. |
| Styling         | In `<div>` tag, we make use of borders with width and height, with specified color pixels to emphasize the frontend document. | In the `<span>` tag, we utilize specified color coding to depict the frontend document.                      |

Please note that Markdown tables might not support the advanced formatting seen in the original text (e.g., line breaks), but I have tried to represent the information as closely as possible.

---

### What is ClickJacking?

ClickJacking is a security attack where the user is fooled to click on something while
they assume they are clicking another thing. The attack mostly happens by the HTML
frames. ClickJacking is also regarded as the user interface redressing. It lets the user
think that they are utilising a normal UI in the web page, but in actuality, there is an
unseen UI in control; you can think of it as the user interface being redressed. When
users click on one thing, assuming it to be secure and safe, the hidden UI executes
another action.

---

### What is Progressive Rendering?

Progressive rendering is a process that is utilized generally to boost the web page's
rendering content process. Now the rendering process is utilized in modern web
development to enhance the mobile data uses of the user, async HTML fragments,
prioritizing visible content, and lazy loading of images
