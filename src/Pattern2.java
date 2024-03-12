/**
 * To print the number pattern:
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 */

import java.util.Scanner;
public class Pattern2 {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=i;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Pattern2 obj=new Pattern2();
        obj.process();
    }
}
