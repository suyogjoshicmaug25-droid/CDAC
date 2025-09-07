// Temperature Sensor
class TemperatureSensor{
	private int temperature;
	
	//setter method
	public void setTemperature(int t){
		if(t>=0 && t<=100){
			this.temperature = t;
		}
		else{
			System.out.println("Temperature out of range");
		}
	}
	
	//getter method
	public int getTemperature(){
		return temperature;
	}
	
	public static void main(String[] args){
		TemperatureSensor t1 = new TemperatureSensor();
		t1.setTemperature(-5);
	}
}
