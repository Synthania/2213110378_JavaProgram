
public class WeeklyWeatherDataLauncher {
	 
		double[] rain = { 5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42 };
		double[] pressure = { 99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87 };

		WeeklyWeatherData wd = new WeeklyWeatherData();
		wd.setData(rain, pressure);
		wd.calcutesStats();

		System.out.println("Maxium Rainfall: " + wd.getMaxRain());
	//	System.out.println("Average Rainfall: " + wd.getAvgRain());
		System.out.printf("Average Rainfall: " ,wd.getAvgRain());
	}
}
