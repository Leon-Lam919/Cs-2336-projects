

enum TrigType {

    COSINE("COSINE"), SIN("SIN");

    private final String type;

    private TrigType(String type){
        this.type = type;
    }
    public String getType(){return type;}
}


//TODO: make sure that this eumeration class works with everything else 
class TrigSwitch{
    public static void main(String[] args) {
        TrigType t;
    }
}
