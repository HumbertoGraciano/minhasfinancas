package com.example.minhasfinancas.model.repository;

// import com.example.minhasfinancas.model.entity.Usuario;
import com.example.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import test.com.example.minhasfinancas.service.UsuarioServiceTest;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

}
