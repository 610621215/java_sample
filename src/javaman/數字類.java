package javaman;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class �Ʀr�� {
	public static void main(String[]args) {
		double aa=Math.random();//�ֳtrandom����
		System.out.println(aa);
		Integer i=new Integer(1);
		int ii=i.intValue();
		System.out.println("ii:"+ii);
		inner_class ic=new �Ʀr��().new inner_class();
		short x=1;
		long y=1;
		ic.show(x);
		ic.show(y);
		//�ȱo�`�N��short�O���int i �ӫD�ϥ�Short
		//�ھ��u���v
		/*
		 * ���G�Ѽ������Ҥ@�P��(int <->int)
		 * �����G�i�H�Q�ݮe��(short�O�i�H�Qint�ݮe��)�A�P�˪��A�p�G�O�l���O�i�H�Q�۰��૬�������O���]�i�H
		 * �̧C�G�i�H�z�LAutoBoxing/AutoUnboxing�̡Cshort �PShort�����Y�N�O�ݩ�o�ӡAShort�i�H�QAutoUnboxing�ܦ�short
		 */
		//vv�r��g
		String txt="CCkcc";
		String txt2="LOL";
		System.out.println(txt.concat(txt2));
		System.out.println("�䪺��"+txt.indexOf("cc"));
		System.out.println("�䤣��"+txt.indexOf("zz"));
		String[] testsort= {"Aa","AaA","aa","a"};
		Arrays.sort(testsort);//�r�Ʀh��᭱�A�p�g��᭱�A��L�A���C
		for(int rro=0;rro<testsort.length;rro++) {
			System.out.println(testsort[rro]);
			
		}
		System.out.println(txt.substring(0, 2));//0�}�l,2���e
		StringBuilder sb=new StringBuilder("kckckc");
		String append_word="a";
		sb.append(append_word);
		System.out.println(sb.toString());
		sb.replace(1, 4, "��Ghost��");
		StringBuilder sb2=new StringBuilder(sb).reverse();
		System.out.println(sb.toString()+"����:"+sb2.toString());
		System.out.println(sb.insert(1, "�Q���J��"));
		//^^�r��g
		//vv�ɶ��g
		Date day=new Date();
		System.out.print(day.getTime());//���o�@��
		System.out.println(day.getHours());//24�p�ɨ�p��
		System.out.println(day.getSeconds());//��
		//^^�ɶ��g
		
		//vv�a�I�PNumberformat
		Locale loc=Locale.getDefault();
		System.out.println("�ڬO"+loc.getCountry()+"�H");//tw
		System.out.println("�ڥ�"+loc.getLanguage()+"��");//zh-tw
		System.out.println("�ڬO"+loc.getDisplayCountry()+"�H");//���o�P�t�Τǰt��
		System.out.println("�ڥ�"+loc.getDisplayLanguage());//���o�P�t�Τǰt��
		NumberFormat nf=NumberFormat.getInstance();//NumberFormat�u�O�����A�n�O�o���o����
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(Math.PI));

		System.out.println(nf.format(Math.E));

		System.out.println(nf.format(2));
		try {
			//�ϥ�XXFormat�A���n�z�LgetInstance()���o����
			Number n =nf.parse("123.456");//�i��|�X�{�L�k�૬
			System.out.println(n.doubleValue());
			NumberFormat n_gotoItA=NumberFormat.getInstance(Locale.ITALY);//�@���q�j�Q�H�}�l
			Number n_ITA=n_gotoItA.parse("1234.789");//.�N��10^3,�]�N�O�d�����
			System.out.println(n_ITA.doubleValue());
			n_ITA=n_gotoItA.parse("12,34.789");//,�~�O�L�̪��p���I
			System.out.println(n_ITA.doubleValue());
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		//^^Number format����
		//vv�W�h�p����
		String bthd="1994-";
		String rule="\\d{4}\\-";
		System.out.println(bthd.matches(rule));
		//^^�W�h�p����
		//vvScanner�γ~
		Scanner sc=new Scanner("source3,can3,any3,thing3");
		sc.useDelimiter("\\d");//��W�h�@�ˡA�i�H�Φ��k�Ӥ��μƦr�A��ܳW�h��\\d�{�w�����Ʀr
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}
	}
	class inner_class{
		public void show(Long num) {
			System.out.println("��");
			
		}
		public void show(Short num) {
			System.out.println("�u");
		}
		public void show(int i) {
			System.out.println("�p�p�O");
			
			
		}
		
	}
}
