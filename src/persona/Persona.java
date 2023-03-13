
package persona;


public class Persona {
   private int edad;
   private String nombre;
   private int telefono;
    
    public static void main(String[] args) {
       Persona persona1 = new Persona();
       Persona persona2 = new Persona();
       persona1.setEdad(18);
       persona1.setNombre("Fernando");
       persona1.setTelefono(5655798);
       persona2.setEdad(20);
       persona2.setNombre("Alejandra");
       persona2.setTelefono(3004587);
       //System.out.println(persona1.getEdad());
       //System.out.println(persona1.getNombre());
       //System.out.println(persona1.getTelefono());
       System.out.println("Su edad es : "+persona1.getEdad()+" "+"Su nombre es: "+persona1.getNombre()+" "+"Su telefono: "+persona1.getTelefono());
       System.out.println("Su edad es : "+persona2.getEdad()+" "+"Su nombre es: "+persona2.getNombre()+" "+"Su telefono: "+persona2.getTelefono());    
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
