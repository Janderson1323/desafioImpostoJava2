import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double rendAnual, rendMensal, rendPrestServ, rendGanhCapit, gastMedc, gastEduc, impostSalario;

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
		
		
		if(rendMensal < 3000) {
			impostSalario = 0;
		}
		
		
		
		

	}

}
