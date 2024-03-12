/**
 * To print the number pattern:
 * 1
 *   2
 *     3
 *       4
 */

import java.util.Scanner;
public class Pattern4 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<i;j++) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
    public static void main(String[]args) {
        Pattern4 obj=new Pattern4();
        obj.process();
    }
}
