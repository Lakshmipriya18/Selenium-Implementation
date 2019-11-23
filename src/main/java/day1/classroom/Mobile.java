package day1.classroom;

public class Mobile {
	public void makeCall(int number) {
		System.out.println("Making a call to this number "+number);
	}
	public void sendSMS (String text) {
		System.out.println("Sending a message");
	}
	public boolean shutDown() {
		System.out.println("ShutDown");
		return true;
	}
	public static void main(String[] args) {
		Mobile calling = new Mobile();
		calling.makeCall(12563);
		calling.sendSMS("msg");
		boolean x = calling.shutDown();
		System.out.println(x);
	}

}
