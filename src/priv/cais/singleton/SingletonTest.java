package priv.cais.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		Singleton singleton = insPrivate();

		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Singleton.getInstance());
			}
		};

		Thread[] threads = new Thread[10];
		for (int i = 0, len = threads.length; i < len; i++) {
			threads[i] = new Thread(runnable);
			threads[i].start();
		}
	}

	/* 反射的方法实例化私有构造器 */
	public static Singleton insPrivate() throws Exception {
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		return constructor.newInstance();

	}

}
