import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // asking for table size
        // please table size
        System.out.print("Enter table size: ");
        int table = in.nextInt();

        // asking for initial hash val
        // pretty please
        System.out.print("Enter initial hash value: ");
        int hashVal = in.nextInt();

        // asking for hash multiplier
        // pretty please with a cherry on top
        System.out.print("Enter hash multiplier: ");
        int hashMulti = in.nextInt();

        // asking for prime val
        System.out.print("Enter relative prime value: ");
        int primeVal = in.nextInt();

        // creating an instance of the StringHash obj, passing all the above values to it
        StringHash SH = new StringHash(table, hashVal, hashMulti, primeVal);

        // menu with while loop to keeping running while usr doesn't choose "Q"
        // "Q" is obviously the wrong choice
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

        // search
        // like how I search for a girlfriend
        if (input.equals("1")){
            System.out.print("String to search for: ");
            String data = in.next();
            SH.contains(data);
        }
        // add string
        // we love that string
        else if (input.equals("2")){
            System.out.print("String to add: ");
            String data = in.next();
            SH.add(data);
        }
        // remove string
        // because fuck that string
        else if (input.equals("3")){
            System.out.print("String to remove: ");
            String data = in.next();
            SH.remove(data);
        }
        // display table
        // what a nice addition to the kitchen
        else if(input.equals("4")){
            SH.displayTable();
        }
        // resize table
        // oh wait it doesn't fit in here
        else if (input.equals("5")){
            SH.resize();
        }
        // breaks out of while loop
        // (jail break, you know?)
        else if (input.equals("Q")){
            quit = "Q";
        }
    }

        in.close();
    }    
}