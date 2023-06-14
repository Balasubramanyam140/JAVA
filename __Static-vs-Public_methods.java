public class Main{
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating Objects");
    }
    
    //public methods
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    //Main method
    public static void main(String[] args){
        myStaticMethod(); //Call the static method
        //myStaticMethod(); This would compile an error
        
        Main myObj = new Main(); //Create an object of Main
        myObj.myPublicMethod(); //Call the public method on the object
    }
}
/*
OUTPUT :
          Static methods can be called without creating Objects
          Public methods must be called by creating objects

*/
