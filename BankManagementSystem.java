import java.util.*;
class Account{
    String name;
    int pin;
    Scanner in = new Scanner(System.in);
    void create(String type){
        System.out.println("Welcome, create your " + type + " here...");
        System.out.println("Enter Name:-");
        name = in.nextLine();
        System.out.println("Please Enter Your four digit " + type +  " PIN:-");
        pin = in.nextInt();
        System.out.println("\n\n\n" + "YOUR " + type + " CREATED SUCCESSFULLY...");
    }
    void auth(String type){
        System.out.println("Enter Your " + type + " PIN:-");
        int AuthPin = in.nextInt();
        if(AuthPin == pin){
            System.out.println("Authentication Successfull, Welcome to Your "+ type);
        }
        else{
            System.out.println("Authentication failed, Try Again");
            auth(type);
        }
    }
}

class AccType extends Account{
    Scanner in = new Scanner(System.in);
    
    void Regular(){
        System.out.println("RULES:- Min Rs.500 required, if balance is fall below Min. ammount then there is an penalty of Rs.100");
        System.out.println("Enter ammount that you want to deposit");
        int ammount = in.nextInt();
        if(ammount<500){
            System.out.println("Insufficient amount Min Rs. 500 required");
        }else{
            System.out.println("CONGRATULATIONS, Your ammout is Successfully deposit, Your Account details:-");
            System.out.println("Name:- " + name);
            System.out.println("Available Balance:- " + ammount);
            System.out.println("REMEMBER, You have to submit:- Rs." + (int)ammount/10+ "(i.e 10% of balance at the end of the month) in the end of the month");
        }
    }
    
    
    void Interest(){
        System.out.println("No minimum balance required and There is a Interest of 7% paid monthly");
        System.out.println("Enter ammount that you want to deposit:-");
        int ammount = in.nextInt();
        System.out.println("CONGRATULATIONS, Your ammout is Successfully deposit, Your Account details:-");
        System.out.println("Name:- " + name);
        System.out.println("Available Balance:- " + ammount);
        System.out.println("REMEMBER, You have to submit:- Rs." + (int)ammount/10+ "(i.e 10% of balance at the end of the month) in the end of the month");

        
    }
  
    
    void Checking(){
        System.out.println("RULES:- Min Rs.1000 required, if balance is fall below Min. ammount then there is an penalty of Rs.50 and there is 0.10% for each transation based account");
        System.out.println("Enter ammount that you want to deposit");
        int ammount = in.nextInt();
        if(ammount<1000){
            System.out.println("Insufficient amount Min Rs. 1000 required");
        }else{
            System.out.println("CONGRATULATIONS, Your ammout is Successfully deposit, Your Account details:-");
            System.out.println("Name:- " + name);
            System.out.println("Available Balance:- " + ammount);
            System.out.println("REMEMBER, You have to submit:- Rs." + (int)ammount/10+ " in the end of the month");
        }
    }
    
      
    
    void CD(){
        System.out.println("There is a Interest of 15% paid yearly and if there is a withdrawal before 12 month have gone by there will be panelty of 20% of current balance");
        System.out.println("Enter ammount that you want to deposit");
        int ammount = in.nextInt();
        System.out.println("CONGRATULATIONS, Your ammout is Successfully deposit, Your Account details:-");
        System.out.println("Name:- " + name);
        System.out.println("Available Balance:- " + ammount);
        System.out.println("REMEMBER, You have to submit:- Rs." + (int)ammount/10+ " in the end of the month");
        
    }
}


class BankAccounts{
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the Account type that you want to create:-");
        System.out.println("1.Regular Account");
        System.out.println("2.Interest Account");
        System.out.println("3.Checking Account");
        System.out.println("4.CD Account");
        int choice = in.nextInt();
        AccType acc = new AccType();
        switch(choice){
            case 1:
                acc.create("Regular Account");
                acc.auth("Regular Account");
                acc.Regular();
                break;
            case 2:
                acc.create("Interest Account");
                acc.auth("Interest Account");
                acc.Interest();
                break;
            case 3:
                acc.create("Checking Account");
                acc.auth("Checking Account");
                acc.Checking();
                break;
            case 4:
                acc.create("CD Account");
                acc.CD();
                break;
            default:
                System.out.println("Please Enter correct choice...");
        }
        
    }
    
}