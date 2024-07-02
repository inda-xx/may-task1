# Hello, INDA!

Welcome to the first assignment for DD1337!

### Read the course instructions!
Before you start working on this assignment, please read through the
**[course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions)**
carefully.

**You will need to have read through these to answer exercises 0.x!**

### 💀 Deadline
This work should be completed before the exercise, on **Friday 8th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the
[assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material for Module 1.

- You can access the OLI material both:
  - via Canvas (see the [OLI Torus SE](https://canvas.kth.se/courses/41415/external_tools/4247) link in the left menu)
  - or directly at this [webpage](https://qbl.sys.kth.se/sections/dd1337_ht23_programmering_prog/container/dd1337__programming)
- Read Module 1: [Introduction to OOP](https://qbl.sys.kth.se/sections/dd1337_ht23_programmering_prog/container/introduction_to_oop)

Please commit any written answers to the [`docs`](docs) folder, and commit any
Java code developed to the [`src`](src) folder of your KTH Github repo.
Remember to push to KTH Github.

### ✅ Learning Goals
This week's learning goals include:
  
* How to get help in this programming course
* Creating your first Java program
* Compiling and executing a Java Program
* Making a Java class from scratch
* Using methods in Java
* Basic Github proficiency 

### 🚨 Troubleshooting Guide
If you have any questions or problems, follow this procedure: <br/>

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, but **do not share answers**!

### 🏛 Assignment

*First things first, make sure you clone your repo to your local file system!* Here's a [quick video](https://www.youtube.com/watch?v=V_oFmi_jA0A) on what that means.

Also, we have arranged the exercises using emojis:

| Emoji | Description |
| :---: | ----------- |
| 📚 | Complementary reading. If you see this emoji, you will find introductions to new concepts or explanations that will be useful for the current exercise. |
| 🛠  | Working example. In some exercises we give you working example code that you can use in your programs. |

#### Exercise 0.1 -- Code of Conduct

In the [`docs`](docs) folder you have a template called `README.md`. Please submit answers to the questions in that document! Use [Markdown](https://www.markdownguide.org/cheat-sheet/) to *prettify* your submission!

#### Exercise 0.2 -- 🎵 Help, I need somebody 🎶
Beginning programmers like yourself are most likely to have a load of questions. Under the 🚨 **Troubleshooting Guide**, you will find some official channels where you can get help! To pass this exercise, you must open a new issue (as explained in the 🚨 **Troubleshooting Guide**) with a question for this exercise!

> **Assistant's note:** If you can't think of any relevant questions, just open an issue with the title "Task 1: My first issue".

#### Exercise 1.1 -- Hello, World!
In the [`src`](src) folder, create a file called `HelloWorld.java`. 
Following the example code in the OLI-material, produce a `Hello World`-program!

<details>
<summary> 🛠 How to compile your program </summary>
<br>
To run your program, type the following in your terminal:

javac HelloWorld.java
java HelloWorld

sql
Copy code
If you need help, follow the 🚨 **Troubleshooting Guide** at the top of this document!
</details>

#### Exercise 1.2 -- `Arithmetic.java`
Create another file in `src` called `Arithmetic.java`.
Your next task will be to create some methods in this Java class
for performing basic arithmetic operations.

#### Exercise 1.3 -- Sum
Create a method called `sum` that takes two arguments of type `int` and returns their sum as an `int`.
The _method header_ should be:

```java
public int sum(int a, int b)
```
<details>
<summary> 🛠 Add a main method to your program</summary>
To test your methods, you must add a main method. Add the following code to bottom of your Arithmetic class:

```java
Copy code
public static void main(String[] args) {
  // Create a new Arithmetic object
  Arithmetic arithmetic = new Arithmetic();

  // store the sum of 3 and 5 in a variable called "test"
  int test = arithmetic.sum(3, 5);

  // print the test variable
  System.out.println("The value of 3 + 5 is:");
  System.out.println(test);
}
```

</details>


<details>
<summary> 📚 ... main method? </summary>
This early on in your programming career, the main method might appear as foul magic. For now, you need to know that it is required for your program to execute a sequence of commands. Oracle, the company behind Java, has a tutorial explaining the main method. It is quite a read, and we do not expect you to fully understand the why and how just yet.

Put the main method at the bottom of your Java class:


```java
Copy code
public class Arithmetic {
  
  // define your methods here!
  
  // put your main method here!
  public static void main(String[] args){
  
    // sequence of commands
    
  } // END OF MAIN METHOD

} // END OF CLASS
```
</details>

#### Exercise 1.4 -- Difference
Create a method called difference that returns the difference between two integers, that is, difference(2, 5) should return -3 (2 - 5).
The method header should be:

```java
Copy code
public int difference(int a, int b)
```

#### Exercise 1.5 -- Average
Create a method called average that takes two doubles as arguments and returns their arithmetic average. For example, if you call average(3.0, 4.0), you should get the result 3.5.
The method header should be:

```java
Copy code
public double average(double a, double b)
```
Assistant's note: Note that the header of average differs from the two previous methods - its parameters are doubles, not ints, and its return type should be a double.

#### Exercise 1.6 -- don't forget to git!
When you are done with your assignment, you must push it to your repository on Github.
If you don't do this, any changes you have made will only be present on your local machine
and your TA will not be able to grade your assignment. If you are uncertain how to
push your files, we have provided you with a brief walkthrough.

<details>
<summary> 🛠 How to push your solution to Github when you are done </summary>
When you are done with your assignment, you must push it to Github. You can either use the terminal in Visual Studio Code
or use the stand-alone terminal in your operating system.

You must navigate to your assignment folder by using the change directory command cd.

First, you must add the files that you want to commit. You should have modified the following files:

src/Arithmetic.java
src/HelloWorld.java
docs/README.md
bash
Copy code
# You can add more than one file at a time
git add src/Arithmetic.java src/HelloWorld.java docs/README.md
Then, after adding the files, you must commit these files with a message:

bash
Copy code
# The -m is called a flag, and is short for 'message'
git commit -m "Done with my first assignment"
If you forget to add the -m flag, you will be redirected to the text editor Vim,
where you can enter a longer commit message.
Using Vim can be a bit tricky, so unless you want to try to enter your commit message using Vim you
can abort your commit by typing :q! (you may need to press the Esc key first) and pressing enter.
You must then commit again (and don't forget -m!).

Finally, you push the committed files to Github:

bash
Copy code
git push
You should get a response from git telling you everything is fine. Go to your repository and
make sure that you can see your changes to the files. Otherwise, follow the steps in 🚨 Troubleshooting Guide.

</details>

❎ Checklist
 Clone your repository to your local computer
 Answer the questions in the README.md file found in the docs folder.
 Open a new issue following the 🚨 Troubleshooting Guide. If you don't have a question, set the title to "Task 1: My first issue".
 Create a file called HelloWorld.java and write a Hello World-program. Compile your code.
 Create another file in src called Arithmetic.java with the following methods:
 public int sum(int a, int b)
 public int difference(int a, int b)
 public double average(double a, double b)
 Push your work to GitHub!
Assistant's note: We have added this checklist for you to make a final check before handing in your work. You don't have to tick the boxes unless you want to (to tick a box, place an "x" within the brackets when editing the README.md)

🐞 Bugs and errors?
If you find any inconsistencies (spelling errors, grammatically incorrect sentences, etc.) or errors in this exercise1, please open a New Issue with the title "Task x Error: summary of error here". Found bugs will be rewarded by mentions in the acknowledgment section.

🙏 Acknowledgment
This task was designed by <br>
Linus Östlund <br>
Sofia Bobadilla <br>
Gabriel Skoglund <br>
Arvid Siberov <br>

Proofreading & Bug fixes by <br>
Ivar Boqvist <br>
Mattias Kvist <br>
Alexander Runebou <br>