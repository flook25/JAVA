# JAVA
# ☕ Learn Java: The Modern Way 🚀

![Java Banner](https://dac.digital/wp-content/uploads/2023/04/backend-java-optimized.png)

[![Java Version](https://img.shields.io/badge/Java-21%2B-blue.svg)](https://www.oracle.com/java/technologies/downloads/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Contributions Welcome](https://img.shields.io/badge/Contributions-welcome-brightgreen.svg?style=flat)](./CONTRIBUTING.md)

Welcome to your first step into the world of Java! This course is designed to teach you the fundamentals of Java programming with a fresh, modern approach. We'll skip the old, verbose styles and jump right into writing clean, efficient, and powerful code. Let's start this journey together! 🌟

---

### 🤔 About This Course

This isn't your traditional Java course. Here's what makes it different:

*   **✨ Modern First:** Learn modern Java features from the get-go, like `var`, Records, and the Stream API.
*   **👩‍💻 Hands-On:** Every lesson comes with practical examples and exercises to get you coding immediately.
*   **😂 Fun & Engaging:** Emojis and visuals make learning more interactive and less intimidating.
*   **🌱 Beginner-Friendly:** We start from zero, so no prior programming experience is needed.

---

### 🛠️ Getting Started: Your Toolkit

Before you begin, you'll need a couple of things. Setting up your development environment is your first win!

1.  **Install the JDK (Java Development Kit)** 📦
    *   We recommend **Java 21 (LTS)** or the latest version. The JDK is what compiles and runs your Java code.
    *   You can download it from the official Oracle website.

2.  **Choose an IDE (Integrated Development Environment)** 📝
    *   An IDE is a code editor with powerful features like debugging and autocompletion.
    *   Popular choices include:
        *   **[Visual Studio Code](https://code.visualstudio.com/)** (with the Java Extension Pack)
        *   **[IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)**
        *   **[Eclipse](https://www.eclipse.org/downloads/)**

---

### 🗺️ Course Outline

Here is the roadmap of what you will learn. Each module builds on the previous one, so it's best to follow them in order.

<details>
<summary><strong>Module 1: The Absolute Basics  기초</strong></summary>

*   `Hello, World!` 👋: Your first Java program.
*   Variables & Data Types 🔢: Storing information (`String`, `int`, `boolean`).
*   Using `var` for type inference.
*   Basic Operators ➕➖✖️➗: Doing math and making comparisons.
*   User Input ⌨️: How to get input from a user.

</details>

<details>
<summary><strong>Module 2: Controlling the Flow 🚦</strong></summary>

*   Conditional Statements (`if`, `else`, `else if`) 🤔: Making decisions in your code.
*   `switch` Expressions: A modern and cleaner way to handle multiple conditions.
*   Loops (`for`, `while`) 🔄: Repeating actions without repeating code.

</details>

<details>
<summary><strong>Module 3: Working with Data Structures 🗃️</strong></summary>

*   Arrays: Storing lists of items.
*   The Collections Framework:
    *   `List`: Ordered collections.
    *   `Set`: Collections of unique items.
    *   `Map`: Key-value pairs.
*   Introduction to the **Stream API** 💧: A powerful way to process collections.

</details>

<details>
<summary><strong>Module 4: The Heart of Java - Object-Oriented Programming (OOP) ❤️</strong></summary>

*   Classes & Objects 🏛️: Blueprints and their instances.
*   Methods: Defining behaviors.
*   Constructors: Creating new objects.
*   The Four Pillars of OOP:
    *   **Encapsulation:** Bundling data and methods.
    *   **Inheritance:** Reusing code from other classes.
    *   **Polymorphism:** One thing, many forms.
    *   **Abstraction:** Hiding complex details.
*   **Records** 📝: A modern, concise way to create immutable data classes.

</details>

<details>
<summary><strong>Module 5: Advanced Concepts 🚀</strong></summary>

*   Exception Handling 🛡️: Gracefully handling errors in your code.
*   Multithreading Basics & **Virtual Threads** 🧵: Running multiple tasks at once with ease (a modern feature!).
*   File I/O 📁: Reading from and writing to files.

</details>

---

### ✨ Modern Java in a Nutshell

Curious about what makes modern Java so cool? Here's a sneak peek!

#### Before: The Old Way (Traditional `for` loop)

```java
List<String> names = List.of("Alice", "Bob", "Charlie");
List<String> upperCaseNames = new ArrayList<>();
for (String name : names) {
    if (name.length() > 3) {
        upperCaseNames.add(name.toUpperCase());
    }
}
System.out.println(upperCaseNames); // [ALICE, CHARLIE]