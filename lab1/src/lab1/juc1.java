package lab1;

import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;

class juc1 {

	@Test
	void test() {
		jhk test = new jhk();
	float oput = test.div(9, 2) ;
	assertEquals(4.5, oput, 0) ;
	oput = test.div(5, 3);
	assertEquals(1.66, oput, 0.1);
	}

}
