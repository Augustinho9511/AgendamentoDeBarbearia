package sistema_barbearia.service;

public class DescontoPrimeiraVez implements RegraDesconto {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal * 0.90;
    }
}
