//Clase persona
public class Persona {
    //Atributos de la clase Persona
    String nombre;
    int edad;

    //Constructor
    public Persona(int Nedad, String Nnombre){
        this.edad = Nedad;
        this.nombre = Nnombre;
    }

    //Metodos Set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para imprimir los datos
    @Override
    public String toString() {
        return "Persona "+
        "[nombre=" + nombre + 
        ", edad=" + edad + "]";
    }

}

