package methodchaining;

public class MethodChainingUsingStatic {

    public static void main(String[] args) {
        /*

        when static method is used as modifier, the code appears more simple and clean as follows
        Steps :
        1) to use this method chaining the first method should be static and it should return new Class Instance.

         */

         a4().
                a5().
                a6();

    }

    public static MethodChainingUsingStatic a4() {
        System.out.println("This is from method a4 ");
        return new MethodChainingUsingStatic();
    }

    public MethodChainingUsingStatic a5() {
        System.out.println("This is from method a5 ");
        return this;
    }

    public MethodChainingUsingStatic a6() {
        System.out.println("This is from method a6 ");
        return this;
    }
}
