package Cola.colasimple;

import java.util.LinkedList;
import java.util.Queue;

public class ColaPedido {
    private Queue<Pedido> pedidos;

    public ColaPedido(){
        pedidos = new LinkedList<Pedido>();
    }

    public void encolar(Pedido p){
        pedidos.add(p);
    }

    public Pedido desencolar() throws Exception{
        if(pedidos.isEmpty()){
            throw new Exception("No hay elementos en la cola");
        }
        return pedidos.poll();
    }
    public Pedido primero() throws Exception{
        if(pedidos.isEmpty()){
            throw new Exception("No hay elementos en la cola");
        }
        return pedidos.peek();
    }

}
