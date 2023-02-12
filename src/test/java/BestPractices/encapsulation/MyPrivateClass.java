package BestPractices.encapsulation;

public class MyPrivateClass {

    private String str = "My Private String !";

    //To give access to the members of Private class it is only possible by getters and setters as below

    public String getStr(){
        return str;
    }

    //In case you wanted to modify the value of the private String use setter
    public void setStr(String str){
        this.str = str;
    }




    private void myPrivateMethod(){

        //To print method name  : https://www.baeldung.com/java-name-of-executing-method
        String myMethodName = new Object(){}

                .getClass()
                .getEnclosingMethod()
                .getName()
                ;

        System.out.println("From my private method " + myMethodName );
    }
}
