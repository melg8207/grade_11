import java.io.*;
public class cuboid {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int option;
    double l,b,h,vol,tsa,diagonal;
    public void input()throws IOException {
        //using BufferedReader
        System.out.println("Enter length: ");
        l=Double.parseDouble(br.readLine());                                   //input length
        System.out.println("Enter breadth: ");
        b=Double.parseDouble(br.readLine());                                   //input breadth
        System.out.println("Enter height: ");
        h=Double.parseDouble(br.readLine());                                   //input height
        System.out.println();
        System.out.println();
        System.out.println("-------- Options --------");
        System.out.println("1. Volume");
        System.out.println("2. Total Surface Area");
        System.out.println("3. Diagonal");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Enter operation(1,2 or 3): ");
        option=Integer.parseInt(br.readLine());                                //input option
    }
    public void calculate() {
        //using a switch statement
        switch(option) {
            case 1:
                vol=l*b*h;                                                     //calculate volume
                System.out.println("Volume: "+vol);
                break;
            case 2:
                tsa=2*(l*b+b*h+l*h);                                           //calculate total surface area
                System.out.println("Total Surface Area: "+tsa);
                break;
            case 3:
                diagonal=Math.sqrt(Math.pow(l,2)+Math.pow(b,2)+Math.pow(h,2)); //calculate diagonal
                System.out.println("Diagonal: "+diagonal);
                break;
        }
    }
    public static void main(String[]args)throws IOException {
        cuboid obj=new cuboid();
        obj.input();
        obj.calculate();
    }
}
