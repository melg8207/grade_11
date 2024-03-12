/**
 * To print the number pattern:
 * 1 2 3 4 5
 *   1 2 3 4
 *     1 2 3
 *       1 2
 *         1
 */

import java.util.Scanner;
public class Pattern5 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i-1;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=n-i+1;k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Pattern5 obj=new Pattern5();
        obj.process();
    }
}
