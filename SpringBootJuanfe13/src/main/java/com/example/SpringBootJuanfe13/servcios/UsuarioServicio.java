package com.example.SpringBootJuanfe13.servcios;

import com.example.SpringBootJuanfe13.modelos.Usuario;
import com.example.SpringBootJuanfe13.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio consulta;

    //Operacion 1 GUARDAR EN BD UN USUARIO
    public boolean guardarUsuarioEnBD(Usuario datosEnviados) throws Exception{

        try{ //CAMINO CORRECTO TODOBN MI PAPA
            consulta.save(datosEnviados);
            return true;

        }catch(Exception error){ //CAMINO DEL ERROR CUENTO PORQUE FALLO
            throw new Exception(error.getMessage());
        }

    }




}
