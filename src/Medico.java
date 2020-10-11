public class Medico extends Persona {
    private String codMedico;
    private Servicio servicio;
    public Medico(String nombre,String primerApellido, String segundoApellido, String dni, String codMedico, String servicio){
        super(nombre,primerApellido,segundoApellido,dni);
        this.setCodMedico(codMedico);
        this.setServicio(getServicio());
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
