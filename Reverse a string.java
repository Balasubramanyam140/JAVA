1) Reversing a String 
2)  Reversing a String Using StringBuilder
3) Reversing a String Using CharArray method

-----------------------------------------------------------------------------------------------------
1) Reversing a String 
    
        public class ReverseStringExample {
            public static void main(String[] args) {
                String str = "Hello, World!";
                String reversed = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }
                System.out.println(reversed);
            }
        }

OUTPUT :
        !dlroW ,olleH
-----------------------------------------------------------------------------------------------------
2)  Reversing a String Using StringBuilder

    class Main{
    public static void main(String[] args){
        String original = "Hello Everyone";
        //Creating a String Builder
        StringBuilder rev = new StringBuilder(original);
        //reversed using reverse() method
        rev.reverse(); 
        //Converting StringBuilder to String
        String revString = rev.toString();
        System.out.println("Original String : " + original);
        System.out.println("Reverse String : " + revString);
        
            }
    }

OUTPUT :
            Original String : Hello Everyone
            Reverse String : enoyrevE olleH
-----------------------------------------------------------------------------------------------------
3) Reversing a String Using CharArray method
    
        class Main{
        public static void main(String[] args){
            String Org = "Hello World";
            //Convert String to Char Array
            char[] arr = Org.toCharArray();
            for(int i= arr.length-1;i>=0;i--){
                System.out.print(arr[i]);
                }
            }
        }

OUTPUT :
            dlroW olleH
-----------------------------------------------------------------------------------------------------
