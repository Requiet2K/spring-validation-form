# Form Validator with Spring MVC and Thymeleaf

A robust web application built with Spring MVC, Spring Boot, and Thymeleaf. This project demonstrates the seamless integration of these technologies to create a dynamic and interactive form validation experience.

## Features

- **Form Validation:** Utilizes Spring annotations for server-side validation, ensuring data integrity.
- **Thymeleaf Templating:** Leverages Thymeleaf for a dynamic HTML rendering.
- **Custom Validation:** Implements a custom validation annotation for a promotion code.
- **Clean Project Structure:** Organized and modular project structure for easy navigation and maintenance.

## Technologies Used

![Spring MVC](https://img.shields.io/badge/Spring_MVC-6DB33F?logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=spring&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?logo=thymeleaf&logoColor=white)
![Regex](https://img.shields.io/badge/Regex-4285F4?logo=regex&logoColor=white)

## Form Fields

- **Brand (*):** Input field for the car brand. Min 2 chars
- **Model (*):** Input field for the car model. Min 5 chars
- **Year (*):** Input field for the car year, restricted between 1975 and 2024.
- **Email (*):** Input field for the user's email in a valid format. Used regexp
- **Promotion Code:** Optional input with custom validation, must start with 'ABC'. Includes custom annotation
