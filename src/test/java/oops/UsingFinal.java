package oops;


public class UsingFinal {

    final int j;

    public UsingFinal() {
        // though the final field 'i' is initated above, value is assigned in the constuctor.
        j = 6;
    }

    public static void MyCustomStaticMethod() {
        // with out any paramete
        int k = 10;
    }

    public static void MyCustomStaticMethod(int k) {
        // with a parameter to overload the method
        k = 11;
    }


    public static void main(String[] args) {
        UsingStaticMethods.newInitialization();
        UsingFinal usingFinal = new UsingFinal();
        System.out.println("Value of varaible j is : " + usingFinal.j);

        //using final constants from MyConstants.
        System.out.println("Value of LONG_WAIT from final constants : " + MyConstants.LONG_WAIT);

        //From ENMUMs  - Enums directly use Values but not Key value pair.
        System.out.println("calling form UsingENUMConstants the values : " + UsingENUMConstants.SUNDAY);
    }


    public static void newInitialization() {
        System.out.println("I am in newInitialize Method");
    }
}
