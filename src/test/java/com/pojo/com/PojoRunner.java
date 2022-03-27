package com.pojo.com;

public class PojoRunner {
	
	public static void main(String[] args) {
		
		
		PojoClass_1 obj = new PojoClass_1();
		
		obj.setName("Iniyan");
		obj.setAge(2);
		int age = obj.getAge();
		String name= obj.getName();
		System.out.println("name is = "+name+ " age is ="+ age);
	}

}
