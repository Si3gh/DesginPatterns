package dependencyUnitTest;

import java.math.BigDecimal;

public class UnidadeFederativa {
    private String sigla;
    private BigDecimal aliquota = new BigDecimal("");

    UnidadeFederativa(final String sigla, final BigDecimal aliquota) {
        this.sigla = sigla;
        this.aliquota = aliquota;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public BigDecimal getAliquota() {
        return aliquota;
    }

    public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    public BigDecimal returnaAliquota() {
        return aliquota;
    }
}

