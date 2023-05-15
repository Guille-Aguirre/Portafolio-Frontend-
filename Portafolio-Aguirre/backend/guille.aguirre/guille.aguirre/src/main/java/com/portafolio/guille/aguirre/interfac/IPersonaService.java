package com.portafolio.guille.aguirre.interfac;

import com.portafolio.guille.aguirre.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas//
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void asaPersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por iD
    public void deletePersona (long id);
    
    //Buscamos una persona por ID
    public Persona findPersona (Long id);
    
    
}
