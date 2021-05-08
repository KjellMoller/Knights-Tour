package codes;

public class KnightsTour{
	
private static Node first;
public static int dimension;
public static int counter= 0;

	public void Board(int dim){
		dimension = dim;
		first = null;
		if(dimension > 0) {
			int counter = 1;
			
			//Creating first Node
			first = new Node(0);
			Node columnMarker = first;
			Node rowMarker = first;
			
			//Creating first row
			for(int x = 0; x < dimension-1; x++) {
				columnMarker.setRight(new Node(0));
				columnMarker.getRight().setLeft(columnMarker);
				columnMarker = columnMarker.getRight();
			}
			for(int y = 0; y < dimension-1; y++) {
				
			//Creating first Node in new row
				rowMarker.setDown(new Node(0));
				rowMarker.getDown().setUp(rowMarker);
				
				rowMarker = rowMarker.getDown();
				columnMarker = rowMarker;
			
			//Creating rest of row
			for(int x = 0; x < dimension-1; x++) {
				columnMarker.setRight(new Node(0));
				columnMarker.getRight().setLeft(columnMarker);
				columnMarker.getRight().setUp(columnMarker.getUp().getRight());
				columnMarker.getRight().getUp().setDown(columnMarker.getRight());
				columnMarker = columnMarker.getRight();
			}
			}
			}
		}
	
	
	public static void display() {
		System.out.println();
		Node temp = first;
		Node rowMarker = first;
		while(rowMarker != null) {
			while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
			}
			temp = rowMarker.getDown();
			rowMarker = temp;
			System.out.println(); 
		}
		System.out.println();
	}
	
	public static void Tour() {
		Path(first, 1);
	}
	public static void Path(Node current, int number) {
		
		current.setData(number);
		if(number == dimension*dimension) {
			counter++;
			System.out.println("Found solution # " + counter);
			display();
		}
		
		if(number < 64){
		try {
			if(current.getUp().getUp().getLeft().getData() == 0) {
				Path(current.getUp().getUp().getLeft(), number+1);
		}
		}catch(Exception e){}
		try {
			if(current.getUp().getUp().getRight().getData() == 0) {
				Path(current.getUp().getUp().getRight(), number+1);
		}
		}catch(Exception e) {}
		try {
			if(current.getRight().getRight().getUp().getData() == 0) {
				Path(current.getRight().getRight().getUp(), number+1);
		}}catch(Exception e) {}
		try {
			if(current.getRight().getRight().getDown().getData() == 0) {
				Path(current.getRight().getRight().getDown(), number+1);
		}}catch(Exception e) {}
		try {
			if(current.getDown().getDown().getRight().getData() == 0) {
				Path(current.getDown().getDown().getRight(), number+1);
		}}catch(Exception e) {}
		try {
			if(current.getDown().getDown().getLeft().getData() == 0) {
				Path(current.getDown().getDown().getLeft(), number+1);
		}}catch(Exception e) {}
		try {
			if(current.getLeft().getLeft().getDown().getData() == 0) {
				Path(current.getLeft().getLeft().getDown(), number+1);
		}}catch(Exception e) {}
		try {
			if(current.getLeft().getLeft().getUp().getData() == 0) {
				Path(current.getLeft().getLeft().getUp(), number+1);
		}}catch(Exception e) {}
		}
		
		if(current.getData()!=1) {
			current.setData(0);
		}
		
	}
	

}
