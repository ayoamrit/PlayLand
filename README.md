# Gaming Selling E-Commerce Website

This is a Gaming Selling E-Commerce Website developed using Java, HTML, CSS, and JavaScript, with the power of JSP(JavaServer Pages) and Servlets. The Website consists of three main pages: Home, Contact, and Shopping Cart. Users can browse and purchase games from the Home Page, contact the company through the Contact Page, and complete their purchases via the Shopping Cart page. The user data is securely stored in an SQL server.

## Description
The Gaming Selling E-Commerce Website provides a seamless and immersive gaming experience for users. Here's an overview of its features:
+ **Home Page:** The Home Page showcases a wide range of games available for purchase. Price of the game can be viewed by hovering the cursor onto its picture. Users can add games to their shopping cart by simply clicking on this price.
+ **Contact Page:** The Contact Page allows users to get in touch with the company. It features a contact form where users can fill in their details, including their name, email, and message. Upon submitting the form, the user's data is securely stored in an SQL server.
+  **Shopping Cart:** The Shopping Cart page provides users with a summary of the games they have added for purchase. To complete their purchase, users need to fill out a few text fields, such as name and email. Once the user submits the necessary details, the purchase data is securely stored in the SQL server for future reference.

### Build With
<img align="left" src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white">
<img align="left" src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white">
<img align="left" src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">

Developed using Java, HTML, CSS, JavaScript, JSP, and Servlets, providing a robust and interactive platform for users to browse and purchase games. These technologies enable features such as platform independence responsive design, interactivity, and server-sude processing, ensuring a seamless user experience.

### Database Management
<img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white">
This website utilizes an SQL Server for efficient and secure data storage. The user's contact information from the Contact page and purchase data from the Shopping Cart page are securely stored in the SQL server. This allows for easy retrieval, organization, and future refereneces of user data. By leveraging the power of SQL, the website ensures data integrity and provides a reliable foundation for managing customer information.

## Getting Started
To get started with this project, follow these steps:
1. **Clone the Repository:** Start by cloning this repository to your local machine using the following command:
```
 git clone https://github.com/ayoamrit/PlayLand
```
2. **Configure the SQL Server:** Set up a secuer SQL server to store user data. Make sure to create the necessary databases tables and configure the connection settings. The tables that I used can be found inside [DATABASE](https://github.com/ayoamrit/PlayLand/tree/main/src/main/webapp/DATABASE) folder.
3. **Open the Project:** Use your preferred IDE(Integrated Development Environment) to open the project. Ensure that you have Java, JSP, and Servlet support installed.
4. **Configure the Database Connection:** In the project files, locate the [SqlConnector](https://github.com/ayoamrit/PlayLand/blob/main/src/main/java/com/playland/database/SqlConnector.java) and [SqlServerConfig](https://github.com/ayoamrit/PlayLand/blob/main/src/main/java/com/playland/database/SqlServerConfig.java). Update the connection settings to match your SQL server configuration.
5. **Build and Run the Project:** Build and run the project using your IDE's build and run commands. Ensure that all dependencies are resolved successfully.
6. **Access the Website:** Once the project is successfully running, open your web browser and navigate to *http://localhost:8080* (or the specified port). You should see the Home page of the Gaming Selling E-Commerce Website.

Feel Free to explore the different pages, add games to the shopping cart, contact the company, and complete purchases.
 
 ## Usuage
A visual guide is provided to help you get started with using this project effectively. I have prepared a concise video demonstration that showcases the key features and functionality of this project.
### Video Demonstration
To make it easier for you to understand how the project works, I have created a YouTube video that provides a steo-by-step walkthrough. I highly recommend watching the video to maximize your experience with this project. You can acces the video by clicking on the image below:

 Click [here](https://youtu.be/gkEnEX4bapI) to watch the video demonstration.
 ## License
 [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) </br>
 This project is licensed under the [MIT License](https://github.com/ayoamrit/PlayLand/blob/main/LICENSE).

