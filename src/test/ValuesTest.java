package test;

import org.junit.Assert;
import org.junit.Test;

import application.App;
import application.Values;

public class ValuesTest {
	
	@Test
	public void shouldReturnTrue() {
		Values values = new Values();
		Assert.assertEquals(true, values.testValue());
		values.setNumberss(6);
		Assert.assertEquals(false, values.testValue());
	}
	
	@Test
	public void shouldReturnMinimumValue() {
		Values values = new Values();
		int[] inputNumbers = {6, 12, 4, 29, 69};
		values.setNumArray(inputNumbers);
		Assert.assertEquals(4, values.getMin());
		Assert.assertNotEquals(12, values.getMin());
	}
	
	
	@Test
	public void shouldReturnMaximumValue() {
		Values values = new Values();
		int[] inputNumbers = {6, 12, 4, 29, 69};
		values.setNumArray(inputNumbers);
		Assert.assertEquals(69, values.getMax());
		Assert.assertNotEquals(12, values.getMax());
	}
}
