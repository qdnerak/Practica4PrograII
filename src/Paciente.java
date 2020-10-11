public class Paciente extends Persona {
    private String codPaciente;
    private String numeroSeguridadSocial;
    public Paciente(String nombre,String primerApellido,String segundoApellido,String dni,String codPaciente, String numeroSeguridadSocial){
        super(nombre,primerApellido,segundoApellido,dni);
        this.setCodPaciente(codPaciente);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
