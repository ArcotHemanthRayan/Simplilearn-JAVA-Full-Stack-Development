package Com.VirtualKey;

public class MenuOptions 
{
	public static void printWelcomeScreen(String appName, String developerName) 
	{
		String companyDetails = String.format(
				               " Welcome to Virtual Key Project :) \n" + 
	                           " The Virtual Key application was developed by\n"
				               + developerName );
		String operation = 
				"The Virtual Key application is used to \n"
				+ "Retrieve all file names in the \"main\" folder\n"
				+ "Search, add, or delete files in \"main\" folder\n";
		
		System.out.println(companyDetails);

		System.out.println(operation);
	}

	public static void menuOptions() 
	{
		String menu = 
				"Select option number from below to perform specific function\n"
				+ "1) Retrieve all files inside \"main\" folder\n" 
				+ "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		
		System.out.println(menu);

	}

	public static void fileMenuOptions() 
	{
		String fileMenu = 
				"Select any correct option from given options\n"
				+ "1) Add a file to \"main\" folder\n" 
				+ "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" 
				+ "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}
}
