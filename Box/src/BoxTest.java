import static org.junit.Assert.*;

import org.junit.Test;


public class BoxTest {
	
	@Test
public void VolumeTest() {
		
		Box b= new Box();
		b.width=2;
		b.height=2;
		b.length=3;
		
		int v = b.Volume(2, 2, 3);
		int v2 = b.Volume(2, 2, 4);
		
		System.out.println("Test of 2 assertions "+v+" et "+v2);
		assertEquals(12, v);
		assertEquals(16, v2);
	}

}
