import java.util.Scanner;
public class Lab3{
    Scanner scan= new Scanner(System.in);
    public static String arr[][]=new String[2][5];

    public static void entry(){
        for(int i=1;i<3;i++){
            System.out.println("Please enter the name of person"+i+": ");
            String name=scan.nextLine();
            System.out.println("Please enter the registration number of person"+i+": ");
            String reg=scan.nextLine();
            System.out.println("Please enter the email of person"+i+": ");
            String email=scan.nextLine();
            System.out.println("Please enter the class of person"+i+": ");
            String cls=scan.nextLine();
            System.out.println("Please enter the department of person"+i+": ");
            String dept=scan.nextLine();
            if(i==1){
                arr[0][0]=name;
                arr[0][1]=reg;
                arr[0][2]=email;
                arr[0][3]=cls;
                arr[0][4]=dept;
            }
            if(i==2){
                arr[1][0]=name;
                arr[1][1]=reg;
                arr[1][2]=email;
                arr[1][3]=cls;
                arr[1][4]=dept;
            }
        }
    }

    public static void display(){
        System.out.println("The entered array is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search(){
        int p=0;
        System.out.println("Enter the name to be searched: ");
        String searchName=scan.nextLine();
        if(searchName.equalsIgnoreCase(arr[0][0])){
            p=0;
            System.out.println("The name has been found!!");
        }
        else if(searchName.equalsIgnoreCase(arr[1][0])){
            p=1;
            System.out.println("The name has been found!!");
        }
        System.out.println("The details of the searched name: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[p][i]+" ");
        }
    }

    public static void main(String[]args){ 
        
        System.out.println("Some choices are given below:\n1. Collect the details of the student.\n2. Display the details of the student.\n3. Search the details of the student.");
        System.out.println("Please enter your choice: ");
        int ch=Integer.parseInt(scan.nextLine());

        switch(ch){
            case 1:
                System.out.println("Your choice is 1.");
                entry();
                break;
            
            case 2:
                System.out.println("Your choice is 2.");
                display();
                break;

            case 3:
                System.out.println("Your choice is 3.");
                search();
                break;        
        }
    }
}