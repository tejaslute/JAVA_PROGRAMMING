
public class FOR_LOOP_4_SUM_OF__DIGITS {

	public static void main(String[] args) {
		int number=23;
		int reminder=0;
		int sum=0;
		while(number>0)
		{
			reminder=number%10;  // Gives an last digit of number 
			sum+=reminder;
			number=number/10;  // After dividing by 10 last digit is gone 
			
		}
		System.out.println("Sum of digits are "+sum);

	}

}
