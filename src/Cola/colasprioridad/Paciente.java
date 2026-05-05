package Cola.colasprioridad;

public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintoma;
    private int prioridad;

    public Paciente(String nombre, String sintoma, int prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre +
                "\nSintoma: " + sintoma +
                "Prioridad: " + prioridad ;
    }

    @Override
    public int compareTo(Paciente p){
       // return Integer.compare(this.prioridad,p.getPrioridad());//ordenamiento natural -> de menor a mayor

        if(this.prioridad > p.getPrioridad())
            return 1;
        else
            return -1;
    }
}
