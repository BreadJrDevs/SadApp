package sadapp.models;

import com.google.gson.annotations.Expose;

/**
 *
 * @author tans_
 */
public class Metas {
    @Expose
    private int id;
    @Expose
    private String descripcion;

    public Metas() {
    }

    public Metas(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
