package bja.pnud.service.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fllegada")
public class Fllegada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private int cdepartamento;
    private String departamento;
    private int cprovincia;
    private String provincia;
    private int credsalud;
    private String redsalud;
    private int cmunicipio;
    private String municipio;
    private int ccentrosalud;
    private String centrosalud;
    private String comunidad;
    private String localidad;

    public Fllegada() {

    }

    public Fllegada(String nrof, int cdepartamento, String departamento, int cprovincia, String provincia,
            int credsalud, String redsalud, int cmunicipio, String municipio, int ccentrosalud, String centrosalud,
            String comunidad, String localidad) {
        this.nrof = nrof;
        this.cdepartamento = cdepartamento;
        this.departamento = departamento;
        this.cprovincia = cprovincia;
        this.provincia = provincia;
        this.credsalud = credsalud;
        this.redsalud = redsalud;
        this.cmunicipio = cmunicipio;
        this.municipio = municipio;
        this.ccentrosalud = ccentrosalud;
        this.centrosalud = centrosalud;
        this.comunidad = comunidad;
        this.localidad = localidad;
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

    public int getCdepartamento() {
        return cdepartamento;
    }

    public void setCdepartamento(int cdepartamento) {
        this.cdepartamento = cdepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCprovincia() {
        return cprovincia;
    }

    public void setCprovincia(int cprovincia) {
        this.cprovincia = cprovincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCredsalud() {
        return credsalud;
    }

    public void setCredsalud(int credsalud) {
        this.credsalud = credsalud;
    }

    public String getRedsalud() {
        return redsalud;
    }

    public void setRedsalud(String redsalud) {
        this.redsalud = redsalud;
    }

    public int getCmunicipio() {
        return cmunicipio;
    }

    public void setCmunicipio(int cmunicipio) {
        this.cmunicipio = cmunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCcentrosalud() {
        return ccentrosalud;
    }

    public void setCcentrosalud(int ccentrosalud) {
        this.ccentrosalud = ccentrosalud;
    }

    public String getCentrosalud() {
        return centrosalud;
    }

    public void setCentrosalud(String centrosalud) {
        this.centrosalud = centrosalud;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
