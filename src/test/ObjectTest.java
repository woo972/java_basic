package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObjectTest {

	@Test
	void test_null�����Ұ�() {
		Assertions.assertThrows(NullPointerException.class, ()->{
			String s = null;
			s.length();
		});
	}
	
	@Test
	void test_memory�ּ�����() {
		int a = 1;
		int b = a;
		b = 2;
		Assertions.assertTrue(a != b, "���� �ٸ� �޸𸮿� �Ҵ�");
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = list1;
		list2.add(1);
		Assertions.assertTrue(list1.size() == list2.size(), "������ �޸𸮸� ����");
	}
}
