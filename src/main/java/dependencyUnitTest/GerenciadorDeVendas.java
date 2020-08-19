package dependencyUnitTest;

import java.math.BigDecimal;

public class GerenciadorDeVendas implements GerenciadorDeParâmetros {
    @Override
    public Venda efetuarVenda(BigDecimal valor, UnidadeFederativa ufDestino) {
        BigDecimal aliquota = obterAlíquotaICMS(ufDestino);
        BigDecimal ONE_HUNDRED = new BigDecimal(100);
        aliquota.multiply(valor).divide(ONE_HUNDRED);
        return new Venda(valor, aliquota, ufDestino);
    }

    @Override
    public BigDecimal obterAlíquotaICMS(UnidadeFederativa uf) {
        return uf.getAliquota();
    }
}
