package cs331programming3;
//Node class
public class Node {   
    private double cost;
    private double probability;
    private double ratio;
    private int row;
    private int column;
    private Node next; 
    public Node(int row, int column, double cost, double probabilty, 
            Node next) {
        this.row = row;
        this.column = column;
        this.cost = cost;
        this.probability = probabilty;
        this.next = next;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getProbability() {
        return probability;
    }
    public void setProbability(double probability) {
        this.probability = probability;
    }
    public double getRatio() {
        return ratio;
    }
    public void setRatio(double cost, double probabilty) {
        ratio = cost/probabilty;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }   
}