package vetormatriz;
import java.util.Scanner;
public class ExercicioVetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = {2,5,1,3,4,9,7,8,10,6};
		int busca, posição = 0;
		
		System.out.println("Digite o numero que voce deseja encontrar:");
		busca = sc.nextInt();
		for (int i = 0; i < number.length; i++) {
			if ( number[i] == busca) {
				posição =i;
				break;
			}
			
		}
		if (posição == 0) {
			System.out.println("Não foi encontrado");
			
		} else {
			System.out.println("O numero " + busca + " esta na posição " + posição + " do vetor.");
		}

	}

}
