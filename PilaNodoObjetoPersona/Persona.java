public class Persona {

    // Atributos
    private int cedula;
    private String nombre, correo;

    public Persona(int nCedula, String nNombre, String nCorreo) {
        this.cedula = nCedula;
        this.nombre = nNombre;
        this.correo = nCorreo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona " +
                "\n[cedula=" + cedula +
                ",\nnombre=" + nombre +
                ",\ncorreo=" + correo + "]";
    }

}
