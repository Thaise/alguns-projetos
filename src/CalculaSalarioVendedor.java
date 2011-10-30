
public class CalculaSalarioVendedor {

	public static double calculo(double salarioFixo, double valorTotalVendas, double comissaoPorCarro) {
		
		double valorTotalComissaoCarros = valorTotalVendas * 0.15 ;//15% da venda dos carros
		double valorComissaoVendas = valorTotalVendas * 0.05;//5% do total das vendas
		double salarioTotal = (Math.round(valorTotalComissaoCarros + valorComissaoVendas + salarioFixo));
		
		return salarioTotal;
	}

}
