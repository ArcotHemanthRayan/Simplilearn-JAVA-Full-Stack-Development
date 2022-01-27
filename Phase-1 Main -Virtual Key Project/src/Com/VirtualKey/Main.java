package Com.VirtualKey;

public class Main 
{
	    public static void main(String[] args) {
		
		// Creating "main" folder if it does not present in current folder structure
	    	
	    OperationsOnFiles.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("This is an Virtual Key Repositories project", " ==>((Arcot Hemanth Rayan)<==");
		
		HandlingFiles.handleWelcomeScreenInput();
	}
}
