package chapter01.ver01;

import org.testng.annotations.Test;

public class CustomerTest {

	@Test
	public void statement() {
		Customer customer = new Customer("John");
		String title = "Titanic";
		int priceCode = 2;
		int _daysRented = 7;
		Movie movie = new Movie(title, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		System.out.println(result);
	}

	@org.junit.jupiter.api.BeforeEach
	void setUp() {
	}

	@org.junit.jupiter.api.AfterEach
	void tearDown() {
	}

	@org.junit.jupiter.api.Test
	void addRental() {
	}

	@org.junit.jupiter.api.Test
	void getName() {
	}

	@org.junit.jupiter.api.Test
	void testStatement() {
	}
}
