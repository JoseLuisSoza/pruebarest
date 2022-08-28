package bja.pnud.service.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String actividades;
    private int mujeresbja;
    private int ninosbja;
    private int ninasbja;
    private int mujeressuppv;

    public Actividades() {

    }

    public Actividades(String nrof, String actividades, int mujeresbja, int ninosbja, int ninasbja, int mujeressuppv) {
        this.nrof = nrof;
        this.actividades = actividades;
        this.mujeresbja = mujeresbja;
        this.ninosbja = ninosbja;
        this.ninasbja = ninasbja;
        this.mujeressuppv = mujeressuppv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrof() {
        return nrof;
    }

    public void setNrof(String nrof) {
        this.nrof = nrof;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public int getMujeresbja() {
        return mujeresbja;
    }

    public void setMujeresbja(int mujeresbja) {
        this.mujeresbja = mujeresbja;
    }

    public int getNinosbja() {
        return ninosbja;
    }

    public void setNinosbja(int ninosbja) {
        this.ninosbja = ninosbja;
    }

    public int getNinasbja() {
        return ninasbja;
    }

    public void setNinasbja(int ninasbja) {
        this.ninasbja = ninasbja;
    }

    public int getMujeressuppv() {
        return mujeressuppv;
    }

    public void setMujeressuppv(int mujeressuppv) {
        this.mujeressuppv = mujeressuppv;
    }

}
