package com.example.SpringBootJuanfe13.repositorios;

import com.example.SpringBootJuanfe13.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
