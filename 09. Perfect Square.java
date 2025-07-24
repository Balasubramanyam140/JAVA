QUE 1 : Check Weather given Number is PErfect Sq or not



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
