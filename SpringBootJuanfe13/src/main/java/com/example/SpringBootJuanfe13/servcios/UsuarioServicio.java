package com.example.SpringBootJuanfe13.servcios;

import com.example.SpringBootJuanfe13.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    
}
