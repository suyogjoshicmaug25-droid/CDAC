//26. Smart Devices
interface Callable{
	public void makeCall(String number);
}
interface Messaging{
	public void sendMessage(String number,String message);
}
interface Internet{
	public void browse(String website);
}
class SmartPhone implements Callable,Messaging,Internet{
	private String model;
	//Constructor
	public SmartPhone(String model){
		this.model = model;
	}
	@Override 
	public void makeCall(String number){
		System.out.println("Calling "+number);
	}
	@Override
	public void sendMessage(String number,String message){
		System.out.println("Sending message to "+number+" : "+message);
	}
	@Override
	public void browse(String website){
		System.out.println("Browsing website: "+website);
	}
}
class SmartDevicesDemo{
	public static void main(String[] args){
		SmartPhone phone = new SmartPhone("MyPhone");
		
		phone.makeCall("9876543210");
		phone.sendMessage("9876543210","Hello");
		phone.browse("www.google.com");
	}
}
/*
D:\CDAC\OOPJ\Assignment 3>javac SmartDevicesDemo.java
D:\CDAC\OOPJ\Assignment 3>java SmartDevicesDemo

Calling 9876543210
Sending message to 9876543210 : Hello
Browsing website: www.google.com
*/