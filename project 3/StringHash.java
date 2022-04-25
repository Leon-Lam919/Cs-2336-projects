import java.lang.String;

public class StringHash {
    // setters for initialval, hash multiplier and relative prime
    private int size, initialvalue, hashMultiplier, relativePrime;
    private String [] hash;

    // setter for initial val
    public void setInitialValue(int initialvalue){
        this.initialvalue = initialvalue;
    }

    // hash multiplier setter
    public void setHashMultiplier(int hashMultiplier){
        this.hashMultiplier = hashMultiplier;
    }

    // relative prime setter
    public void setRelativePrime(int relativePrime){
        this.relativePrime = relativePrime;
    }
    
    // size getter
    public int getSize(){
        return size;
    }

    // initial val getter
    public int getInitialvalue() {
        return initialvalue;
    }

    // hash multiplier getter
    public int getHashMultiplier() {
        return hashMultiplier;
    }
    
    // relative prime getter
    public int getRelativePrime() {
        return relativePrime;
    }

    // constructor StringHash method
    public StringHash(int size, int initialvalue, int hashMultiplier, int relativePrime){
        // sets the size and sets the hash array size
        this.size = size;
        this.hash = new String[size];
        for(int i = 0; i < size; i++){
            if (hash[i] == null){
                hash[i] = "<EMPTY>";
            }
        }

        // sets the rest of the values
        setInitialValue(initialvalue);
        setHashMultiplier(hashMultiplier);
        setRelativePrime(relativePrime);
    }

    // method that will take the initial val and the multiplier and run through the string and find
    // the hash val of it
    int hashMultiplicative(String data){
        int stringHash = getInitialvalue();
        int multiplier = getHashMultiplier();
        char[] string = data.toCharArray();
        int x = getSize();

        // using a for loop, will take the string and add it to the hash val
        // returns the string hash % table which is the index to put the string into
        for (int i = 0; i < data.length(); i++){
            stringHash = (stringHash * multiplier) + string[i];
        }
        return stringHash % x;
    }

    int doubleHash(String data){
        int stringHash = getInitialvalue();
        int multiplier = getHashMultiplier();
        int prime = getRelativePrime();
        char[] string = data.toCharArray();
        int x = getSize();

        //String that could not be hashed, now must be double hashed

        // for loop that will hash the string first
        for (int i = 0; i < data.length(); i++){
            stringHash = (stringHash * multiplier) + string[i];
        }
        stringHash = stringHash % x;

        for (int j = 0; j < x; j++){
            if (hash[j].equals("<EMPTY>")){
                int index = ((stringHash % x) + j*(prime - (stringHash % prime)));
                return index;
            }
        }
        return 0;

    }

    // method that adds the value to the StringHash
    // adds strings according to the hash table val
    // TODO: needs to return false/ failed if it cannot be added to list
    boolean add(String data){
        int x = getSize();
        // simple for loop to populate array until hash map can be created
        for(int i = 0; i < x; i++){
                if (hash[i].equals("<EMPTY>")){
                    hash[i] = data;
                    System.out.println("Adding " + "\"" + data + "\" -> " + i);
                    return true;
                }
                else if(!(hash[i].equals("<EMPTY>"))){
                    int doubleHash = doubleHash(data);
                    int j = 0;
                    if (j == 0){
                    hash[doubleHash] = data;
                    System.out.print("Adding " + "\"" + data + "\"");
                    j++;
                    }
                    else if (i != doubleHash){
                        System.out.print(" -> " + i);
                    }
                    else{
                    System.out.println(" -> " + doubleHash);
                    return true;
                    }
                }
            }
        return false;
    }

       // method that sees if the StringHash contains the value,
       // TODO: if after traversing all of the vals in the array, val cannot be found, 
       // TODO: return failed and false
       // TODO: if it is found, return and print out true
       boolean contains(String data){
        int x = getSize();
        for (int i = 0; i < x; i++){
            if (hash[i].equals(data)){
                System.out.println("Searching \"" + data + "\" -> " + i + " TRUE");
                return true;
            }
        }
        return false;
    }
    
    // TODO: will remove the string from the array
    // TODO: if not there, will return failed
    // TODO: if it is there, remove and return true
    // TODO: relist the spot as removed and not empty or filled
    boolean remove(String data){
        int x = getSize();
        for (int i = 0; i < x; i++){
            if (hash[i].equals(data)){
                System.out.println("Removing \"" + data +"\" -> " + i);
                hash[i] = "<REMOVED>";
                return true;
            }
        }
        return false;
    }

    // method displays the table
    void displayTable(){
        int x = getSize();
        
        // checks the array and sees if it is null, then set Empty inside of it, otherwise it will have a string inside of it
        for (int i = 0; i < x; i++){
            System.out.println(i + " : " + hash[i]);
        }
    }

    // TODO: needs to double the size of the array
    // TODO: rehash the values inside the array to the correct spot
    void resize(){
        int x = getSize();

        String[] temp = new String [x*2];

        for (int i = 0; i < x; i++){
            hash[i] = temp[i];
            hash[i*2] = temp[i];
        }
    }
}
