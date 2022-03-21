public class LinkedList {
//TODO: figure out if the linked list works and make sure all the fucntions work within it
// TODO: currrently does not work with other classes and cannot be called from main
    class node<T>{
        T data;
        node<T> next;

        node (T data){
            this.data = data;
            this.next = null;
        }
    }

    public class list<T>{
        node<T> head;

        // length of list
        private int length = 0;

        // default constructor for list
        list(){
            this.head=null;
        }

        // method to add data to end of the linked list
        void add(T data){
            node<T> temp = new node<>(data);

            // checking if the list has any values yet
            if (this.head == null){
                head = temp;
            }
            else{
                node<T> X = head;

                while(X.next != null){
                    X = X.next;
                }
                X.next = temp;
            }
            length++;

        }

        //method that adds a value at any postion of the list
        void add(int position, T data){
            // checking if position is valid
            if(position > length + 1){
                System.out.println("position unavailable");
                return;
            }

            // if the new position is 1, replace the head node
            if (position == 1){

                // temp node that stores prev head val
                node<T> temp = head;

                // new head val
                head = new node<T>(data);

                // new head node points to old head node
                head.next = temp;

                return;
            }

            // temp node for transversal
            node<T> temp = head;
            
            //dummy node with null that stores prev node
            node<T> prev = new node<T>(null);

            // iterating to given position
            while (position - 1 > 0){
                // assigning prev node
                prev = temp;
                //incr to next node
                temp = temp.next;
                // decresing the position
                position--;
            }
            //prev node noew points to new val
            prev.next = new node<T>(data);
            // new val points to former cur val
            prev.next.next = temp;
        }

        // func to remove a node from the LL
        void remove(T key){
            node<T> prev = new node<>(null);

            // dummy node that points to head node
            prev.next = head;

            // node that points to node ahead of head
            node<T> next = head.next;

            // temp node for head
            node<T> temp = head;

            boolean exist = false;

            //if head node needs to be deleted
            if (head.data ==key ){
                // head will point to node after head
                head = head.next;
                exist = true;
            }

            while (temp.next != null){
                if (String.valueOf(temp.data).equals(String.valueOf(key))){
                    // if node is found, prev node points to 
                    // next node, skipping curr node
                    prev.next = next;

                    exist = true;
                }

                // if the node is deleted, decrease length
                if (exist){
                    length--;
                }
                // error msg if val is not on LL
                else{
                    System.out.println("Value given is not on Linked list");
                }
            }
        }

    }

    public static void main(String[] args) {
        
    }
}
