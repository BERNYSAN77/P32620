package examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JPanel Ventana;
    private JTextField txtIdentificador;
    private JTextField txtNombre;
    private JComboBox cmbCategoria;
    private JTextField txtPresupuesto;
    private JComboBox cmbPrioridad;
    private JButton agregarButton;
    private JButton recalcularButton;
    private JButton totalesButton;
    private JTextArea textArea1;
    private ColaTarea cola = new ColaTarea();

    public Ventana(){

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    cola.cargaDatos();
                    int identificador = Integer.parseInt(txtIdentificador.getText());
                    String nombre = txtNombre.getText();
                    String categoria = cmbCategoria.getSelectedItem().toString();
                    float presupuesto = Float.parseFloat(txtPresupuesto.getText());
                    int prioridad = Integer.parseInt(cmbPrioridad.getSelectedItem().toString());
                    Tarea t = new Tarea(identificador,nombre,categoria,presupuesto,prioridad);
                    cola.encolar(t);
                   List<Tarea> aux = cola.listar();
                   Collections.sort(aux);
                    for(Tarea t1:aux){
                        textArea1.append(t1.toString());
                    }
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1.getMessage());
                }


            }
        });
        recalcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append(cola.recalcularPresupuesto());
            }
        });
        totalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float totalPresupuesto = cola.totalPresupuesto(cmbCategoria.getSelectedItem().toString());
                float totalPresupuestoAjustado = cola.totalPresupuestoAjustado(cmbCategoria.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null,"Presupuesto: "+totalPresupuesto+"\nPresupuesto ajustado: "+
                        totalPresupuestoAjustado);
            }
        });
    }
}
