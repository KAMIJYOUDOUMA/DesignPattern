package priv.cais;

public class SenderFactory {
	//<<简单工厂
	public static Sender produce(int i) {
		return i==0? new MailSender():new SmsSender();
	}
	//>>

	//<<多工厂
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
	//>>
}
