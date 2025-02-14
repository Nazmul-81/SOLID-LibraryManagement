# 📖 Library Management System (SOLID Principles)  

A Java-based **Library Management System** demonstrating the **SOLID** principles:  
✅ **S**ingle Responsibility Principle (SRP)  
✅ **O**pen/Closed Principle (OCP)  
✅ **L**iskov Substitution Principle (LSP)  
✅ **I**nterface Segregation Principle (ISP)  
✅ **D**ependency Inversion Principle (DIP)  

---

## 🛠 Features  
✔ Add books (Physical & E-Books)  
✔ Filter books (Available books, Author-based filtering)  
✔ Borrow & return books  
✔ Notification system (Email notifications)  


---

## 🏗 SOLID Principles Breakdown  
- **SRP**: `BookRepository` handles storage, `Book` represents an entity, and `Library` manages book actions separately.  
- **OCP**: New filters (`AvailableBookFilter`, `AuthorBookFilter`) can be added without modifying existing code.  
- **LSP**: `EBook` extends `Book` without altering expected behavior.  
- **ISP**: `Borrowable` and `Returnable` ensure classes only implement necessary methods.  
- **DIP**: `Library` depends on `Notification` abstraction instead of `EmailNotification` directly.  

---

## 🚀 Getting Started  

### Prerequisites  
- Java 8+  
- IDE (IntelliJ, Eclipse, VS Code)  

### Installation  
1️⃣ **Clone the Repository**  
```bash
git clone https://github.com/your-username/library-management-system.git
cd library-management-system

