import java.util.Scanner;
public class Lab5{
    static String s1="";
    static String s2="";
    static String s="";
    static char ch;

    static void encrypt(String a){
        for(int i=0; i<a.length();i++){
            if((int)(a.charAt(i))==65|| (int)(a.charAt(i))==66|| (int)(a.charAt(i))==67)
                s1=s1+ (char)((int)(a.charAt(i)+23));
            else
                s1=s1+ (char)((int)(a.charAt(i)-3));
        }
        System.out.println("The encrypted string is: "+s1);
    }

    static void decrypt(String b){
        for(int i=0; i<b.length();i++){
            if((int)(b.charAt(i))==68|| (int)(b.charAt(i))==89|| (int)(b.charAt(i))==90)
                s2=s2+ (char)((int)(b.charAt(i)-23));
            else
                s2=s2+ (char)((int)(b.charAt(i)+3));
        }
        System.out.println("The decrypted string is: "+s2);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your String: ");
        String str=sc.nextLine();
        s=str.toUpperCase();
        System.out.println("The message entered by you is: "+s);
        System.out.println("You have the following choices:\n1. Encrypt your message.\n2. Decrypt your message.");
        System.out.println("Please enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("Your choice is 1. Encrypt your message.");
            encrypt(s);
            break;

            case 2:
            System.out.println("Your choice is 2. Decrypt your message.");
            decrypt(s);
            break;

            default:
            System.out.println("Invalid choice !!");
            break;

        }

    }
}