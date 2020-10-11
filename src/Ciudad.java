public class Ciudad extends Hospital {
    protected String codCiudad;
    protected String nombre;
    public Ciudad(String codHospital, String nombre, String ciudad, int telefono, String direccion){
       super(codHospital,nombre,ciudad,telefono,direccion);
        this.setCodCiudad(getCodCiudad());
        this.setNombre(nombre);
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
