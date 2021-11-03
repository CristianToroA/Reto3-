package Domingo_Reto3.Reto3.interfaces;

import Domingo_Reto3.Reto3.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {    
}
