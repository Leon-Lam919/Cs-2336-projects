
public class Main {    
    public static void main(String[] args) {
        Expression a  = new Expression();
        a.toString();
        System.out.println("test");

        TrigType x = TrigType.COSINE;

        // TODO: needs to be instaniated with ITerm, not the sub class itself, 
        // TODO: then that needs to be able to be calculated and changed
    
        // declaring an instance of the LinearTerm class
        LinearTerm lin = new LinearTerm();
        // passing an int to a method inside the LinearTerm class 
        String t1 = lin.linearTerm(9912);
        // prints out the number passed with an "x" after
        // System.out.println(t1);

        // instantiating 
        ITerm term = new LinearTerm();

        System.out.println(lin.linearTerm(6));
        System.out.println(term.evaluate(1));

        // ProjLinkedList<Integer> LL = new ProjLinkedList<>();
        
        // LL.add(3);
        // LL.add(9);
        // LL.add(32);
        // LL.add(4);

        // LL.display();     
    }
    
    
}
