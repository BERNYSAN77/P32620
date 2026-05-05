package Cola.colasimple;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JTextField txtCodigo;
    private JTextField txtDescripcion;
    private JTextField txtCantidad;
    private JButton agregarPedidoButton;
    private JButton despacharPedidoButton;
    private JButton próximoPedidoButton;
    private JButton totalesButton;
    private JButton pedidosPendientesButton;
    private JButton pedidosDespachadosButton;
    private JTextArea textArea1;
    private ColaPedido pedidos = new ColaPedido();
    private ColaPedido despachados = new ColaPedido();

    public Ventana(){

        agregarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String descripcion = txtDescripcion.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                pedidos.encolar(new Pedido(codigo,descripcion,cantidad));
                setear();
            }
        });
        despacharPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Pedido p = pedidos.desencolar();
                    despachados.encolar(p);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
    public void setear(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
