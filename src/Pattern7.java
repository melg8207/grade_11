/**
 * To print the number pattern:
 *         1
 *       1 2 1
 *     1 2 3 2 1
 *   1 2 3 4 3 2 1
 *     1 2 3 2 1
 *       1 2 1
 *         1
 */

import java.util.Scanner;
public class Pattern7 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {                    // Printing the upper half
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
        for(int i=1;i<=n;i++) {                    // Printing the lower half
            System.out.print("  ");
            for(int sp=1;sp<=i-1;sp++) {           // Print leading spaces
                System.out.print("  ");
            }
            for(int j=1;j<n-i+1;j++) {             // Print left half of the pattern
                System.out.print(j+" ");
            }
            for(int j=n-i-1;j>=1;j--) {            // Print the right half of the pattern
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Pattern7 obj=new Pattern7();
        obj.process();
    }
}

