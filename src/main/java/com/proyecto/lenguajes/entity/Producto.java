package com.proyecto.lenguajes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author cquir
 */

@Entity
@Data
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCTO_ID")
    private int PRODUCTO_ID;

    @Column(name="NOMBRE_PRODUCTO")
    private String NOMBRE_PRODUCTO;
    
    @Column(name="PRECIO")
    private int PRECIO;
    
    @Column(name="CANTIDAD")
    private int CANTIDAD;
    
    @Column(name="CATEGORIA_ID")
    private int CATEGORIA_ID;

    public Producto() {
    }

    public Producto(int PRODUCTO_ID, String NOMBRE_PRODUCTO, int PRECIO, int CANTIDAD, int CATEGORIA_ID) {
        this.PRODUCTO_ID = PRODUCTO_ID;
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
        this.PRECIO = PRECIO;
        this.CANTIDAD = CANTIDAD;
        this.CATEGORIA_ID = CATEGORIA_ID;
    }

    public int getPRODUCTO_ID() {
        return PRODUCTO_ID;
    }

    public void setPRODUCTO_ID(int PRODUCTO_ID) {
        this.PRODUCTO_ID = PRODUCTO_ID;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public int getCATEGORIA_ID() {
        return CATEGORIA_ID;
    }

    public void setCATEGORIA_ID(int CATEGORIA_ID) {
        this.CATEGORIA_ID = CATEGORIA_ID;
    }

    @Override
    public String toString() {
        return "Producto{" + "PRODUCTO_ID=" + PRODUCTO_ID + ", NOMBRE_PRODUCTO=" + NOMBRE_PRODUCTO + ", PRECIO=" + PRECIO + ", CANTIDAD=" + CANTIDAD + ", CATEGORIA_ID=" + CATEGORIA_ID + '}';
    }


    
    

}
