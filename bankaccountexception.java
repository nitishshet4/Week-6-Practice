/* import java.util.Scanner;
class InsufficientFundsException extends Exception{
    
}
class BankAccount{
    private double balance;
    
    public BankAccount(double intitiaBalance){
        this.balance=intitiaBalance;
    }
    public void deposit(double amount){
        balance =balance+amount;
    }
    
    public void withdraw(double amount) throws  InsufficientFundsException{
        
        if(amount>balance){
            throw new InsufficientFundsException();
        }
        balance=balance-amount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    
}
public class Main
{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
           BankAccount obj=new BankAccount(10000);
           
           
           
           int option=10;
           do{
               System.out.println("Enter 1 to deposite");
               System.out.println("Enter 2 to withdraw");
               System.out.println("Enter 3 check balance");
               System.out.println("Enter 0 to exit");
               
               option=sc.nextInt();
               
               switch(option){
                   case 1:{
                       System.out.println("Enter Amount to deposite");
                        double b=sc.nextDouble();
                       obj.deposit(b);
                       break;
                   }
                   case 2:{
                       System.out.println("Enter Amount to withdraw");
                        double b=sc.nextDouble();
                       try{
                        obj.withdraw(b);
                       }catch(Exception e){
                           System.out.println(e);
                        }
                       break;
                   }
                   case 3:{
                       double b=obj.getBalance();
                       System.out.println(b);
                   }
                       
               }
               
           }while(option !=0);
    }
}   */