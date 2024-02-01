package intoduction;

import java.time.LocalDate;

public class TestMain {
	
final String panCardString;

	public TestMain(String panCardString) {
	super();
	this.panCardString = panCardString;
}
	static {
		System.out.println("program can execute without main");
	}
	
	public static void main(String[] args) {
		TestMain testMain=new TestMain("amit");
		System.out.println(testMain.panCardString);
		
		LocalDate currentDate = LocalDate.now();
		LocalDate confirmationDate = LocalDate.of(2024, 01, 01);
		boolean isGreaterThanOneYear = currentDate.isAfter(confirmationDate.plusYears(1));
		if (isGreaterThanOneYear) {
			System.out.println("exceedas");
		}
	}
	

}
