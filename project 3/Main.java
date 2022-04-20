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

        String quit = "";
        while (quit != "Q"){
        System.out.println("1. Search String");
        System.out.println("2. Add String");
        System.out.println("3. Remove String");
        System.out.println("4. Display Table");
        System.out.println("5. Resize Table");
        System.out.println("Q. Quit");
        System.out.print("Choice: ");
        String input = in.next();

        if (input.equals("1")){
            System.out.println("1");
        }
        else if (input.equals("2")){
            System.out.println("2");
        }
        else if (input.equals("3")){
            System.out.println("3");
        }
        else if(input.equals("4")){
            System.out.println("4");
        }
        else if (input.equals("5")){
            System.out.println("5");
        }
        else if (input.equals("Q")){
            quit = "Q";
        }
    }

        in.close();
    }    
}