import java.util.Scanner;

public class CalculandoDias {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de anos, meses e dias de vida (contando até ontem): ");
		String idade = entrada.nextLine();

		System.out.println("Você viveu, contando até ontem, "+idade(idade)+" dias.");
		
	}
	
	public static int idade(String idade) {
		String idadeCorreta = idade.trim();
		
		String[] idadeSeparada = idadeCorreta.split(" ");
		
		if(idadeSeparada.length < 3){
			System.out.println("Você deve fornecer todos os dados (anos, meses e dias)!");
			main(null);
		}
		
		int anos = (Integer.parseInt(idadeSeparada[0]));
		int meses = (Integer.parseInt(idadeSeparada[1]));;
		int dias = (Integer.parseInt(idadeSeparada[2]));;
		
		int diasAnos = anos * 365;
		int diasMeses = meses * 30;
		
		int idadeFinal = diasAnos + diasMeses + dias;
		
		return idadeFinal;
	}

}
