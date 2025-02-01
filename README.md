# Spring Beans Management with XML Configuration

## 📌 About the Project
This is a simple **standalone Java application** demonstrating how to manage **Spring beans** and configure them using an **XML file**. The project follows the traditional approach of configuring beans in an XML file rather than Java-based or annotation-based configuration.

## 🚀 Features
- **Spring Bean Configuration via XML**
- **Dependency Injection** using setter and constructor injection
- **Standalone Java Application** (No Web Server required)
- **Easy to Extend & Modify**

## 📂 Project Structure
```
📦 Spring-1
 ┣ 📂 src
 ┃ ┣ 📂 com.ahmad.app
 ┃ ┃ ┗ 📜 Main.java   # Entry point of the application
 ┃ ┣ 📂 com.ahmad.beans
 ┃ ┃ ┗ 📜 Student.java   # Bean class
 ┃ ┣ 📂 com.ahmad.resources
 ┃ ┃ ┗ 📜 config.xml  # XML-based Spring configuration
 ┣ 📂 Referenced Libraries  # Contains required Spring JAR files
 ┣ 📜 README.md       # Project documentation
```

## 🛠️ Technologies Used
- **Java** (Standalone Application)
- **Spring Core Framework**
- **XML Configuration**

## 🔧 Setup & Run the Project
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/spring-xml-beans.git
cd spring-xml-beans
```

### 2️⃣ Add Required JAR Files
Make sure you have the following **JAR files** in the `Referenced Libraries`:
- `spring-context-5.3.22.jar`
- `spring-beans-5.3.22.jar`
- `spring-core-5.3.22.jar`
- `commons-logging-1.2.jar`

If you don’t have them, download from [Spring Repository](https://repo.spring.io/release/org/springframework/).

### 3️⃣ Compile and Run the Application
```sh
javac -cp .;ReferencedLibraries/* src/com/ahmad/app/Main.java
java -cp .;ReferencedLibraries/* com.ahmad.app.Main
```

## 📝 Example XML Configuration (config.xml)
```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">
    
    <bean id="student" class="com.ahmad.beans.Student">
        <property name="name" value="Ahmad Raza"/>
        <property name="age" value="21"/>
    </bean>
</beans>
```

## 📌 Output Example
```
Student Name: Ahmad Raza
Student Age: 21
```

## 🤝 Contributing
Feel free to fork the repository and submit pull requests!

## 📧 Contact
🔗 **LinkedIn**:(https://www.linkedin.com/in/ahmad-raza-09062a323/)  
🐙 **GitHub**: (https://github.com/Ahmad-Raza810)
