package com.miaplicacion.primerproyecto.Interface;

import com.miaplicacion.primerproyecto.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer lista de persona
    public List<Persona> getPersona();
    
    //guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar objeto por id
    public void deletePersona(Long id);
    
    //buscar persona
    public Persona findPersona(Long id);
}
