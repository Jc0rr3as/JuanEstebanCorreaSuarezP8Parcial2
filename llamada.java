public class llamada {
    private String numero;
    private String nombreContacto;
    private String duracion;
    private String fecha;

    public llamada(String numero, String nombreContacto, String duracion, String fecha) {
        this.numero = numero;
        this.nombreContacto = nombreContacto;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getFecha() {
        return fecha;
    }
}
