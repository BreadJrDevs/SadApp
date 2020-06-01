package sadapp.models;

import com.google.gson.annotations.Expose;

/**
 *
 * @author tans_
 */
public class Psicologo {
    @Expose
    private int id;
    @Expose
    private String nombre;
    @Expose
    private String paterno;
    @Expose
    private String materno;
    @Expose
    private String tel;
    @Expose
    private String email;
    @Expose
    private int edad;
    @Expose
    private String pass;
    @Expose
    private boolean sexo;

    public Psicologo() {
    }

    public Psicologo(int id, String nombre, String paterno, String materno, String tel, String email, int edad, String pass, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.tel = tel;
        this.email = email;
        this.edad = edad;
        this.pass = pass;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}