/**
 * 单例模式
 */
package priv.cais.singleton;

public class SingletonDoubleCheck {

	/* 持有私有静态实例，防止被引用，此处为勤加载 */
	private static volatile SingletonDoubleCheck instance = null;

	/* 私有构造方法，防止被实例化 */
	private SingletonDoubleCheck() {
		System.out.println("instance");
	}

	/* 静态工程方法，创建实例 */
	public static  SingletonDoubleCheck getInstance() {
		if(instance == null){
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}
}