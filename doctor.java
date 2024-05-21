import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona implements GestionCitas {
    private final String especialidad;
    private List<CitaMedica> citas;

    public Doctor(String nombre, String id, String direccion, String especialidad) {
        super(nombre, id, direccion);
        this.especialidad = especialidad;
        this.citas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

    @Override
    public void programarCita(CitaMedica cita) {
        cita.setEstado("programada");
        citas.add(cita);
    }

    @Override
    public void cancelarCita(CitaMedica cita) {
        cita.setEstado("cancelada");
    }

    @Override
    public void realizarCita(CitaMedica cita) {
        cita.setEstado("realizada");
    }
}
