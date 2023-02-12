package BestPractices.encapsulation;

public class MyRegularClass {

    //members of Private class can be accessed by getters and setters of the class object in Private class..



    public static void main(String[] args) {


        MyPrivateClass myPrivateClass = new MyPrivateClass();

        System.out.println(myPrivateClass.getStr());
        //Incase you wanted to modify the private string
        myPrivateClass.setStr("My Updated Private String !!");
        System.out.println(myPrivateClass.getStr());
        System.out.println("myPrivateClass. = " + myPrivateClass);

        // In case you wanted to modify the
//        System.out.println(myPrivateClass.getMethod());

    }
}
