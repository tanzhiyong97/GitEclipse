package collection�ӿں�iterator�ӿ�;

import java.util.*;
public class YoungCollection {
	public static void main(String[] args) {
			ArrayList c=new ArrayList();
			c.add("����"); //���Ԫ��
			c.add(6);
			System.out.println("����C��Ԫ�ظ���Ϊ��"+c.size());
			c.remove(6);
			System.out.println("����C��Ԫ�ظ���Ϊ��"+c.size());
			//�ж��Ƿ����ָ���ַ�
			System.out.println("����C��Ԫ���Ƿ���������ַ���"+c.contains("����"));
			System.out.println("����C��Ԫ���Ƿ���������ַ���"+c.contains("����"));
			c.add("����");
			System.out.println("����C��Ԫ�أ�"+c);

	}

}
