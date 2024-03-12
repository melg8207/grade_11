/**
 * Program to merge 2 integer arrays from user's input
 * Mainly use of objects
 */
import java.util.Scanner;
public class Mixer {
    int[] arr;
    int n;
    static Scanner sc=new Scanner(System.in);
    Mixer(int nn) {
        n=nn;
        arr=new int[n];
    }
    void accept() {
        System.out.println("Enter "+n+" elements in ascending order : ");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A) {
        Mixer B=new Mixer(n+A.n);
        int x=0,y=0,z=0;
        // Merge the two sorted arrays
        while(x<n&&y<A.n) {
            if(arr[x]<A.arr[y]) {
                B.arr[z]=arr[x];
                x++;
            }else {
                B.arr[z]=A.arr[y];
                y++;
            }
            z++;
        }
        // Copy any remaining elements from the first array
        while (x<n) {
            B.arr[z]=arr[x];
            x++;
            z++;
        }
        // Copy any remaining elements from the second array
        while (y<A.n) {
            B.arr[z]=A.arr[y];
            y++;
            z++;
        }
        return B;
    }
    void display() {
        System.out.println();
        System.out.println("Sorted array : ");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        // Create two Mixer objects and merge them
        Mixer P=new Mixer(3);
        P.accept();
        Mixer Q=new Mixer(4);
        Q.accept();
        Mixer R=P.mix(Q);
        R.display();
    }
}