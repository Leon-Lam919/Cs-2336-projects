class Expression{
    
    //constructor method 
    public Expression(){}

    // getter taht returns a new expression object containing the derivate of each term of the original obj
    public Expression getDerivative(){
        // created instance of expression and returns expression
        Expression E = new Expression();
        return E;
    }

    // TODO: get the evaluation of the expression that is sent in
    // gets eval
    public double getEvaluation(double expression){
        // returns double
        return 0.0;

    }

    public String toString(){
        // TODO: returns the input to string type
        return null;
    }

    public void add(ITerm x){

        // TODO: add ITerm objects to the linked list
        
    }

    //TODO: create a ProjLinkedList of ITerms

    ProjLinkedList<ITerm> LL = new ProjLinkedList<>();

    

}
