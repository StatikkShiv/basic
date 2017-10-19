package com.liyun.reflect;

public class Person implements InterFace {

	private String id;
	
	private String name;
	
	public String age;
	
	//构造函数1
	public Person() {
		System.out.println("构造函数 无参");
	}
	
	//构造函数2
	public Person(String id) {
		this.id = id;
		System.out.println("构造函数 id: "+id);
	}
    
	//构造函数3

	public Person(String id, String name) {
		super();
		this.id = id;
		System.out.println("构造函数 id :"+id+ " name: "+name);
		this.name = name;
	}
	
    //get set 方法
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	//静态方法
	public static void update() {
		
	}
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
