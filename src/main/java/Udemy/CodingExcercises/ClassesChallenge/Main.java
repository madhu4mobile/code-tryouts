package Udemy.CodingExcercises.ClassesChallenge;

public class Main {

    public static void main(String[] args){
        System.out.println("In Main class.");
        Account madhusAccount = new Account();

        madhusAccount.setNumber(12345);
        madhusAccount.setBalance(1000.00);
        madhusAccount.setCustomerName("Madhu M");
        madhusAccount.getEmail("myTestEmail@madhusFirm.com");
        madhusAccount.setPhoneNumber("(331)123-4567");

        madhusAccount.depositFunds(500.00);
        madhusAccount.depositFunds(1000.00);
        madhusAccount.withdrawFunds(50.75);
        madhusAccount.withdrawFunds(500);
        madhusAccount.withdrawFunds(949.35);
    }

}
