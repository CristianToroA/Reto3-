
package Domingo_Reto3.Reto3.interfaces;

import Domingo_Reto3.Reto3.model.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}

