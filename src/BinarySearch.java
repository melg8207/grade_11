import java.util.*;
public class BinarySearch {
    static Scanner sc=new Scanner(System.in);
    boolean flag=false;
    public void binary() {
        int begin=0,end=7,mid;
        int[] N=new int[8];
        System.out.println("Enter 8 elements : ");
        for(int i=0;i<8;i++) {
            N[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println("Enter the number to search for : ");
        int x=sc.nextInt();
        System.out.println();
        while(begin<=end) {
            mid=(begin+end)/2;
            if(N[mid]==x) {
                System.out.println("Number found in position : "+(mid+1));
                flag=true;
                break;
            }
            else if(x>N[mid]) {
                begin=mid+1;
            } else {
                end=mid-1;
            }
        }
        if(!flag) {
            System.out.println("Number not found in array");
        }
    }
    public static void main(String[]args) {
        BinarySearch obj=new BinarySearch();
        obj.binary();
    }
}
