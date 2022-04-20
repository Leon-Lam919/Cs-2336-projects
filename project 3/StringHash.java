import java.lang.String;

public class StringHash {
    private int size, initialvalue, hashMultiplier, relativePrime;
    private String [] hash = new String [getSize()];

    // size setter
    public void setSize(int size) {
        this.size = size;
    }

    public void setInitialValue(int initialvalue){
        this.initialvalue = initialvalue;
    }

    public void setHashMultiplier(int hashMultiplier){
        this.hashMultiplier = hashMultiplier;
    }

    public void setRelativePrime(int relativePrime){
        this.relativePrime = relativePrime;
    }
    
    public int getSize(){
        return size;
    }

    public int getInitialvalue() {
        return initialvalue;
    }

    public int getHashMultiplier() {
        return hashMultiplier;
    }
    
    public int getRelativePrime() {
        return relativePrime;
    }

    // constructor StringHash method
    public StringHash(int size, int initialvalue, int hashMultiplier, int relativePrime){
        setSize(size);
        setInitialValue(initialvalue);
        setHashMultiplier(hashMultiplier);
        setRelativePrime(relativePrime);
    }

    // method that sees if the StringHash contains the value
    boolean contains(String data){
        return false;
    }

    // method that adds the value to the StringHash
    boolean add(String data){
        return false;
    }

    
    boolean remove(String data){
        return false;
    }

    void displayTable(){

    }

    void resize(){

    }
}
