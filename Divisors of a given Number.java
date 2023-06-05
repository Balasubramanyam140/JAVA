import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Divisors of "+n+" are :");
        for(int i =1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }


/*
OUTPUT :
        Enter a Number : 
        36
        Divisors of 36 are :
        1 2 3 4 6 9 12 18 36 
*/
