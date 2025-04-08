package ex1;

public class TV {
	
	private String model;
	private int size;
	private int channel;
	
	public int getChannel() {
		return channel;
	}
	public String getModel() {
		return model;
	}
	
	public int getSize() {
		return size;
	}
	
	public TV() {	
	}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size  = size;
		this.channel = channel;				
	}
	
	public void channelUp() {
		channel = channel > 10 ? 1 : channel++;		
	}
	
	public void channelDown() {
		channel = channel < 1 ? 10 : channel--;	
	}
	
	public void play() {}
	
}
