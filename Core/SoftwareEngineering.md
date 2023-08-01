<!-- TOC -->

- [What is Software Engineering?](#what-is-software-engineering)
- [What are the engineering practices for software engineering ?](#what-are-the-engineering-practices-for-software-engineering-)
- [What is Software Development Life Cycle](#what-is-software-development-life-cycle)
- [Models in Software engineering](#models-in-software-engineering)
    - [Classic Waterfall model in Software Engineering](#classic-waterfall-model-in-software-engineering)
        - [Advantages and Disadvantages of Classic Waterfall model in Software Engineering](#advantages-and-disadvantages-of-classic-waterfall-model-in-software-engineering)
        - [Usecases of the waterfall model](#usecases-of-the-waterfall-model)
    - [Iterative Waterfall Model](#iterative-waterfall-model)
        - [Advantages and Disadvantages of Iterative Waterfall Model in Software Engineering](#advantages-and-disadvantages-of-iterative-waterfall-model-in-software-engineering)
    - [SDLC V-Model](#sdlc-v-model)
        - [Advantages and Disadvantages of SDLC V-Model in Software Engineering](#advantages-and-disadvantages-of-sdlc-v-model-in-software-engineering)
    - [Agile Model](#agile-model)
        - [Advantages and Disadvantages of Agile Model in Software Engineering](#advantages-and-disadvantages-of-agile-model-in-software-engineering)
    - [Spiral Model](#spiral-model)
        - [Disadvantages of Spiral Model in Software Engineering](#disadvantages-of-spiral-model-in-software-engineering)
    - [RAD Models](#rad-models)
        - [Advantages and Disadvantages of RAD Models in Software Engineering](#advantages-and-disadvantages-of-rad-models-in-software-engineering)
- [What is Software prototyping and POC?](#what-is-software-prototyping-and-poc)
- [What is SRS?](#what-is-srs)
- [What are CASE tools?](#what-are-case-tools)
- [What is the feasibility study?](#what-is-the-feasibility-study)
- [Define black box testing and white box testing?](#define-black-box-testing-and-white-box-testing)
- [What is Concurrency?](#what-is-concurrency)
- [What are Software Metrics?](#what-are-software-metrics)
- [What is Data Flow Diagram?](#what-is-data-flow-diagram)
- [What are functional and non-functional requirements?](#what-are-functional-and-non-functional-requirements)
- [What is Cohesion and Coupling?](#what-is-cohesion-and-coupling)
- [What is reverse engineering?](#what-is-reverse-engineering)
- [What are the elements to be considered in the System Model Construction?](#what-are-the-elements-to-be-considered-in-the-system-model-construction)
- [What is COCOMO model?](#what-is-cocomo-model)
- [What is level-0 DFD?](#what-is-level-0-dfd)
- [What is physical DFD?](#what-is-physical-dfd)
- [What is the black hole concept in DFD?](#what-is-the-black-hole-concept-in-dfd)
- [What is the difference between Risk and Uncertainty?](#what-is-the-difference-between-risk-and-uncertainty)
- [What is a use case diagram?](#what-is-a-use-case-diagram)
- [Which model is used to check software reliability?](#which-model-is-used-to-check-software-reliability)
- [What is CMM?](#what-is-cmm)
- [Define adaptive maintenance?](#define-adaptive-maintenance)
- [What is regression testing?](#what-is-regression-testing)

<!-- /TOC -->

# What is Software Engineering?

Software Engineering is a discipline that focuses on designing, developing, and maintaining software systems. It involves applying engineering principles, methods, and tools to create reliable, efficient, and high-quality software solutions for various domains and user requirements.



# What are the engineering practices for software engineering ?

Engineering practices for software engineering can be summarized in the following key principles:

1. **Requirements Engineering:** Thoroughly understand and document the needs and expectations of the software system's stakeholders.

2. **Design and Architecture:** Create a well-thought-out, modular, and scalable design that meets the requirements and allows for flexibility and maintainability.

3. **Code Quality:** Write clean, readable, and maintainable code adhering to coding standards and best practices. Utilize code reviews and automated testing to ensure quality.

4. **Version Control:** Use a version control system (e.g., Git) to manage source code changes, enabling collaboration, tracking history, and facilitating bug fixes and feature development.

5. **Testing and Quality Assurance:** Implement comprehensive testing strategies, including unit tests, integration tests, and system tests, to ensure software reliability, functionality, and performance.

6. **Continuous Integration and Deployment:** Automate the build, testing, and deployment processes to achieve frequent and reliable software releases, allowing for rapid feedback and iteration.

7. **Documentation:** Create clear and concise documentation for the software system, including user manuals, API documentation, and technical specifications.

8. **Bug Tracking and Issue Management:** Utilize a bug tracking system (e.g., Jira) to track and manage reported issues, ensuring they are resolved efficiently and effectively.

9. **Security and Privacy:** Incorporate security measures into the software development process, such as secure coding practices, vulnerability assessments, and data protection mechanisms.

10. **Collaboration and Communication:** Foster effective communication and collaboration within the development team and with stakeholders, promoting knowledge sharing, transparency, and alignment.

By following these engineering practices, software engineering teams can build high-quality, reliable, and maintainable software systems.



# What is Software Development Life Cycle

The Software Development Life Cycle (SDLC) is a structured approach that outlines the stages involved in the development of software. Although specific methodologies and models may vary, the typical SDLC consists of the following phases:

1. **Requirements Gathering:** In this phase, software requirements are gathered by engaging with stakeholders and end-users. The goal is to understand the desired functionality, constraints, and objectives of the software.

2. **System Design:** In this phase, the overall system architecture and detailed design are created based on the gathered requirements. The design includes various components, modules, data structures, and interfaces.

3. **Implementation:** This phase involves coding and development activities. Developers write code based on the design specifications, following coding standards and best practices. Unit testing is typically performed to validate the individual components.

4. **Testing:** This phase focuses on verifying the software's functionality and ensuring it meets the specified requirements. Different types of testing, such as unit testing, integration testing, system testing, and user acceptance testing, are conducted to identify and fix defects.

5. **Deployment:** After successful testing, the software is deployed to the production environment. This involves activities such as installation, configuration, data migration, and user training.

6. **Maintenance:** Once the software is deployed, it enters the maintenance phase. This phase involves ongoing support, bug fixing, software updates, and enhancements based on user feedback and changing requirements.

It's important to note that various SDLC models exist, such as the Waterfall model, Agile methodologies (e.g., Scrum, Kanban), and DevOps practices. Each model has its own variations and emphasizes different aspects of software development, but they all generally follow a similar set of fundamental phases.

```
   ________       ____________       ____________       _________
  |        |     |            |     |            |     |         |
  |        |     |   System   |     |   Testing  |     |  System |
  |        |---->|   Design   |---->|   & QA     |---->|  Release|
  |        |     |            |     |            |     |         |
  |        |     |____________|     |____________|     |_________|
  |        |            |                   |               |
  |        |            |                   |               |
  |   Req. |            |                   |               |
  |  & Ana.|            |                   |               |
  |        |            |                   |               |
  |        |            V                   |               |
  |        |     ____________       ____________            |
  |        |    |            |     |            |           |
  |        |    |   Coding   |     |Integration |           |
  |        |    |  & Testing |     |  Testing   |           |
  |        |    |            |     |            |           |
  |        |    |____________|     |____________|           |
  |        |            |                   |               |
  |        |            |                   |               |
  |        |            |                   V               |
  |        |            |         ____________              |
  |        |            |        |            |             |
  |        |            |        |   Review   |             |
  |        |            |        | & Feedback |             |
  |        |            |        |            |             |
  |        |            V        |____________|             |
  |        |     ____________              |                |
  |        |    |            |             |                |
  |        |    |    Final   |<------------+                |
  |        |    |   Release  |                              |
  |        |    |            |                              |
  |________|    |____________|                              |
                                                            |
                     _______________________________________|
                    |
                    V
              __________________
             |                  |
             |  Maintenance     |
             |   & Support      |
             |__________________|

```


# Models in Software engineering

A software development model is a process framework that is used to structure, plan, and control the process of developing information systems. A wide variety of such frameworks has evolved over the years, each with its own recognized strengths and weaknesses. One software development model is not necessarily suitable for use by all projects. Each of the available models is best suited to specific kinds of projects, based on various technical, organizational, project and team considerations.

Here are some of the most common software development models used in the industry today:

## Classic Waterfall model in Software Engineering

The Classic Waterfall model is a sequential software development process that follows a linear and rigid approach. It consists of several distinct phases, including feasibility study, requirements analysis, design, coding, testing, and maintenance. Here's a sketch and explanation of each phase:

1. Feasibility Study:
In this phase, the project's feasibility and viability are assessed. Factors such as technical, economic, legal, and scheduling aspects are evaluated. The objective is to determine whether the project is worth pursuing and if it aligns with the organization's goals and resources.

2. Requirements Analysis:
During this phase, the software requirements are gathered and documented in detail. The project team interacts with stakeholders to understand their needs, expectations, and constraints. The requirements are analyzed, prioritized, and documented in a Software Requirements Specification (SRS) document.

3. Design:
The design phase involves transforming the requirements into a software architecture that describes how the system will be structured. The design can be divided into two sub-phases: high-level design and low-level design. The high-level design outlines the overall system structure, while the low-level design focuses on specific components, modules, and algorithms.

4. Coding:
In the coding phase, the actual implementation of the software takes place. Developers write the code based on the design specifications. This phase involves translating the design into executable programming code using a suitable programming language. Coding standards and best practices are followed to ensure code quality and maintainability.

5. Testing:
The testing phase is dedicated to verifying and validating the software. Various testing techniques are employed, such as unit testing, integration testing, system testing, and user acceptance testing. Test cases are designed, executed, and defects are identified and fixed. The objective is to ensure that the software meets the specified requirements and functions correctly.

6. Maintenance:
After the software has been deployed, the maintenance phase begins. It involves the ongoing support and enhancement of the software throughout its lifecycle. Maintenance activities include bug fixes, performance optimization, feature enhancements, and addressing user feedback. This phase ensures that the software remains functional, secure, and up to date.

Here's a sketch representing the Classic Waterfall model:

```
Feasibility Study  ->  Requirements Analysis  ->  Design  ->  Coding  ->  Testing  ->  Maintenance
       |                  |                      |           |          |            |
       |                  |                      |           |          |            |
       +------------------+----------------------+-----------+----------+------------+
```

Please note that the Classic Waterfall model follows a sequential flow, where each phase is typically completed before moving on to the next. However, this model lacks flexibility for accommodating changes or iterations, which can be a limitation in dynamic software development environments.


### Advantages and Disadvantages of Classic Waterfall model in Software Engineering


| Advantages                                            | Disadvantages                                          |
| ----------------------------------------------------- | ------------------------------------------------------ |
| Clear and well-structured methodology                 | Lack of flexibility and adaptability                   |
| Sequential and linear process                         | Minimal customer involvement during development        |
| Well-defined project requirements                     | Limited room for error correction and iteration        |
| Easier to manage and predict timelines                | Difficult to accommodate changes or new requirements   |
| Strong documentation throughout the project lifecycle | Testing and debugging occur late in the development    |
| Thorough and formalized project planning              | No tangible deliverables until the end of the project  |
| Easy to understand and implement                      | Limited opportunities for early user feedback          |
| Provides a clear baseline for progress measurement    | Challenges with complex or evolving projects           |
| Suitable for stable and well-understood projects      | High risk of project failure if requirements are wrong |
| Well-suited for projects with strict regulatory needs | Challenges in managing interdependent project modules  |

### Usecases of the waterfall model

- When requirements are well-defined and unchangeable.
- There are no ambiguous requirements or conditions.
- When the technology is well understood
- The project is brief, and the cast is small.
- The risk is negligible.

## Iterative Waterfall Model

The Iterative Waterfall Model is a software development methodology that combines the iterative nature of Agile methodologies with the structured approach of the Waterfall model. It aims to address some of the limitations of the traditional Waterfall model by incorporating feedback and iteration throughout the development process. Here are the phases of the Iterative Waterfall Model, along with their key activities:

1. Feasibility Study:
   - Evaluate the project's feasibility, considering technical, economic, and operational factors.
   - Identify potential risks and constraints.
   - Determine whether the project should proceed based on the analysis.

2. Requirements Analysis:
   - Gather and document the functional and non-functional requirements.
   - Validate requirements with stakeholders.
   - Identify dependencies and constraints.
   - Prioritize requirements based on business needs.

3. Design:
   - Create a detailed system design based on the requirements.
   - Identify components, modules, and interfaces.
   - Define the system architecture.
   - Perform a design review to ensure the design meets the requirements.

4. Coding:
   - Implement the software system based on the design.
   - Write and test individual units or components.
   - Integrate the components to build the complete system.
   - Conduct code reviews to maintain code quality.

5. Testing:
   - Develop a comprehensive test plan based on the requirements.
   - Execute functional and non-functional tests to validate the system.
   - Identify and report defects.
   - Perform system integration testing and user acceptance testing.

6. Maintenance:
   - Address and fix defects identified during testing.
   - Provide ongoing support and maintenance for the software.
   - Accommodate change requests and enhancements.
   - Monitor and optimize the system's performance and reliability.

In the Iterative Waterfall Model, each phase is performed in an iterative manner, allowing for feedback and adjustments as needed. After each iteration, there is an evaluation and review process to assess progress and make necessary adaptations. This iterative approach helps mitigate risks and allows for continuous improvement throughout the development lifecycle.

![](https://github.com/ItsRoy69/Learn/assets/78967360/09214d27-3430-4949-a53c-155afe500281)

------------------------------------------------------------------------------------------------------------------

### Advantages and Disadvantages of Iterative Waterfall Model in Software Engineering

| Advantages                                                        | Disadvantages                                                    |
| ----------------------------------------------------------------- | ---------------------------------------------------------------- |
| Clear and well-defined phases                                     | Limited flexibility for changes or requirements                  |
| Early identification of project risks and issues                  | Limited customer involvement during development                  |
| Strict control over project deliverables                          | Lengthy development cycle                                        |
| Well-suited for projects with stable and predictable requirements | Limited scope for feedback and iteration                         |
| Clearly defined milestones and deliverables                       | Difficult to accommodate evolving customer needs                 |
| Easier to manage and estimate project timelines                   | Higher risk of project failure if requirements are misunderstood |
| Suitable for projects with a sequential workflow                  | Inefficient for projects with evolving requirements              |

------------------------------------------------------------------------------------------------------------------

## SDLC V-Model

The V-model is a type of SDLC model where process executes in a sequential manner in V-shape. It is also known as Verification and Validation model. It is based on the association of a testing phase for each corresponding development stage. Development of each step directly associated with the testing phase. The next phase starts only after completion of the previous phase i.e. for each development activity, there is a testing activity corresponding to it. 

The V-Model is a software development life cycle (SDLC) model that provides a systematic and visual representation of the software development process. It is based on the idea of a “V” shape, with the two legs of the “V” representing the progression of the software development process from requirements gathering and analysis to design, implementation, testing, and maintenance.

The V-Model consists of the following phases :

1. **Requirements Gathering and Analysis:** This phase involves gathering and analyzing the customer's requirements for the software to determine the project's scope.

2. **Design:** In this phase, the software architecture and design are developed. It includes both high-level design, which establishes the overall structure and components, and detailed design, which provides more specific implementation details.

3. **Implementation:** The implementation phase focuses on actually building the software based on the design specifications. Developers write the code and integrate the various components to create the desired functionality.

4. **Testing:** The testing phase is crucial for ensuring that the software meets the customer's requirements and is of high quality. Different types of testing, such as unit testing, integration testing, and system testing, are performed to identify and resolve any defects or issues.

5. **Deployment:** Once the software has successfully passed the testing phase, it is deployed and put into use. This phase involves activities such as installation, configuration, and user training, depending on the specific deployment requirements.

6. **Maintenance:** The maintenance phase focuses on the ongoing support and enhancement of the software. It ensures that the software continues to meet the customer's needs and expectations over time. Maintenance activities include bug fixing, updates, and addressing user feedback.

The V-Model is commonly used in safety-critical systems, particularly in industries such as aerospace and defense, due to its emphasis on thorough testing and its ability to clearly define the steps involved in the software development process.

https://media.geeksforgeeks.org/wp-content/uploads/V-Model.png


### Advantages and Disadvantages of SDLC V-Model in Software Engineering

| Advantages                                                        | Disadvantages                                                    |
| ----------------------------------------------------------------- | ---------------------------------------------------------------- |
| Clear and well-defined phases                                     | Limited flexibility for changes or requirements                  |
| Early identification of project risks and issues                  | Limited customer involvement during development                  |
| Strict control over project deliverables                          | Lengthy development cycle                                        |
| Well-suited for projects with stable and predictable requirements | Limited scope for feedback and iteration                         |
| Clearly defined milestones and deliverables                       | Difficult to accommodate evolving customer needs                 |
| Easier to manage and estimate project timelines                   | Higher risk of project failure if requirements are misunderstood |
| Suitable for projects with a sequential workflow                  | Inefficient for projects with evolving requirements              |


## Agile Model

The Agile Model is an approach to software development that emphasizes flexibility, collaboration, and customer satisfaction. It's a way of working that breaks down complex projects into smaller, manageable tasks. Here's a simple explanation:

Imagine you want to build a house. Instead of trying to construct the entire house at once, the Agile Model suggests building it in small, incremental steps. Each step is like a mini-version of the house, called an iteration or sprint. At the end of each iteration, you have a functional part of the house that you can use or show to others.

Here are the key principles of the Agile Model:

- Customer-Centric: The focus is always on delivering value to the customer. Throughout the process, you involve the customer to understand their needs and get feedback on the product regularly.

- Iterative Development: Instead of working on the whole project at once, it's divided into smaller iterations. Each iteration lasts a fixed time, like two weeks, during which a working part of the product is built.

- Collaborative Teamwork: The development team, including developers, testers, designers, and others, work together closely. Communication is open and frequent to ensure everyone is on the same page.

- Adaptive and Flexible: Agile acknowledges that requirements can change, so it's designed to be flexible and adapt to those changes easily.

- Continuous Improvement: After each iteration, the team reflects on what went well and what could be improved. This feedback loop helps the team get better with each iteration.

- Minimal Documentation: While documentation is important, Agile focuses on delivering working software. Instead of excessive documentation, it encourages simple and clear communication.

- Regular Reviews and Retrospectives: At the end of each iteration, there is a review where the customer provides feedback, and the team evaluates the progress. There's also a retrospective where the team discusses what can be improved.

Overall, the Agile Model allows teams to be more responsive to changes, deliver value faster, and involve customers throughout the development process to ensure they get what they really need. It's widely used in software development but can be applied to other projects too.


### Advantages and Disadvantages of Agile Model in Software Engineering

| Advantages                                                        | Disadvantages                                                    |
| ----------------------------------------------------------------- | ---------------------------------------------------------------- |
| Customer-centric approach                                        | Requires active customer involvement                            |
| Flexible and adaptable to changes                                | Requires experienced and skilled team members                   |
| Frequent feedback and iteration                                  | Requires a high level of collaboration and communication        |
| Faster time to market                                            | Requires a stable and well-understood project scope             |
| Continuous improvement                                           | Requires a high level of customer involvement                   |
| Minimal documentation                                            | Requires a high level of customer involvement                   |
| Well-suited for complex projects with evolving requirements      | Requires a high level of customer involvement                   |
| Well-suited for projects with a high degree of uncertainty       | Requires a high level of customer involvement                   |
| Well-suited for projects with a high degree of uncertainty       | Requires a high level of customer involvement                   |


## Spiral Model

The Spiral Model is a software development approach that combines the iterative nature of prototyping with the systematic aspects of the Waterfall model. It is called the "Spiral Model" because the development process follows a spiral-shaped path, repeating cycles of planning, risk analysis, engineering, and testing. Here's a simple explanation:

Imagine you are building a software project. Instead of trying to do everything in one long cycle, the Spiral Model suggests breaking it down into smaller cycles, like taking steps around a spiral. Each cycle consists of four main phases:

- Planning: In this phase, you identify the project's goals, requirements, and constraints. You also create a plan to guide the development process. <br/><br/>

- Risk Analysis: Here, you evaluate potential risks and uncertainties that could affect the project's success. These risks could be related to technology, resources, or changes in requirements. <br/><br/>

- Engineering: This is where the actual development takes place. You design, build, and test the software based on the plans made earlier. <br/><br/>

- Evaluation: In this phase, you review the progress, get feedback from users or stakeholders, and assess the results of the engineering phase. This helps you identify what's working well and what needs improvement. <br/><br/>

After completing one cycle, you start another one, each time refining and expanding the software. This process continues until the software meets all the requirements and is ready for deployment.

The Spiral Model is useful for large and complex projects where risks and uncertainties are high. It allows you to manage those risks effectively, as each cycle addresses potential problems before moving forward. The iterative nature of the model also means that changes can be accommodated more easily, making it suitable for projects with evolving requirements.

### Disadvantages of Spiral Model in Software Engineering

- It's significantly more complicated than other SDLC models. The procedure is intricate. <br/> <br/>
- Due to its high cost, it is not recommended for small projects. <br/> <br/>
- Risk Analysis is overly reliant, and it necessitates a high level of skill. <br/> <br/>
- Time estimation is challenging  <br/> <br/>
- The spiral could continue endlessly. <br/> <br/>



## RAD Models

The Rapid Application Development (RAD) model is a software development approach that focuses on building software quickly and efficiently through rapid prototyping and iterative development. It's designed to reduce development time while ensuring high-quality results. Here's a more detailed explanation in simple words:

Imagine you want to create a software application. Instead of following a lengthy and rigid development process, the RAD model suggests a faster and more flexible approach. It breaks down the development into smaller, manageable parts, like building a house with pre-built Lego blocks.

Here are the key steps in the RAD model:

- Requirements Gathering: In this initial phase, you work closely with users and stakeholders to gather their requirements and expectations for the software. The emphasis is on understanding what the software needs to do and what features it should have. <br><br>

- Rapid Prototyping: Once you have a clear understanding of the requirements, you start building a prototype or mock-up of the software. This prototype is a simple version of the final product that demonstrates its core functionalities and user interface. <br><br>

- Feedback and Iteration: You show the prototype to users and stakeholders for their feedback. They can interact with the prototype and provide suggestions for improvement. Based on the feedback, you make necessary changes to the prototype and create an updated version. <br><br>

- Incremental Development: Instead of building the entire software at once, you divide it into smaller increments. Each increment adds new features or functionalities to the existing prototype. This iterative process continues until the software is fully developed. <br><br>

- Quick Reviews and Testing: Throughout the development process, you perform regular reviews and testing to ensure that each increment works as expected and meets the requirements. <br><br>

- Integrated Testing and Deployment: Once all the increments are developed and tested, they are integrated to form the complete software. The final integrated product undergoes comprehensive testing before deployment. <br><br>

The RAD model is beneficial when there is a need for quick development and delivery. It is often used for projects with rapidly changing requirements or when a proof-of-concept is required before proceeding with the full-scale development. However, it requires active and continuous involvement from users and stakeholders to provide feedback during the prototyping and iterative development phases. With proper planning and collaboration, the RAD model can lead to faster development cycles and a more responsive software development process.

### Advantages and Disadvantages of RAD Models in Software Engineering

| Advantages                                                        | Disadvantages                                                    |
| ----------------------------------------------------------------- | ---------------------------------------------------------------- |
| Flexible and adaptable to changes                                | Requires active customer involvement                            |
| Frequent feedback and iteration                                  | Requires experienced and skilled team members                   |
| Faster time to market                                            | Requires a high level of collaboration and communication        |
| Continuous improvement                                           | Requires a stable and well-understood project scope             |


# What is Software prototyping and POC?

A software prototype is a working model with limited functionality. The prototype may or may not contain the exact logic used in the final software program, and therefore is an additional work that should be considered in the calculation. Users can review developer proposals and try them out before they are implemented through prototyping. It also helps in comprehending user-specific details that may have been missed by the developer during product development.

POC (Proof of Concept) is a method used by organizations to validate an idea or concept's practicality. The stage exists prior to the start of the software development process. On the basis of technical capability and business model, a mini project is built to see if a concept can be executed.

# What is SRS?

SRS is a formal report that serves as a representation of software that allows customers to assess whether it meets their needs. It is a list of requirements for a certain software product, program, or set of apps that execute specific tasks in a specific environment. It also includes user needs for a system, as well as precise system requirements specifications. Depending on who is writing it, it fulfils a variety of purposes. It can be used to communicate system requirements to stakeholders, serve as a contract between the developer and the customer, or act as a reference for testing the final system.

# What are CASE tools?
CASE tools are a collection of software application programs that automate SDLC tasks. Analysis tools, Design tools, Project management tools, Database Management tools, and Documentation tools are a few of the CASE tools available to simplify various stages of the Software Development Life Cycle. CASE tools are used to automate the SDLC process, resulting in increased productivity and improved quality.

# What is the feasibility study?
As the name implies, a feasibility study is a measurement of a software product in terms of how useful product development will be for the business from a practical standpoint. Feasibility studies are conducted for a variety of reasons, including determining whether a software product is appropriate in terms of development, implementation, and project value to the business. The feasibility study concentrates on the following areas:

 - Economic feasibility <br> <br>
 - Technical feasibility <br> <br>
 - Operational feasibility <br> <br>
 - Legal feasibility <br> <br>
 - Schedule feasibility <br> <br>

# Define black box testing and white box testing?
Black box testing is a type of high-level testing in which the primary goal is to evaluate functionalities from a behavioural standpoint. In black-box testing, the tester does not test the code; instead, they utilize the program to see if it works as expected.
When you have insight into the code or broad information about the architecture of the software in question, you can perform white box testing, also known as clear box testing. It falls under the category of low-level testing and is mostly concerned with integration and unit testing.  White box testing requires programming expertise or at the very least a thorough grasp of the code that implements a particular functionality.
# What is Concurrency?
In software engineering, concurrency refers to a set of techniques and mechanisms that allow the software to do many tasks at the same time. Concurrency can be achieved by using languages like C++ or Java because these languages support the concept of thread. New hardware and software features are required to achieve concurrency. 

# What are Software Metrics?
A software metric is a quantitative measure of program properties. Software metrics can be used for a range of things, such as analyzing software performance, planning, estimating productivity, and so on. Load testing, stress testing, average failure rate, code complexities, lines of code, etc. are some software metrics. The benefits of software metrics are many, some of them being:

- It reduces cost.
- It increases ROI (return on investment).
- Reduces workload.
- Highlights areas for improvement.
- Improves quality.

# What is Data Flow Diagram?
A Data Flow Diagram (DFD) shows the flow of information flows through a system. It shows data inputs, outputs, storage sites, and paths between each destination using symbols such as rectangles, circles, and arrows, as well as short text labels. Data flowcharts can range from simple to in-depth DFDs that go deeper into how data is processed. They can be used to evaluate a current system or to create a new system. A DFD can effortlessly express things that are difficult to describe in words, and it can be used by both technical and non-technical audiences.

![https://i.ibb.co/N1pgH59/Data-Flow-Diagram.png](https://i.ibb.co/N1pgH59/Data-Flow-Diagram.png)

# What are functional and non-functional requirements?

| Functional Requirements                                                                 | Non-Functional Requirements                                                                 |
| -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| These are the needs that the end-user specifies as essential features that the system should provide. | These are the quality requirements that the system must meet in order to fulfil the project contract. |
| The user specifies the functional requirements. |Technical individuals, such as architects, technical leaders, and software engineers, specify non-functional requirements.
| Functional Requirements are mandatory. For example, the client might want certain mandatory changes in UI, like dark mode. | Non-functional requirements are not Mandatory. For example, the requirement to enhance readability is non-functional. |


# What is Cohesion and Coupling?

Cohesion indicates the relative functional capacity of the module. Aggregation modules need to interact less with other sections of other parts of the program to perform a single task. It can be said that only one coagulation module (ideally) needs to be run. Cohesion is a measurement of the functional strength of a module. A module with high cohesion and low coupling is functionally independent of other modules. Here, functional independence means that a cohesive module performs a single operation or function. The coupling means the overall association between the modules. 

Coupling relies on the information delivered through the interface with the complexity of the interface between the modules in which the reference to the section or module was created. High coupling support Low coupling modules assume that there are virtually no other modules. It is exceptionally relevant when both modules exchange a lot of information. The level of coupling between two modules depends on the complexity of the interface.

# What is reverse engineering?

Software Reverse Engineering is a process of recovering the design, requirement specifications, and functions of a product from an analysis of its code. It builds a program database and generates information from this. The purpose of reverse engineering is to facilitate maintenance work by improving the understandability of a system and producing the necessary documents for a legacy system. 

Reverse Engineering Goals:  

 - Cope with Complexity.
 - Recover lost information.
 - Detect side effects.
 - Synthesize higher abstraction.
 - Facilitate Reuse.

 # What are the elements to be considered in the System Model Construction?

The type and size of the software, the experience of use for reference to predecessors, difficulty level to obtain users’ needs, development techniques and tools, the situation of the development team, development risks, the software development methods should be kept in mind. It is an important prerequisite to ensure the success of software development that designing a reasonable and suitable software development plan.

#  What is COCOMO model?

A COCOMO model stands for Constructive Cost Model. As with all estimation models, it requires sizing information and accepts it in three forms: 

 - Object points
 - Function points
 - Lines of source code

# What is level-0 DFD?

The highest abstraction level is called Level 0 of DFD. It is also called context-level DFD. It portrays the entire information system as one diagram.


# What is physical DFD?

Physical DFD focuses on how the system is implemented. The next diagram to draw after creating a logical DFD is physical DFD. It explains the best method to implement the business activities of the system. Moreover, it involves the physical implementation of devices and files required for the business processes. In other words, physical DFD contains the implantation-related details such as hardware, people, and other external components required to run the business processes. 

# What is the black hole concept in DFD?

A block hole concept in the data flow diagram can be defined as “A processing step may have input flows but no output flows”.In a black hole, data can only store inbound flows.

# What is the difference between Risk and Uncertainty?

 - Risk is able to be measured while uncertainty is not able to be measured. <br/> <br/>
 - Risk can be calculated while uncertainty can never be counted. <br/> <br/>
 - You are capable of make earlier plans in order to avoid risk. It is impossible to make prior plans for the uncertainty. <br/> <br/>
 - Certain sorts of empirical observations can help to understand the risk but on the other hand, the uncertainty can never be based on empirical observations. <br/> <br/>
 - After making efforts, the risk is able to be converted into certainty. On the contrary, you can’t convert uncertainty into certainty. <br/> <br/>
 - After making an estimate of the risk factor, a decision can be made but as the calculation of the uncertainty is not possible, hence no decision can be made. <br/> <br/>

 # What is a use case diagram?

A use case diagram is a behavior diagram and visualizes the observable interactions between actors and the system under development. The diagram consists of the system, the related use cases, and actors and relates these to each other:

 - System: What is being described?
 - Actor: Who is using the system?
 - Use Case: What are the actors doing?


# Which model is used to check software reliability?

A Rayleigh model is used to check software reliability. The Rayleigh model is a parametric model in the sense that it is based on a specific statistical distribution. When the parameters of the statistical distribution are estimated based on the data from a software project, projections about the defect rate of the project can be made based on the model.


# What is CMM?

To determine an organization’s current state of process maturity, the SEI uses an assessment that results in a five-point grading scheme. The grading scheme determines compliance with a capability maturity model (CMM) that deﬁnes key activities required at different levels of process maturity. The SEI approach provides a measure of the global effectiveness of a company’s software engineering practices and establishes ﬁve process maturity levels that are deﬁned in the following manner:

 - Level 1: Initial
 - Level 2: Repeatable
 - Level 3: Defined
 - Level 4: Managed
 - Level 5: Optimizing


# Define adaptive maintenance?

Adaptive maintenance defines as modifications and updations when the customers need the product to run on new platforms, on new operating systems, or when they need the product to interface with new hardware and software.

# What is regression testing?

Regression testing is defined as a type of software testing that is used to confirm that recent changes to the program or code have not adversely affected existing functionality. Regression testing is just a selection of all or part of the test cases that have been run. These test cases are rerun to ensure that the existing functions work correctly. This test is performed to ensure that new code changes do not have side effects on existing functions. Ensures that after the last code changes are completed, the above code is still valid.