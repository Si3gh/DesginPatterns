package dependencyUnitTest;

import java.math.BigDecimal;

public class Venda {
    protected BigDecimal valor = new BigDecimal(0.00);
    protected UnidadeFederativa ufDestino;
    protected BigDecimal aliquotaIcms = new BigDecimal(0.00);

    public Venda(BigDecimal valor, BigDecimal aliquota, UnidadeFederativa ufDestino) {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public UnidadeFederativa getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(UnidadeFederativa ufDestino) {
        this.ufDestino = ufDestino;
    }

    public BigDecimal getAliquota() {
        return aliquotaIcms;
    }
}
