import java.util.ArrayList;
import java.util.List;

public class Enfermero extends Persona {
    private List<Paciente> pacientes;

    public Enfermero(String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }
}
