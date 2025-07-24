QUE 1 : Check Weather given Number is PErfect Sq or not
Que 2: No of Perfect Squares in an Array


_________________________________________________________________________
QUE 1 : Check Weather given Number is PErfect Sq or not
public class Main {  
    public static void main(String[] args) {
        int n = 36;
        float a = (float)Math.sqrt(n);
        int b = (int)a;
        if(b*b==n){
        System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
_________________________________________________________________________
Que 2: No of Perfect Squares in an Array

    import java.util.Scanner;
            public class Main {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    }
                    int count =0;
                    for(int i=0;i<n;i++){
                        if(isPerfectSquare(arr[i])){
                            count++;
                        }
                    }
                    System.out.println("Number of Perfect SQuare : "+count);
                }
                
                static boolean isPerfectSquare(int a){
                    if(a < 0 ) return false;
                    int sqrt = (int) Math.sqrt(a);
                    return sqrt*sqrt ==a;
                }
        }

OUTPUT:
            5
            1
            23
            45
            36
            81
            Number of Perfect SQuare : 3
--------------------------------------------------------------------------
