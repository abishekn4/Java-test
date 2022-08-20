class Game{
	
	public static String badminton(int number){

		if (number==7)
		{
			return("good number");

		}

		if(number==9)
		{

			return("bad number");
		}
		if(number==0){

			return("Neutral");
		}

		return("unknown number");
	}

    // Weekday names
	public static String week(int num){

		if (num==1)
		{
			return("Sunday");

		}

		if (num==2)
		{
			return("Monday");

		}

		if (num==3)
		{
			return("Tuesday");

		}


		if (num==4)
		{
			return("Wednesday");


		}

		if (num==5)
		{
			return("Thursday");

		}

		if (num==6)
		{
			return("Friday");

		}

		if (num==7)
		{
			return("Saturday");

		}
		return("there are only 7 days");


	}

	// sum of two numbers 

	public static int sumOfNumber(int firstNum, int secondNum){


		int sum=firstNum+secondNum;
		return(sum);

	}

	//sum of strings

	public static String name(String firstName, String lastName){

		String fullName=firstName+lastName;
		return(fullName);
	}

	// percentage 

	public static String grade(int percent){

		if(percent>50 &&percent<60)
		{

			return("Second Class");
		}
		return ("");

	}

	public static String maleFemale(String gender){

		 if(gender=="M"){

		 	return("true");
		 }
		 return("false");

	}

	public static int chappal(String name){

		if(name=="abishek")
		{
			return(9);
		}

		if (name=="sanjay")
		{
			return(10);
		}
		return(0); 
	}



}