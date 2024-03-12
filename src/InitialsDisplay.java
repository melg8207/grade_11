import java.util.Scanner;
public class InitialsDisplay {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first=sc.nextLine();
        System.out.print("Enter the second name: ");
        String second=sc.nextLine();
        System.out.print("Enter the last name: ");
        String last=sc.nextLine();
        // Getting initials
        char first_i=first.charAt(0);
        char second_i=second.charAt(0);
        char last_i=last.charAt(0);
        System.out.println("Initials: "+first_i+"."+second_i+"." +last_i);
    }
}
