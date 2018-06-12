package oca.basics;

public class Cat {
	private int age;
	public Cat(int age1){
		age = age1;
	}
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	//overshadowing age variable
	public void setAge(int age){
		if (age > 0){
			this.age = age;
		}
	}

}
