/**
 * 适配器模式
 */
package priv.cais.adapter;

public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }
}
