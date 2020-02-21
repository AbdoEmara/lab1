package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class juc {

	@Test
	void test() {
		jhk test = new jhk();
		int z = test.add(2,3);
		assertEquals(5, z);
		int z1 = test.add(3,3);
		assertEquals(6, z1);
		int z2 = test.add(2,4);
		assertEquals(6, z2);
		int z3 = test.add(1,4);
		assertEquals(5, z3);
	}

}
