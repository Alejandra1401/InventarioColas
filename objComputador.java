public class objComputador
{
    private String Serial;
    private String Marca;
    private int MemoriaRam;
    private int Discoduro;
    private Double Precio;
    private String NombreEstudiante; 
    private int Carnet;
    private boolean Disponible;

    public objComputador(String serial, String marca, int memoriaRam, int discoduro, Double precio,
            String nombreEstudiante, int carnet, boolean disponible) {
        Serial = serial;
        Marca = marca;
        MemoriaRam = memoriaRam;
        Discoduro = discoduro;
        Precio = precio;
        NombreEstudiante = nombreEstudiante;
        Carnet = carnet;
        Disponible = disponible;
    }

    public objComputador() {
    }
    
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getMemoriaRam() {
        return MemoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        MemoriaRam = memoriaRam;
    }
    public int getDiscoduro() {
        return Discoduro;
    }
    public void setDiscoduro(int discoduro) {
        Discoduro = discoduro;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }
    public String getNombreEstudiante() {
        return NombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }
    public int getCarnet() {
        return Carnet;
    }
    public void setCarnet(int carnet) {
        Carnet = carnet;
    }
    public boolean isDisponible() {
        return Disponible;
    }
    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    } 
    
}