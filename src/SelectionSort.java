import java.util.Scanner;
public class SelectionSort {
    static Scanner sc=new Scanner(System.in);
    int[] A=new int[6];
    public void input() {
        System.out.println("Enter any 6 integers : ");
        for(int i=0;i<6;i++) {
            A[i]=sc.nextInt();
        }
    }
    public void Sel_sort() {
        int small,pos,temp;
        for(int i=0;i<A.length;i++) {
            small=A[i];pos=i;
            for(int j=i+1;j<A.length;j++) {
                if(A[j]<small) {
                    small=A[j];
                    pos=j;
                }
            }
            temp=A[i];
            A[i]=small;
            A[pos]=temp;
            System.out.print(A[i]+", ");
        }
    }
    public static void main(String[]args) {
        SelectionSort obj=new SelectionSort();
        obj.input();
        System.out.println();
        System.out.println();
        System.out.println("Sorted array : ");
        obj.Sel_sort();
    }
}
