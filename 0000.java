Que 1: Decimal to Binary
Que 1: Binary to Decimal
  
Que 4: No of Perfect Squares in an Array





------------------------------------------------------------------------
Que 1: Decimal to Binary
    import java.util.Scanner;
    
    public class DecimalToBinaryDirect {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String b = Integer.toBinaryString(a);
            System.out.println(b);
            sc.close();
        }
    }
    ------------------------------------------------------------------------\
Que 1: Binary to Decimal

        import java.util.Scanner;
        
        public class DecimalToBinaryDirect {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                int b = Integer.parseInt(a,2);
                System.out.println(b);
                sc.close();
            }
        }
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------
------------------------------------------------------------------------  
Que 1: No of Perfect Squares in an Array

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
