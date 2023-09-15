package interfaceexample;

public class TestingInterface implements Printable,Showable,Drawable {
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drag() {
		System.out.println("Dragging...");
		
	}

	
	public static void main(String[] args) {
		
	TestingInterface ti = new TestingInterface();
	ti.drag();
		
	//  interface  to class possible 
		// Interface i = new Class();
		
	// Class to interface is NOT POSSIBLE
		//Class c = new Interface();
		
		
		

	}


}
