1) Swaping using a Variable
2) Swapping without a new Variable

_____________________________________________________________________________________
1) Swaping using a Variable
import java.io.*;
class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping :");
        System.out.println("a = " +a + "  b =" + b);
        //swapping numbers
        int temp =a;
        a = b;
        b = temp;
        System.out.println("After Swapping :");
        System.out.println("a = " +a + "  b =" + b);
    }
}

/*
OUTPUT :
          Before Swapping :
          a = 10  b =20
          After Swapping :
          a = 20  b =10
*/
_____________________________________________________________________________________

2) Swapping without a new Variable

    import java.util.Scanner;
    class main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt(); //6
            int y = sc.nextInt();  //4
            x = x+y;  // 10
            y = x-y;  //6
            x = x-y;   //4
            System.out.println(x+" "+y);
        }
    }

        INPUT :
                 6 4
        OUTPUT :
                 4 6
