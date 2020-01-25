package 基礎觀念;
//先說結論
//常常因為i++及++i困擾的你，其實只要不是有a命給b的問題的
//你先加後加都一樣。
public class 算子符號 {
	static int[] data=new int[3];
	static boolean arg1=true;
	static boolean arg2=false;
	public static void main(String[] args) {
		
		new 算子符號().createdata();
		System.out.println("data[1]|data[2]"+(data[1]|data[2]));//For位元的儲存方法
		System.out.println((arg1&arg2)+"");
		int a=1;
		int b=++a;
		System.out.println(a+"\t"+b);
		++a;
	}
	public void createdata() {
		for(int i=1;i<=2;i++) 
			data[i]=i;		
	}
	
	
}
