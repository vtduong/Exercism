import java.util.ArrayList;
class ArmstrongNumbers {

	boolean isArmstrongNumber(int num) {
		int temp = num;
		//base case: one-digit number
		if (temp < 10)
			return true;
		// list of digits
		//Alternative: use Integer.toString() to split number into integers
		ArrayList<Integer> digits = new ArrayList<Integer>();
		//count number of digits and get each digit from input
		while (temp > 0){
			digits.add(temp % 10);
			temp = temp / 10;
		}
		//calculate the sum
		int sum = 0;
		for (int i = 0; i < digits.size(); i++){
			sum += Math.pow(digits.get(i), digits.size());
		}

		if (sum == num)
			return true;
		return false;
		
	}

}
