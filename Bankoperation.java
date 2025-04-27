import java.util.*;

public class Bankoperation {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        double balance=0;
        boolean isRunning=true;
        int choice;
        
        while(isRunning){

        System.out.println("**********");
        System.out.println("BANKING PROGRAM");
        System.out.println("***********");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("************");

        System.out.println("Enter your choice(1-4): ");
        choice=sc.nextInt();

        switch(choice){
            case 1-> showBalance(balance);
            case 2-> balance += deposit();
            case 3-> balance -=Withdraw(balance);
            case 4-> isRunning=false;
            default -> System.out.println("INVALID CHOICE");
        }
    }
    System.out.println("************************");
    System.out.println("Thank you! have  nice day");
    System.out.println("*************************");
}
        static void showBalance(double balance){
            System.out.printf("$%.2f\n", balance);
        }
        static double deposit(){
            double amount=0;
            System.out.print("Enter an amount to be deposited: ");
            
            amount = sc.nextDouble();
            if(amount< 0)
            {
                System.out.println("Amount can't be negative");
                return 0;
            }else
            {
                return amount;
            }
            // return 0;
        }
        static double Withdraw(double balance){
            double amount;
            System.out.println("Enter amount to be withdrawn");
            amount = sc.nextDouble();
            if(amount>balance)
            {
                System.out.println("INSUFFIIENT FUNDS");
                return 0;

            }else if(amount<0)
            {
                System.out.println("Amount can't be negative");
                return 0;
            }else{
                return amount;
            }
        }
    }
// }
    

