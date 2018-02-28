package d4;
//饿汉式
public class Test {

	public static void main(String[] args) {
		Singlaton sing=Singlaton.get();
		
		sing.info();
	}
}
//1、写一个类
class Singlaton{
	/**
	 * 3、在类中实例化
	 * 4、在属性前面加static
	 * 5、学习封装所有属性都要进行私有化
	 * 8、为了防止属性被更改
	 */
	
	private final static Singlaton SIN=new Singlaton();
	private  Singlaton() {}//把构造方法私有化
	public void info(){
		System.out.println("Holle C");
	}
	//6、写一个方法来实例化
	//7、在方法前加static 
	public static Singlaton get(){
		return SIN;
	}
}
/**
 * 单例设计模式分为两种
 * 饿汉式：不管在程序是否需要使用此类，此类都要经过实例化
 * 懒汉式：在第一次使用的时候才进行实例化
 * 
 * @author Ajia
 *
 */