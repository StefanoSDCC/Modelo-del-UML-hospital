import java.util.ArrayList;
import java.util.List;


public class Enfermero extends Persona {
    private List<Paciente> pacientesAsignados;

    public Enfermero(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        pacientesAsignados = new ArrayList<>();
    }

  
    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void asignarPaciente(Paciente paciente) {
        pacientesAsignados.add(paciente);
    }
}
