package br.com.fiap.trafego;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AcidenteApplicationTests {

    @Test
    void contextLoads() {
        // Verifica se o contexto do Spring carrega corretamente.
        // O teste será bem-sucedido se não houver exceções durante o carregamento do contexto.
    }
    
    // Exemplo de um teste adicional que verifica se um componente específico está carregado
    @Test
    void testComponentLoad() {
        // Aqui você pode adicionar um teste que verifica se um bean específico é carregado no contexto.
        // Por exemplo, se você tiver um serviço chamado 'AcidenteService':
        // AcidenteService acidenteService = applicationContext.getBean(AcidenteService.class);
        // assertNotNull(acidenteService);
    }
}
