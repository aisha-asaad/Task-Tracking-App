# Task-Tracking-App

Task Tracking App is a web-based application that allows users to manage and track their tasks efficiently. 
It is built using Spring Boot for the backend and React for the frontend.

---

## **Features**

- Create, update, and delete tasks.
- Assign priorities and due dates to tasks.
- Organize tasks into task lists.
- Track task statuses (e.g., Open, In Progress, Completed).
- User-friendly REST API for task management.

---

## **Technologies Used**

### Backend:
- **Spring Boot**: Framework for building the RESTful API.
- **Hibernate**: ORM for database interactions.
- **MySQL/PostgreSQL**: Database for storing task data.

### Frontend:
- **React**: Frontend library for building the user interface.
- **Axios**: HTTP client for API communication.

### Tools:
- **Git**: Version control.
- **Postman**: For testing APIs.
- **Docker**: Containerization (if applicable).

---

## **Setup Instructions**

### Prerequisites:
- Java 17+
- Node.js 18+
- MySQL/PostgreSQL database
- Git

### Steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/aisha-asaad/Task-Tracking-App.git
   cd Task-Tracking-App
   ```

2. **Setup the Backend:**
   - Navigate to the backend directory:
     ```bash
     cd backend
     ```
   - Update `application.properties` with your database credentials.
   - Build and run the application:
     ```bash
     ./mvnw spring-boot:run
     ```

3. **Setup the Frontend:**
   - Navigate to the frontend directory:
     ```bash
     cd frontend
     ```
   - Install dependencies:
     ```bash
     npm install
     ```
   - Run the development server:
     ```bash
     npm start
     ```

4. **Access the Application:**
   - Open your browser and navigate to `http://localhost:3000`.

---

## **API Endpoints**

### **Task Management**
- **GET** `/api/task-lists/{taskListId}/tasks` - Retrieve all tasks in a task list.
- **POST** `/api/task-lists/{taskListId}/tasks` - Create a new task.
- **PUT** `/api/task-lists/{taskListId}/tasks/{taskId}` - Update an existing task.
- **DELETE** `/api/task-lists/{taskListId}/tasks/{taskId}` - Delete a task.

### **Task Lists**
- **GET** `/api/task-lists` - Retrieve all task lists.
- **POST** `/api/task-lists` - Create a new task list.

---

## **Contributing**

Contributions are welcome! Follow these steps to contribute:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

---

## **License**

This project is licensed under the [MIT License](LICENSE).

---

## **Contact**

For questions or suggestions, please reach out to **Aisha Asaad** at [aishaasaad212@gmail.com].
