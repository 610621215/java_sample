package setofproblem;

public class problem_test1 {
	public static void main(String[]args) {
		A a=new B();//介面可以當作一種型別做宣告,但是就是不能建立實體，因為
		//沒有抽象建構子。介面本身並不具備建構子。
		a.a();
	}
}
interface A{
	int count=0;
	public abstract void a();
}
class B implements A{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	
}
