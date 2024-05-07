package javabasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExer {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>(); // Integer : int의 기본타입을 갖고있는 참조타입
		
		set.add(100); // auto boxing(rapping) : 기본타입을 넣었지만 자동적으로 참조타입으로 해석
		set.add(200); // 기본타입과 참조타입은 서로 형변환이 절대 안 됨, 다른 개념임
		set.add(300);
		set.add(400);
		set.add(500);
		
		System.out.println(set.size());
		
		System.out.println(set.contains(300));
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		set.forEach(e -> System.out.println(e));
		
		set.add(100);
		set.add(100);
		
		set.forEach(e -> System.out.println(e));
		
		Object[] iArray = (Object[])set.toArray();
		int iArrayLeng = iArray.length;
		for (int i=0; i<iArrayLeng; i++) {
			System.out.println(iArray[i]);
		}
		
	} // main

} // class
