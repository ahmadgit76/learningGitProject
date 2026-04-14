# learningGitProject

A learning repository for Git features and Spring Boot application development.

## Spring Boot Hello World Application

This is a simple Spring Boot REST API application that demonstrates basic Spring Boot concepts.

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Git

### How to Run

1. **Clone the repository** (if needed):
   ```bash
   git clone https://github.com/ahmadgit76/learningGitProject.git
   cd learningGitProject
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**:
   - Home: `http://localhost:8080/`
   - API: `http://localhost:8080/api/hello`

### Project Structure
```
learningGitProject/
├── pom.xml                                      # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── HelloWorldApplication.java       # Main Spring Boot class
│   │   │   └── controller/
│   │   │       └── HelloWorldController.java    # REST controller
│   │   └── resources/
│   │       └── application.properties           # Spring Boot configuration
│   └── test/                                    # Test files (when added)
└── README.md
```

### Dependencies
- Spring Boot Starter Web (for REST APIs)
- Spring Boot DevTools (for development)
