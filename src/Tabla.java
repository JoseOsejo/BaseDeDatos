
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcoq2
 */
public class Tabla {
    private String nombreTabla;
    private String nombreCreador;
    private Date fechaTabla;
    private String[] atributos;

    public Tabla(String nombreTabla)
    {
    this.nombreTabla = nombreTabla;
    }
    public Tabla(String nombreTabla, String nombreCreador, Date fechaTabla, String[] atributos) {
        this.nombreTabla = nombreTabla;
        this.nombreCreador = nombreCreador;
        this.fechaTabla = fechaTabla;
        this.atributos = atributos;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }

    public Date getFechaTabla() {
        return fechaTabla;
    }

    public void setFechaTabla(Date fechaTabla) {
        this.fechaTabla = fechaTabla;
    }

    public String[] getAtributos() {
        return atributos;
    }

    public void setAtributos(String[] atributos) {
        this.atributos = atributos;
    }
}
