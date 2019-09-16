package farmatec;
//
public class Medicamentos {
    //p
    //Atributos de la clase
    private String Nombre;
    private String Marca;
    private String Descripcion;
    private String Tipo_Medicamento;
    private String Dosis;
    private String Efectos_Secundarios;
    public int cantidad;
     
    //Constructor
    public Medicamentos(){
        
    }

    //Métodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo_Medicamento() {
        return Tipo_Medicamento;
    }

    public void setTipo_Medicamento(String Tipo_Medicamento) {
        this.Tipo_Medicamento = Tipo_Medicamento;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getEfectos_Secundarios() {
        return Efectos_Secundarios;
    }

    public void setEfectos_Secundarios(String Efectos_Secundarios) {
        this.Efectos_Secundarios = Efectos_Secundarios;
    }

    public int getCantidad() {
    
        return this.cantidad;
   
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    
    
    
}
