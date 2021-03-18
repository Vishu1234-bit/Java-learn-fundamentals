import java.util.Scanner;
public class decimaltoroman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				Scanner sc = new Scanner(System.in);
				mainLoop: while (true) {
					System.out.print("Please, select mode. If you want to convert Roman "
							+ "numbers to decimal - type 'R2D' and press enter."
							+ System.lineSeparator()
							+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

					String mode = sc.next();
					if (mode.equalsIgnoreCase("R2D")) {
						while (true) {
							System.out.print("Please, enter Roman number you want to convert: ");
							String romanNumber = sc.next();
							if (isRomanNumberValid(romanNumber)) {
								System.out.println(roman2Decimal(romanNumber));
								break mainLoop;
							} else {
								System.out.println("You entered invalid Roman number. "
										+ "Please, try one more time.");
								continue;
							}
						}
					} else if (mode.equalsIgnoreCase("D2R")) {
						while (true) {
							System.out.print("Please, enter decimal number "
									+ "you want to convert: ");
							int decimalNumber = sc.nextInt();
							if (isDecimalNumberValid(decimalNumber)) {
								System.out.println(decimal2Roman(decimalNumber));
								break mainLoop;
							} else {
								System.out.println("Please, enter positive integer from 1 to 100.");
								continue;
							}

						}

					}
					
					System.out.println("Please, enter 'R2D' or 'D2R.");
				}
			}

			

			/**
			 * Converts decimal numbers to Roman.
			 * 
			 * Takes int value as a parameter. Works only with numbers from 1 to 100.
			 * 
			 * @param number to convert to Roman.
			 * @return string of Roman number.
			 */
			public static String decimal2Roman(int number) {
				//<write your code here>
				String[] roman = new String[] {"I","IV","V","IX","X","XL","L","XC","C"};
				int[] decimal = new int[] {1,4,5,9,10,40,50,90,100};
				StringBuilder s = new StringBuilder();
				for (int i=roman.length-1;i>=0;i--) {
					while(number>=decimal[i]) {
						s.append(roman[i]);
						number-=decimal[i];
					}
				}
				return s.toString();
				
			}

			/**
			 * Converts Roman numbers to decimal.
			 * 
			 * Takes string value with Roman number as a parameter.
			 * 
			 * At first method validates if input string could be Roman number. After method
			 * uses algorithm to convert Roman numeral to decimal.
			 * 
			 * @param romanNumber
			 * @return decimal representation of Roman number
			 */

			public static int roman2Decimal(String romanNumber) {
				//<write your code here>
				String romannumber = romanNumber.toUpperCase();
				int decimal = 0;
				int lastnumber=0;
				for(int i =romannumber.length()-1;i>=0;i--) {
					char chartodecimal = romannumber.charAt(i);
					switch(chartodecimal) {
					case 'C':
						decimal = processdecimal(100,lastnumber,decimal);
						lastnumber=100;
						break;
					case 'L':
						decimal = processdecimal(50,lastnumber,decimal);
						lastnumber=50;
						break;
					case 'X':
						decimal = processdecimal(10,lastnumber,decimal);
						lastnumber=10;
						break;
					case 'V':
						decimal = processdecimal(5,lastnumber,decimal);
						lastnumber=5;
						break;
					case 'I':
						decimal = processdecimal(1,lastnumber,decimal);
						lastnumber=1;
						break;
						}
				}
				return decimal;
			}
			public static int processdecimal(int decimal,int lastnumber,int lastdecimal)
			{
				if(lastnumber>decimal) {
					return lastdecimal-decimal;
				}
				else {
					return lastdecimal+decimal;
				}
			}

			/**
			 * Validation for Roman numbers.
			 * 
			 * Use regular expression which is checking if string really could be Roman
			 * number.
			 * 
			 * @param romanNumber
			 * @return true if String is Roman number
			 */
			public static boolean isRomanNumberValid(String romanNumber) {
			 //   <write your code here>
				return romanNumber.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
			}
			
			public static boolean isDecimalNumberValid(int decimalNumber) {
				//<write your code here>
				return decimalNumber>0 && decimalNumber<=100;
			}
	
	}


