import java.util.Scanner;

public class CalculandoPercentualVotos {

	public static void main(String[] args) throws CalculandoPercentualVotosException{
		Scanner entrada =  new Scanner(System.in);
		
		try{
			System.out.print("Quantidade de eleitores: ");
			
			int eleitores = entrada.nextInt();
			
			System.out.print("Quantidade de votos válidos: ");
			double votosValidos = entrada.nextDouble();
			
			System.out.print("Quantidade de votos brancos: ");
			double votosBrancos = entrada.nextDouble();
			
			System.out.print("Quantidade de votos nulos: ");
			double votosNulos = entrada.nextDouble();
			
			encontraErros(eleitores,votosValidos,votosBrancos,votosNulos);
				
			double[]totalVotos = calcularVotos(eleitores,votosValidos, votosBrancos, votosNulos);
			
			System.out.println("Porcentagem de votos VÁLIDOS em relação à quantidade de eleitores: "+totalVotos[0]+"%");
			System.out.println("Porcentagem de votos BRANCOS em relação à quantidade de eleitores: "+totalVotos[1]+"%");
			System.out.println("Porcentagem de votos NULOS em relação à quantidade de eleitores: "+totalVotos[2]+"%");
		
		}catch(CalculandoPercentualVotosException e){
			System.out.println("ERRO: A quantidade de votos difere da quantidade de eleitores!");
		}
	}
	
	private static void encontraErros(int eleitores, double votosValidos,
			double votosBrancos, double votosNulos) throws CalculandoPercentualVotosException {	
		
		double totalVotos1 = votosValidos + votosBrancos + votosNulos;	
		
		if(totalVotos1 > eleitores || totalVotos1 < eleitores){
			throw new CalculandoPercentualVotosException("ERRO: A quantidade de votos difere da quantidade de eleitores!");
		}
		
	}

	public static double[] calcularVotos(int eleitores, double votosValidos, double votosBrancos, double votosNulos) {
		
		double porcentagemValidos = (votosValidos / eleitores) * 100;
		double porcentagemBrancos = (votosBrancos / eleitores) * 100;
		double porcentagemNulos = (votosNulos / eleitores) * 100;
		
		double[] porcentagemVotos = new double [3];
		
		porcentagemVotos[0] = (Math.round(porcentagemValidos));
		porcentagemVotos[1] = (Math.round(porcentagemBrancos));
		porcentagemVotos[2] = (Math.round(porcentagemNulos));
		
		return porcentagemVotos;
	}

}
