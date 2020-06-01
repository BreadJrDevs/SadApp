package sadapp.models;

import com.google.gson.annotations.Expose;

/**
 *
 * @author tans_
 */
public class Metas_Empleado {
    @Expose
    private int id;
    @Expose
    private boolean realizado;
    @Expose
    private String fechaLim;
    @Expose
    private int idMetas;
    @Expose
    private int idEmpleado;

    public Metas_Empleado() {
    }

    public Metas_Empleado(int id, boolean realizado, String fechaLim, int idMetas, int idEmpleado) {
        this.id = id;
        this.realizado = realizado;
        this.fechaLim = fechaLim;
        this.idMetas = idMetas;
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

    public String getFechaLim() {
        return fechaLim;
    }

    public void setFechaLim(String fechaLim) {
        this.fechaLim = fechaLim;
    }

    public int getIdMetas() {
        return idMetas;
    }

    public void setIdMetas(int idMetas) {
        this.idMetas = idMetas;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}