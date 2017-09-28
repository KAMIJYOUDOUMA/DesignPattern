package priv.cais.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        //Targetable target = new Adapter();

    	Source source = new Source();
        Targetable target = new Wrapper(source);

        target.method1();
        target.method2();
    }
}
