import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import org.junit.Test;

public class randomTest {

	@Test
	public void testFileManage() {
		random Random=new random();
		Vector<String> vec= new Vector<String>();
		vec=Random.fileManage("test.txt", vec);
		int size=vec.size();
		assertEquals(size,7);
		
	}

	@Test
	public void testGetValueN() {
		int length=1000;
		random Random=new random();
		String val1="6";
		int N1=Random.getValueN(length, val1);
		int expected = 6;
		assertEquals(expected,N1);
		/*ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		assertThat(output.toString(), is("Hello");
		System.setOut(System.out);*/
	
	}

	@Test
	public void testBuildCollection() {
	
	}

	@Test
	public void testNewCurrent() {
		random Random=new random();
		String testCurrent="I am happy coding.";
		String result=Random.newCurrent(testCurrent);
		String expectedCurrent="am happy coding.";
		assertEquals(expectedCurrent,result);
	
	}

	@Test
	public void testGetNumOfWords() {
		random Random=new random();
		String val1="60";
		int N1=Random.getNumOfWords(val1);
		assertEquals(60,N1);
		
	}

}
