
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcoq2
 */
public class Usuario 
{
private String usuario;
private String password;
private ArrayList<Permisos>permisos = new ArrayList();

    public Usuario(String usuario, String password, ArrayList<Permisos> permisos) {
        this.usuario = usuario;
        this.password = password;
        this.permisos = permisos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Permisos> getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList<Permisos> permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario 
                + ", password=" + password 
                + ", permisos=" + permisos + '}';
    }


}

    