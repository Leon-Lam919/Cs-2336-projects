
public class Main {    
    public static void main(String[] args) {
        Expression a  = new Expression();
        a.toString();
        System.out.println("test");

        // TODO: needs to be instaniated with ITerm, not the sub class itself, 
        // TODO: then that needs to be able to be calculated and changed
        
        PolynomialTerm poly = new PolynomialTerm(2, 3);
        System.out.println(poly.evaluate(2));
    }
    
}
