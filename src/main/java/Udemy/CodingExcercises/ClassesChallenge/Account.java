package Udemy.CodingExcercises.ClassesChallenge;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private boolean withDrawAbility = false;
    private int amountWithDrawn;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getBalance(int balance){
        return balance;
    }
    public void setBalance(double balance ){
/*        if( withDrawAbility == true){
             balance = balance - amountWithDrawn;
        } else { System.out.println("The account balance is either zero or less. So it is blocked to withdraw amount!"); }
        System.out.println("The account balance is : "+balance);*/
        this.balance = balance;
    }
    public String getCustomerName(String customerName){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getEmail(String email){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(String phoneNumber){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public boolean isWithDrawAbility(boolean withDrawAbility){
        return withDrawAbility;
    }
    public void setWithDrawAbility(boolean withDrawAbility){
        if(balance <= 0){
            withDrawAbility = false;
        } else {withDrawAbility = true;}
        this.withDrawAbility = withDrawAbility;
    }
    public void depositFunds(double amount){
        // this is to increment the account balance on adding money to the accountNumber.
        this.balance = balance + amount;

        System.out.println("The deposit of $"+ amount + " is successful.");
        System.out.println("The new balance is : $"+ this.balance);
    }
    public void withdrawFunds(double amount){
        if(amount > 0 && this.balance >= amount ){
          this.balance = balance - amount;
            System.out.println("The withdrawal of $"+ amount + " is successful.");
            System.out.println("The new balance is : $"+ this.balance);
        } else {
            System.out.println("The account balance is insufficient. You only have $"+this.balance);
        }

    }
}
