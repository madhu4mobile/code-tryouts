package controlStructures;


public class IfElseCheck {

    boolean THIS = true;
    boolean THAT = false;

    public static void main(String[] args) {
        IfElseCheck ifElseCheck = new IfElseCheck();

       ifElseCheck.ifCheckWithTwoConditions();
    }

    public void ifCheckWithTwoConditions(){
        boolean flag = true;
        String str = "myString";

        //to use two conditions in if like AND --> &
        if(str.equals("myString") & flag){
            System.out.println("I am in if as THIS and THAT are true !");
        }else{
            System.out.println("I am in else as THIS is true though THAT is false !!");
        }
        // to check condition with OR --> ||

        //set THIS to false;
        THIS = false;
        if(THIS | THAT){
            System.out.println("I am in if as THIS is true though THAT is false !");
        }else{
            System.out.println("I am in else as both  THIS and THAT are false !!");
        }
    }
}
