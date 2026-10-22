package SkillBuilders;

public class DemoMethods {

	public static void main(String[] args)
	{
		//Method1
		displayWelcome();
		
		//Method2
		greetStudent("Ayaan");
		
		//Method3
		int total = addNumbers (8, 21);
		System.out.println("Total:" + total);
		
		//Method4
		double area = calculateArea(2.75);
		System.out.println("Area:" + area);
		
		//Method5
		boolean result = isPassing(85);
		System.out.println("Passing: "+ result);

	}

	// METHOD 1: No parameters, no return value
	public static void displayWelcome()
	{
		System.out.println("Welcome to our Math class.");
	}
	
	
	// METHOD 2: One parameter, no return value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, " + name);
	}
	
	// METHOD 3: two parameters, returns an integer
	public static int addNumbers(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	
	// MEHTOD 4: One parameter, returns a decimal
	public static double calculateArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return area;
	}
	
	// METHOD 5: One parameter, returns a boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}
}
