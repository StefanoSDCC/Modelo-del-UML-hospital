# Modelo-del-UML-hospital
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
enum EstadoCita {
    PROGRAMADA,
    REALIZADA,
    CANCELADA
}
public class Persona {
    private String nombre;
    private String identificacion;
    private String direccion;

    public Persona(String nombre, String identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
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
