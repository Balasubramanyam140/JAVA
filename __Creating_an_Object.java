public class Main {

  int x = 5;

  public static void main(String[] args) {

    Main myObj = new Main();

    System.out.println(myObj.x);

  }

}

/*
OUTPUT:
         5
*/
__________________________________________
public class Main {

  int x = 5;

  public static void main(String[] args) {

    Main myObj1 = new Main();  // Object 1

    Main myObj2 = new Main();  // Object 2

    System.out.println(myObj1.x);

    System.out.println(myObj2.x);

  }

}

/*
OUTPUT:
        5
        5
/*
___________________________________________
/*
  Example
Create a class called "Main" with two attributes: x and y:
*/
public class Main {
  int x = 5;
  int y = 3;
}
/*
Another term for class attributes is fields.

Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

Example
Create an object called "myObj" and print the value of x:
*/
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
/*
OUTPUT :
          5
*/
___________________________________________
/*
Modify Attributes
You can also modify attribute values:

Example
Set the value of x to 40:
*/
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}

/*
OUTPUT :
         40
*/
 ________________________________________
/*
Or override existing values:

Example
Change the value of x to 25:
*/
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}

/*
OUTPUT :
          25
*/
 ______________________________________________
/*
If you don't want the ability to override existing values, declare the attribute as final:
*/
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
/*
OUTPUT :
        Main.java:6: error: cannot assign a value to final variable x
      myObj.x = 25;
           ^
     1 error
*/
  
  
