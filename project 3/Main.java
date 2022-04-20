import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter table size: ");
        int table = in.nextInt();

        System.out.print("Enter initial hash value: ");
        int hashVal = in.nextInt();

        System.out.print("Enter hash multiplier: ");
        int hashMulti = in.nextInt();

        System.out.print("Enter relative prime value: ");
        int primeVal = in.nextInt();

        StringHash SH = new StringHash(table, hashVal, hashMulti, primeVal);

        System.out.print("1. Search String \n 2. Add String \n 3. Remove String \n 4. Display Table \n 5. Resize Table \n Q. Quit \n Choice: ");
        String input = in.next();

        if (input.equals("1")){
            System.out.println("1");
        }
        else{
            System.out.println("not choice");
        }

        in.close();
    }    
}