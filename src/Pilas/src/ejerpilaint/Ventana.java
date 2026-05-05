

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {

    private JPanel Ventana;
    private JTextField txtNumero;
    private JButton btnApilar;
    private JButton btnDesapilar;
    private JButton btnCima;
    private JButton btnBuscar;
    private JTextArea textArea1;
    private ejerpilaint.Pila pilaNumeros;

    public Ventana(){

        btnApilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilaNumeros.push(Integer.parseInt(txtNumero.getText()));
                txtNumero.setText("");
                textArea1.setText(pilaNumeros.toString());
            }
        });
    }


}
