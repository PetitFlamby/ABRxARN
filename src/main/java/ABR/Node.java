package ABR;

public class Node {

    private Object value ;
    private Node leftSon ;
    private Node rightSon ;

    public Node(){
        this.value = null ;
        this.leftSon = null ;
        this.rightSon = null ;
    }

    public Node(Object value){
        this.value = value ;
        this.rightSon = null ;
        this.leftSon = null ;
    }

    public Object getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }
    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }
}
