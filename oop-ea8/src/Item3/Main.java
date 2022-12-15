package Item3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Case CountryA = new Case();
		Case CountryB = new Case();
		Case CountryC = new Case();
		
		System.out.println("COUNTRY A");
		System.out.print("Enter the Country's name: ");
		CountryA.setCountry(input.nextLine());
		System.out.print("Enter number of populaiton: ");
		CountryA.setPopulation(input.nextInt());
		System.out.print("Enter number of recovered: ");
		CountryA.setRecovered(input.nextInt());
		System.out.print("Enter number of infected: ");
		CountryA.setInfected(input.nextInt());
		input.nextLine();
		
		CountryA.computeRatio();
		
		System.out.println("\nCOUNTRY B");
		System.out.print("Enter the Country's name: ");
		CountryB.setCountry(input.nextLine());
		System.out.print("Enter number of populaiton: ");
		CountryB.setPopulation(input.nextInt());
		System.out.print("Enter number of recovered: ");
		CountryB.setRecovered(input.nextInt());
		System.out.print("Enter number of infected: ");
		CountryB.setInfected(input.nextInt());
		input.nextLine();
		
		CountryB.computeRatio();
		
		System.out.println("\nCOUNTRY C");
		System.out.print("Enter the Country's name: ");
		CountryC.setCountry(input.nextLine());
		System.out.print("Enter number of populaiton: ");
		CountryC.setPopulation(input.nextInt());
		System.out.print("Enter number of recovered: ");
		CountryC.setRecovered(input.nextInt());
		System.out.print("Enter number of infected: ");
		CountryC.setInfected(input.nextInt());
		input.nextLine();
		
		CountryC.computeRatio();
		
		System.out.println("\n\nCOUNTRY A");
		System.out.println("Name: " + CountryA.getCountry());
		System.out.println("Population: " + CountryA.getPopulation());
		System.out.println("Infected: " + CountryA.getInfected());
		System.out.println("Recovered: " + CountryA.getRecovered());
		System.out.println("Ratio of Infected: " + CountryA.ratioOfInfected);
		
		System.out.println("\nCOUNTRY B");
		System.out.println("Name: " + CountryB.getCountry());
		System.out.println("Population: " + CountryB.getPopulation());
		System.out.println("Infected: " + CountryB.getInfected());
		System.out.println("Recovered: " + CountryB.getRecovered());
		System.out.println("Ratio of Infected: " + CountryB.ratioOfInfected);
		
		System.out.println("\nCOUNTRY C");
		System.out.println("Name: " + CountryC.getCountry());
		System.out.println("Population: " + CountryC.getPopulation());
		System.out.println("Infected: " + CountryC.getInfected());
		System.out.println("Recovered: " + CountryC.getRecovered());
		System.out.println("Ratio of Infected: " + CountryC.ratioOfInfected);

	}

}
