/**
 * 
 */
package platzi.ereservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import platzi.ereservation.modelo.Cliente;

/**
 * Interface to define operations about DBB related with client
 * @author jose.r.urrutia.loya
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	/**
	 * Method definition to search clients with their last name.
	 * 
	 *  @param apellidoCli
	 */
	
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
	
	

}
