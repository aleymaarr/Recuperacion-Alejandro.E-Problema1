public class Impresora {
    private String estado;
    private String colaimpresion;

    public Impresora(String estado, String colaimpresion) {
        this.estado = estado;
        this.colaimpresion = colaimpresion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColaimpresion() {
        return colaimpresion;
    }

    public void setColaimpresion(String colaimpresion) {
        this.colaimpresion = colaimpresion;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "estado='" + estado + '\'' +
                ", colaimpresion='" + colaimpresion + '\'' +
                '}';
    }
}
