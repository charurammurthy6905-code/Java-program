class Node{
int data;
Node left;
Node right;
Node(int data) {
this.data = data;
}
}
public class choco {
public static void main(String[] args){
Node root = new Node(10);
root.left = new Node(5);
root.right = new Node(15);
System.out.println("Left Child: " + root.left.data);
System.out.println("Right Child: " + root.right.data);
}
}

