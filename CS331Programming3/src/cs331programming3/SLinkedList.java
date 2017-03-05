package cs331programming3;
//Singly-linked list.
public class SLinkedList {
    private Node head;
    private int size; 
    public SLinkedList() {
        head = null;   
        size = 0;
    }
    //Add to node at the end.
    public void addLast(double cost, double probability, int row) {
        Node newNode = new Node(row, size, cost, probability, null);     
        if(size == 0) {
            head = newNode;
            size = size + 1;
        } else {
            Node temp = head;
            while(temp.getNext() != null) {
            temp = temp.getNext();
            }
            temp.setNext(newNode);
            size = size + 1;
        }
    }
    //Another add method that is used for contructing op linked list.
    public void addLastOP(Node source) {
        if (size == 0) {
            head = source;
            size = size + 1;
        } else {
            Node temp = head;
            while(temp.getNext() != null) {
            temp = temp.getNext();
            }
            temp.setNext(source);
            size = size + 1;
        }
    }
    //Delete the head.
    public void deleteFirst() {    
        if (size == 0) {
            System.out.println("The linked list is empty. "
                    + "Cannot perform deletion.");
        } else {
            Node temp = head;
            head = temp.getNext();
            temp.setNext(null);      
            size = size - 1;
        }
       
    }
    //Compute ratio for each test.
    public void computeRatio() {
        double curCost;
        double curProb;
        double totalCost = 0;
        double totalProb = 0; 
        if (size == 0) {
            System.out.println("The linked list is empty. "
                    + "Cannot compute ratio.");
        } else {
            Node temp = head;
            while(temp != null) {
                curCost = temp.getCost();
                curProb = temp.getProbability();
                totalCost = totalCost + curCost;
                totalProb = totalProb + curProb;
                temp.setRatio(totalCost, totalProb);
                temp = temp.getNext();
            }
        }
    }   
    //Get the lowest ratio of a linked list.
    public double getMinRatio() {
        double minRatio = 0;
        if (size == 0) {
            System.out.println("The linked list is empty. "
                    + "Cannot find the lowest ratio.");
        } else {
            Node temp = head;
            while(temp != null) {
                if (temp == head) {
                    minRatio = temp.getRatio();
                } else {
                    if (minRatio > temp.getRatio())
                        minRatio = temp.getRatio();
                }
                temp = temp.getNext();
            }
        }
        return minRatio;
    }
    //Check if a linked list has the lowest ratio.
    public boolean hasMinRatio(double minRatio) {
        boolean check = false;
        if (size == 0) {
            System.out.println("The linked list is empty. "
                    + "No lowest ratio.");
        } else {
            Node temp = head;
            while(temp != null && !check) {
                if (temp.getRatio() == minRatio)
                    check = true;
                temp = temp.getNext();
            }
        }
        return check;
    }
    //Check if a linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }
    //Move nodes from a linked list to the op linked list and delete them
    //from the linked list.
    public void move(double minRatio, SLinkedList op) {
        Node temp = head;
        while (temp != null && temp.getRatio() != minRatio) {          
            op.addLastOP(head);
            deleteFirst();
            temp = head;
        }
        op.addLastOP(head);
        deleteFirst();
    }
    //Print a linked list.
    public void print() {
        if (size == 0) {
            System.out.println("The linked list is empty. "
                    + "Cannot print.");
        } else {
            Node curNode = head;
            while(curNode != null) {
                System.out.println("Row = " + curNode.getRow() + " Column = " + 
                        curNode.getColumn() + " Cost = " + curNode.getCost() + 
                        " Prob = " + curNode.getProbability() + " Ratio = " + 
                        curNode.getRatio());
                curNode = curNode.getNext();
            }
        }
    }
}