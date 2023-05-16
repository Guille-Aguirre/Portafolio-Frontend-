package com.portafolio.guille.aguirre.service;

import com.portafolio.guille.aguirre.entity.Persona;
import com.portafolio.guille.aguirre.interfac.IPersonaService;
import com.portafolio.guille.aguirre.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    //quede acá
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void asaPersona(Persona persona) {
         ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
}
