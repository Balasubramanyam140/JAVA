Que : 1. Creating ArrayList using ArrayList<String> VariableName = new ArrayList<String>();
      2. Adding elements in the Array using add() method .
      3. Size of ArrayList using size() method .
      4. Access an item using get() method .
      5. Changing an Item using set() method .
      6. Removing an element using remove() method .
      7. Clearing total array using clear() method .


import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Suzuki");
        System.out.println("size of cars " + cars.size());
        System.out.println(cars + "\n");
        System.out.print(cars);
        System.out.println(" Accessing a specific element by get() method " + "\n");
        System.out.println(cars.get(0)+"\n");
        System.out.println("Changing an Item using set() method " + "\n");
        cars.set(0,"Hundai");
        System.out.println(cars.get(0)+"\n");
        System.out.println("Removing an element using remove() method " + "\n");
        cars.remove(0);
        System.out.println("size of cars " + cars.size() + "\n");
        System.out.println(cars + "\n");
        System.out.println("To remove all elements using clear() method " + "\n");
        cars.clear();
        System.out.println(cars);
        
    }
}

/*
  OUTPUT :
        size of cars 4
        [Volvo, BMW, Ford, Suzuki]
*/

-------------------------------------------------------------------------------------
Que: Printing elements using for loop :

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Suzuki");
        for(String i : cars){
            System.out.print(i+" ");
        }
}
}
/*
OUTPUT : 
      Volvo BMW Ford Suzuki 
*/
--------------------------------------------------------------------------------------
Que : Sorting elements using Collections.sort() method :

import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    System.out.println("Printing all elements from the Array ");
    for (int i : myNumbers) {
      System.out.println(i);
    }
    System.out.println("Sorting the array using sort() method");
    Collections.sort(myNumbers);
    for(int i : myNumbers){
        System.out.println(i);
    }
  }
}

/*
OUTPUT :

      Printing all elements from the Array 
      10
      15
      20
      25
      Sorting the array using sort() method
      10
      15
      20
      25
*/

  
  
