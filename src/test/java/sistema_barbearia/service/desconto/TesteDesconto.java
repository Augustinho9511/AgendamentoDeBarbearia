package sistema_barbearia.service.desconto;

import sistema_barbearia.service.CalculadoraDeDesconto;
import sistema_barbearia.service.DescontoPrimeiraVez;
import sistema_barbearia.service.DescontoVip;

public class TesteDesconto {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        double valorServico = 100.0;

        double valorComVip = calculadora.calcular(valorServico, new DescontoVip());
        System.out.println("Valor para VIP: R$ " + valorComVip);

        double valorComPrimeiraVez = calculadora.calcular(valorServico, new DescontoPrimeiraVez());
        System.out.println("Valor para Primeira Vez: R$ " + valorComPrimeiraVez);
    }
}