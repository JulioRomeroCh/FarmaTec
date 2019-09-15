package farmatec;

public class Farmacia {
    
    //Atributos de la clase
    private String nombre;
    private String cedulaJuridica;
    private String ubicacion;
    private int telefono;
    public listaMedicamentos listameds;
    
    //Constructos
    public Farmacia () {
        
       listameds = new listaMedicamentos();
        
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
