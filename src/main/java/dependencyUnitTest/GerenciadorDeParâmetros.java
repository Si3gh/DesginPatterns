package dependencyUnitTest;

import java.math.BigDecimal;

public interface GerenciadorDeParâmetros {
    Venda efetuarVenda(BigDecimal valor, UnidadeFederativa ufDestino);
    BigDecimal obterAlíquotaICMS(UnidadeFederativa uf);
}
