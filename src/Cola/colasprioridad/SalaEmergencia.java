package Cola.colasprioridad;

import Cola.colasimple.Pedido;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SalaEmergencia {
    PriorityQueue<Paciente> pacientes;

    public SalaEmergencia(){
        pacientes = new PriorityQueue<Paciente>();
    }

    public void encolar(Paciente p){
        pacientes.add(p);
    }

    public Paciente desencolar() throws Exception{
        if(pacientes.isEmpty()){
            throw new Exception("No hay pacientes en la cola");
        }
        return pacientes.poll();
    }
    public Paciente primero() throws Exception{
        if(pacientes.isEmpty()){
            throw new Exception("No hay pacientes en la cola");
        }
        return pacientes.peek();
    }

    public List<Paciente> listar(){
        return new ArrayList<>(pacientes);
    }


}
