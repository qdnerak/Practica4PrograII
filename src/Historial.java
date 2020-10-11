public class Historial extends Servicio {
    private String codHistorial;
    private Paciente paciente;
    private String Comentario;
    public Historial(String servicio, String nombre, int numeroCamas){
        super(servicio,nombre,numeroCamas);
        this.setCodHistorial(getCodHistorial());
        this.setPaciente(getPaciente());
        this.setComentario(getComentario());
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
