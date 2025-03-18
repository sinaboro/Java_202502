package ex01;


public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl remote = new Telvision();
		
		remote.turnOn();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
	}

}


