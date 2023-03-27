import java.util.Scanner;
public class Lab4{
    
    static Scanner scan= new Scanner(System.in);
    static String name;
    static String acc_num;
    static double acc_bal=10000.0;

    static void input(){
        System.out.println("Please enter account holder name: ");
        name=scan.nextLine();
        System.out.println("Please enter account number: ");
        acc_num=scan.nextLine();
    }

    static double deposit(double dep){
        acc_bal+=dep;
        return acc_bal;
    }

    static double withdraw(double wd){
        if(wd<=acc_bal){
            acc_bal-=wd;
        }
        return acc_bal;
    }

    static void transaction(double d, double w){
        System.out.println("Current balance: "+acc_bal);
        if(d!=0.0){
            System.out.println("The last transaction was a deposition of amount "+d);
        }
        if(w!=0.0){
            System.out.println("The last transaction was a withdrawal of amount "+w);
        }
    }

    static void summary(double n_bal){
        System.out.println("Account holder name: "+name);
        System.out.println("Account number: "+acc_num);
        System.out.println("Your current account balance is: "+acc_bal);
    }

    public static void main(String[]args){
        double new_bal=0.0;
        double dep=0.0;
        double wid=0.0;
        char cont='n';
        input();
        do{
        System.out.println("Welcome user!!\nYou can choose among the following options: ");
        System.out.println("1.To deposit money\n2.To withdraw money\n3.To print the transactions\n4.To print account summary");
        System.out.println("Please enter your choice: ");
        int ch= Integer.parseInt(scan.nextLine());
        switch(ch){
            case 1:
            System.out.println("Your choice is 1.");
            System.out.println("Please enter amount to be deposited: ");
            dep=Double.parseDouble(scan.nextLine());
            new_bal=deposit(dep);
            System.out.println("Amount deposited successfully");
            break;
            
            case 2:
            System.out.println("Your choice is 2.");
            System.out.println("Please enter amount to be withdrawn: ");
            wid=Double.parseDouble(scan.nextLine());
            new_bal=withdraw(wid);
            if(new_bal!=-1){
                System.out.println("Amount withdrawn successfully");
            }
            else{
                System.out.println("Amount cannot be withdrawn");
            }
            break;

            case 3:
            System.out.println("Your choice is 3.");
            System.out.println("Your transaction details are as follows: ");
            transaction(dep,wid);
            break;

            case 4:
            System.out.println("Your choice is 4.");
            System.out.println("Your account summary are as follows: ");
            summary(new_bal);
            break;

            default:
            System.out.println("Invalid choice!!");
            break;

              
          }
          System.out.println("\nPress 'y' to continue: ");
          cont=scan.nextLine().charAt(0);
        }while(cont=='y'||cont=='Y');
           System.out.println("Thanks for using this program!!");
    }
}