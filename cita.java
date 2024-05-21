import java.time.LocalDate;
import java.time.LocalTime;


public class Cita {
    private final LocalDate fecha;
    private final LocalTime hora;
    private final String motivo;
    private EstadoCita estado;
    private Paciente paciente;
    private Doctor doctor;

    public Cita(LocalDate fecha, LocalTime hora, String motivo, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
