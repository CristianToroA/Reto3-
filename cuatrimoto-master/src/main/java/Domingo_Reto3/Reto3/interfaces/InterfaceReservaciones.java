
package Domingo_Reto3.Reto3.interfaces;

import Domingo_Reto3.Reto3.model.Reservaciones;
import org.springframework.data.repository.CrudRepository;


public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer> {
    
}

