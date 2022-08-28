package bja.pnud.service.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "fsalida")
public class Fsalida {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

   private String nrof;
   private String codigom;
   private String nombrem;
   private String fecha;
   private String hora;
   private String tipoarea;
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
   private String tipocamino;
   private String tipotransporte;
   private String desctransporte;
   private String tipopago;
   private String desctipopago;
   private String descpago;
   private String gastoa;
   private String gastob;
   private String gastoc;
   private String gastod;
   private int costoa;
   private int costob;
   private int costoc;
   private int costod;

   public Fsalida () {
		
}

public Fsalida(String nrof, String codigom, String nombrem, String fecha, String hora, String tipoarea,
        int cdepartamento, String departamento, int cprovincia, String provincia, int credsalud, String redsalud,
        int cmunicipio, String municipio, int ccentrosalud, String centrosalud, String comunidad, String localidad,
        String tipocamino, String tipotransporte, String desctransporte, String tipopago, String desctipopago,
        String descpago, String gastoa, String gastob, String gastoc, String gastod, int costoa, int costob, int costoc,
        int costod) {
    this.nrof = nrof;
    this.codigom = codigom;
    this.nombrem = nombrem;
    this.fecha = fecha;
    this.hora = hora;
    this.tipoarea = tipoarea;
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
    this.tipocamino = tipocamino;
    this.tipotransporte = tipotransporte;
    this.desctransporte = desctransporte;
    this.tipopago = tipopago;
    this.desctipopago = desctipopago;
    this.descpago = descpago;
    this.gastoa = gastoa;
    this.gastob = gastob;
    this.gastoc = gastoc;
    this.gastod = gastod;
    this.costoa = costoa;
    this.costob = costob;
    this.costoc = costoc;
    this.costod = costod;
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
public String getCodigom() {
    return codigom;
}
public void setCodigom(String codigom) {
    this.codigom = codigom;
}
public String getNombrem() {
    return nombrem;
}
public void setNombrem(String nombrem) {
    this.nombrem = nombrem;
}
public String getFecha() {
    return fecha;
}
public void setFecha(String fecha) {
    this.fecha = fecha;
}
public String getHora() {
    return hora;
}
public void setHora(String hora) {
    this.hora = hora;
}
public String getTipoarea() {
    return tipoarea;
}
public void setTipoarea(String tipoarea) {
    this.tipoarea = tipoarea;
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
public String getTipocamino() {
    return tipocamino;
}
public void setTipocamino(String tipocamino) {
    this.tipocamino = tipocamino;
}
public String getTipotransporte() {
    return tipotransporte;
}
public void setTipotransporte(String tipotransporte) {
    this.tipotransporte = tipotransporte;
}
public String getDesctransporte() {
    return desctransporte;
}
public void setDesctransporte(String desctransporte) {
    this.desctransporte = desctransporte;
}
public String getTipopago() {
    return tipopago;
}
public void setTipopago(String tipopago) {
    this.tipopago = tipopago;
}
public String getDesctipopago() {
    return desctipopago;
}
public void setDesctipopago(String desctipopago) {
    this.desctipopago = desctipopago;
}
public String getDescpago() {
    return descpago;
}
public void setDescpago(String descpago) {
    this.descpago = descpago;
}
public String getGastoa() {
    return gastoa;
}
public void setGastoa(String gastoa) {
    this.gastoa = gastoa;
}
public String getGastob() {
    return gastob;
}
public void setGastob(String gastob) {
    this.gastob = gastob;
}
public String getGastoc() {
    return gastoc;
}
public void setGastoc(String gastoc) {
    this.gastoc = gastoc;
}
public String getGastod() {
    return gastod;
}
public void setGastod(String gastod) {
    this.gastod = gastod;
}
public int getCostoa() {
    return costoa;
}
public void setCostoa(int costoa) {
    this.costoa = costoa;
}
public int getCostob() {
    return costob;
}
public void setCostob(int costob) {
    this.costob = costob;
}
public int getCostoc() {
    return costoc;
}
public void setCostoc(int costoc) {
    this.costoc = costoc;
}
public int getCostod() {
    return costod;
}
public void setCostod(int costod) {
    this.costod = costod;
}
    
}
