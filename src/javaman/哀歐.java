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


public class �s�� implements Serializable{//�Y����Limplements Serializable�h�|�X�{
	//java.io.NotSerializableException
	//�ǦC�ƤW���ޥΥ����O��̬Ҩ�ƧǦC�ƪ���O
	class inner_class implements Serializable{
		int test=23;
		
		
		public void show() {
			System.out.println("show��ñ��");
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
  		�o���eclipse �ϥ�System.console�|�Onull
 */
		String partents_path="D:\\java_workspace\\����׸ɪ�\\src\\javaman\\";
		File f2=new File(partents_path+"DD");
		System.out.println(f2.getParent()+"\t\t"+f2.getPath());
		File f=new File(f2.getPath(),"�۵M���O.txt");//���|�إ�
		try {
			if(f2.mkdir()) {
				System.out.println("�إ�");
			}else {
				System.out.println("Already exist");
				
			}
			if(!f.exists()) {
				f.createNewFile();//�q���y�}�l�ݭntry-catch
				System.out.println("�إ�");//
			}
			BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			for(int i=0;i<3;i++) {
				bw.write("��H"+(i+1)+""+"\n")	;
				bw.flush();
			}
			bw.close();
			BufferedReader br=new BufferedReader(new FileReader(f));
			String line="";
			System.out.println("�۵M���O:");
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
//			String insert_one_card="�Ұ�";
//			FileOutputStream fos=new FileOutputStream(f);//�p�G����g�|�X�{�����\�������D
//			fos.write(insert_one_card.getBytes());
//			fos.close();
			/*
//			fis=new FileInputStream(f);
//			while((word=fis.read())!=-1) {
//				System.out.println((char)word);
//				
//			}
 			�ýX,�]������O���줸�s�X
			 */
			inner_class ic=new �s��().new inner_class();
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
