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

    int multiplicativeHash(String data){
        int stringHash = getInitialvalue();
        int multiplier = getHashMultiplier();
        int x = getSize();

        // turns string to stringHash value
        for (int i = 0; i < data.length(); i++){
            stringHash = (stringHash * multiplier) + data.charAt(i);
        }

        // takes the abs value and returns that mod the table size
        stringHash = Math.abs(stringHash);
        return stringHash % x;
    }

    // method that will take the multiplicative hash and an i value that starts at 0 and increments 
    // for each collision
    int doubleHash(int mulitHash, int i){
        //int stringHash = getInitialvalue();
        //int multiplier = getHashMultiplier();
        int prime = getRelativePrime();
        //char[] string = data.toCharArray();
        int x = getSize();

        // double hash
        int index = (((mulitHash % x) + i*(prime - (mulitHash % prime))) % x);
        return index;
    }

    // method that adds the value to the StringHash
    // adds strings according to the hash table val
    // TODO: needs to return false/ failed if it cannot be added to list
    boolean add(String data){
        int x = getSize();
        int i = 0, count = 0;
        // simple for loop to populate array until hash map can be created
        int hashT = multiplicativeHash(data);
        int hashD = doubleHash(hashT, i);
        // while is used for if the string traverses the entire table and cannot find a spot to insert
        System.out.print("Adding " + "\"" + data + "\"");
        while(i != x){
            // if the first double hash = success, insert
            if (hash[hashD].equals("<EMPTY>")){
                    hash[hashD] = data;
                    System.out.println(" -> " + hashD);
                    return true;
            }
            // if the index found by the double hashing is not empty, then increase collision by 1 and test again
            else if (!hash[hashD].equals("<EMPTY>")){
                if (count == 0){
                System.out.print(" -> " + hashD);
                count++;
                }
                i++;
                hashD = doubleHash(hashT, i);
                // if the index after setting collision to 1 is empty, then print its empty and 
                if (hash[hashD].equals("<EMPTY>")){
                    hash[hashD] = data;
                    System.out.println(" -> " + hashD);
                    return true;
                }
                // if i is equal to the table size then fail
                else if (i == x){
                    System.out.println(" -> FAILED");
                    return false;
                }
                // if the hashD is not empty then try again
                else if (!hash[hashD].equals("<EMPTY>")){
                    System.out.print(" -> " + hashD);
                    continue;
                }
            }
        }

        // prints out that the string serached the full table and cannot be inserted anywhere
        return false;
    }

       // method that sees if the StringHash contains the value,
       // TODO: if after traversing all of the vals in the array, val cannot be found, 
       // TODO: return failed and false
       // TODO: if it is found, return and print out true
       boolean contains(String data){
        int x = getSize();
        int i = 0, count = 0;
        // simple for loop to populate array until hash map can be created
        int hashT = multiplicativeHash(data);
        int hashD = doubleHash(hashT, i);
        // while is used for if the string traverses the entire table and cannot find a spot to insert
        System.out.print("Searching for " + "\"" + data + "\"");
        while(i != x){
            // if the first double hash = success, return that it has been found
            if (hash[hashD].equals(data)){
                    hash[hashD] = data;
                    System.out.println(" -> " + hashD);
                    return true;
            }
            // if the index found by the double hashing is not found, then increase collision by 1 and test again
            else if (!hash[hashD].equals(data)){
                if (count == 0){
                System.out.print(" -> " + hashD);
                count++;
                }
                i++;
                hashD = doubleHash(hashT, i);
                // if the index after setting collision to 1 equals the data given, then print and return true
                if (hash[hashD].equals(data)){
                    System.out.println(" -> " + hashD);
                    return true;
                }
                // if it goes through the entire table and cannot find it, then print FAILED and return false
                else if (i == x){
                    System.out.println(" -> FAILED");
                    return false;
                }
                // if the value in the table does not equal data, then print and try again
                else if (!hash[hashD].equals(data)){
                    System.out.print(" -> " + hashD);
                    continue;
                }
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
        int i = 0, count = 0;
        // simple for loop to populate array until hash map can be created
        int hashT = multiplicativeHash(data);
        int hashD = doubleHash(hashT, i);
        // while is used for if the string traverses the entire table and cannot find a spot to insert
        System.out.print("Removing " + "\"" + data + "\"");
        while(i != x){
            // if the first double hash = success, return that it has been found
            if (hash[hashD].equals(data)){
                    hash[hashD] = "<REMOVED>";
                    System.out.println(" -> " + hashD);
                    return true;
            }
            // if the index found by the double hashing is not found, then increase collision by 1 and test again
            else if (!hash[hashD].equals(data)){
                if (count == 0){
                System.out.print(" -> " + hashD);
                count++;
                }
                i++;
                hashD = doubleHash(hashT, i);
                // if the index after setting collision to 1 equals the data given, then print and return true
                if (hash[hashD].equals(data)){
                    hash[hashD] = "<REMOVED>";
                    System.out.println(" -> " + hashD);
                    return true;
                }
                // if it goes through the entire table and cannot find it, then print FAILED and return false
                else if (i == x){
                    System.out.println(" -> FAILED");
                    return false;
                }
                // if the value in the table does not equal data, then print and try again
                else if (!hash[hashD].equals(data)){
                    System.out.print(" -> " + hashD);
                    continue;
                }
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
