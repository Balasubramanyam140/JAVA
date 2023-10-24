PATTERNS
_________________________________________________________________________________________
QUE)
            *****
            *****
            *****
            *****
            *****
SOL:

            import java.util.Scanner;
            import java.io.*;

            class Main{
                public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter a Number : ");
                    int rows = sc.nextInt();
                    sc.close();
                    for(int i=0;i<rows;i++){
                        for(int j=0;j<rows;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }

INPUT:
Enter a Number : 
5
OUTPUT:
*****
*****
*****
*****
*****
_______________________________________________________________________________________________________________________
QUE)        
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
SOL)
            import java.util.Scanner;
            import java.io.*;

            class Main{
                public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter a Number : ");
                    int rows = sc.nextInt();
                    // sc.close();
                    for(int i=0;i<=rows;i++){
                        for(int j=0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }

INPUT : 
Enter a Number :
8
OUTPUT :
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
________________________________________________________________________________________________________________________________
QUE)
        1
        12
        123
        1234
        12345
SOL)
import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int rows = sc.nextInt();
        // sc.close();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
INPUT :
Enter a Number :
5
OUTPUT:
        1
        12
        123
        1234
        12345
*/
________________________________________________________________________________________________________

QUE)
            1
            22
            333
            4444
            55555

SOL)
            import java.util.Scanner;
            import java.io.*;

            class Main{
                public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter a Number : ");
                    int rows = sc.nextInt();
                    // sc.close();
                    for(int i=1;i<=rows;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                }
            }
/*
INPUT:
Enter a Number : 
            5
OUTPUT:

            1
            22
            333
            4444
            55555
*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)
            *****
            ****
            ***
            **
            *
SOL)
            import java.util.Scanner;
            import java.io.*;

            class Main{
                public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter a Number : ");
                    int rows = sc.nextInt();

                    for(int i=rows;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
/*
INPUT:
            Enter a Number : 
            5
OUTPUT:
                *****
                ****
                ***
                **
                *
*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)
           12345
           1234
           123
           12
           1
SOL)
import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=rows ; i>0 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}    
/*
INPUT:
           Enter a number
           5
OUTPUT:
           12345
           1234
           123
           12
           1

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
______________________________________________________________________________________________________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
_________________________________________________________________________________________
_____________________________________________________________________________________________
QUE)

SOL)
/*
INPUT:

OUTPUT:

*/
