# Library Management System (CLI)

Hi there! This is a simple Command Line Interface (CLI) application that I built to manage library operations, student registries, and book inventories. I created this project to practice my programming fundamentals, modular package structures, and persistent data storage using file logic.

🚀 Features

* **Add & Remove Students:** Allows registering new student profiles or removing them from the system.
* **Add & Remove Books:** Controls the library catalog by adding new book stocks or deleting outdated records.
* **Search Books:** Quickly searches through the inventory to find specific books instantly.
* **List Registered Students & Books:** Displays a clean, structured list of all registered students and available books.
* **Borrow & Return System:** Core logic that allows issuing a book to a specific student and handling the return process smoothly.
* **Edge Case Handling:** Includes checks to ensure the application doesn't crash if an invalid ID or unexpected input type is entered.

🛠️ Tech Stack & Concepts Used

* **Language:** Java (JDK 25)
* **Architecture:** Modular Package Structure (`students`, `books`, `library`, `data_management`).
* **Data Storage:** Flat text files (`student.txt` and `books.txt`) managed via file I/O streams for permanent data storage.
* **Control Flow:** Object-oriented design, dynamic loops, and interactive user input scanners.


A robust, package-based Java application designed to manage library operations, student registries, and book inventories. This system utilizes file handling to ensure that all data persists even after the application closes.

## 📁 Project Structure

The project is structured into modular folders (packages) to ensure a clean separation of concerns:

```text
├── Main.java                     # The entry point of the application
├── students/                     # Manages student-related structures
│   └── student.java              # Student class defining properties (ID, Name, etc.)
├── books/                        # Manages book inventory and classifications
│   ├── book.java                 # Core Book class with details like Title, Author, ID
│   └── bookType.java             # Configuration or helper file for book types (enum)
├── library/                      # Business logic layer
│   └── library.java              # Controls application logic, borrowing rules, and operations
└── data_management/              # Data persistence layer
    ├── data management.java      # Handles reading and writing operations to flat files
    ├── student.txt               # Text database storing registered students' data
    └── books.txt                 # Text database storing the library's book collection
