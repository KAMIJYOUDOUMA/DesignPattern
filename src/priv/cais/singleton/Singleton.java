/**
 * 单例模式
 */
package priv.cais.singleton;

public class Singleton {

	/* 持有私有静态实例，防止被引用，此处为勤加载 */
	private static Singleton instance = new Singleton();

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
		System.out.println("instance");
	}

	/* 静态工程方法，创建实例 */
	public static  Singleton getInstance() {
		return instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}
}