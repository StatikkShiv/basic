package com.liyun.reflect;

public class Person implements InterFace {

	private String id;
	
	private String name;
	
	public String age;
	
	//���캯��1
	public Person() {
		System.out.println("���캯�� �޲�");
	}
	
	//���캯��2
	public Person(String id) {
		this.id = id;
		System.out.println("���캯�� id: "+id);
	}
    
	//���캯��3

	public Person(String id, String name) {
		super();
		this.id = id;
		System.out.println("���캯�� id :"+id+ " name: "+name);
		this.name = name;
	}
	
    //get set ����
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

	//��̬����
	public static void update() {
		
	}
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
