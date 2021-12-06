/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcoq2
 */
public class Permisos {
    private boolean gestionDeNuevosUsuarios,create,select,insert,delete,drop;

    public Permisos(boolean gestionDeNuevosUsuarios, boolean create, boolean select, boolean insert, boolean delete, boolean drop) {
        this.gestionDeNuevosUsuarios = gestionDeNuevosUsuarios;
        this.create = create;
        this.select = select;
        this.insert = insert;
        this.delete = delete;
        this.drop = drop;
    }

    public boolean isGestionDeNuevosUsuarios() {
        return gestionDeNuevosUsuarios;
    }

    public void setGestionDeNuevosUsuarios(boolean gestionDeNuevosUsuarios) {
        this.gestionDeNuevosUsuarios = gestionDeNuevosUsuarios;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public boolean isInsert() {
        return insert;
    }

    public void setInsert(boolean insert) {
        this.insert = insert;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isDrop() {
        return drop;
    }

    public void setDrop(boolean drop) {
        this.drop = drop;
    }

    @Override
    public String toString() {
        return "Permisos{" + "gestionDeNuevosUsuarios=" + gestionDeNuevosUsuarios 
                + ", create=" + create 
                + ", select=" + select 
                + ", insert=" + insert 
                + ", delete=" + delete 
                + ", drop=" + drop + '}';
    }
    
}
