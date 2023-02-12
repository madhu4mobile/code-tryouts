package BestPractices.inheritance;

public class InheritanceParentClass {

    String superStr = "SuperClass String ";

    String commonStr = "Common string from super class !";

//    public InheritanceParentClass(){
//        System.out.println("from default constructor of ParentClass");
        /// this is intentionally commented to check super
//    }

    public InheritanceParentClass(String superClassStringParameter){
        System.out.println("from parametrized constructor of ParentClass --> " +superClassStringParameter);
    }



    public void superClassMethod() {
        System.out.println("From Inheritance superClassMethod !");
    }
}
