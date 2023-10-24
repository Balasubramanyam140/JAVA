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
