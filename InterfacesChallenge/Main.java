package InterfacesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISaveable tims = new Player("Tim", 10, 15);
		System.out.println(tims);
		saveObject(tims);

		((Player) tims).setHitPoints(8);
		System.out.println(tims);
		((Player) tims).setWeapon("Stormbringer");
		saveObject(tims);
		loadObject(tims);
		System.out.println(tims);

		ISaveable wereWolf = new Monster("wereWolf",20,40);
		System.out.println(wereWolf);
		saveObject(wereWolf);
		
	}

	public static ArrayList<String> readValues() {
		ArrayList<String> values = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("1 to enter the string 0 to quit");

		while (!quit) {
			System.out.print("Choose your option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.print("Enter a String: ");
				values.add(index, scanner.nextLine());
				index++;
				break;
			}
		}
		return values;
	}

	public static void saveObject(ISaveable objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}

	public static void loadObject(ISaveable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

}
