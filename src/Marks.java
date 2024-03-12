import java.util.Scanner;
public class Marks {
    static Scanner sc=new Scanner(System.in);
    int Class;
    double marks1,marks2,marks3,total,percentage;
    char sec;
    String name= "";
    String grade= "";
    public void input() {
        System.out.print("Enter name        : ");
        name=sc.nextLine();
        System.out.print("Enter class       : ");
        Class=sc.nextInt();
        System.out.print("Enter section     : ");
        sec=sc.next().charAt(0);
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.print("Enter marks in Mathematics  :   ");
        marks1=sc.nextDouble();
        System.out.print("Enter marks in Computers    :   ");
        marks2=sc.nextDouble();
        System.out.print("Enter marks in English      :   ");
        marks3=sc.nextDouble();
        System.out.println();
        System.out.println();
    }
    public void calculate() {
        total=marks1+marks2+marks3;
        percentage=(total*100)/300.0;
        if(percentage<40) {
            grade="F";
        }
        else if(percentage>=40&&percentage<50) {
            grade="C";
        }
        else if(percentage>=50&&percentage<60) {
            grade="C+";
        }
        else if(percentage>=60&&percentage<70) {
            grade="B";
        }
        else if(percentage>=70&&percentage<80) {
            grade="B+";
        }
        else if(percentage>=80&&percentage<90) {
            grade="A";
        }
        else if(percentage>=90) {
            grade="A+";
        }
        else {
            System.out.println("Error occurred!");
            System.exit(0);
        }
    }
    public void display() {
        System.out.println("-------------------------------------------------");
        System.out.println("---------------- Marks Statement ----------------");
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("      Student Name       :        "+name);
        System.out.println("      Class              :        "+Class);
        System.out.println("      Section            :        "+sec);
        System.out.println("  --------------------------------------------");
        System.out.println("  ------------ Marks in 3 subjects -----------");
        System.out.println("      Mathematics        :        "+marks1);
        System.out.println("      Computers          :        "+marks2);
        System.out.println("      English            :        "+marks3);
        System.out.println("-------------------------------------------------");
        System.out.println("----------------------- Total      :  "+total);
        System.out.println("----------------------- Percentage :  "+percentage);
        System.out.println("----------------------- Grade      :  "+grade);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

    }
    public static void main(String[]args) {
        Marks obj=new Marks();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
