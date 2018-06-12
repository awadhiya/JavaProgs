package oca.basics;

public class MyVariableAnalysis {

	public static void main(String[] args) {
		int a = 3;
		
		doSomething(a);
		System.out.println(a);
		Cat myCat = new Cat(5);
		System.out.println(myCat.getAge());
       doSomething(myCat);
       System.out.println(myCat.getAge());
       Cat yourCat = new Cat(5);
       System.out.println(5 == 5);
       System.out.println(myCat == yourCat);
       Cat thisCat = myCat;
       System.out.println(thisCat == myCat);
       System.out.println(thisCat.getAge());
       myCat = null;
       System.out.println(thisCat.getAge());
       //System.out.println(myCat.getAge());
       thisCat = myCat;
       //System.out.println(thisCat.getAge());
       System.out.println(thisCat == myCat);
       
	}
	static void doSomething(int x) {
		x = 6;
	}
	static void doSomething (Cat z){
		z.setAge(6);
	}
}
