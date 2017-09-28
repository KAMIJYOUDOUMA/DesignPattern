package priv.cais;

public class SmsSender implements Sender{

	SmsSender(){
		System.out.println("SmsSender is created.");
	}

	@Override
	public void Send() {
		System.out.println("This is SmsSender.");
	}
}
