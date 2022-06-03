public class DocumentoOfimatico {
    private String nombre;
    private int  tamaño;

    public DocumentoOfimatico(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "DocumentoOfimatico{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
