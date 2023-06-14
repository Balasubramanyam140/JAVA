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
__________________________________________
/*
Access Methods With an Object
Example
Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
*/
// Create a Main class
public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
/* OUTPUT :
             The car is going as fast as it can!
              Max speed is: 200
*/
