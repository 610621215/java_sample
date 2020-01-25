package javaman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class �W�Ū��� {
	
	class item{
		int t=0;
		public item(int code) {
			this.t=code;
			
		}
		public int hashCode() {
			return t;
		}
		public boolean equals(Object o) {
			if(this==o) {//���hashcode
				return true;
			}
			if((o==null))
				return false;
			if(!(o instanceof item))
				return false;
			item o2=(item)o;
			Integer super_t=new Integer(t);
			Integer super_t2=new Integer(o2.t);
			return (super_t.equals(super_t2));
		}
	}
	class item2 implements Comparable<item2>{
		int t=0;
		@Override
		public int compareTo(item2 o) {//��y�� public int compareTo(T o);,�G���򫬺A�ҥi�H
			//��TreeSet�I�s���ƦC�����X
			// TODO Auto-generated method stub
			Integer the_it=new Integer(this.t);
			Integer outer_it=new Integer(o.t);
			return the_it.compareTo(outer_it);
		}
		
		
		
	}
	public static void main(String[]args) {
		�W�Ū��� it=new �W�Ū���();
		item testing_item=it.new item(233);
		item testing_item2=it.new item(233);
		item2 testing_itemm=it.new item2();
		System.out.println("Hashcode1:"+testing_item.hashCode());
		System.out.println("Hashcode2:"+testing_item2.hashCode());
		System.out.println("�ۦP������:"+testing_item.equals(testing_item2));
		System.out.println("�ۦP��Hashcode:"+(testing_item.hashCode()==testing_item2.hashCode()));
		Set<item> bag=new HashSet<item>();//�i�H�Ѫx���M�w�O�_�����s�W��
//		bag.add(null);
		System.out.println(bag.add(testing_item));
		System.out.println(bag.add(testing_item2));//�]�����@�˪�t��
		System.out.println("null���s�W"+bag.add(null));
//		System.out.println("�~��"+testing_item.equals(testing_itemm));
		testing_item2=testing_item;
		System.out.println(bag.add(testing_item2));
		//^^��ghashcode�Pequals
		Set<item2> it_set=new TreeSet<item2>();
//		Set<item2> sort_it_set=new SortedSet<item2>(); 
		testing_itemm.t=234;
		item2 testing_itemm2=it.new item2();
		testing_itemm2.t=333;
		item2 testing_itemm3=it.new item2();
		testing_itemm3.t=-23;
		it_set.add(testing_itemm);
		it_set.add(testing_itemm3);
		it_set.add(testing_itemm2);
		//^^����TreeSet
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(3);
		ts.add(4);
		ts.add(1);
		ts.add(2);
		TreeSet<Integer> sub_ts=(TreeSet<Integer>) ts.subSet(1,true,3,false);//Set�j���૬��TreeSet
		Iterator it2=sub_ts.iterator();
		while(it2.hasNext()) {
			System.out.println("Tree: "+it2.next());
		}
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(3);
		ls.add(33);
		ls.add(43);
		ls.add(0,40);//�Y�W�Lindex���d��A�|�X�{���~
		// java.lang.IndexOutOfBoundsException <=�x���Ҧ��W�L�d�򪺨ҥ~
		for(Integer is:ls) {
			System.out.println(is);
			
		}
		Queue<String> qq=new PriorityQueue<String>();//��ƱƦC�S��
		//�d�U�O�o�r�Ƥ֪���᭱,
		//�p�g��᭱
		qq.offer("ss");
		qq.offer("s");
		qq.offer("SS");
		qq.offer("Ss");
		Iterator itqq=qq.iterator();
		System.out.println(qq.peek());
		while(itqq.hasNext()) {
			System.out.println(itqq.next());
		}
		System.out.println("poll�X�Ĥ@��"+qq.poll());
		System.out.println("\n");
		itqq=qq.iterator();//�ݭn���s�w�q�A�Ѧ��i�H���D�Ynull�ɫhIterator�]�|�ܦ�null
		//������˩�
		while(itqq.hasNext()) {
			System.out.println("poll�L��"+itqq.next());//���޹L�Ĥ@�ӤF�A�]����L�T��
		}
		String temp="";
		//��peek�H��poll��combo�������X��C
		while((temp=qq.peek())!=null) {
			System.out.println(temp);
			qq.poll();
			
		}
		//
		System.out.println("���������F�G"+qq.size());
		Map gomap=new HashMap<String,Integer>();
		gomap.put("A", 11);
		gomap.put("B", 12);
		gomap.put("b", 11);
		System.out.println("map elements:"+gomap);
		gomap.remove("A");
		System.out.println("map elements:"+gomap);
		Set mykey=new TreeSet(gomap.keySet());
		Collection myvalue=new ArrayList(gomap.values());
		Iterator temp_it=mykey.iterator();
		while(temp_it.hasNext()) {
			System.out.println(temp_it.next());//�p�g�m��
		}
		for(Object values:myvalue) {//�Ҧ����X�P���쪺�U����k
			System.out.println(values);
		}
	}
}
