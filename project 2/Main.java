
public class Main {    
    public static void main(String[] args) {
        Expression a  = new Expression();
        a.toString();
        System.out.println("test");

        TrigType x = TrigType.COSINE;

        // TODO: needs to be instaniated with ITerm, not the sub class itself, 
        // TODO: then that needs to be able to be calculated and changed
    
        // declaring an instance of the LinearTerm class
        LinearTerm lin = new LinearTerm(3);

        // declaring an instance of the PolyTerm class
        PolynomialTerm poly = new PolynomialTerm(1, 1);
        
        // prints out the number passed with an "x" after
        // System.out.println(t1);

        // instantiating new LinearTerm
        //ITerm term = new LinearTerm();

        // works when using instantiation doesnt when using ITerm
        System.out.println(lin.evaluate(3));

        System.out.println(poly.PolyTerm(24, 3));
        System.out.println(poly.evaluate(9));
        

        TrigTerm q = new TrigTerm(3, TrigType.COSINE);

        System.out.println(q);

        // works in main but not any other class
        // ProjLinkedList<Integer> LL = new ProjLinkedList<>();
        
        // LL.add(3);
        // LL.add(9);
        // LL.add(32);
        // LL.add(4);

        // LL.display();
    }
    
    
}
