package setofproblem;

public class problem_test1 {
	public static void main(String[]args) {
		A a=new B();//�����i�H��@�@�ث��O���ŧi,���O�N�O����إ߹���A�]��
		//�S����H�غc�l�C���������ä���ƫغc�l�C
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
