package priv.cais;

public class SmsProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
}
