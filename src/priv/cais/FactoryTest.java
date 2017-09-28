package priv.cais;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory();
		absFactory();
	}

	// Factory Method
	public static void factory() {
		Sender sender = SenderFactory.produce(0);
		sender.Send();
	}

	// Abstract Factory
	public static void absFactory() {
		Provider provider = new MailProvider();
		Sender sender = provider.produce();
		sender.Send();
	}
}
