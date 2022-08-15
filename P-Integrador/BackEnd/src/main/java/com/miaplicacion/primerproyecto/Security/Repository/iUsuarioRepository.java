package com.miaplicacion.primerproyecto.Security.Repository;

import com.miaplicacion.primerproyecto.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuairo(String nombreUsuario);
    
    boolean existByNombreUsuario(String NombreUsuario);
    boolean existByEmail(String email);
}
