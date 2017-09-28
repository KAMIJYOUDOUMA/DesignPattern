package priv.cais;

public class SingletonTest {

	public static void main(String[] args) throws InterruptedException {
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

}
