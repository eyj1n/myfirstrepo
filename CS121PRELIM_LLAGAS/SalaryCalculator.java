import java.util.Scanner;
	public class SalaryCalculator {
		public static void main(String[] args){
			Scanner scanner = new Scanner (System.in);
	
		System.out.print("Input rate per day:");
		double rateperday = scanner.nextDouble();
		
		System.out.print("Input No. of working days:");
		double workingdays = scanner.nextDouble();
		
		System.out.print("Input No. of days absent:");
		double absent = scanner.nextDouble();
		
		
		double GroosSalary = rateperday * workingdays - absent;
		System.out.println("GroosSalary " * workingdays + " absent - " + GroosSalary);
		
		scanner.close();
		}
	}
