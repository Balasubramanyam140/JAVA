Que 1: Decimal to Binary
Que 1: Binary to Decimal
Que 2: Count of digits in an array
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
Que 2: Count of digits in an array
          import java.util.Scanner;
        class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i]= sc.nextInt();
                }
                int sum =0;
                for(int i=0;i<n;i++){
                    sum += countArr(arr[i]);
                }
                System.out.println(sum);
            }
            static int countArr(int a){//10
                if(a==0){
                    return 0;
                }
                int sum=0;
                while(a>0){//10   1
                    int rem = a%10;//0  1
                    sum= sum+rem;//0   1
                    a=a/10;//1  0
                }
                return sum;
            }
        }
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
