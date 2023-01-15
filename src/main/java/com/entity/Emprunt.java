package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Emprunt implements Serializable {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int numemprunt;
private int id_adherent;
private int numexemplaire;


private Date dateemprunt;
private Date dateretourprevu;
private Date dateretourreel;
public int getNumemprunt() {
	return numemprunt;
}
public void setNumemprunt(int numemprunt) {
	this.numemprunt = numemprunt;
}
public int getId_adherent() {
	return id_adherent;
}
public void setId_adherent(int id_adherent) {
	this.id_adherent = id_adherent;
}
public int getNumexemplaire() {
	return numexemplaire;
}
public void setNumexemplaire(int numexemplaire) {
	this.numexemplaire = numexemplaire;
}
public Date getDateemprunt() {
	return dateemprunt;
}
public void setDateemprunt(Date dateemprunt) {
	this.dateemprunt = dateemprunt;
}
public Date getDateretourprevu() {
	return dateretourprevu;
}
public void setDateretourprevu(Date dateretourprevu) {
	this.dateretourprevu = dateretourprevu;
}
public Date getDateretourreel() {
	return dateretourreel;
}
public void setDateretourreel(Date dateretourreel) {
	this.dateretourreel = dateretourreel;
}
public Emprunt () 
{
}
public Emprunt(int numemprunt, int id_adherent, int numexemplaire, Date dateemprunt, Date dateretourprevu,
		Date dateretourreel) {
	super();
	this.numemprunt = numemprunt;
	this.id_adherent = id_adherent;
	this.numexemplaire = numexemplaire;
	this.dateemprunt = dateemprunt;
	this.dateretourprevu = dateretourprevu;
	this.dateretourreel = dateretourreel;
}
@Override
public String toString() {
	return "Emprunt [numemprunt=" + numemprunt + ", id_adherent=" + id_adherent + ", numexemplaire=" + numexemplaire
			+ ", dateemprunt=" + dateemprunt + ", dateretourprevu=" + dateretourprevu + ", dateretourreel="
			+ dateretourreel + "]";
}


}
