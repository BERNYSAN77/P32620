package Cola.colasprioridad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class Ventana {
    private JTextField txtNombre;
    private JTextField txtSintoma;
    private JComboBox cmbPrioridad;
    private JButton ingresarButton;
    private JButton atenderButton;
    private JButton proximoButton;
    private JList list1;
    private JPanel Ventana;
    private SalaEmergencia emergencia;
    private DefaultListModel dlm; //obligatorio para usar el JList

    public Ventana(){

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre, sintomas;
                int prioridad;
                nombre = txtNombre.getText();
                sintomas = txtSintoma.getText();
                prioridad = Integer.parseInt(cmbPrioridad.getSelectedItem().toString());
                emergencia.encolar(new Paciente(nombre,sintomas,prioridad));
                mostrar();
            }
        });
    }

    public void setear(){
        txtNombre.setText("");
        txtSintoma.setText("");
        cmbPrioridad.setSelectedIndex(0);
    }
    public void mostrar(){
        dlm.removeAllElements();
        List<Paciente> aux = emergencia.listar();
        Collections.sort(aux);
        for(Paciente p : aux){
            dlm.addElement(p);
        }
        list1.setModel(dlm);
    }

}
