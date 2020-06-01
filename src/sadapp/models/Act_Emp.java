package sadapp.models;

import com.google.gson.annotations.Expose;

/**
 *
 * @author tans_
 */
public class Act_Emp {
    @Expose
    private int id;
    @Expose
    private boolean realizado;
    @Expose
    private int nivelEstres;
    @Expose
    private int idActividades;
    @Expose
    private int idEmpleado;

    public Act_Emp() {
    }

    public Act_Emp(int id, boolean realizado, int nivelEstres, int idActividades, int idEmpleado) {
        this.id = id;
        this.realizado = realizado;
        this.nivelEstres = nivelEstres;
        this.idActividades = idActividades;
        this.idEmpleado = idEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getNivelEstres() {
        return nivelEstres;
    }

    public void setNivelEstres(int nivelEstres) {
        this.nivelEstres = nivelEstres;
    }

    public int getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(int idActividades) {
        this.idActividades = idActividades;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
