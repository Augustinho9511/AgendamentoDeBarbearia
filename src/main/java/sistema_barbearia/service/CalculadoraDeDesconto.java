package sistema_barbearia.service;

public class CalculadoraDeDesconto {

    public double calcular(double valorOriginal, RegraDesconto regra) {
        return regra.aplicarDesconto(valorOriginal);
    }
}
