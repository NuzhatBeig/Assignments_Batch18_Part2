package Inheritance.tigersclass;

public class American extends Tiger {

	public American(String name, String habitat) {
		super(name, habitat);
		
	}

	@Override
	public void height() {
		System.out.println("Height is 13");
		
	}

}
