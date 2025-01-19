package Udemy.CodingExcercises.section7;

// static methods dont require an instance to be created.
class StaticMethodsEx {
    public static void printSum(int a, int b){
        System.out.printf("Sum of %d, %d is %d \n", a,b,a+b );
    }
}
class Main3 {

    public static void main(String[] args){
        StaticMethodsEx.printSum(14,87);
        printHello();
    }
    public static void printHello(){
        System.out.println("Hello !");
    }
}
