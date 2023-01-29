package oops;


public class AllOopsAtOnePlace {
    /*
    //filelds/parameters - Used to declare class level parameters
        Premitive -> int, boolean, long, float, double
        Referce -> String
    */
    int i = 5;
    String str1 = "Java is fun but little complex to learn";

    /*
    //constructors are used to instantiate all parameters, methods and functions in java
    // Java starts reserving memory once the constructor is instantiated with new keyword
    // We can assign values to the prameters here to be used by entire class.
    */
    public AllOopsAtOnePlace() {
        i = 6;
    }

    //To use method overloading with constructor
    public AllOopsAtOnePlace(int i) {
        this.i = i;
    }

    /*
    //Methods
    */
    public static void main(String[] args) {
        AllOopsAtOnePlace allOopsAtOnePlace = new AllOopsAtOnePlace();
        /*
        //as main method is static, to call non static variable 'i', we have to initialize the Constructor
        // and we can call i from constructor object as allOopsAtOnePlace. 3w
        */
        System.out.println("Value of i is : " + allOopsAtOnePlace.i);
        System.out.println("----->Notice the above value, which is coming from default constructor not for class variable");
        allOopsAtOnePlace.Initialize();
        System.out.println("Value of i after initialize method is : " + allOopsAtOnePlace.i);

        AllOopsAtOnePlace allOopsAtOnePlace1 = new AllOopsAtOnePlace(8);
        System.out.println("Value of i from method over loaded constructor is : " + allOopsAtOnePlace1.i);
        //if we initialize the class object again, previous initialization will be nullified / or rest to default constructor
        AllOopsAtOnePlace allOopsAtOnePlace2 = new AllOopsAtOnePlace();
        System.out.println("Value of i is : " + allOopsAtOnePlace2.i);
        System.out.println("----->Notice the above value, which is not from Initialize but reset as we created the new instance of the class ");
        System.out.println("*******************************");

        //calling other static methods which can return
        System.out.println(UsingStaticMethods.newInitialization());

        //calling Instance variable of UsingStaticMethod from here
        UsingStaticMethods usingStaticMethods = new UsingStaticMethods();
        System.out.println(usingStaticMethods.toReturnClassInstance());

        //calling the instance varaiable from MyClass
        //when you try to call the following commented way, it throws error as non-static method is called from static.
        ///////////System.out.println("calling the instance varaiable from MyClass : "+MyClass.toUseInstanceVariableInOtherClass());

        // to avaoid this error, better way is to create an intance of the object before calling the non-static method.
        MyClass myClass = new MyClass();
        System.out.println("calling the instance varaiable from MyClass : " + myClass.toUseInstanceVariableInOtherClass().a);

    }

    public void Initialize() {
        i = 7;
    }

}
