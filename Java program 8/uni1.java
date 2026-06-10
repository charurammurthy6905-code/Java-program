class Node {
int data;
Node left, right;
Node(int data) {
this.data = data;
}
}
public class uni1 {
public static void main(String[] args) {
Node root = new Node(10);
root.left = new Node(5);
root.right = new Node(15);
root.left.left = new Node(3);
root.left.right = new Node(7);
System.out.println("Root Node: " + root.data);
System.out.println("Left Child of Root: " + root.left.data);
System.out.println("Right Child of Root: " + root.right.data);
System.out.println("Left Child of 5: " + root.left.left.data);
System.out.println("Right Child of 5: " + root.left.right.data);
}
}