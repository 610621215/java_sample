package javaman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class �x�� {
	class Book<T>{
		T price;
		public void show(Book<? extends Number> b) {//�o�Ӫx����Number���l���O
			System.out.println(b.price);
		}
		
		
	}
	class CG<T>{
		
		public void showlist(Collection<? extends Integer> elements_list) {
			int total=0;
			for(Integer elements :elements_list) {
				
				System.out.println(elements);
				total+=elements;
			}
			System.out.println("�`�p"+total);
		}
		
	}
	public static void main(String[]args) {
		�x�� rice=new �x��();
		Book<Integer> bk=rice.new Book<Integer>();
		bk.price=533;
		bk.show(bk);
		Collection<Integer> cc=new ArrayList<Integer>();
		CG cg=rice.new CG();
		cc.add(2233);
		cc.add(3344);
		cg.showlist(cc);
		Set<String> set=new HashSet<String>();
		System.out.println(set.add("test"));

		System.out.println(set.add("test1"));

		System.out.println(set.add("test2"));

		System.out.println(set.add("test"));
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
	}
}
