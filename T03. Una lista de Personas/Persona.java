//Clase persona
public class Persona {
    
    //Atributos clase persona
    String Nombre, Correo;
    int Cedula;
    
    //Constructor clase persona
    public Persona(String nombre, String correo, int cedula) {
        this.Nombre = nombre;
        this.Correo = correo;
        this.Cedula = cedula;
    }

    //Metodo para retornar el nombre de la persona
    public String getNombre() {
        return Nombre;
    }

    //Metodo para agregar el nombre de la persona
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    //Metodo para retornar el correo de la persona
    public String getCorreo() {
        return Correo;
    }

    //Metodo para agregar un correo de la persona
    public void setCorreo(String correo) {
        Correo = correo;
    }

    //Metodo para retornar el valor de la cedula
    public int getCedula() {
        return Cedula;
    }

    //Metodo para agregar una cedula 
    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    @Override
    //Metodo para imprimir informacion de la persona
    public String toString() {
        return "Persona \n[Nombre=" + Nombre 
        + ",\n Correo=" + Correo 
        + ", Cedula=" + Cedula + "]";
    }

}
