package BestPractices.inheritance;

public class InheritanceDemo {

    /*
    Def :   One class acquires properties ( methods and fields ) of another class !!!
    Why :   For reusability
    How :   Using extends keyword

    SubClass    :   derived class or child class
    SuperClass  :   base class or parent class

    Important Points:
    -- Subclass can have methods and fields in addition to the methods and fields of SuperClass.
    -- SubClass can only have one superClass. ( Multiple inheritances are not supported )
    -----------------> This can be achieved indirectly from interfaces. But not supported directly
    -- SubClass can not inherit SuperClasse's constructor, but it can invoke the constructor.

    -----------------> while accessing subclass, first the constructors of super class and then the constructors of subclass will be called than any other method

    Types of Inheritance :
        Single Inheritance      :   Class B inherits Class A; ( Class B extends A)
        Multilevel Inheritance  :   Class C inherits Class B and Class B inherits Class A --> meaning C inderectly inherits A and its methods and fields along with B
        Hirarchical Inheritance :   Classes D,C and B inherits Class A.
        Mutliple Inheritance    :   Not supported directly but can be achieved using interfaces

     super keyword :
        --  Used to distinguish between members of Superclass from members of Subclass, when they have same names.
        --  Also used to invoke the constructor of the superclass from subclass incase the superClass constructor is using parameters.
            If the constructor of subclass is not using parameters or Sublcass uses the default constructor, it will not be really needed.
     */
    public static void main(String[] args) {
        InheritanceSubClass inheritanceSubClass = new InheritanceSubClass();
        inheritanceSubClass.superClassMethod();
        System.out.println("superString = " + inheritanceSubClass.superStr);
        inheritanceSubClass.subClassMethod();
        System.out.println("subString = " + inheritanceSubClass.subStr);

        inheritanceSubClass.toPrintCommonString();



    }







}
