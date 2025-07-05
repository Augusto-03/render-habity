package com.habity.habity_backend.service;


import com.habity.habity_backend.dto.RegistroUsuarioDTO;
import com.habity.habity_backend.entity.Usuario;
import com.habity.habity_backend.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario crearDesdeRegistro(RegistroUsuarioDTO dto) {
        if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("El email ya está en uso");
        }

        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setEmail(dto.getEmail());
        usuario.setPassword(passwordEncoder.encode(dto.getPassword()));
        usuario.setEdad(dto.getEdad());
        usuario.setPeso(dto.getPeso());
        usuario.setAltura(dto.getAltura());

        return usuarioRepository.save(usuario);
    }
}
