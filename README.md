# TODO App

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Startup](#startup)
3. [Used Technologies](#used-technologies)
4. [Backend Endpoints](#backend-endpoints)

## Prerequisites

Requirements for execution and development:
* Java 21 (Backend)
* Node 20 (Frontend)

## Startup

### Backend

The Spring Boot backend can be started using Gradle (using default port 8080):

    backend/gradlew bootRun

### Frontend

The React frontend is started with NPM:

    npm install
    npm run dev

## Used Technologies

### Backend

* Java
* Groovy
* Spring Boot 3
* H2 Database
    * accessible in browser: http://localhost:8080/todo-service/console
* JUnit
* Spock

### Frontend

* React
* Typescript
* [Mantine](https://mantine.dev/getting-started/) (UI components)
* [Axios](https://axios-http.com/docs/intro) (backend communication)
* [Sass](https://sass-lang.com/documentation/) (styling)

## Backend Endpoints

The backend provides two simple REST endpoints:

| Purpose | URL | Http Method | Output |
|--|--|--|--|--|
| Get all todo lists | todo-service/lists | GET | List of todo-lists and todos, e.g.:<br/><pre><code>[<br/>    {<br/>        "id": 1,<br/>        "name": "List 1",<br/>        "completed": false,<br/>        "todos": [<br/>            {<br/>                "id": 1,<br/>                "title": "Todo 1.1",<br/>                "completed": false<br/>            },<br/>            {<br/>                "id": 2,<br/>                "title": "Todo 1.2",<br/>                "completed": false<br/>            }<br/>        ]<br/>    },<br/>    {<br/>        "id": 2,<br/>        "name": "List 2",<br/>        "completed": true,<br/>        "todos": [<br/>            {<br/>                "id": 3,<br/>                "title": "Todo 2.1",<br/>                "completed": true<br/>            },<br/>            {<br/>                "id": 4,<br/>                "title": "Todo 2.2",<br/>                "completed": true<br/>            }<br/>        ]<br/>    },<br/>]</code></pre> |
| Toggle completed-state of todo | todo-service/todos/${id} | POST | Edited todo, e.g.:<br/><pre><code>{<br/>    "id": 1,<br/>    "title": "Todo 1.1",<br/>    "completed": true<br/>}</code></pre> |
