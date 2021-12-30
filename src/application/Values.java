package application;

public class Values {
	
	int numberss = 0;
	int[] numArray = new int[5];
	
	public void setNumberss(int numberss) {
		this.numberss = numberss;
	}
	
	public void setNumArray(int[] inputs) {
		for(int i = 0; i < 5; i++) {
			numArray[i] = inputs[i];
		}
	}
	public void run() {
		testValue();
	}
	
	public boolean testValue() {
		boolean output = numberss == 0 ? true: false;
		return output;
	}
	
	public int getMin() {
		int minValue = Integer.MAX_VALUE;
		for(int j = 0; j < numArray.length; j++) {
			minValue = numArray[j] < minValue ? numArray[j]: minValue;
		}
		return minValue;
	}
	
	public int getMax() {
		int maxValue = Integer.MIN_VALUE;
		for(int k = 0; k < numArray.length; k++) {
			maxValue = numArray[k] > maxValue ? numArray[k]: maxValue;
		}
		return maxValue;
	}
}
