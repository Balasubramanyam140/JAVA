import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count=1;
            }
        }
        if(count==0)
            System.out.println(n+" is a Prime number ");
        else 
            System.out.println(n+" is Not a prime");
        }
    
}

/*
OUTPUT :
        Enter a number
        5
        5 is a Prime number
*/
