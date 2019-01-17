package enumExamples;

public class Example {

	public static void main(String[] args) {
		
		season winter = season.WINTER;
		season summer = season.SUMMER;
		season spring = season.SPRING;
		season autumn = season.AUTUMN;
		
		winter.showTime();
		summer.showTime();
		spring.showTime();
		autumn.showTime();
		

	}
	
	public enum season {
		WINTER("winter time"){
			public void showTime() { 			// this method overrides the showTime() method of the season enum and is specific to winter
				System.out.println("this is a special time of the year"); 
			}
		},SUMMER("summer time"),SPRING("spring time"),AUTUMN("autumn time"); 	/** Enums that contain any extra values must end 
																			  		with a semi collon ";"*/
	
		private String timeOfYear;					/** Any variable declared in an enum must be done after the enumm values
														there is no restriction on what access modifier a variable in an enum can have.*/
		
		private season(String time) { 				//The constructer in an enum must be declared after the enum values
			this.timeOfYear = time;					//	and can only be private or default.
		}
		
		public void showTime() { 						// this is a method that is for all sesaon enums that do not override this one
			System.out.println(timeOfYear);
		}
		
	}
	
	
	
}
