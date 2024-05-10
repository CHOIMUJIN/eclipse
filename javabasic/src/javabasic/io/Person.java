package javabasic.io;

import java.io.Serializable;

public class Person implements Serializable {
	
		// network 상에서 Person의 ID
		public static final long serialVersionUID = 124089712478903L;
		
		public String name;
		public int age;
		private String sno; // 주민번호
			
		public Person() {
		}

		public Person(String name, int age, String sno) {
			super();
			this.name = name;
			this.age = age;
			this.sno = sno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

			public int getAge() {
				return age;
			}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSno() {
			return sno;
		}

		public void setSno(String sno) {
			this.sno = sno;
		}

		@Override
		public String toString() {
			return "ObjectExer [name=" + name + ", age=" + age + ", sno=" + sno + "]";
		}

}
