package methodchaining;

public class MethodChainingWithoutStatic {
    public static void main(String[] args) {
        /*
        In order to chain methods, we will have to initate object of the class
        2. Now using calss object methodChaining
        3. the mehtods should return the Class instance as return type and return is this.
         */
        MethodChainingWithoutStatic methodChainingWithoutStatic = new MethodChainingWithoutStatic();
        methodChainingWithoutStatic.a1().a2().a3();
    }

    public MethodChainingWithoutStatic a1() {
        System.out.println("This is from method a1");
        return this;
    }

    public MethodChainingWithoutStatic a2() {
        System.out.println("This is from method a2");
        return this;
    }

    public MethodChainingWithoutStatic a3() {
        System.out.println("This is from method a3");
        return this;
    }
}
