public class Persona {

    // Creamos las variables que va a tener el objeto
    private String Nombre, Apellido;
    private int Cedula, Sueldo;
    // Fecha de nacimiento
    private int Dia, Mes, Año;

    // Creamos el contructor del objetos
    public Persona(String nombre, String apellido, int cedula, int sueldo, int dia, int mes, int año) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Cedula = cedula;
        this.Sueldo = sueldo;
        this.Dia = dia;
        this.Mes = mes;
        this.Año = año;
    }

    // Creamos los Metodos Settern y Getterns que va a necesitar el objeto
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    // Metodo toString para imprimir los datos del Objeto
    public String toString() {
        return "Persona \n[Nombre=" + Nombre +
                ",\nApellido=" + Apellido +
                ",\nCedula=" + Cedula +
                ",\nSueldo=" + Sueldo+
                ", \nFecha de Cumpleaños: "
                + ",\nDia=" + Dia + ", Mes=" + Mes + ", Año=" + Año + "]";
    }

}
