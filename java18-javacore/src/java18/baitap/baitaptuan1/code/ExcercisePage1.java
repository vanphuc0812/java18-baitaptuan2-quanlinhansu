package java18.baitap.baitaptuan1.code;

import java.time.LocalTime;

public class ExcercisePage1 {

	/***
	 * Function calculate karaoke cost
	 * @param inputStartTime 	start time
	 * @param inputStopTime		stop time
	 * @param numWaterBottle	number of bottle of water
	 * @return	price or -1 if input is invalid 
	 */
	public static double calculateKaraokeCost(LocalTime inputStartTime, LocalTime inputStopTime, int numWaterBottle) {
		int startTime = inputStartTime.toSecondOfDay();
		int stopTime = inputStopTime.toSecondOfDay();

		if (checkValidTime(startTime, stopTime,numWaterBottle)) {
			return calculatePrice(startTime, stopTime, numWaterBottle);
		} else {
			return -1;
		}
	}

	/***
	 * Function check if input time is valid
	 * 
	 * @param startTime time customer starts service
	 * @param stopTime  time customer stops service
	 * @return
	 */
	public static boolean checkValidTime(int startTime, int stopTime, int numWaterBottle ) {
		int openDoorTime = LocalTime.of(9, 0).toSecondOfDay(); // get open door time in second
		int closeDoorTime = 24 * 3600; // get close door time in second

		if (startTime < openDoorTime || stopTime > closeDoorTime) {
			return false;
		}
		if (startTime > stopTime) {
			return false;
		}
		if (numWaterBottle <0) {
			return false;
		}

		return true;
	}

	/***
	 * Function check if customer cost is discounted
	 * 
	 * @param startTime time customer starts service
	 * @return true if start time in discount range, else return false
	 */
	public static boolean checkDiscountTime(int startTime) {
		int discountBeginTime = LocalTime.of(9, 0).toSecondOfDay(); // get time begin discount in second
		int discountEndTime = LocalTime.of(17, 0).toSecondOfDay(); // get time end discount in second

		return (startTime > discountBeginTime && startTime < discountEndTime);
	}

	/***
	 * Function calculate price
	 * 
	 * @param startTime time customer starts service
	 * @param stopTime  time customer stops service
	 * @return price
	 */
	public static double calculatePrice(int startTime, int stopTime, int numWaterBottle) {
		double price = 0;
		int gap = stopTime - startTime;
		if (gap < 3 * 3600) { // compare with 3 hours = 3*3600 second
			price = (gap / 3600.0) * 30000;
		} else {
			price = (gap / 3600.0 - 3) * 30000; // price after 3 hours
			price += 30000 * 3; // price of first 3 hours
		}

		if (checkDiscountTime(startTime)) {
			price += price * 0.2; // discount 20%
		}

		return price + numWaterBottle * 10000;
	}

}
