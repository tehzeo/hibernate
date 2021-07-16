/**
 * 
 */
package platzi.ereservation.resources.vo;

import lombok.Data;

/**
 * @author jose.r.urrutia.loya
 *
 */
@Data
public class ClienteVO {
	
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	
}