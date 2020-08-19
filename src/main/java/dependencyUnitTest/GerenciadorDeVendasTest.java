package dependencyUnitTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GerenciadorDeVendasTest {

    @Test
    void testa_EfetuarVenda_compra_de_200_no_estado_de_sao_paulo() {
        UnidadeFederativa sp = new UnidadeFederativa("sp",new BigDecimal(12.00));
        GerenciadorDeParâmetros gerenciadorDeParâmetros = Mockito.mock(GerenciadorDeParâmetros.class);

        when(gerenciadorDeParâmetros.obterAlíquotaICMS(sp)).thenReturn(new BigDecimal(12.00));
        when(gerenciadorDeParâmetros.efetuarVenda(new BigDecimal(2000),sp)).thenReturn(new Venda(new BigDecimal(2000),new BigDecimal(12),sp));


        GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas();
        gerenciadorDeVendas.efetuarVenda(new BigDecimal(2000),sp);

        verify(gerenciadorDeParâmetros.efetuarVenda(new BigDecimal(2000),sp),times(1));
    }

    @Test
    void testaObterAlíquotaICMS() {
    }
}