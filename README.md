# Data Structure and Alogirthms

## Description
- This repository is a collection of various data structures and algorithms implemented in different programming languages.

## Project Objective
- The objective of this project is to provide a centralized and well-documented repository of data structures and algorithms that I've encountered throughout my career.
- The aim is to assist students on their journey to becoming proficient software engineers by offering a practical reference for learning and implementation.

## Data Structures
- Bag

## Design Pattern
- Factory Design Pattern
  - Description
    - The Factory pattern is one of the most commonly used design patterns in Java. It allows objects to be created without exposing the instantiation logic to the client. Instead, the client interacts with the created object through a common interface. This approach avoids the direct use of the new keyword, which is often considered outdated in favor of more flexible and testable designs. The Factory pattern typically returns an instance of one of several possible classes, depending on the input or configuration.
  - Usage
    - When object creation is complex or involves logic
      -  Creating different types of documents (PDF, Word, Excel) based on a user's input or settings.
    - When you want to decouple object creation from usage
      - A payment system that selects between CreditCardPayment, PayPalPayment, or ApplePayPayment based on user preference.
    - When your application needs to decide which class to instantiate at runtime
      - Loading different database drivers (MySQLDriver, PostgresDriver, MongoDriver) depending on a config setting.
## Algorithms


## Languages
- Java
- ...

## How to use
- Clone the repo and open your desired directory using your favorite IDE

## Contribution Guidelines

We welcome contributions to enhance the content and functionality of this repository. If you're interested in contributing, please follow these guidelines:

### How to Contribute

1. Fork the repository to your GitHub account.
2. Clone the forked repository to your local machine:
- Using command line or GitHub Desktop
3. Create a new branch for your feature or bug fix:
```bash
git checkout -b feature/your-feature-name
```
4. Make your changes and commit them with a clear and concise commit message:
```bash
git add .
git commit -m "Add/Update: Description of your changes"
```
5.  Push your changes to your GitHub Repo
```
git push origin feature/your-feature-name
```
6. Create a pull request (PR) from your branch to the main repository. Be sure to provide a detailed description of your changes in the PR.

### Coding Standards
Please adhere to the coding standards followed in the repository. If there are specific style guidelines for the language you're working in, please follow them.

### Adding New Data Structures/Algorithms
If you're adding a new data structure or algorithm, make sure to include the implementation in all supported programming languages. Provide clear documentation and examples demonstrating its usage.

### Reporting Issues
If you encounter any issues or have suggestions for improvements, please open an issue on the GitHub repository. Clearly describe the problem or enhancement you're proposing.

### Code Review
All contributions will go through a code review process. Be prepared to address feedback and make necessary changes to your code.

## Project Status
- Ongoing: New data structures and algorithms will be added regularly.

## Acknowledgments
- [Design Patterns: Elements of Reusable](:https://www.amazon.ca/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
