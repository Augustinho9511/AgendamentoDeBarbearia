package sistema_barbearia.service.desconto;

public class CalculadoraDeDesconto {

    public double calcular(double valorOriginal, RegraDesconto regra) {
        return regra.aplicarDesconto(valorOriginal);
    }
}
