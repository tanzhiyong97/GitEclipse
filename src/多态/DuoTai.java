package 多态;

class jiBaseClass{
	public int book=6;
	public void base() {
		System.out.println("父类的普通方法");
	}
	public void test() {
		System.out.println("父类被覆盖的方法");
	}
}

public class DuoTai extends jiBaseClass {
	//重新定义一个book实例属性覆盖父类的book实例属性
	public String book="Android江湖";
	public void test() {
		System.out.println("子类的覆盖父类的方法");
	}
	public void sub() {
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args) {
		//下面编译时类型和运行时类型完全一样，因此不存在多态
		jiBaseClass bc=new jiBaseClass();
		//输出6
		System.out.println(bc.book);
		//下面两次调用将执行jiBaseClass的方法
		bc.base();
		bc.test();
		
		//下面编译时烈性和运行时类型完全一样，因此不存在多态
		DuoTai sc=new DuoTai();
		//输出“Android江湖”
		System.out.println(sc.book);
		//下面调用将执行从父类继承到的base方法
		sc.base();
		//下面调用将执行从父类继承到的test方法
		sc.test();
		//下面调用将执行当前类的sub方法
		sc.sub();
		
		//下面编译时类型和运行时类型不一样，多态发生
		jiBaseClass sanYin=new DuoTai();
		//输出6，这表明访问的是父类的属性 
		System.out.println(sanYin.book);
		//下面调用将执行从父类继承到的base方法
		sanYin.base();
		//下面将执行当前类的test方法
		sanYin.test();
	}
}


//注意最后执行的sanYin.test()执行的结果是子类的覆盖父类的方法。******它编译时的类型是jiBaseClass，运行时的类型是DuoTai。******
//方法具有多态性，对象的属性则不具备多态性。当通过引用变量来访问其包含的实例属性时，系统总是试图访问它编译时所定义的属性，而不是它运行时所定义的属性。
//引用变量在编译阶段只能调用其编译时类型所具有的方法，但是在运行时则执行它运行时类型所具有的方法。