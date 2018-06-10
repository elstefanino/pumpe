package ep.rs.bckndepumpe.dto;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pumpa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String naziv;
	private String adresa;
	private boolean aktivna = true;
	private String opis;
	private String code;
	private int cena;
	private int poseta;
	private String geoSir;
	private String geoDuz;
	private int grad_id;
	private int korisnik_id;
	
	// default constructor
		public Pumpa() {
			
			this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
			
		}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public boolean isAktivna() {
		return aktivna;
	}
	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getPoseta() {
		return poseta;
	}
	public void setPoseta(int poseta) {
		this.poseta = poseta;
	}
	
	public int getGrad_id() {
		return grad_id;
	}
	public void setGrad_id(int grad_id) {
		this.grad_id = grad_id;
	}
	public int getKorisnik_id() {
		return korisnik_id;
	}
	public void setKorisnik_id(int korisnik_id) {
		this.korisnik_id = korisnik_id;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	public String getGeoSir() {
		return geoSir;
	}

	public void setGeoSir(String geoSir) {
		this.geoSir = geoSir;
	}

	public String getGeoDuz() {
		return geoDuz;
	}

	public void setGeoDuz(String geoDuz) {
		this.geoDuz = geoDuz;
	}

	@Override
	public String toString() {
		return "Pumpa [id=" + id + ", naziv=" + naziv + ", adresa=" + adresa + ", aktivna=" + aktivna + ", opis=" + opis
				+ ", code=" + code + ", cena=" + cena + ", poseta=" + poseta + ", geoSir=" + geoSir + ", geoDuz="
				+ geoDuz + ", grad_id=" + grad_id + ", korisnik_id=" + korisnik_id + "]";
	}
	
	
}
