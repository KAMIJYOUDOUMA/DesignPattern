package priv.cais;

public class MailSender implements Sender {

	MailSender(){
		System.out.println("MailSender is created.");
	}

	@Override
	public void Send() {
		System.out.println("This is MailSender.");
	}
}
