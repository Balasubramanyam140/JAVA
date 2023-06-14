//Create a method named myMethod() in Main:

public class Main {

  static void myMethod() {

    System.out.println("Hello World!");

  }

}
/*
myMethod() prints a text (the action), when it is called. To call a method, write the method's name followed by two parentheses () and a semicolon;
*/
___________________________________________
/*
Example
Inside main, call myMethod():
*/
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"
_____________________________
/*
Static vs Public
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, 
which means that it can be accessed
without creating an object of the class, unlike public, 
which can only be accessed by objects:
An example to demonstrate the differences between static and public methods:
*/
public class Main {

  // Static method

  static void myStaticMethod() {

    System.out.println("Static methods can be called without creating objects");

  }

  // Public method

  public void myPublicMethod() {

    System.out.println("Public methods must be called by creating objects");

  }

  // Main method

  public static void main(String[] args) {

    myStaticMethod(); // Call the static method

    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main

    myObj.myPublicMethod(); // Call the public method on the object

  }

}
/*
OUTPUT :
Static methods can be called without creating objects
Public methods must be called by creating objects
*/
