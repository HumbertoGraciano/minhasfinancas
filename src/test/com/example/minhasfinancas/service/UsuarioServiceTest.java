package test.com.example.minhasfinancas.service;

import com.example.minhasfinancas.model.entity.Usuario;
import com.example.minhasfinancas.model.repository.UsuarioRepository;
import com.example.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@ExtendWith(SpringRunner.class)
@ActiveProfiles("test")
public class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Autowired
    UsuarioRepository repository;

    @Test(expected = Test.None.class)
    public void deveValidarEmaill(){

        // Cenanrio
        repository.deleteAll();

        // Acao
        service.validarEmail("email@email.com");
    }

    public void deveLancarErroAoValidarEmailQuandoExistirEmailCadastrado(){
    // Cenario
    Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
    repository.save(usuario);

    // Acao
    service.validarEmail("email@email.com");

    }
}

