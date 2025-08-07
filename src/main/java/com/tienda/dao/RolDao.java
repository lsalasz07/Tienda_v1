package com.tienda.dao;

import com.tienda.domain.Rol;
import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends JpaRepository<Usuario, Long> {

    public void save(Rol rol);
    
}
