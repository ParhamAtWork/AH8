class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
}

class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) { // checks if a target value exists in linked list
        Node<T> current = head; 
        while (current != null) {
            if (current.val.equals(target)) {
                return true; 
            }
            current = current.next;
        }
        return false; 
        // starts from head and traverses until it finds target val or reaches end of list
        
    }

    // test cases below
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        

        System.out.println(Source.linkedListFind(a, "c"));
       
        Node<Integer> node1 = new Node<>(100);

        System.out.println(Source.linkedListFind(node1, 100)); 
    }
}
