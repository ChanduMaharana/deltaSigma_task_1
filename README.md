# Item Management REST API

This is a simple Java Spring Boot backend application that provides REST APIs
to manage a collection of items using in-memory storage.

## Tech Stack
- Java 17
- Spring Boot
- REST API
- In-memory data storage (ArrayList)
- Docker (for deployment)

## Live Demo
Base URL:  
https://deltasigma-task-1.onrender.com

## API Endpoints

### Add a New Item
POST https://deltasigma-task-1.onrender.com/api/items

Request Body:
```json
{
  "name": "Laptop",
  "description": "Dell Inspiron"
}
