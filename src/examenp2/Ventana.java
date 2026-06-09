package examenp2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ventana {
    private JTabbedPane tabbedPane1;
    private JTextField txtNombre;
    private JComboBox cmbCategoria;
    private JTextField txtCantidad;
    private JTextField txtPrecio;
    private JButton agregarButton;
    private JList list1;
    private JButton buscarButton;
    private JTextField txtNombreM;
    private JTextField txtPrecioM;
    private JTextField txtCantidadM;
    private JComboBox cmbCategoriaM;
    private JButton modificarButton;
    private JComboBox cmbCategoriaO;
    private JButton ordenarButton;
    private JList list2;
    private JTextField txtNombreB;
    private JButton buscarButton1;
    private JSpinner spinnerI;
    private JSpinner spinnerM;
    private JTextArea textArea1;
    private JPanel Ventana;
    private InventarioProducto productos = new InventarioProducto();

    public Ventana(){
       try{
           productos.cargarDatos();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
       SpinnerNumberModel spm = new SpinnerNumberModel(10,1,1000,1);
       spinnerI.setModel(spm);
       spinnerM.setModel(spm);


    }
    public void llenarJList1(){
        DefaultListModel dlm = new DefaultListModel();
        List<Producto> lista = productos.getInventario();
        for(Producto p : lista){
            dlm.addElement(p);
        }
        list1.setModel(dlm);
    }
    public void llenarJList2(ArrayList<Producto> lista){
        DefaultListModel dlm = new DefaultListModel();
        for(Producto p : lista){
            dlm.addElement(p);
        }
        list2.setModel(dlm);
    }
}
