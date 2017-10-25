package collection;
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
 * �����̰߳�ȫ
 */
	public static void main(String[] args) {
	 
		 ArrayList<String> list = new ArrayList<String>();
		
		 list.add("Item1");
		 list.add("Item2");
		 list.add(2,"Item3");//// ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
		 list.add("Item4");
		 
		 //�������� �ٶ����
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 
		 //forѭ������ �ٶȵڶ�
		 for(String s:list) {
			 System.out.println(s);
		 }
		 
		//���������� �ٶ�����
		 Iterator<String> it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());	
		 }
		 
		 //���Ԫ�ص�λ��
		 int pos=list.indexOf("Item2");
		 System.out.println("The index of Item2:"+pos);
		 
		 //������������Ƿ�Ϊ��
		 boolean check=list.isEmpty();
		 System.out.println("Checing if the arraylist is empty");
		 
		 //��ȡ����Ĵ�С
		 int size=list.size();
		 System.out.println("The size of the list is: "+size);
		 
		 //��������������Ƿ����ĳԪ��
		 boolean element=list.contains("Item2");
		 System.out.println("Checking if the arraylist contains the object Item2");
		 
		 //��ȡָ��λ���ϵ�Ԫ��
		 String item=list.get(0);
		 System.out.println("The item is the index 0 is: "+item);
		 
		 //�滻Ԫ��
		 list.set(0, "NewItem");
		 
		 //�Ƴ�ָ��λ�õ�Ԫ��
		 list.remove(0);
		 
		 //�Ƴ���һ���ҵ���Item3Ԫ��
		 list.remove("Item3");
		 
		 System.out.println("The final contents of the arraylist are: " + list);
		 
		// ���ArrayList
         list.clear();
		 
		 //��ʱ�򣬵����ǵ���ArrayList�е� toArray()�������������׳�java.lang.ClassCastException�쳣���������������toArray() ���ص��� Object[] ���飬�� Object[] ת��Ϊ��������(�磬��Object[]ת��Ϊ��Integer[])����׳�java.lang.ClassCastException�쳣����ΪJava��֧������ת�͡� 
		 // toArray�÷�
         // ��һ�ַ�ʽ(���)
         String[] integer = list.toArray(new String[0]);

         // �ڶ��ַ�ʽ(�������)
         String[] integer1 = new String[list.size()];
         list.toArray(integer1);

         // �׳��쳣��java��֧������ת��
         //Integer[] integer2 = new Integer[arrayList.size()];
         //integer2 = arrayList.toArray();
         System.out.println();
         
         
		 
	}
}
