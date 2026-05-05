package Cola.colasimple;

import java.time.LocalDateTime;

public class Pedido {
    private String codigo;
    private String descripcion;
    private LocalDateTime fecha;
    private int cantidad;

    public Pedido(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        fecha = LocalDateTime.now();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}
