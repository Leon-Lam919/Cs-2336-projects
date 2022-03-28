public class ProjLinkedList <T> {
    
    // node class that creates a node
    class node<T>{
        T data;
        node<T> next;

        node (T data){
            this.data = data;
            this.next = null;
        }
    }


    // TODO: needs to work inside the Expression class

    // list class that defines the entire list

        // delcaring head node
        node<T> head;

        // length of list
        private int length = 0;

        // method to add data to end of the linked list
        public void add(T data){
            node<T> temp = new node<>(data);

            // checking if the list has any values yet
            if (this.head == null){
                head = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            length++;

        }

        // method that returns the value of the node that is called
        public int getAt (int position){
            // cannot find a way to iterate the linked list to get to the position

            for (int i = 0; i < position; i++){
                head.next = head;
            }

            return 0; 
        }

        //method that adds a value at any postion of the list
        public void add(int position, T data){
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

        public void display(){
            node<T> current = head;

            if (head == null){
                System.out.println("List is empty");
            }

            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }


}
