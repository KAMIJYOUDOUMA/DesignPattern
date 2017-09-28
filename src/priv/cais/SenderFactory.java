package priv.cais;

public class SenderFactory {
	//<<�򵥹���
	public static Sender produce(int i) {
		return i==0? new MailSender():new SmsSender();
	}
	//>>

	//<<�๤��
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
	//>>
}
