package Punto4;

public class Persona {
    
    private int Cedula;
    private String Nombre;
    private String Apellido;
    private int sueldo;
    private int dia;
    private int mes;
    private int anio;

    public Persona() {
    }

    Persona(int Cedula, String nombre, String Apellido, int anio, int mes, int dia, int sueldo){
        this.Cedula = Cedula;
        this.Nombre = nombre;
        this.Apellido = Apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.sueldo = sueldo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
