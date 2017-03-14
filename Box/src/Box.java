
public class Box {

	/**
	 * @param args
	 */
	int width;
	int height;
	int length;
	
	public int Volume(int w, int h, int l) {
		
		return w*h*l;
	}
	
	//Main function
	public static void main(String[] args) {
		
		Box b = new Box();
		b.width=2;
		b.height=2;
		b.length=3;
		
		System.out.println("Hello Box "+b.Volume(2,2,3));

		
		int a1 = 1;
		int a2= 20;
		if (a1 == a2)
			System.out.println("Equality");
	}

}
