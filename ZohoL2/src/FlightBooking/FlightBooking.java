package FlightBooking;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FlightBooking {
	static int flightId = 100;
	static int bookingId = 01;
	static HashMap<Integer, Flightpojo> flight = new HashMap<Integer, Flightpojo>();
	static HashMap<Integer, BookingPojo> booking = new HashMap<Integer, BookingPojo>();

	public static void main(String[] args) {

	}

	public void addFlightDetails() {

		Flightpojo flightdetails = new Flightpojo();
		flightdetails.setBusinessCost(2000);
		flightdetails.setEconomyCost(1000);
		flightdetails.setBusinessSeats(4);
		flightdetails.setEconomySeats(8);
		flightdetails.setTakalEconomySeats(4);
		flightdetails.setTatkalBusinessSeats(2);
		flightdetails.setTakkalBusinessCost(4000);
		flightdetails.setTakkalEconomyCost(2000);

		flight.put(++flightId, flightdetails);
		Flightpojo flightdetails1 = new Flightpojo();

		flightdetails1.setBusinessCost(2000);
		flightdetails1.setEconomyCost(1000);
		flightdetails1.setBusinessSeats(4);
		flightdetails1.setEconomySeats(8);
		flightdetails1.setTakalEconomySeats(4);
		flightdetails1.setTatkalBusinessSeats(2);
		flightdetails1.setTakkalBusinessCost(3000);
		flightdetails1.setTakkalEconomyCost(2000);
		flight.put(++flightId, flightdetails1);

	}

	public void selection() {
		addFlightDetails();
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while (end) {
			System.out.println("\n\n ---Welcome---");
			System.out.println("\n1.Ticket Booking");
			System.out.println("2.Ticket Cancellation");
			System.out.println("3.Check Seats Availability");
			System.out.println("5.Flight Booking details summary");
			// System.out.println("4. Meal Ordering Details");
			System.out.println("6.Exit ");
			String option = sc.next();
			if (FlightValidation.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					ticketBooking();
					break;
				case 2:
					ticketCancellation();
					break;
				case 3:
					seatsAvailability();
					break;
				case 4:
					mealDetails();
					break;

				case 5:
					BookingSummary();
					break;

				case 6:
					System.out.println("\n ----- Thank You ----");
					end = false;

				}

			} else {
				System.out.println("Enter a Valid options");
			}

		}

	}

	private void BookingSummary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the flight id ");
		int id = sc.nextInt();

		for (Map.Entry<Integer, BookingPojo> entry : booking.entrySet()) {
			int bookid = entry.getKey();
			BookingPojo bp = booking.get(id);
			if (bp.getFlightId() == id) {
				System.out.println(entry.getKey());
				System.out.println(bp.toString());
			}

		}

	}

	private void mealDetails() {

		for (Map.Entry<Integer, BookingPojo> entry : booking.entrySet()) {
			int id = entry.getKey();
			System.out.println("Flight Name " + entry.getKey());

		}

	}

	private void seatsAvailability() {

		for (Map.Entry<Integer, Flightpojo> entry : flight.entrySet()) {
			int id = entry.getKey();
			int temp = 0;
			System.out.print("\n---Flight Name " + entry.getKey() + "---\n");
			// economy seats

			System.out.println("\nEconomy class");
			if (flight.get(id).getEconomySeats() == 8) {
				temp = 1;
			} else {
				temp = 8 - flight.get(id).getEconomySeats() + 1;
			}
			for (int i = temp; i <= 8; i++) {
				System.out.print(i + " ");
			}
			// economy takkal

			System.out.println("\nEconomy Takkal");

			if (flight.get(id).getTakalEconomySeats() == 4) {
				temp = 1;
			} else {
				temp = 4 - flight.get(id).getTakalEconomySeats() + 1;
			}
			for (int i = temp; i <= 4; i++) {
				System.out.print((i + 8) + " ");
			}

			// Business seats sysou

			System.out.println("\nBusiness Seats");
			if (flight.get(id).getBusinessSeats() == 4) {
				temp = 1;
			} else {
				temp = 4 - flight.get(id).getEconomySeats() + 1;
			}
			for (int i = temp; i <= 4; i++) {
				System.out.print((i + 12) + " ");
			}

			// business takkal seats

			System.out.println("\nTakkal Business");

			if (flight.get(id).getTatkalBusinessSeats() == 2) {
				temp = 1;
			} else {
				temp = 2 - flight.get(id).getTatkalBusinessSeats() + 1;
			}
			for (int i = temp; i <= 2; i++) {
				System.out.print((i + 16) + " ");
			}

		}

	}

	private void ticketCancellation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cancellation Id ");
		int cancellationId = sc.nextInt();
		BookingPojo book = booking.get(cancellationId);

		if (booking.containsKey(cancellationId)) {

			if (book.getCategory() == 'G' || book.getCategory() == 'g') {
				int cancelFee = book.getNoSeats() * 200;
				System.out.println("Cancellation Fees " + cancelFee);
				System.out.println("Your Booking charge " + book.getTotalCost());
				System.out.println("Amount " + (book.getTotalCost() - cancelFee) + " will be refunded");
				booking.remove(cancellationId);
			} else if (book.getCategory() == 'T' || book.getCategory() == 't') {
				int cancelFee = book.getNoSeats() * 1000;
				System.out.println("Cancellation Fees " + cancelFee);
				System.out.println("Your Booking charge " + book.getTotalCost());
				System.out.println("Amount " + (book.getTotalCost() - cancelFee) + " will be refunded");
				booking.remove(cancellationId);
			}

		} else {
			System.out.println("There is no Order exist in this ID");
		}

	}

	private void ticketBooking() {
		BookingPojo book = new BookingPojo();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the flight ID ");
		int id = sc.nextInt();
		book.setFlightId(id); // booking
		System.out.print("Category [G-General T-Takkal] ");
		char category = sc.next().charAt(0);
		book.setCategory(category);
		System.out.print("Seats Available Economy [E - " + flight.get(id).getEconomySeats() + " T- "
				+ flight.get(id).getTakalEconomySeats() + "]  Business Seats [B - " + flight.get(id).getBusinessSeats()
				+ " T -" + flight.get(id).getTatkalBusinessSeats() + "]");

		System.out.println("\nSeats Type [ B | E ] ");
		char seatType = sc.next().charAt(0);
		book.setSeatType(seatType);
		System.out.print("\nNumber of Seats Required ");
		int noSeats = sc.nextInt();
		book.setNoSeats(noSeats);
		int seat = seatAvailability(id, category, seatType, noSeats);
		if (seat >= noSeats) {
			System.out.print("\nSenior Citizen Y or N ");
			char citizen = sc.next().charAt(0);
			book.setSeniorCitizen(citizen);
			System.out.print("\nMeals Required Y or N ");
			char meals = sc.next().charAt(0);
			book.setMeals(meals);
			double Total = total(id, category, seatType, noSeats);

			if (citizen == 'Y' || citizen == 'y') {
				double discounts = (Total / 100) * 10;
				Total = Total - discounts;
			}
			if (meals == 'Y' || meals == 'y') {
				Total = Total + 200 * noSeats;
				;
			}
			book.setTotalCost(Total);
			System.out.println("Total Cost " + Total);

			booking.put(++bookingId, book);
			System.out.println("\n---Your Flight Ticket id Booked. Booking Id is " + bookingId + "---\n");
			modifingSeatCount(id, category, seatType, noSeats);
			modifingPrice(id, category, seatType, noSeats);
			// System.out.println(booking);
			// System.out.println(flight);
		} else {
			System.out.println("only " + seat + " are available .Please check the seat Availability!!");
		}

	}

	private void modifingPrice(int id, char category, char seatType, int noSeats) {

		Flightpojo book = flight.get(id);

		if (seatType == 'E' || seatType == 'e') {

			book.setEconomyCost(book.getEconomyCost() + 100);

		} else if (seatType == 'B' || seatType == 'b') {

			book.setBusinessCost(book.getBusinessCost() + 100);

		}
		flight.put(id, book);

	}

	private void modifingSeatCount(int id, char category, char seatType, int noSeats) {
		Flightpojo book = flight.get(id);

		if (seatType == 'E' || seatType == 'e') {
			if (category == 'T' || category == 't') {
				book.setTakalEconomySeats(book.getTakalEconomySeats() - noSeats);

			} else if (category == 'G' || category == 'g') {
				book.setEconomySeats(book.getEconomySeats() - noSeats);

			}
		} else if (seatType == 'B' || seatType == 'b') {
			if (category == 'T' || category == 't') {
				book.setTatkalBusinessSeats(book.getTatkalBusinessSeats() - noSeats);

			} else if (category == 'G' || category == 'g') {
				book.setBusinessSeats(book.getBusinessSeats() - noSeats);

			}
		}
		flight.put(id, book);

	}

	private int seatAvailability(int id, char category, char seatType, int noSeats) {
		int seat = 0;
		if (seatType == 'E' || seatType == 'e') {
			if (category == 'T' || category == 't') {
				seat = flight.get(id).getTakalEconomySeats();

			} else if (category == 'G' || category == 'g') {
				seat = flight.get(id).getEconomySeats();

			}
		} else if (seatType == 'B' || seatType == 'b') {
			if (category == 'T' || category == 't') {
				seat = flight.get(id).getTatkalBusinessSeats();

			} else if (category == 'G' || category == 'g') {
				seat = flight.get(id).getBusinessSeats();

			}
		}

		return seat;

	}

	private double total(int id, char category, char seatType, int noSeats) {
		double total = 0;
		if (category == 'G' || category == 'g') {

			if (seatType == 'E' || seatType == 'e') {
				total = flight.get(id).getEconomyCost() * noSeats;
			} else if (seatType == 'B' || seatType == 'b') {
				total = flight.get(id).getBusinessCost() * noSeats;
			}
		} else if (category == 'T' || category == 't') {
			if (seatType == 'E' || seatType == 'e') {
				total = flight.get(id).getTakkalEconomyCost() * noSeats;
			} else if (seatType == 'B' || seatType == 'b') {
				total = flight.get(id).getTakkalBusinessCost() * noSeats;
			}

		}

		return total;
	}

}
