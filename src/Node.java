public class Node {
    private final int frequency;
    private Node leftNode;
    private Node rightNode;

    public Node(Node leftNode, Node rightNode) {
        this.frequency = leftNode.getFrequencey() +rightNode.getFrequncy();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public int compareTo(Node node){
        return Integer.compare(frequency,node.getFrequency());
    }
}
