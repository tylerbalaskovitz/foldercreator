
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Main {
	public static void main(String args []) {
		
	        // Get the current date
	    LocalDate currentDate = LocalDate.now();
	
	    // Get the current month and year
	    int month = currentDate.getMonthValue();
	
	    // Get the number of days in the current month
	    int daysInMonth = currentDate.lengthOfMonth();
	
	    // Create a new folder for each day of the month
	    for (int day = 1; day <= daysInMonth; day++) {
	        String folderName = String.format("%02d-%02d", month, day);
	        Path folderPath = Paths.get(folderName);
	
	        try {
	            // Create the folder
	            Files.createDirectory(folderPath);
	            System.out.println("Created folder: " + folderPath);
	        } catch (Exception e) {
	            System.out.println("Error creating folder: " + folderPath);
	            e.printStackTrace();
	        }
	    }

	}
}
