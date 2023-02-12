package BestPractices.inheritance;

public class InheritanceSubClass  extends InheritanceParentClass {

    String subStr = "SubClass String";

    String commonStr = "Common string from sub class !!";

    public InheritanceSubClass(){

        super("Parameter passed to superClass constructor from subClass with Super() !");
        //--> this is needed when there is no default constructor is avaialble in superClass.
        System.out.println("from default constructor of subClass");
    }

    public void subClassMethod() {
        System.out.println("From Inheritance subClassMethod !!");
    }

    public void toPrintCommonString(){
        System.out.println("Value of commonString :" +commonStr);
        System.out.println("   -->  when we want to use common parameter from parent class, we have to use super() ");
        System.out.println("Value of commonString from superClass : " + super.commonStr);
    }

}
//video[@id='playerId__34984660--25_html5_api']