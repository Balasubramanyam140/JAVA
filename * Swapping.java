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
