package javabasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // java.lang에 없는 것들은 다 import 해줘야한다.

public class ListExer {
	
	public static void main(String[] args) {
		
		List<String> fruitList = new ArrayList<String>()	; // 비어있는 리스트
		
		fruitList.add("오렌지"); // add : 추가하기
		fruitList.add("사과");
		fruitList.add("포도");
		fruitList.add("복숭아");
		fruitList.add("딸기");
		
		System.out.println(fruitList.size()); // size : 몇개 담았냐는 키워드
		
		fruitList.set(1, "바나나"); // set : 바꾸기
		
		fruitList.remove(4); // remove : 지우기
		fruitList.remove("복숭아");
		
		System.out.println(fruitList.size());
		
		System.out.println(fruitList.contains("포도")); // contains : 포함하고 있는 지
		
		System.out.println(fruitList.get(1)); // get : 가져오기
		
		Iterator<String> iter = fruitList.iterator(); // Iterator : 반복자
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		int listSize = fruitList.size();
		for (int i=0; i<listSize; i++) {
			System.out.println(fruitList.get(i));
		}
		
		fruitList.forEach(e -> System.out.println(e)); // 람다함수
		
		fruitList.clear(); // clear : 다 없애기
		
	} // main
	
} // class
