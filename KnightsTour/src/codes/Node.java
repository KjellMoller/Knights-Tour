package codes;

public class Node {
	private int data;
	private Node left;
	private Node right; 
	private Node up;
	private Node down;
	

public Node (int data) {
	this.data = data;
}


public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public Node getLeft() {
	return left;
}

public void setLeft(Node left) {
	this.left = left;
}

public Node getRight() {
	return right;
}

public void setRight(Node right) {
	this.right = right;
}

public Node getDown() {
	return down;
}

public void setDown(Node down) {
	this.down = down;
}

public Node getUp() {
	return up;
}

public void setUp(Node up) {
	this.up = up;
}


}