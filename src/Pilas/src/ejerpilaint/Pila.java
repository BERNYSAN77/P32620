package ejerpilaint;

import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila(){
        pila = new Stack<Integer>();
    }

    public Stack<Integer> getPila() {
        return pila;
    }

    //pop
    //push
    //peek
    //isEmpty
    //search

    public boolean isEmpty(){
        return pila.isEmpty();
    }

    public void push(Integer i){
        pila.push(i);
    }
    public Integer pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Pila esta vacía");
        }
        return pila.pop();
    }

    public Integer search(Integer i) throws Exception{
        if(isEmpty()){
            throw new Exception("Pila esta vacía");
        }
        return pila.search(i);
    }

    public Integer peek() throws Exception{
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
