package controlStructures;

public class ForLoopCheck {

    public static void main(String[] args) {

        ForLoopCheck forLoopCheck = new ForLoopCheck();

        forLoopCheck.firstForLoop1();
        System.out.println();
        forLoopCheck.secondForLoop();
        System.out.println();
        forLoopCheck.loopThroughAnArray();

    }


    public void firstForLoop1(){
        System.out.printf("%s"," ");
        for(int i=1;i<=10;i++){
            System.out.printf("%d %2s %2d  %-2s % 3d%n ", 7,"x",i,"=",7*i);
            //to get out of the loop after i = 5;
            if(i==5){
                break;
            }
        }
    }

    public void secondForLoop(){
        int NUMBER_OF_TABLES = 4;
        int NUMBER_OF_TIMES = 10;

        for (int i = 1; i <= NUMBER_OF_TABLES; i++) {
            for (int j = 1; j <= NUMBER_OF_TIMES; j++) {
                System.out.printf("%6d", i * j);

            }
            System.out.println();
        }

    }
    public void loopThroughAnArray(){
        String[] myArray = {"Apple","Grapes","Oranges","PineApple","Pear"};

        for(String fruit : myArray){
            System.out.println("fruit = " + fruit);
            
        }
    }

}


