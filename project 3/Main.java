import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // asking for table size
        System.out.print("Enter table size: ");
        int table = in.nextInt();

        // asking for initial hash val
        System.out.print("Enter initial hash value: ");
        int hashVal = in.nextInt();

        // asking for hash multiplier
        System.out.print("Enter hash multiplier: ");
        int hashMulti = in.nextInt();

        // asking for prime val
        System.out.print("Enter relative prime value: ");
        int primeVal = in.nextInt();

        // creating an instance of the StringHash obj, passing all the above values to it
        StringHash SH = new StringHash(table, hashVal, hashMulti, primeVal);

        // menu with while loop to keeping running while usr doesn't choose "Q"
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
            System.out.print("String to add: ");
            String data = in.next();
            SH.add(data);
        }
        else if (input.equals("3")){
            System.out.println("3");
        }
        else if(input.equals("4")){
            SH.displayTable();
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