//Reverse a Number

            import java.util.Scanner;
            class Main{
                public static void main(String [] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a number : ");
                    long n = sc.nextLong();
                    long x = n;
                    long y,z;
                    long rev=0;
                    System.out.println(x);
                    while(x!=0){
                        y= x%10;
                        x = x/10;
                        rev = rev*10+y;
                    }
                    System.out.println("Reverse Number : "+ rev);
                }
            }
            
/*
OUTPUT : 
          Enter a number : 341
          341
          Reverse Number : 143
*/
