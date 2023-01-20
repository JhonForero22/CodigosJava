public class Persona {
    private int edad;
    private String Nombre;

    public Persona(int edadI, String nombreI) {
        this.edad = edadI;
        this.Nombre = nombreI;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", Nombre=" + Nombre + "]";
    }
}
