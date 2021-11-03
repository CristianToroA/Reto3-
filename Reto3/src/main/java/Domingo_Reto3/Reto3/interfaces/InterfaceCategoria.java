package Domingo_Reto3.Reto3.interfaces;

import Domingo_Reto3.Reto3.model.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}

