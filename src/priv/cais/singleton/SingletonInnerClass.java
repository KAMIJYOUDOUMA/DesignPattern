/**
 * 单例模式
 */
package priv.cais.singleton;

public class SingletonInnerClass {

	/* 私有构造方法，防止被实例化 */
	private SingletonInnerClass() {
		System.out.println("instance");
	}

	/* 静态工程方法，创建实例 */
	public static  SingletonInnerClass getInstance() {
		return SingletonHolder.instance;
	}

	/* 持有实例 */
	private static class SingletonHolder{
		private static SingletonInnerClass instance = new SingletonInnerClass();
	}
}