package ep.rs.bckndepumpe.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grad  implements Serializable {

    private static final long serialVersionUID = 1L; 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ime;
	private String opis;
	private String slikaURL;
	private boolean aktivan = true;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getSlikaURL() {
		return slikaURL;
	}

	public void setSlikaURL(String slikaURL) {
		this.slikaURL = slikaURL;
	}

	public boolean isAktivan() {
		return aktivan;
	}

	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}

	@Override
	public String toString() {
		return "Grad [id=" + id + ", ime=" + ime + ", opis=" + opis + ", slikaURL=" + slikaURL + ", aktivan=" + aktivan
				+ "]";
	}


}
