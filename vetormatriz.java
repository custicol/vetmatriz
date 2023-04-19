package vetormatriz;
import java.util.Scanner;
public class vetormatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [][] notas = new double [10][4];
		double []	medias = new double [10];
		
		for (int i = 0; i < notas.length; i++ ) {
			System.out.println("Digite as notas do aluno " + (i+1) + ":");
			for (int j = 0; j < notas[i].length; j++) {
				notas [i][j] = sc.nextDouble();
			}
			System.out.println();
		}
		for (int i = 0; i < notas.length; i++) {
			double soma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
		
			}
		medias[i] = soma / notas[i].length;
		}
		
		System.out.println("Media dos alunos");
		for (int i = 0; i < medias.length; i++) {
			System.out.printf("Paricipante %d: %.2f\n", (i+1), medias[i]);
		}
	}

}
