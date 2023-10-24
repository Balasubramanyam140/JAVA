QUE : 1. Creating LinkedList using LinkedList<String> variableName = new LinkedList<String>();
      2. Adding elements in LinkedList using add() method .

import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList<String> family = new LinkedList<String>();
        family.add("Venkataramana");
        family.add("Sivakumari");
        family.add("Balasubramanyam");
        family.add("Sai prasanna");
        System.out.println(family);
    }
}
/*
OUTPUT :
      [Venkataramana, Sivakumari, Balasubramanyam, Sai prasanna]

*/
-------------------------------------------------------------------------------------------------
QUE : 1. Creating linked list using LinkedList<String> variableName = new LinkedList<String>();
      2. Adding elements using add() method .
      3. Adding element at the beggining of the list using addFirst() method .
      
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Actual LinkedList \n" + cars);
        cars.addFirst("Mazda");
        System.out.println("Adding new item at 1st in LinkedList \n" + cars);
    }
}

/*
OUTPUT :
            Actual LinkedList 
            [Volvo, BMW, Ford]
            Adding new item at 1st in LinkedList 
            [Mazda, Volvo, BMW, Ford]
*/

---------------------------------------------------------------------------------------------
QUE :  Adding an item to the end of the list
      1. Create a linkedList using LinkedList<String> variableName = new LinkedList<String>();
      2. Add elements in LinkedList using add() method .
      3. Add an element at the last using addLast() method .


import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Actual LinkedList \n" + cars);
        cars.addLast("Mazda");
        System.out.println("Adding new item at Last in LinkedList \n" + cars);
    }
}

/*
OUTPUT :
            Actual LinkedList 
            [Volvo, BMW, Ford]
            Adding new item at Last in LinkedList 
            [Volvo, BMW, Ford, Mazda]

*/

-----------------------------------------------------------------------------------------------

      
