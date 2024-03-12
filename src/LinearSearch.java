import java.util.Scanner;
public class LinearSearch {
    static Scanner sc=new Scanner(System.in);
    int[] input=new int[10];
    boolean flag=false;
    public void process() {
        System.out.println("Enter any 10 integers : ");
        for(int i=0;i<10;i++) {
            input[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println("Enter the number to search for : ");
        System.out.println();
        int numberToSearch=sc.nextInt();
        for(int i=0;i<10;i++) {
            if(input[i]==numberToSearch) {
                flag=true;
                System.out.println("Number found in position "+(i+1));
                break;
            }
        }
        if(!flag)
            System.out.println("Number not found in array");
    }
    public static void main(String[]args) {
        LinearSearch obj=new LinearSearch();
        obj.process();
    }
}
