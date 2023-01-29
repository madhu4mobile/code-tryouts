package oops;

public class UsingStaticMethods {

    static int j;

    public UsingStaticMethods() {
        j = 6;
    }

    public UsingStaticMethods(int j) {
        this.j = j;
    }

    public static void MyCustomStaticMethod() {
        // with out any parameter
        int k = 10;
    }

    public static void MyCustomStaticMethod(int k) {
        // with a parameter to overload the method
        k = 11;
    }

    public static void main(String[] args) {
        UsingStaticMethods usingStaticMethods = new UsingStaticMethods();
        System.out.println("Value of varaible j is : " + usingStaticMethods.j);
        UsingStaticMethods.newInitialization();
        System.out.println("Value of varaible j is : " + j);
        UsingStaticMethods usingStaticMethods2 = new UsingStaticMethods(7);
        System.out.println("Value of varaible j is : " + j);


    }


    public static String newInitialization() {
        j = 8;
        String myString = "This is from UsingStaticMethods class and newInitialization method!!";
        System.out.println("The value of J in UsingStaticMethods class and newInitialization method! : " + j);
        return myString;
    }

    public static int toReturnClassInstance() {

        return j;
    }
}
