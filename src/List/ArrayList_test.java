package List;
import java.util.*;

public class ArrayList_test {
/*
 * Arraylist֧��3�����췽��
 * Arraylist() ����һ���յ�����
 * ArrayList(Collection<? extends E> c) ������췽��������һ������ָ��Ԫ�ؼ��ϵ�����
 * ��ע�⣬������ַ�E��һ����ǣ�������ʾ������Ԫ�ص����͡����ھ�����ʲô���ͣ���Ҫ����ʹ��������췽����ʱ����ָ����
 * ArrayList(int initialCapacity) ������һ��ָ����С������Ϊ�յ�����initialCapacity�������ǳ�ʼ������С��
 * Ĭ����10
 * ��Ҫ˵�����ǣ�����ArrayListʱ��ͨ������ֵ����Ч����ߣ�forѭ��������֮��������������͡�
 */
	public static void main(String[] args) {
	 
		 ArrayList<String> list = new ArrayList<String>();
		
		 list.add("Item1");
		 list.add("Item2");
		 list.add(2,"Item3");//// ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
		 list.add("Item4");
		 
		 //����������
		 Iterator<String> it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());	
		 }
	}
}
