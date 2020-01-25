package 基礎觀念;
import java.util.Arrays;
import java.util.Random;
//binarysearch實例
public class 他說那傢伙是排序問題 {
	static char[] data=new char[10];
	public static void main(String[] args) {
		String[] string_result=new String[data.length];
		new 他說那傢伙是排序問題().random_deploy_chars();
	
		show();
		System.out.println();
		string_result=charsgostring(string_result);
		Arrays.sort(string_result);
		int index=Arrays.binarySearch(string_result,"g");
		int index2=Arrays.binarySearch(string_result,"A");
		System.out.println("g:"+index+"\nA:"+index2);//大寫字母在後面
		show(string_result);
	}
	public void random_deploy_chars() {
		for(int i=0;i<10;i++) {
			int seed=(int) 'a';
			data[i]=(char)(seed+new Random().nextInt(26));
		}
		
		
	}
	public static String[] charsgostring(String[] string_result) {
		
		for(int i=0;i<data.length;i++) {
//			System.out.print(data[i]+"\t");
			string_result[i]=data[i]+"";
		}
		
		return string_result;
	}
	public static void show() {
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"\t");
		}
		
	}
	public static void show(String[] string_result) {
		
		for(int i=0;i<string_result.length;i++) {
			System.out.print(string_result[i]+"\t");
		}
		
	}
}
