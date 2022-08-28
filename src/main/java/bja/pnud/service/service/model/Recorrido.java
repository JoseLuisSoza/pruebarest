package bja.pnud.service.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recorrido")
public class Recorrido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String tipoevento;
    private String descevento;
    private String nrorecorrido;
    private String distancia;

    public Recorrido() {

    }

    public Recorrido(String nrof, String tipoevento, String descevento, String nrorecorrido, String distancia) {
        this.nrof = nrof;
        this.tipoevento = tipoevento;
        this.descevento = descevento;
        this.nrorecorrido = nrorecorrido;
        this.distancia = distancia;
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

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public String getDescevento() {
        return descevento;
    }

    public void setDescevento(String descevento) {
        this.descevento = descevento;
    }

    public String getNrorecorrido() {
        return nrorecorrido;
    }

    public void setNrorecorrido(String nrorecorrido) {
        this.nrorecorrido = nrorecorrido;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

}
