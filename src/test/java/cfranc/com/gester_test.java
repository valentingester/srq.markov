package cfranc.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;



public class gester_test {

	@Test
	public void test1(){
		Markov m = new Markov();
		m.readFile("test.txt");
		Couple p = new Couple("attention", "salut");
		assertEquals(2, m.couples.size());
	}
	
	
	//il doit toujours nous renvoyer "il fait beau" car il n'a que ca dans sa librairi
	@Test
	public void test2() {
		Markov m = new Markov();
		m.readFile("test2.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 3);
		assertNotNull(res);
		System.out.println(res);
	}
	
	@Test
	public void test3() {
		Couple p = new Couple("maman", "maman");
		int result = p.hashCode();
		int expResult = "maman".hashCode()*2;
		assertEquals(expResult,result);
	}
	
}
