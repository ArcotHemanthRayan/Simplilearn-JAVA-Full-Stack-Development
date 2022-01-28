package Com.VirtualKey;

import java.util.List;
import java.util.Scanner;

public class HandlingFiles 
{
	public static void handleWelcomeScreenInput() 
	{
		boolean working = true;
		Scanner scan = new Scanner(System.in);
		do {
			try // try block used to handle the code where exception might happen
			{
				MenuOptions.menuOptions(); // menu options to select the task to be performed
				int input = scan.nextInt(); // Takes input from the user (we have to enter 1, 2 or 3 only)

				switch (input) 
				{
				case 1:
					OperationsOnFiles.displayAllFiles("main");
					break;
				case 2:
					HandlingFiles.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Project Closed");
					working = false;
					scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from the given choices");
				}
			} 
			catch (Exception e) // Using generic exception handling catch block to handle exception
			{
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} 
		while (working == true);
	}
	
	public static void handleFileMenuOptions() // This method used for perform specific operations with files
	{
		boolean working = true;
		Scanner scan = new Scanner(System.in); 
		do 
		{
			try {
				MenuOptions.fileMenuOptions();
				OperationsOnFiles.createMainFolderIfNotPresent("main");
				
				int input = scan.nextInt(); //takes input (1 to 5) to perform specific function in files
				switch (input) 
				{
				case 1:	// This case-1 used to adding File

					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = scan.next();
					
					OperationsOnFiles.createFile(fileToAdd, scan);
					
					break;
					
				case 2: // This case-2 used to delete File 
			
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = scan.next();
					
					OperationsOnFiles.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = OperationsOnFiles.displayFileLocations(fileToDelete, "main");
					
					String deletionPrompt = "Select index of which file to delete"
							+ "\n(Enter 0 if you want to delete all files)";
					
					System.out.println(deletionPrompt);
				
					int index = scan.nextInt();
					
					if (index != 0) 
					{
						OperationsOnFiles.deleteFileRecursively(filesToDelete.get(index - 1));
					} 
					else 
					{
						
						// If index == 0, delete all files
						for (String path : filesToDelete) 
						{
							OperationsOnFiles.deleteFileRecursively(path);
						}
					}
					break;
					
					
				case 3:	// This case-3 will Search for the file

					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = scan.next();
					
					OperationsOnFiles.createMainFolderIfNotPresent("main");
					OperationsOnFiles.displayFileLocations(fileName, "main");
					break;
					
					
				case 4:	// This case-4 used to Go to Previous menu options

					
					return;
					
					
				case 5:	// This case-5 will Exit the application

					System.out.println("Program exited successfully, thanks for using the application :)");
					working = false;
					scan.close();
					System.exit(0);
					
				default: // Default is used to display message if not selected correct option from the given options
					
					System.out.println("Select a correct option from the given options");
				}
			} 
			catch (Exception e) // Catches exception if any exception occurs
			{
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
			
		} 
		while (working == true);
	}
}

