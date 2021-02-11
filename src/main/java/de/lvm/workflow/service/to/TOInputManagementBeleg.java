package de.lvm.workflow.service.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * TO für die Übernahme von Belegen aus dem Inputmanagement/vom Host
 */
public class TOInputManagementBeleg implements Serializable {
	private static final long serialVersionUID = 5145742641008809593L;

	private String id;
	private LocalDate behandlungsDatumBis;
	private LocalDate behandlungsDatumVon;
	private Integer behandlungAnzahlTage;
	private LocalDate belegDatum;
	private BigDecimal belegRechnungsBetrag;
	private int belegRegulierungsStatusSchluessel;
	private LocalDate belegEingangsDatum;
	private Integer personNummer;
	protected Integer dokumentTypSchluessel;
	private Long vsnr;
	private LocalDateTime veraenderungsZeitpunkt;
	private LocalDateTime erstellungsZeitpunkt;
	private String erstellungsCcid;
	private String veraenderungsCcid;
	private long briefBarcode;
	private int belegNummer;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getBehandlungsDatumBis() {
		return behandlungsDatumBis;
	}

	public void setBehandlungsDatumBis(LocalDate behandlungsDatumBis) {
		this.behandlungsDatumBis = behandlungsDatumBis;
	}

	public LocalDate getBehandlungsDatumVon() {
		return behandlungsDatumVon;
	}

	public void setBehandlungsDatumVon(LocalDate behandlungsDatumVon) {
		this.behandlungsDatumVon = behandlungsDatumVon;
	}

	public Integer getBehandlungAnzahlTage() {
		return behandlungAnzahlTage;
	}

	public void setBehandlungAnzahlTage(Integer behandlungAnzahlTage) {
		this.behandlungAnzahlTage = behandlungAnzahlTage;
	}

	public LocalDate getBelegDatum() {
		return belegDatum;
	}

	public void setBelegDatum(LocalDate belegDatum) {
		this.belegDatum = belegDatum;
	}

	public BigDecimal getBelegRechnungsBetrag() {
		return belegRechnungsBetrag;
	}

	public void setBelegRechnungsBetrag(BigDecimal belegRechnungsBetrag) {
		this.belegRechnungsBetrag = belegRechnungsBetrag;
	}

	public int getBelegRegulierungsStatusSchluessel() {
		return belegRegulierungsStatusSchluessel;
	}

	public void setBelegRegulierungsStatusSchluessel(int belegRegulierungsStatusSchluessel) {
		this.belegRegulierungsStatusSchluessel = belegRegulierungsStatusSchluessel;
	}

	public LocalDate getBelegEingangsDatum() {
		return belegEingangsDatum;
	}

	public void setBelegEingangsDatum(LocalDate belegEingangsDatum) {
		this.belegEingangsDatum = belegEingangsDatum;
	}

	public Integer getPersonNummer() {
		return personNummer;
	}

	public void setPersonNummer(Integer personNummer) {
		this.personNummer = personNummer;
	}

	public Integer getDokumentTypSchluessel() {
		return dokumentTypSchluessel;
	}

	public void setDokumentTypSchluessel(Integer dokumentTypSchluessel) {
		this.dokumentTypSchluessel = dokumentTypSchluessel;
	}

	public Long getVsnr() {
		return vsnr;
	}

	public void setVsnr(Long vsnr) {
		this.vsnr = vsnr;
	}

	public LocalDateTime getVeraenderungsZeitpunkt() {
		return veraenderungsZeitpunkt;
	}

	public void setVeraenderungsZeitpunkt(LocalDateTime veraenderungsZeitpunkt) {
		this.veraenderungsZeitpunkt = veraenderungsZeitpunkt;
	}

	public LocalDateTime getErstellungsZeitpunkt() {
		return erstellungsZeitpunkt;
	}

	public void setErstellungsZeitpunkt(LocalDateTime erstellungsZeitpunkt) {
		this.erstellungsZeitpunkt = erstellungsZeitpunkt;
	}

	public String getErstellungsCcid() {
		return erstellungsCcid;
	}

	public void setErstellungsCcid(String erstellungsCcid) {
		this.erstellungsCcid = erstellungsCcid;
	}

	public String getVeraenderungsCcid() {
		return veraenderungsCcid;
	}

	public void setVeraenderungsCcid(String veraenderungsCcid) {
		this.veraenderungsCcid = veraenderungsCcid;
	}

	public long getBriefBarcode() {
		return briefBarcode;
	}

	public void setBriefBarcode(long briefBarcode) {
		this.briefBarcode = briefBarcode;
	}

	public int getBelegNummer() {
		return belegNummer;
	}

	public void setBelegNummer(int belegNummer) {
		this.belegNummer = belegNummer;
	}

	@Override
	public String toString() {
		return "TOInputManagementBeleg{" +
				"id='" + id + '\'' +
				", behandlungsDatumBis=" + behandlungsDatumBis +
				", behandlungsDatumVon=" + behandlungsDatumVon +
				", behandlungAnzahlTage=" + behandlungAnzahlTage +
				", belegDatum=" + belegDatum +
				", belegRechnungsBetrag=" + belegRechnungsBetrag +
				", belegRegulierungsStatusSchluessel=" + belegRegulierungsStatusSchluessel +
				", belegEingangsDatum='" + belegEingangsDatum + '\'' +
				", personNummer=" + personNummer +
				", dokumentTypSchluessel=" + dokumentTypSchluessel +
				", vsnr=" + vsnr +
				", veraenderungsZeitpunkt='" + veraenderungsZeitpunkt + '\'' +
				", erstellungsZeitpunkt='" + erstellungsZeitpunkt + '\'' +
				", erstellungsCcid='" + erstellungsCcid + '\'' +
				", veraenderungsCcid='" + veraenderungsCcid + '\'' +
				", briefBarcode=" + briefBarcode +
				", belegNummer=" + belegNummer +
				'}';
	}
}

