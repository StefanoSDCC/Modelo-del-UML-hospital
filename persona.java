public abstract class Persona {
    protected String nombre;
    protected final String id;
    protected String direccion;

    public Persona(String nombre, String id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
