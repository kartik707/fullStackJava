package springOne;

public class baseball implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public baseball(FortuneService theFortuneService) {
	   fortuneService = theFortuneService;	
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 20 mins";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get a fortune
		return fortuneService.getFortune();
	}

}
