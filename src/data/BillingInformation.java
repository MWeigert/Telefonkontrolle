/**
 * 
 */
package data;

import java.util.Date;

/**
 * @author Mathias Weigert
 * @version 0.5
 */
public class BillingInformation {

	private String kundenNr;
	private String rufNr;
	private String sim;
	private String monat;
	private String kategorie;
	private Date datum;
	private String dienst;
	private String anrufer;
	private String zielnummer;
	private String tarif;
	private int menge;
	private Date dauer;
	private String einheit;
	private Double betrag;
	/**
	 * @return the kundenNr
	 */
	public String getKundenNr() {
		return kundenNr;
	}
	/**
	 * @return the rufNr
	 */
	public String getRufNr() {
		return rufNr;
	}
	/**
	 * @return the sim
	 */
	public String getSim() {
		return sim;
	}
	/**
	 * @return the monat
	 */
	public String getMonat() {
		return monat;
	}
	/**
	 * @return the kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}
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
	 * @return the anrufer
	 */
	public String getAnrufer() {
		return anrufer;
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
	public int getMenge() {
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
	 * @return the betrag
	 */
	public Double getBetrag() {
		return betrag;
	}
	/**
	 * @param kundenNr the kundenNr to set
	 */
	public void setKundenNr(String kundenNr) {
		this.kundenNr = kundenNr;
	}
	/**
	 * @param rufNr the rufNr to set
	 */
	public void setRufNr(String rufNr) {
		this.rufNr = rufNr;
	}
	/**
	 * @param sim the sim to set
	 */
	public void setSim(String sim) {
		this.sim = sim;
	}
	/**
	 * @param monat the monat to set
	 */
	public void setMonat(String monat) {
		this.monat = monat;
	}
	/**
	 * @param kategorie the kategorie to set
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
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
	 * @param anrufer the anrufer to set
	 */
	public void setAnrufer(String anrufer) {
		this.anrufer = anrufer;
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
	public void setMenge(int menge) {
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
	 * @param betrag the betrag to set
	 */
	public void setBetrag(Double betrag) {
		this.betrag = betrag;
	}
}
