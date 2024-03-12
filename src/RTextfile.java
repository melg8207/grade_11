import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class RTextfile {
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e) {
            return false;
        }
    }
    public void display() {
        try(BufferedReader br=new BufferedReader(new FileReader("C:/Users/STEPHEN GEORGE/IdeaProjects/grade 11/RV.txt"))) {
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
        }catch(IOException e) {
            System.out.println("Error reading file___\"RV.txt\" : " + e.getMessage());
        }
    }
    public void highest() {
        try(BufferedReader reader=new BufferedReader(new FileReader("RV.txt"))) {
            int maxTotal=0;
            String studentRecord="";
            String line;
            while((line=reader.readLine())!=null) {
                String[] studentDetails=line.split("\\s+");
                int total=0;
                for(int i=1;i<studentDetails.length;i++) {
                   if(isInteger(studentDetails[i])) {
                       total+=Integer.parseInt(studentDetails[i]);
                   }
                }
                if(total>maxTotal) {
                    maxTotal=total;
                    studentRecord=line;
                }
            }
            if(!studentRecord.isEmpty()) {
                System.out.println("Student with the highest total:");
                System.out.println(studentRecord);
            }else {
                System.out.println("No records found.");
            }
        }catch (IOException e) {
            System.out.println("Error reading file 'RV.txt': "+e.getMessage());
        }
    }

    public static void main(String[]args) {
        RTextfile obj=new RTextfile();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of all students");
            System.out.println("2. Display record of the student with the highest total");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            String choice =sc.nextLine();
            System.out.println();
            switch (choice) {
                case "1":
                    obj.display();
                    break;
                case "2":
                    obj.highest();
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}