\# SPIP – Smart Portal Investment Platform



\## About the Project

SPIP (Smart Portal Investment Platform) is a full-stack web application developed to manage and track investment records. It allows users to organize investment information, including owner names, asset names, asset types, and investment amounts.



\## Features

\- Add and manage investment records.

\- Store investment details in a MySQL database.

\- Access investment data through REST APIs.

\- Interactive frontend built with React.js.

\- Backend services developed using Spring Boot.



\## Technologies Used

\- \*\*Frontend:\*\* React.js, JavaScript, HTML, CSS

\- \*\*Backend:\*\* Java, Spring Boot

\- \*\*Database:\*\* MySQL

\- \*\*API:\*\* REST API

\- \*\*Build Tool:\*\* Maven

\- \*\*Version Control:\*\* Git and GitHub



\## Project Structure

```text

SPIP/

├── backend/

│   ├── src/

│   └── pom.xml

├── frontend/

│   ├── index.html

│   ├── package.json

│   ├── src.jsx

│   └── style.css

├── .gitignore

└── README.md

```



\## Prerequisites

\- Java 17 or a compatible configured JDK

\- Maven

\- Node.js and npm

\- MySQL

\- Git



\## How to Run



\### 1. Configure MySQL

Create a database named `spip\_db` in MySQL. Configure your database username and password locally in the backend configuration. Do not commit real credentials to GitHub.



\### 2. Run the Backend

Open a terminal in the `backend` folder and run:



```bash

mvn spring-boot:run

```



The backend is configured to run on:



`http://localhost:8081`



\### 3. Run the Frontend

Open another terminal in the `frontend` folder and run:



```bash

npm install

npm run dev

```



Open the local URL displayed by Vite, usually:



`http://localhost:5173`



\## API Endpoint

\- `GET /api/investments` – Retrieve investment records.



Base URL: `http://localhost:8081`



\## Learning Outcomes

\- Full-stack application development.

\- Building REST APIs using Spring Boot.

\- Connecting Java applications to MySQL.

\- Developing frontend interfaces using React.js.

\- Using Git and GitHub for version control.



\## Author

Chandramukhikumari



\## License

This project is available for educational and portfolio purposes.

