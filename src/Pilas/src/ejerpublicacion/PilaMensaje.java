package Pilas.src.ejerpublicacion;

import java.util.Stack;

public class PilaMensaje {
    private Stack<Mensaje> pila;

    public PilaMensaje(){
        pila = new Stack<Mensaje>();
    }

    public Stack<Mensaje> getPila() {
        return pila;
    }



    public boolean isEmpty(){
        return pila.isEmpty();
    }

    public void push(Mensaje i){
        pila.push(i);
    }

    public Mensaje pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Pila esta vacía");
        }
        return pila.pop();
    }

   public Mensaje peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Pila esta vacía");
        }
        return pila.peek();
    }
    @Override
    public String toString(){
        return "hola";
    }
}
