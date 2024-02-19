---
sidebar_position: 8
description: "Understanding Browsers and CORS."
---

# Browsers


## CORS

CORS (Cross-Origin Resource Sharing) is needed to allow Website A to ask for permission from Website B to access its information. It's like Website A saying, "Hey Website B, can I please see your data?". CORS helps ensure that Website B is okay with this request and allows Website A to access the data if everything checks out.

So, CORS helps keep things secure on the web while still allowing websites to communicate and share information with each other when needed.

## But why do you need these ?

The CORS policy is in place to enhance security on the web and protect users from potential risks that could arise from cross-origin requests.

- **Security**: Without CORS, any website could potentially make requests to other websites on behalf of the user (e.g., reading sensitive data, performing actions, etc.). This could be exploited by malicious websites to steal data or perform harmful actions without the user's knowledge.

- **Privacy**: CORS helps prevent unauthorized access to a user's private data. It ensures that only websites from trusted origins (domains) can access certain resources, like personal information or user accounts.

- **Isolation of Websites**: CORS helps maintain the separation between different websites and their resources. Each website operates in its own "sandbox," and CORS ensures that one website cannot freely interact with or modify resources from another website.

- **Protection against CSRF**: Cross-Site Request Forgery (CSRF) attacks are thwarted by CORS. It prevents attackers from forcing a user's browser to make requests to other websites where the user is authenticated, potentially performing unwanted actions on those sites.

By enforcing the CORS policy, browsers ensure that websites can only interact with resources from their own domain unless explicitly permitted by the server hosting those resources. This way, user data and web interactions remain more secure and controlled, reducing the risk of unauthorized access or malicious activities.

## Understanding how stuffs work

Suppose we have 2 origins, `Origin A` and `Origin B`, so when a request is made from `Origin A` to `Origin B`, the browser will first send a preflight request to `Origin B` to check if it is safe to send the actual request. If `Origin B` allows the preflight request, then the browser will send the actual request to `Origin B`.

The preflight request is an HTTP OPTIONS request that contains the following headers:

- **Access-Control-Request-Method**: The HTTP method of the actual request.

- **Access-Control-Request-Headers**: The headers that will be sent with the actual request.

- **Acess-control-allow-origin**: The origin of the request.

- **Host**: The host of the request.

- **User-Agent**: The user agent of the request.

- **Connection**: The connection of the request.

- **Accept**: The accept of the request.

- **Accept-Encoding**: The accept encoding of the request.


**So does the preflight request is made everytime ?**

No, the preflight request is not made every time for every cross-origin request. It is only made in certain situations, depending on the nature of the cross-origin request and the server's CORS configuration.

The preflight request is made when a cross-origin request meets certain conditions:

- HTTP Methods: If the cross-origin request uses certain HTTP methods other than simple methods, like GET, POST, or HEAD. For example, if the request uses PUT, DELETE, or custom methods, the browser will send a preflight request to check if the server allows the actual request.

- Custom Headers: If the cross-origin request includes custom HTTP headers (non-standard headers), the browser will also trigger a preflight request to verify if the server permits the use of these custom headers in the actual request.

For simple cross-origin requests (e.g., GET or POST without custom headers), the browser doesn't send a preflight request. Instead, it directly sends the actual request to the server, and the server includes appropriate CORS headers in the response, allowing or denying access based on its CORS configuration.

The preflight request helps the server make an informed decision on whether to allow or deny the cross-origin request, ensuring security and protecting against unauthorized access to resources. Once the server responds with the necessary headers during the preflight, subsequent cross-origin requests can be made without the need for additional preflight requests as long as they meet the criteria for simple requests.

## Questions on CORS


### Same-Origin Policy and how CORS relaxes it.

The Same-Origin Policy is a security feature that browsers follow, allowing web pages to only request resources from the same origin as the one from which the web page was served. CORS relaxes this policy by introducing a mechanism that enables servers to specify which other origins are allowed to access their resources. By using specific HTTP headers in the server's response, CORS allows cross-origin requests in a controlled and secure manner.

### HTTP headers involved in a CORS preflight request

The HTTP headers involved in a CORS preflight request are:
 - Origin: Indicates the origin of the web page making the request.
 - Access-Control-Request-Method: Specifies the HTTP method that will be used in the actual request.
 - Access-Control-Request-Headers: Lists the custom headers that will be used in the actual request.

### How does the server respond to a preflight request?

The server can respond to a preflight request by including specific CORS headers in the response. The key header is:
 - Access-Control-Allow-Origin: Specifies the origins that are allowed to access the resource. It can be set to a specific origin or "*" (wildcard) to allow any origin.
 - Access-Control-Allow-Methods: Indicates the HTTP methods allowed for the actual request.
 - Access-Control-Allow-Headers: Lists the custom headers that are allowed in the actual request.

### What are the security implications of not implementing CORS correctly?

Not implementing CORS correctly can lead to security vulnerabilities like Cross-Site Request Forgery (CSRF) attacks, where malicious websites trick users into performing actions on other trusted websites without their consent. It can also expose sensitive data to unauthorized domains, leading to data breaches and privacy violations.


## Is Node.js completely single threaded

Node is a single thread, but some of the functions included in the Node.js standard library(e.g, fs module functions) are not single threaded. i.e, Their logic runs outside of the Node.js single thread to improve the speed and performance of a program.
