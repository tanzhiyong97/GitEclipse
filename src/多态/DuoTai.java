package ��̬;

class jiBaseClass{
	public int book=6;
	public void base() {
		System.out.println("�������ͨ����");
	}
	public void test() {
		System.out.println("���౻���ǵķ���");
	}
}

public class DuoTai extends jiBaseClass {
	//���¶���һ��bookʵ�����Ը��Ǹ����bookʵ������
	public String book="Android����";
	public void test() {
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub() {
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args) {
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		jiBaseClass bc=new jiBaseClass();
		//���6
		System.out.println(bc.book);
		//�������ε��ý�ִ��jiBaseClass�ķ���
		bc.base();
		bc.test();
		
		//�������ʱ���Ժ�����ʱ������ȫһ������˲����ڶ�̬
		DuoTai sc=new DuoTai();
		//�����Android������
		System.out.println(sc.book);
		//������ý�ִ�дӸ���̳е���base����
		sc.base();
		//������ý�ִ�дӸ���̳е���test����
		sc.test();
		//������ý�ִ�е�ǰ���sub����
		sc.sub();
		
		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		jiBaseClass sanYin=new DuoTai();
		//���6����������ʵ��Ǹ�������� 
		System.out.println(sanYin.book);
		//������ý�ִ�дӸ���̳е���base����
		sanYin.base();
		//���潫ִ�е�ǰ���test����
		sanYin.test();
	}
}


//ע�����ִ�е�sanYin.test()ִ�еĽ��������ĸ��Ǹ���ķ�����******������ʱ��������jiBaseClass������ʱ��������DuoTai��******
//�������ж�̬�ԣ�����������򲻾߱���̬�ԡ���ͨ�����ñ����������������ʵ������ʱ��ϵͳ������ͼ����������ʱ����������ԣ�������������ʱ����������ԡ�
//���ñ����ڱ���׶�ֻ�ܵ��������ʱ���������еķ���������������ʱ��ִ��������ʱ���������еķ�����