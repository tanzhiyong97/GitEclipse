package ����;

public class YoungThread extends Thread{
	private int i;
	//��дrun������run�����ķ���������߳�ִ����
	public void run() {
		for( ;i<100;i++) {
			//���߳���̳�Thread��ʱ������ֱ�ӵ���getName()���������ص�ǰ�̵߳���
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this����
			System.out.println(getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20) {
				//��������������һ���߳�
				new YoungThread().start();
			}
		}
	}

}
