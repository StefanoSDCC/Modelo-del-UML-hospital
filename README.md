public interface GestionCitas {
    void programarCita(CitaMedica cita);
    void cancelarCita(CitaMedica cita);
    void realizarCita(CitaMedica cita);
}
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
import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private String hora;
    private String motivo;
    private String estado;
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica(Date fecha, String hora, String motivo, String estado, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
import java.util.List;

public class ExpedienteMedico {
    private List<String> historialMedico;
    private List<String> diagnosticos;
    private List<String> tratamientos;
    private List<String> prescripciones;

    public ExpedienteMedico(List<String> historialMedico, List<String> diagnosticos, List<String> tratamientos, List<String> prescripciones) {
        this.historialMedico = historialMedico;
        this.diagnosticos = diagnosticos;
        this.tratamientos = tratamientos;
        this.prescripciones = prescripciones;
    }

    public List<String> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(List<String> historialMedico) {
        this.historialMedico = historialMedico;
    }

    public List<String> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<String> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<String> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<String> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<String> prescripciones) {
        this.prescripciones = prescripciones;
    }
}
