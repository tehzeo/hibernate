package platzi.ereservation.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import platzi.ereservation.modelo.Cliente;
import platzi.ereservation.repository.ClienteRepository;

/**
 * Class to define client services!
 * @author jose.r.urrutia.loya
 *
 */

@Service
@Transactional(readOnly = true)
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
	}
	/**
	 * Method to do the operation for client saving.
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
		
	}
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
		
	}
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
	
	
	
	
	
	

}
