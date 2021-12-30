package test;

import org.junit.Assert;
import org.junit.Test;

import application.App;
import application.Values;

public class ValuesTest {
	
	@Test
	public void shouldReturnTrue() {
		App app = new App();
		Values values = new Values();
		//app.value = 7;
		Assert.assertEquals(true, values.testValue());
		values.setNumberss(6);
		Assert.assertEquals(false, values.testValue());
	}
}
