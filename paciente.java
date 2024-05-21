import java.util.ArrayList;
import java.util.List;


public class Paciente extends Persona {
    private List<Cita> citas;

    public Paciente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        citas = new ArrayList<>();
    }


    public List<Cita> getCitas() {
        return citas;
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }
}
