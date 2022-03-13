public class LinkedList {
    class node<T>{
        T data;
        node<T> next;

        node (T data){
            this.data = data;
            this.next = null;
        }
    }

    class list<T>{
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

                
                head.next = temp;

                return;
            }
        }

    }
}
