public class Hospital {
    protected String codHospital;
    protected String nombre;
    protected String ciudad;
    protected int telefono;
    protected Servicio servicio;
    protected String direccion;
    protected Medico director;
    @Override
    public String toString() {
        return "Hospital{" +
                "codHospital='" + codHospital + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Ciudad=" + ciudad +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public Hospital(String codHospital, String nombre, String ciudad, int telefono, String direccion) {
        this.setCodHospital(codHospital);
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
    }

    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
