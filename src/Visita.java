import java.util.Date;

public class Visita extends Servicio {

    protected String codVisita;
    protected Date fechaHora;
    protected Hospital hospital;
    protected Medico medico;
    protected String diagnostico;
    protected String tratamientos;
    protected Date fechaSalida;
    protected Historial historial;
    public Visita(String servicio, String nombre, int numeroCamas){
        super(nombre,nombre,numeroCamas);
        this.setDiagnostico(getDiagnostico());
        this.setCodVisita(getCodVisita());
        this.setFechaHora(getFechaHora());
    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
