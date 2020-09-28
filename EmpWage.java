import java.util.Scanner;

class EmpWage {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee wage per day:");
		int wage_per_day = sc.nextInt();
		System.out.println("Enter employee working hours per month:");
		int hrs_per_month = sc.nextInt();
		System.out.println("Enter employee working days per month:");
		int days_per_month = sc.nextInt();
		SampleEmp e = new SampleEmp(wage_per_day, days_per_month, hrs_per_month);
		e.Calculate();

	}
}

class SampleEmp {
	int w = 0;
	int h = 0;
	int d = 0;

	public SampleEmp(int w, int d, int h) {
		this.w = w;
		this.h = h;
		this.d = d;
	}

	void Calculate() {
		int wage = 0;
		int hours = 0;
		int days = 0;
		{
			while (days <= d || hours <= h) {
				int randomValue = (int) Math.floor(Math.random() * 10 % 3);
				switch (randomValue) {
				case 1:
					wage = wage + w * 8;
					hours = hours + 8;
					days = days + 1;
					break;
				case 2:
					wage = wage + w * 4;
					hours = hours + 4;
					days = days + 1;
					break;
				default:
					wage = wage + 0;
				}
			}
			System.out.println("Wage per month = " + wage);
		}
	}
}