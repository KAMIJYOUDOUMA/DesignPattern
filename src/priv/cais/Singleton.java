package priv.cais;

public class Singleton {

	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
	private static Singleton instance = new Singleton();

	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton() {
		System.out.println("instance");
	}

	/* ��̬���̷���������ʵ�� */
	public static  Singleton getInstance() {
		return instance;
	}

	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
	public Object readResolve() {
		return instance;
	}
}