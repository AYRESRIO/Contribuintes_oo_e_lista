package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double deducao) {

	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;

	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {

		Double monthSalary = salaryIncome / 12;
		Double salTax = 0.00;

		if (monthSalary < 3000.00)

		{
			salTax = 0.00;
		} else if (monthSalary >= 3000.00 && monthSalary < 5000.00) {
			salTax = (salaryIncome) * 0.10;
		} else {
			salTax = (salaryIncome) * 0.20;
		}

		return salTax;

	}

	public Double servicesTax() {

		Double servTax = 0.00;
		servTax = servicesIncome * 0.15;
		return servTax;

	}

	public Double capitalTax() {

		Double capTax = 0.0;
		capTax = capitalIncome * 0.20;
		return capTax;
	}

	public Double grossTax() {

		Double gTax = 0.0;

		gTax = salaryTax() + servicesTax() + capitalTax();
		return gTax;

	}

	public Double taxRebate() {

		Double spending = healthSpending + educationSpending;
		Double maxDisc = grossTax() * 0.30;
		Double discount = 0.00;
		if (spending > maxDisc) {
			discount = maxDisc;
		} else {
			discount = spending;
		}

		return discount;

	}

	public Double netTax() {

		return grossTax() - taxRebate();

	}

	public String toString() {

		return

		String.format("Imposto bruto total:%.2f;%n", grossTax()) +

				String.format("Abatimento:%.2f ;%n", taxRebate()) +

				String.format("Imposto devido:%.2f .%n", netTax());

	}
}
