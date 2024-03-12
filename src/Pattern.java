/**
 * To display the number pattern:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

import java.util.Scanner;
public class Pattern {
    static Scanner sc=new Scanner(System.in);
    int n;
    public void process() {
        System.out.println("Enter number of rows : ");
        n=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Pattern obj=new Pattern();
        obj.process();
    }
}
