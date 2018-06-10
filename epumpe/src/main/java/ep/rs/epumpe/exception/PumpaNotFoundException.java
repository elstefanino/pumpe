package ep.rs.epumpe.exception;

import java.io.Serializable;

public class PumpaNotFoundException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String poruka;
	
	public PumpaNotFoundException() {
		this("Pumpa nije dostupna!");
	}
	
	public PumpaNotFoundException(String poruka) {
		this.poruka = System.currentTimeMillis() + ": " + poruka;
	}

	public String getPoruka() {
		return poruka;
	}
}