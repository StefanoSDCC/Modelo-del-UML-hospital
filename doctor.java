public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, String identificacion, String direccion, String especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
