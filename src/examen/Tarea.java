package examen;

public class Tarea implements  Comparable<Tarea>{
    private int identificador;
    private String nombre;
    private String categoria;
    private float presupuesto;
    private int prioridad;

    public Tarea(int identificador, String nombre, String categoria, float presupuesto, int prioridad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.presupuesto = presupuesto;
        this.prioridad = prioridad;
    }

    public Tarea(){
        identificador = 0;
        nombre = "S/N";
        categoria = "Administrativa";
        presupuesto = 0;
        prioridad = 1;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public float getPresupuestoAjustado(){
        float presupuestoRed;
        if(getCategoria().equals("Administrativa"))
            presupuestoRed = getPresupuesto()*0.9F;
        else if(getCategoria().equals("Directiva"))
            presupuestoRed = getPresupuesto()*0.8F;
        else
            presupuestoRed = getPresupuesto()*0.95F;
        return presupuestoRed;
    }

    @Override
    public String toString(){
        return "Identificador: "+identificador+"\nNombre: "+nombre+"\nCategoria: "+categoria+
                "\nPresupuesto: "+presupuesto+"\nPrioridad: "+prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return Integer.compare(this.prioridad,o.getPrioridad());

    }
}
