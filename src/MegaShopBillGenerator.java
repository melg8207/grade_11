import java.util.Scanner;
public class MegaShopBillGenerator {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int floorNumber=getFloorNumber(scanner);
        char dressType=getDressType(scanner);
        int quantity=getQuantity(scanner);
        double price=getPrice(scanner);
        double totalAmount=calculateTotalAmount(quantity, price);
        displayBill(floorNumber, dressType, quantity, price, totalAmount);
        scanner.close();
    }
    public static int getFloorNumber(Scanner scanner) {
        System.out.println("Enter the floor number (1 for Men's Wear, 2 for Kids Wear, 3 for Ladies Wear):");
        return scanner.nextInt();
    }
    public static char getDressType(Scanner scanner) {
        System.out.println("Enter the type of dress (A, B, or C):");
        return scanner.next().charAt(0);
    }
    public static int getQuantity(Scanner scanner) {
        System.out.println("Enter the quantity:");
        return scanner.nextInt();
    }
    public static double getPrice(Scanner scanner) {
        System.out.println("Enter the price:");
        return scanner.nextDouble();
    }
    public static double calculateTotalAmount(int quantity,double price) {
        return quantity*price;
    }
    public static void displayBill(int floorNumber,char dressType,int quantity,double price,double totalAmount) {
        switch (floorNumber) {
            case 1: // Men's Wear
                switch (dressType) {
                    case 'A':
                        System.out.println("Item: Jeans");
                        System.out.println("Range: Rs.999 - Rs.3999");
                        break;
                    case 'B':
                        System.out.println("Item: Half Shirts");
                        System.out.println("Range: Rs.499 - Rs.2999");
                        break;
                    case 'C':
                        System.out.println("Item: Full Shirts");
                        System.out.println("Range: Rs.599 - Rs.2599");
                        break;
                    default:
                        System.out.println("Invalid dress type!");
                        return;
                }
                break;
            case 2: // Kids Wear
                switch (dressType) {
                    case 'A':
                        System.out.println("Item: Baba Suit");
                        System.out.println("Range: Rs.650 - Rs.1650");
                        break;
                    case 'B':
                        System.out.println("Item: Jeans Suit");
                        System.out.println("Range: Rs.750 - Rs.1950");
                        break;
                    case 'C':
                        System.out.println("Item: Cotton Suit");
                        System.out.println("Range: Rs.850 - Rs.1850");
                        break;
                    default:
                        System.out.println("Invalid dress type!");
                        return;
                }
                break;
            case 3: // Ladies Wear
                switch (dressType) {
                    case 'A':
                        System.out.println("Item: Salwar Suit");
                        System.out.println("Range: Rs.799 - Rs.2999");
                        break;
                    case 'B':
                        System.out.println("Item: Skirt");
                        System.out.println("Range: Rs.599 - Rs.1999");
                        break;
                    case 'C':
                        System.out.println("Item: Jeans");
                        System.out.println("Range: Rs.899 - Rs.2999");
                        break;
                    default:
                        System.out.println("Invalid dress type!");
                        return;
                }
                break;
            default:
                System.out.println("Invalid floor number!");
                return;
        }
        System.out.println("Quantity: " +quantity);
        System.out.println("Price per item: Rs." +price);
        System.out.println("Total amount: Rs." +totalAmount);
    }
}