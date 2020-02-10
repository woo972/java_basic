package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObjectTest {

	@Test
	void test_null참조불가() {
		Assertions.assertThrows(NullPointerException.class, ()->{
			String s = null;
			s.length();
		});
	}
	
	@Test
	void test_memory주소참조() {
		int a = 1;
		int b = a;
		b = 2;
		Assertions.assertTrue(a != b, "서로 다른 메모리에 할당");
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = list1;
		list2.add(1);
		Assertions.assertTrue(list1.size() == list2.size(), "동일한 메모리를 참조");
	}
}
