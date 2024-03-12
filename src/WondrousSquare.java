import java.util.Scanner;
public class WondrousSquare {
    public static boolean isWondrousSquare(int[][] grid,int n) {
        double targetSum=0.5*n*(n*n+1);
        // Check rows and columns sum
        for(int i=0;i<n;i++) {
            int rowSum=0;
            int colSum=0;
            for(int j=0;j<n;j++) {
                rowSum+=grid[i][j];
                colSum+=grid[j][i];
            }
            if(rowSum!=targetSum||colSum!=targetSum) {
                return false;
            }
        }
        // Check if each number appears only once
        boolean[] seen=new boolean[n*n+1];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int num=grid[i][j];
                if(seen[num]) {
                    return false;
                }
                seen[num]=true;
            }
        }
        return true;
    }
    public static boolean isPrime(int num) {
        if(num<2) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimesInGrid(int[][] grid,int n) {
        System.out.println("Prime numbers in the grid:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int num=grid[i][j];
                if(isPrime(num)) {
                    System.out.println(num+" at row "+i+" and column "+j);
                }
            }
        }
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the grid (2<=n<=10): ");
        int n=sc.nextInt();
        // Input grid values
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter "+n+" values for row "+(i+1)+": ");
            for(int j=0;j<n;j++) {
                grid[i][j]=sc.nextInt();
            }
        }
        // Check if the grid is a wondrous square
        if(isWondrousSquare(grid,n)) {
            System.out.println("The grid represents a wondrous square");
            // Find and print prime numbers with their indices
            findPrimesInGrid(grid,n);
        }else {
            System.out.println("The grid does not represent a wondrous square");
        }
    }
}