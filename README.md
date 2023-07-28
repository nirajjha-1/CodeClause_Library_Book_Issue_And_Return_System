# CodeClause_Library_Book_Issue_And_Return_System

# Library Management System

This is a simple Library Management System implemented in Java. The system allows users to manage books in a library, including adding new books, displaying all books, displaying available books, borrowing books, and returning books.

## Getting Started

To use the Library Management System, follow the instructions below:

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone <repository_url>
   ```

2. Make sure you have Java installed on your system.

3. Compile the Java files:

   ```bash
   javac JAVA/Internship/CodeClause/LIbrary_Mgmt/*.java
   ```

4. Run the Main class:

   ```bash
   java JAVA.Internship.CodeClause.LIbrary_Mgmt.Main
   ```

## Project Structure

The project consists of the following Java files:

1. **Book.java**: This class represents a book entity and contains properties such as id, title, author, publish year, and status. It also provides methods to get and set these properties.

2. **BookServiceImpl.java**: This class implements the `BookServiceInterface` and provides the implementation for adding, displaying, borrowing, and returning books.

3. **BookServiceInterface.java**: This interface defines the contract for the book service, including methods for adding, displaying, borrowing, and returning books.

4. **Main.java**: This class contains the main method and acts as the entry point for the Library Management System. It allows users to interact with the system through a simple console-based menu.

5. **Validator.java**: This class provides validation methods for book ID, author/title, and publish year.

## How to Use

Upon running the `Main` class, you will be presented with a menu to perform various operations on the library:

1. **Add Book**: Allows you to add a new book to the library by providing book details.

2. **Show All Books**: Displays all the books in the library.

3. **Show Available Books**: Displays all the books that are currently available for borrowing.

4. **Borrow Book**: Allows you to borrow a book from the library by providing the book ID.

5. **Return Book**: Allows you to return a book that you have borrowed by providing the book ID.

6. **Exit**: Exits the application.

## Contributing

If you find any issues with the Library Management System or would like to add new features, feel free to submit pull requests or open issues on the GitHub repository.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Authors

- [Niraj jha](https://github.com/nirajjha-1)

## Acknowledgments

- The Library Management System was developed as part of the Java Internship program at CodeClause.
