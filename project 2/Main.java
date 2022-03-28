// Leon Lam
// CS 2336.002
// Professor: Gorndon Arnold
// Due date: 3/29/2022
// This program will take inputs of int or trig type and return an evaluation, the value with the
// correct value or the evaluation of given values

public class Main {    
    public static void main(String[] args) {
        Expression a  = new Expression();
        a.toString();
        //System.out.println("test");

        // TODO: needs to be instaniated with ITerm, not the sub class itself, 
        // TODO: then that needs to be able to be calculated and changed

        TrigTerm tig = new TrigTerm(-6, TrigType.COSINE);

        System.out.println(tig.evaluate(45));
        
        PolynomialTerm poly = new PolynomialTerm(3, 3);
        System.out.println(poly.derivative());

        ProjLinkedList<Integer> list = new ProjLinkedList<Integer>();
        list.add(3);
        list.display();
    }
    
}
