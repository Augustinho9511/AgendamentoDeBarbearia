package sistema_barbearia.service;

public class DescontoVip implements RegraDesconto {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal * 0.80;
    }
}
