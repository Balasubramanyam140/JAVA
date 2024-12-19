import java.util.Scanner;
class Main {
    public static void isPrime(int a, int b) {
        
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid");
        } else {
            boolean firstPrime = true;
            for (int i = a; i <= b; i++) {
                int fc = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        fc++;
                    }
                }
                if (fc == 2) {
                    if (firstPrime) {
                        System.out.print(i);
                        firstPrime = false;
                    } else {
                        System.out.print(", " + i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt()
        ;
        isPrime(start, end);
    }
}


input :
        25
        100
Output :
        29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
  -------------------------------------------------------------------------------------
