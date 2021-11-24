package Modelo;
// Generated 12-nov-2021 20:12:47 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * FormaPago generated by hbm2java
 */
public class FormaPago  implements java.io.Serializable {


     private String codigo;
     private String descripcion;
     private short NRecibo;
     private BigDecimal interes;
     private Set prestamos = new HashSet(0);

    public FormaPago() {
    }

	
    public FormaPago(String codigo, String descripcion, short NRecibo, BigDecimal interes) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.NRecibo = NRecibo;
        this.interes = interes;
    }
    public FormaPago(String codigo, String descripcion, short NRecibo, BigDecimal interes, Set prestamos) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.NRecibo = NRecibo;
       this.interes = interes;
       this.prestamos = prestamos;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public short getNRecibo() {
        return this.NRecibo;
    }
    
    public void setNRecibo(short NRecibo) {
        this.NRecibo = NRecibo;
    }
    public BigDecimal getInteres() {
        return this.interes;
    }
    
    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }
    public Set getPrestamos() {
        return this.prestamos;
    }
    
    public void setPrestamos(Set prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return this.codigo + " - " + this.descripcion;
    }
}


