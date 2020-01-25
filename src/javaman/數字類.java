package javaman;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class 數字類 {
	public static void main(String[]args) {
		double aa=Math.random();//快速random產生
		System.out.println(aa);
		Integer i=new Integer(1);
		int ii=i.intValue();
		System.out.println("ii:"+ii);
		inner_class ic=new 數字類().new inner_class();
		short x=1;
		long y=1;
		ic.show(x);
		ic.show(y);
		//值得注意的short是選用int i 而非使用Short
		//根據優先權
		/*
		 * 高：參數類型皆一致者(int <->int)
		 * 次高：可以被兼容的(short是可以被int兼容的)，同樣的，如果是子類別可以被自動轉型成父類別的也可以
		 * 最低：可以透過AutoBoxing/AutoUnboxing者。short 與Short的關係就是屬於這個，Short可以被AutoUnboxing變成short
		 */
		//vv字串篇
		String txt="CCkcc";
		String txt2="LOL";
		System.out.println(txt.concat(txt2));
		System.out.println("找的到"+txt.indexOf("cc"));
		System.out.println("找不到"+txt.indexOf("zz"));
		String[] testsort= {"Aa","AaA","aa","a"};
		Arrays.sort(testsort);//字數多放後面，小寫放後面，其他再說。
		for(int rro=0;rro<testsort.length;rro++) {
			System.out.println(testsort[rro]);
			
		}
		System.out.println(txt.substring(0, 2));//0開始,2之前
		StringBuilder sb=new StringBuilder("kckckc");
		String append_word="a";
		sb.append(append_word);
		System.out.println(sb.toString());
		sb.replace(1, 4, "白Ghost白");
		StringBuilder sb2=new StringBuilder(sb).reverse();
		System.out.println(sb.toString()+"反轉:"+sb2.toString());
		System.out.println(sb.insert(1, "被插入的"));
		//^^字串篇
		//vv時間篇
		Date day=new Date();
		System.out.print(day.getTime());//取得毫秒
		System.out.println(day.getHours());//24小時制的小時
		System.out.println(day.getSeconds());//秒
		//^^時間篇
		
		//vv地點與Numberformat
		Locale loc=Locale.getDefault();
		System.out.println("我是"+loc.getCountry()+"人");//tw
		System.out.println("我用"+loc.getLanguage()+"文");//zh-tw
		System.out.println("我是"+loc.getDisplayCountry()+"人");//取得與系統匹配的
		System.out.println("我用"+loc.getDisplayLanguage());//取得與系統匹配的
		NumberFormat nf=NumberFormat.getInstance();//NumberFormat只是介面，要記得取得實體
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(Math.PI));

		System.out.println(nf.format(Math.E));

		System.out.println(nf.format(2));
		try {
			//使用XXFormat，都要透過getInstance()取得實體
			Number n =nf.parse("123.456");//可能會出現無法轉型
			System.out.println(n.doubleValue());
			NumberFormat n_gotoItA=NumberFormat.getInstance(Locale.ITALY);//作為義大利人開始
			Number n_ITA=n_gotoItA.parse("1234.789");//.代表10^3,也就是千分單位
			System.out.println(n_ITA.doubleValue());
			n_ITA=n_gotoItA.parse("12,34.789");//,才是他們的小數點
			System.out.println(n_ITA.doubleValue());
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		//^^Number format完結
		//vv規則小測驗
		String bthd="1994-";
		String rule="\\d{4}\\-";
		System.out.println(bthd.matches(rule));
		//^^規則小測驗
		//vvScanner用途
		Scanner sc=new Scanner("source3,can3,any3,thing3");
		sc.useDelimiter("\\d");//跟規則一樣，可以用此法來切割數字，表示規則內\\d認定視為數字
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}
	}
	class inner_class{
		public void show(Long num) {
			System.out.println("長");
			
		}
		public void show(Short num) {
			System.out.println("短");
		}
		public void show(int i) {
			System.out.println("小小板");
			
			
		}
		
	}
}
