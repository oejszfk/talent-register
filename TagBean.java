/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.jszfk;

import java.util.Date;
import java.util.List;


/**
 *
 * @author szakkolegium
 */
public class TagBean {
    
    private int regisztraciosSzam;
    private String nev;
    private String jelszo;
    private String email;
    private String telefonszam;
    private String neptunKod;
    private String iskola;
    private String kar;
    private String szak;
    private int egyetemiBeiratkozasEve;
    private int talentumElfogadott;
    private int talentumFuggo;
    private String statusz;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public String getIskola() {
        return iskola;
    }

    public void setIskola(String iskola) {
        this.iskola = iskola;
    }

    public String getKar() {
        return kar;
    }

    public void setKar(String kar) {
        this.kar = kar;
    }

    public String getSzak() {
        return szak;
    }

    public void setSzak(String szak) {
        this.szak = szak;
    }

    public int getEgyetemiBeiratkozasEve() {
        return egyetemiBeiratkozasEve;
    }

    public void setEgyetemiBeiratkozasEve(int egyetemiBeiratkozasEve) {
        this.egyetemiBeiratkozasEve = egyetemiBeiratkozasEve;
    }

    public int getTalentumElfogadott() {
        return talentumElfogadott;
    }

    public void setTalentumElfogadott(int talentumElfogadott) {
        this.talentumElfogadott = talentumElfogadott;
    }

    public int getTalentumFuggo() {
        return talentumFuggo;
    }

    public void setTalentumFuggo(int talentumFuggo) {
        this.talentumFuggo = talentumFuggo;
    }

    public String getStatusz() {
        return statusz;
    }

    public void setStatusz(String statusz) {
        this.statusz = statusz;
    }

    public Date getBelepesiIdo() {
        return belepesiIdo;
    }

    public void setBelepesiIdo(Date belepesiIdo) {
        this.belepesiIdo = belepesiIdo;
    }

    public Date getTagjeloltsegKezdeteIdo() {
        return tagjeloltsegKezdeteIdo;
    }

    public void setTagjeloltsegKezdeteIdo(Date tagjeloltsegKezdeteIdo) {
        this.tagjeloltsegKezdeteIdo = tagjeloltsegKezdeteIdo;
    }

    public List<IdoszakosListaElem> getPozicio() {
        return pozicio;
    }

    public void setPozicio(List<IdoszakosListaElem> pozicio) {
        this.pozicio = pozicio;
    }

    public List<IdoszakosListaElem> getMentorRegszama() {
        return mentorRegszama;
    }

    public void setMentorRegszama(List<IdoszakosListaElem> mentorRegszama) {
        this.mentorRegszama = mentorRegszama;
    }

    public List<IdoszakosListaElem> getKurzusLista() {
        return kurzusLista;
    }

    public void setKurzusLista(List<IdoszakosListaElem> kurzusLista) {
        this.kurzusLista = kurzusLista;
    }

    public List<IdoszakosListaElem> getMeetingJelenlet() {
        return meetingJelenlet;
    }

    public void setMeetingJelenlet(List<IdoszakosListaElem> meetingJelenlet) {
        this.meetingJelenlet = meetingJelenlet;
    }

    public List<IdoszakosListaElem> getÖDI() {
        return ÖDI;
    }

    public void setÖDI(List<IdoszakosListaElem> ÖDI) {
        this.ÖDI = ÖDI;
    }

    public List<IdoszakosListaElem> getBizottsagiTagsagokLista() {
        return bizottsagiTagsagokLista;
    }

    public void setBizottsagiTagsagokLista(List<IdoszakosListaElem> bizottsagiTagsagokLista) {
        this.bizottsagiTagsagokLista = bizottsagiTagsagokLista;
    }

    public List<IdoszakosListaElem> getEredmenyekLista() {
        return eredmenyekLista;
    }

    public void setEredmenyekLista(List<IdoszakosListaElem> eredmenyekLista) {
        this.eredmenyekLista = eredmenyekLista;
    }

    public List<IdoszakosListaElem> getRaeresiTablazat() {
        return raeresiTablazat;
    }

    public void setRaeresiTablazat(List<IdoszakosListaElem> raeresiTablazat) {
        this.raeresiTablazat = raeresiTablazat;
    }

    public List<IdoszakosListaElem> getKutatocsoportok() {
        return kutatocsoportok;
    }

    public void setKutatocsoportok(List<IdoszakosListaElem> kutatocsoportok) {
        this.kutatocsoportok = kutatocsoportok;
    }

    public List<IdoszakosListaElem> getTisztsegekLista() {
        return tisztsegekLista;
    }

    public void setTisztsegekLista(List<IdoszakosListaElem> tisztsegekLista) {
        this.tisztsegekLista = tisztsegekLista;
    }

    public List<IdoszakosListaElem> getMunkakLista() {
        return munkakLista;
    }

    public void setMunkakLista(List<IdoszakosListaElem> munkakLista) {
        this.munkakLista = munkakLista;
    }
    private Date belepesiIdo;
    private Date tagjeloltsegKezdeteIdo;
    //private List<TDK> tdkLista; -- TDK objektum még nincs kész
    
    //---------------- Időszakos adatok ------------------------------
    private List<IdoszakosListaElem> pozicio;  //ebbe az időszakos listaelembe bele lehet rakni bármilyen objektumot, plusz van egy kezdő-és vég dátuma
    private List<IdoszakosListaElem> mentorRegszama;
    private List<IdoszakosListaElem> kurzusLista; //ahol Lista az utótag, ott egy időszakon belül is listát kell tárolni
    private List<IdoszakosListaElem> meetingJelenlet;
    private List<IdoszakosListaElem> ÖDI;
    private List<IdoszakosListaElem> bizottsagiTagsagokLista;
    private List<IdoszakosListaElem> eredmenyekLista;
    private List<IdoszakosListaElem> raeresiTablazat;
    private List<IdoszakosListaElem> kutatocsoportok;
    private List<IdoszakosListaElem> tisztsegekLista;
    private List<IdoszakosListaElem> munkakLista;
    

    public TagBean(int regisztraciosSzam, String nev, Date belepesiIdo, String telefonszam) {
        this.regisztraciosSzam = regisztraciosSzam;
        this.nev = nev;
        this.belepesiIdo = belepesiIdo;
        this.telefonszam = telefonszam;
    }
    
    public TagBean(int regisztraciosSzam, String nev, Date belepesiIdo) {
        this.regisztraciosSzam = regisztraciosSzam;
        this.nev = nev;
        this.belepesiIdo = belepesiIdo;  
    }

    public int getRegisztraciosSzam() {
        return regisztraciosSzam;
    }
    
    
}
