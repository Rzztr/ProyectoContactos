
public class Contacto {
    String nombre;
    String telefono;
    String empresaAsociacion;

    public Contacto(String nombre, String telefono, String empresaAsociacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresaAsociacion = empresaAsociacion;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\ntelefono: " + telefono + "\nempresa ó asociacion: " + empresaAsociacion;
    }
    
    
}
