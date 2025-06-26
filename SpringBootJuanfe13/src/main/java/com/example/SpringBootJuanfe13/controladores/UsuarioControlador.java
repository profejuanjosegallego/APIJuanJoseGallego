package com.example.SpringBootJuanfe13.controladores;

import com.example.SpringBootJuanfe13.modelos.Usuario;
import com.example.SpringBootJuanfe13.servcios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio servicio;

    //FUNCION para activar el servicio de
    //guardado

    @PostMapping
    public ResponseEntity<?> activarGuardado(@RequestBody Usuario datosEnviados){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarUsuarioEnBD(datosEnviados));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }


}
