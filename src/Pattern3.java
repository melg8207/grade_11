/**
 * To print the number pattern:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

import java.util.Scanner;
public class Pattern3 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Pattern3 obj=new Pattern3();
        obj.process();
    }
}
