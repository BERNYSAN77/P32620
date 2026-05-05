package examen;

import Cola.colasprioridad.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColaTarea {
    private Queue<Tarea> tareas;

    public ColaTarea(){
        tareas = new PriorityQueue<Tarea>();
    }

    public void cargaDatos() throws Exception{
       encolar(new Tarea(1,"Agua","Operativa",520123,10));
       encolar(new Tarea(2,"Luz","Operativa",852963,8));
       encolar(new Tarea(3,"Recategorización","Administrativa",785236,12));
       encolar(new Tarea(4,"Casa Comunal","Directiva",742596,10));
       encolar(new Tarea(5,"Asamblea","Directiva",963,5));
    }
    public void encolar(Tarea t) throws Exception{
        List<Tarea> aux = new ArrayList<>(tareas);
        for(Tarea t1 : aux){
            if(t1.getIdentificador() == t.getIdentificador())
                throw new Exception("Tarea ya existe");
        }
        tareas.add(t);
    }

    public String recalcularPresupuesto(){
        StringBuilder sb = new StringBuilder();
        float presupuestoRed;
        List<Tarea> aux = new ArrayList<>(tareas);
        for(Tarea t1 : aux){
           presupuestoRed = t1.getPresupuestoAjustado();
            sb.append(t1.toString());
            sb.append("\nNuevo presupuesto: "+presupuestoRed);
        }
        return sb.toString();
    }
    public float totalPresupuesto(String categoria){
        float total = 0;
        List<Tarea> aux = new ArrayList<>(tareas);
        for(Tarea t1 : aux){
            if(t1.getCategoria().equals(categoria))
            total += t1.getPresupuesto();
        }
        return total;
    }
    public float totalPresupuestoAjustado(String categoria){
        float total = 0;
        List<Tarea> aux = new ArrayList<>(tareas);
        for(Tarea t1 : aux){
            if(t1.getCategoria().equals(categoria))
            total += t1.getPresupuestoAjustado();
        }
        return total;
    }
    public List<Tarea> listar(){
        return new ArrayList<>(tareas);
    }


}
