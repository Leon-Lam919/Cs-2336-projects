import java.lang.String;

public class StringHash {
    private int size, initialvalue, hashMultiplier, relativePrime;
    private String [] hash;

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
        // sets the size and sets the hash array size
        this.size = size;
        this.hash = new String[size];

        setInitialValue(initialvalue);
        setHashMultiplier(hashMultiplier);
        setRelativePrime(relativePrime);
    }

    // method that sees if the StringHash contains the value
    boolean contains(String data){
        return false;
    }

    // method that adds the value to the StringHash
    // will add strings according to the hash
    boolean add(String data){
        int x = getSize();
        // simple for loop to populate array until hash map can be created
        for(int i = 0; i < x; i++){
                if (hash[i] == null){
                    hash[i] = data;
                }
                else{
                    continue;
                    
                }
            }
        return false;
    }


    
    boolean remove(String data){
        return false;
    }

    // method displays the table
    void displayTable(){
        int x = getSize();
        
        // checks the array and sees if it is null, then set Empty inside of it, otherwise it will have a string inside of it
        for (int i = 0; i < x; i++){
            if (hash[i] == null){
                hash[i] = "<EMPTY>";
            }
            System.out.println(i + " : " + hash[i]);
        }
    }

    void resize(){

    }
}
