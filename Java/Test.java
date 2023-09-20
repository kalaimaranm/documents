class Person
{
    public static void speak(){
        System.out.println("Person speaks");
        
    }
}

class Main extends Person
{
    public static void speak(){
    System.out.println("Teacher speaks");}
    

    public static void main( String args[]){    // Reference is of Person type and object is Teacher type
    Person obj = new Main();
    obj.speak();                                 //Reference and object both are of Person type.
    Main obj2 = new Main();
    obj2.speak();
        
    }

}

