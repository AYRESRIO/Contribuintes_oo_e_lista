package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		TaxPayer imp = null;
		int i;

		System.out.println("How many taxpayers will you enter?");
		int N = sc.nextInt();

		for (i = 0; i < N; i++) {

			System.out.println("Enter the data of the " + (1 + i) + "º contributor: ");

			System.out.print("Annual Income with Salaries:");
			Double salaryIncome = sc.nextDouble();
			System.out.print("annual income from services rendered: ");
			Double servicesIncome = sc.nextDouble();
			System.out.print("Annual Income with Capital Gains: ");
			Double capitalIncome = sc.nextDouble();
			System.out.print("Medical Expenses: ");
			Double healthSpending = sc.nextDouble();
			System.out.print("Educational Expenses: ");
			Double educationSpending = sc.nextDouble();

			imp = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			list.add(imp);
			System.out.println();

		}

		for (i = 0; i < N; i++) {

			if (i < N) {
				System.out.println("Resumo do " + (i + 1) + "º contribuinte:");
				System.out.println(list.get(i));
			}

		}

		sc.close();

	}

}
