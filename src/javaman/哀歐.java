package javaman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class 哀歐 implements Serializable{//若本體無implements Serializable則會出現
	//java.io.NotSerializableException
	//序列化上的引用必須是兩者皆具備序列化的能力
	class inner_class implements Serializable{
		int test=23;
		
		
		public void show() {
			System.out.println("show的簽章");
		}
		
	}
	public static void main(String[]args) {
//		Console c=System.console();
//		String txt=c.readLine("%s");
//		System.out.println(txt);
/*
 public static Console console()

Returns the unique Console object associated with the current Java virtual machine, if any.

Returns: The system console, if any, otherwise null.
  		這表示eclipse 使用System.console會是null
 */
		String partents_path="D:\\java_workspace\\玩具修補者\\src\\javaman\\";
		File f2=new File(partents_path+"DD");
		System.out.println(f2.getParent()+"\t\t"+f2.getPath());
		File f=new File(f2.getPath(),"自然之力.txt");//不會建立
		try {
			if(f2.mkdir()) {
				System.out.println("建立");
			}else {
				System.out.println("Already exist");
				
			}
			if(!f.exists()) {
				f.createNewFile();//從此句開始需要try-catch
				System.out.println("建立");//
			}
			BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			for(int i=0;i<3;i++) {
				bw.write("樹人"+(i+1)+""+"\n")	;
				bw.flush();
			}
			bw.close();
			BufferedReader br=new BufferedReader(new FileReader(f));
			String line="";
			System.out.println("自然之力:");
			while((line=br.readLine())!=null) {
				System.out.println(line);			
			}
			br.close();
			FileInputStream fis=new FileInputStream(f);
			int word=0;
			while((word=fis.read())!=-1) {
				System.out.println(word);
				
			}
//			fis.close();
//			String insert_one_card="啟動";
//			FileOutputStream fos=new FileOutputStream(f);//如果鼻接續寫會出現直接蓋掉的問題
//			fos.write(insert_one_card.getBytes());
//			fos.close();
			/*
//			fis=new FileInputStream(f);
//			while((word=fis.read())!=-1) {
//				System.out.println((char)word);
//				
//			}
 			亂碼,因為中文是雙位元編碼
			 */
			inner_class ic=new 哀歐().new inner_class();
			File oos_Text_f=new File("oos_Test");
			FileOutputStream fos=new FileOutputStream(oos_Text_f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ic);
			oos.close();
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(oos_Text_f));
			Object ooo=ois.readObject();
			ic=(inner_class)ooo;
			ic.show();
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
