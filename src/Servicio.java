import java.util.List;

public class Servicio {
    protected String servicio;
    protected String nombre;
    protected List hospitales;
    protected int numeroCamas;

    @Override
    public String toString() {
        String servicioCompleto=servicio;
        if (nombre!=null){
            servicioCompleto+=" "+servicio;

        }
        return servicioCompleto;
    }

    public Servicio(String servicio, String nombre, int numeroCamas) {
        this.setServicio(servicio);
        this.setNombre(nombre);
        this.setNumeroCamas(numeroCamas);
    }

    protected String comentario;

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getHospitales() {
        return hospitales;
    }

    public void setHospitales(List hospitales) {
        this.hospitales = hospitales;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
