/**
 * To print the number pattern:
 *         1
 *       1 2 1
 *     1 2 3 2 1
 *   1 2 3 4 3 2 1
 * 1 2 3 4 5 4 3 2 1
 */

import java.util.Scanner;
public class Pattern6 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int sp=1;sp<=n-i;sp++) {           // Print leading spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {                // Print left half of the pattern
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--) {              // Print the right half of the pattern
                System.out.print(j+" ");
            }
            System.out.println();                  // Move to the next line
        }
    }
    public static void main(String[]args) {
        Pattern6 obj=new Pattern6();
        obj.process();
    }
}
