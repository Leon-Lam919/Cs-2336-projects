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

        ConstantTerm c = new ConstantTerm(0);
        c.derivative();
        
    }
    
}
