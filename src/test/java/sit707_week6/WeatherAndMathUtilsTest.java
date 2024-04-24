package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "220007878";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Deepak Kumar Khatri";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		// Writing a test case for isEven() method
		boolean result = WeatherAndMathUtils.isEven(3); // Testing with an odd number
		Assert.assertFalse(result); // Expecting false since 3 is not even
	}
	
	@Test
    public void testCancelWeatherAdvice() {
    	// Writing a test case for weatherAdvice() method to test cancel alert
    	String advice = WeatherAndMathUtils.weatherAdvice(70.1, 0.0);
    	Assert.assertEquals("CANCEL", advice);
    }
	
	@Test
	    public void testDangerousWeatherAdvice() {
	    	// Testing for dangerous weather conditions
	    	String advice = WeatherAndMathUtils.weatherAdvice(75.0, 6.1); // Dangerous wind speed and precipitation
	    	Assert.assertEquals("CANCEL", advice);
	    }
	
	
	@Test
		public void testConcerningWeatherAdvice() {
		// Testing for concerning weather conditions
			String advice = WeatherAndMathUtils.weatherAdvice(50.0, 4.0); // Concerning wind speed and precipitation
			Assert.assertEquals("WARN", advice); 
		}
	    
	 @Test
	    public void testNormalWeatherAdvice() {
	    	// Testing for normal weather conditions
	    	String advice = WeatherAndMathUtils.weatherAdvice(30.0, 2.0); // Normal wind speed and precipitation
	    	Assert.assertEquals("ALL CLEAR", advice);
	    }
	 
}
