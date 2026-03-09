package com.viviana.forohub.infra.security;
import com.viviana.forohub.domain.usuario.Usuario;
import com.viviana.forohub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CargaInicialUsuarios implements CommandLineRunner {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        var usuario = repository.findByLogin("admin@forohub.com");

        if (usuario == null) {
            repository.save(new Usuario(
                    null,
                    "admin@forohub.com",
                    passwordEncoder.encode("123456")
            ));
        } else {
            usuario.setClave(passwordEncoder.encode("123456"));
            repository.save(usuario);
        }
    }
}