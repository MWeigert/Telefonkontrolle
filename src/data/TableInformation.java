/**
 * 
 */
package data;

import java.util.Date;

/**
 * @author MWeigert
 *
 */
public class TableInformation {
	
	private Date datum;
	private String dienst;
	private String kategorie;
	private String zielnummer;
	private String tarif;
	private String menge;
	private Date dauer;
	private String einheit;
	private Double kosten;
	private String typ;
	/**
	 * @return the datum
	 */
	public Date getDatum() {
		return datum;
	}
	/**
	 * @return the dienst
	 */
	public String getDienst() {
		return dienst;
	}
	/**
	 * @return the kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}
	/**
	 * @return the zielnummer
	 */
	public String getZielnummer() {
		return zielnummer;
	}
	/**
	 * @return the tarif
	 */
	public String getTarif() {
		return tarif;
	}
	/**
	 * @return the menge
	 */
	public String getMenge() {
		return menge;
	}
	/**
	 * @return the dauer
	 */
	public Date getDauer() {
		return dauer;
	}
	/**
	 * @return the einheit
	 */
	public String getEinheit() {
		return einheit;
	}
	/**
	 * @return the kosten
	 */
	public Double getKosten() {
		return kosten;
	}
	/**
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}
	/**
	 * @param datum the datum to set
	 */
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	/**
	 * @param dienst the dienst to set
	 */
	public void setDienst(String dienst) {
		this.dienst = dienst;
	}
	/**
	 * @param kategorie the kategorie to set
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	/**
	 * @param zielnummer the zielnummer to set
	 */
	public void setZielnummer(String zielnummer) {
		this.zielnummer = zielnummer;
	}
	/**
	 * @param tarif the tarif to set
	 */
	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	/**
	 * @param menge the menge to set
	 */
	public void setMenge(String menge) {
		this.menge = menge;
	}
	/**
	 * @param dauer the dauer to set
	 */
	public void setDauer(Date dauer) {
		this.dauer = dauer;
	}
	/**
	 * @param einheit the einheit to set
	 */
	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}
	/**
	 * @param kosten the kosten to set
	 */
	public void setKosten(Double kosten) {
		this.kosten = kosten;
	}
	/**
	 * @param typ the typ to set
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
}
