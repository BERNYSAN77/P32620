package examenp2;

import java.util.ArrayList;
import java.util.List;

public class InventarioProducto {
    private List<Producto> inventario;

    public InventarioProducto(){
        inventario = new ArrayList<Producto>();
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void cargarDatos() throws Exception{
        adicionarProducto(1,"TP-Link Ax90","Router",5,65F);
        adicionarProducto(5,"GT-BE98","Router",15,95F);
        adicionarProducto(10,"TL-SG105","Switch",10,82F);
        adicionarProducto(9,"DGS-1016D","Switch",12,125F);
        adicionarProducto(6,"RE305","Expansor",8,165F);
        adicionarProducto(3,"DecoX20","Expansor",6,215F);
    }
    public void adicionarProducto(int id, String nombre, String categoria, int cantidad, float precio) throws Exception{
        for(Producto p: inventario){
            if(p.getId() == id)
                throw new Exception("Código ya existe");
        }
        inventario.add(new Producto(id,nombre,categoria,cantidad,precio));
    }
    public List<Producto> buscarCategoria(String categoria){
        List<Producto> lista = new ArrayList<>();
        for(Producto p : inventario){
            if(p.getCategoria().equals(categoria))
                lista.add(p);
        }
        return ordenarPrecio((ArrayList<Producto>) lista);
    }
    public Producto buscarNombre(String nombre) throws Exception{
        for(Producto p : inventario){
            if(p.getNombre().equals(nombre))
                return p;
        }
        throw new Exception("No existe ese producto");

    }
    public void editarProducto(int id, String nombre, String categoria, int cantidad, float precio){
        for(Producto p: inventario){
            if(p.getId() == id){
                p.setNombre(nombre);
                p.setCantidad(cantidad);
                p.setCategoria(categoria);
                p.setPrecio(precio);
            }

        }
    }
    private List<Producto> ordenarPrecio(ArrayList<Producto> lista){

        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).getPrecio() > lista.get(j + 1).getPrecio()) {
                    Producto temp = lista.get(j);
                    lista.set(j,lista.get(j + 1));
                    lista.set(j+1,temp);
                }
            }
        }
        return lista;
    }





/*
    intefaz
    mostrar elementos
    Editar productos seleccionando id
    Buscar por nombre
     */
}
