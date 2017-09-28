package priv.cais;

public class MailProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
