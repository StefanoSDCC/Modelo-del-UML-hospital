import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private ExpedienteMedico expediente;
    private List<CitaMedica> citas;

    public Paciente(String nombre, String id, String direccion, ExpedienteMedico expediente) {
        super(nombre, id, direccion);
        this.expediente = expediente;
        this.citas = new ArrayList<>();
    }

    public ExpedienteMedico getExpediente() {
        return expediente;
    }

    public void setExpediente(ExpedienteMedico expediente) {
        this.expediente = expediente;
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

    public void addCita(CitaMedica cita) {
        this.citas.add(cita);
    }
}

