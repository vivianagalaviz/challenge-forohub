package com.viviana.forohub.controller;
import com.viviana.forohub.domain.usuario.DatosAutenticacionUsuario;
import com.viviana.forohub.domain.usuario.Usuario;
import com.viviana.forohub.infra.security.DatosJWTToken;
import com.viviana.forohub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efectuarLogin(@RequestBody @Valid DatosAutenticacionUsuario datos) {
        var authenticationToken =
                new UsernamePasswordAuthenticationToken(datos.login(), datos.clave());

        var autenticacion = manager.authenticate(authenticationToken);
        var tokenJWT = tokenService.generarToken((Usuario) autenticacion.getPrincipal());

        return ResponseEntity.ok(new DatosJWTToken(tokenJWT));
    }
}
