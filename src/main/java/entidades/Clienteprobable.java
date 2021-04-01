/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Richard
 */
@Entity
@Table(name = "clienteprobable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clienteprobable.findAll", query = "SELECT c FROM Clienteprobable c")
    , @NamedQuery(name = "Clienteprobable.findByCpId", query = "SELECT c FROM Clienteprobable c WHERE c.cpId = :cpId")
    , @NamedQuery(name = "Clienteprobable.findByCpCedula", query = "SELECT c FROM Clienteprobable c WHERE c.cpCedula = :cpCedula")
    , @NamedQuery(name = "Clienteprobable.findByCpNombre", query = "SELECT c FROM Clienteprobable c WHERE c.cpNombre = :cpNombre")
    , @NamedQuery(name = "Clienteprobable.findByCpApellido", query = "SELECT c FROM Clienteprobable c WHERE c.cpApellido = :cpApellido")
    , @NamedQuery(name = "Clienteprobable.findByCpDireccion", query = "SELECT c FROM Clienteprobable c WHERE c.cpDireccion = :cpDireccion")
    , @NamedQuery(name = "Clienteprobable.findByCpCelular", query = "SELECT c FROM Clienteprobable c WHERE c.cpCelular = :cpCelular")})
public class Clienteprobable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cp_id")
    private Integer cpId;
    @Size(max = 10)
    @Column(name = "cp_cedula")
    private String cpCedula;
    @Size(max = 25)
    @Column(name = "cp_nombre")
    private String cpNombre;
    @Size(max = 25)
    @Column(name = "cp_apellido")
    private String cpApellido;
    @Size(max = 100)
    @Column(name = "cp_direccion")
    private String cpDireccion;
    @Size(max = 10)
    @Column(name = "cp_celular")
    private String cpCelular;
    @OneToMany(mappedBy = "cpId")
    private Collection<Visita> visitaCollection;
    @OneToMany(mappedBy = "cpId")
    private Collection<Cotizacion> cotizacionCollection;

    public Clienteprobable() {
    }

    public Clienteprobable(Integer cpId) {
        this.cpId = cpId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCpCedula() {
        return cpCedula;
    }

    public void setCpCedula(String cpCedula) {
        this.cpCedula = cpCedula;
    }

    public String getCpNombre() {
        return cpNombre;
    }

    public void setCpNombre(String cpNombre) {
        this.cpNombre = cpNombre;
    }

    public String getCpApellido() {
        return cpApellido;
    }

    public void setCpApellido(String cpApellido) {
        this.cpApellido = cpApellido;
    }

    public String getCpDireccion() {
        return cpDireccion;
    }

    public void setCpDireccion(String cpDireccion) {
        this.cpDireccion = cpDireccion;
    }

    public String getCpCelular() {
        return cpCelular;
    }

    public void setCpCelular(String cpCelular) {
        this.cpCelular = cpCelular;
    }

    @XmlTransient
    public Collection<Visita> getVisitaCollection() {
        return visitaCollection;
    }

    public void setVisitaCollection(Collection<Visita> visitaCollection) {
        this.visitaCollection = visitaCollection;
    }

    @XmlTransient
    public Collection<Cotizacion> getCotizacionCollection() {
        return cotizacionCollection;
    }

    public void setCotizacionCollection(Collection<Cotizacion> cotizacionCollection) {
        this.cotizacionCollection = cotizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpId != null ? cpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clienteprobable)) {
            return false;
        }
        Clienteprobable other = (Clienteprobable) object;
        if ((this.cpId == null && other.cpId != null) || (this.cpId != null && !this.cpId.equals(other.cpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Clienteprobable[ cpId=" + cpId + " ]";
    }
    
}
