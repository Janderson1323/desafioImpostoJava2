import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double rendAnual, rendMensal, rendPrestServ, rendGanhCapit, gastMedc, 
		gastEduc, impostSalario, impostPrestServ, impostGanCapital, impostBrtT, gastDedu, 
		maxDedu, abatimento, impostoDevido;

		System.out.printf("Renda anual com salário: ");
		rendAnual = sc.nextDouble();

		System.out.printf("Renda anual com prestação de serviço: ");
		rendPrestServ = sc.nextDouble();

		System.out.println("Renda anual com ganho de capital:");
		rendGanhCapit = sc.nextDouble();

		System.out.printf("Gastos médicos: ");
		gastMedc = sc.nextDouble();

		System.out.println("Gastos educacionais:");
		gastEduc = sc.nextDouble();

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA ");
		System.out.println();

		System.out.println("CONSOLIDADO DE RENDA");

		rendMensal = rendAnual / 12;
        impostSalario = 0;

		if (rendMensal < 3000) {
			impostSalario = 0;
		}

		else if (rendMensal == 3000 || rendMensal < 5000) {
			impostSalario = rendAnual * 10 / 100;

		} else if (rendMensal >= 5000) {
			impostSalario = rendAnual * 20 / 100;
		}

		if (rendPrestServ > 0) {
			impostPrestServ = rendPrestServ * 15 / 100;
		}

		else {
			impostPrestServ = 0;
		}

		if (rendGanhCapit > 0) {
			impostGanCapital = rendGanhCapit * 20 / 100;
		}

		else {
			impostGanCapital = 0;
		}
		
		
		impostBrtT = impostSalario + impostPrestServ + impostGanCapital;
		
		gastDedu = gastMedc + gastEduc;
		maxDedu = impostBrtT * 30 / 100;
		
		
		if (maxDedu < gastDedu) {
			abatimento = maxDedu;
			impostoDevido = impostBrtT - abatimento;
		}
		
		else {
			
			abatimento = gastDedu;
			impostoDevido = impostBrtT - abatimento;
			
			
		}

	}

}
