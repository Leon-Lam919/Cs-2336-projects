
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
        
        // prints out the number passed with an "x" after
        // System.out.println(t1);

        // instantiating new LinearTerm
        //ITerm term = new LinearTerm();

        // works when using instantiation doesnt when using ITerm
        System.out.println(lin.linearTerm(-69));
        System.out.println(lin.evaluate(3.12));
        
        
        // works in main but not any other class
        // ProjLinkedList<Integer> LL = new ProjLinkedList<>();
        
        // LL.add(3);
        // LL.add(9);
        // LL.add(32);
        // LL.add(4);

        // LL.display();
    }
    
    
}
