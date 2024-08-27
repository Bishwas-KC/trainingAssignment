package assignmentThree;

public class TestMethod {
	
	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.displayParent();

		Child child = new Child();
		child.displayChild();
		
		child.displayParent();
	}

}
