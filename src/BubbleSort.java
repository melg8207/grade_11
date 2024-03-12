import java.util.Scanner;
public class BubbleSort {
    static Scanner sc=new Scanner(System.in);
    int[] A=new int[6];
    public void input() {
        System.out.println("Enter any 6 integers : ");
        for(int i=0;i<6;i++) {
            A[i]=sc.nextInt();
        }
    }
    public void Bubble_sort() {
        int temp;
        System.out.print("Sorted array : ");
        for (int i=0;i<6;i++) {
            for(int j=1;j<(A.length-i);j++) {
                if(A[j-1]>A[j]) {
                    temp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=temp;
                }
            }
            System.out.print(A[i]+", ");
        }
    }

    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();
        obj.input();
        obj.Bubble_sort();
    }
}
