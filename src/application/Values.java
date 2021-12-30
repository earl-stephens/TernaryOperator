package application;

public class Values {
	
	int numberss = 0;
	
	public void setNumberss(int numberss) {
		this.numberss = numberss;
	}
	public void run() {
		testValue();
	}
	
	public boolean testValue() {
		boolean output = numberss == 0 ? true: false;
		return output;
	}
}
