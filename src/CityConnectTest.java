import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import CityConnect.COMMAND_TYPE;


public class CityConnectTest {

	@Test
	public void testMain() {
		CityConnect test = new CityConnect();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter command:");
		String userCommand = scanner.nextLine();
		String feedback = test.executeCommand(userCommand);
		//Testing to make sure executecommand does not return null
		assertNotNull(feedback);
	}

	@Test
	public void testExecuteCommand() {
		CityConnect test = new CityConnect();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter command:");
		String userCommand = scanner.nextLine();	
	}

}
