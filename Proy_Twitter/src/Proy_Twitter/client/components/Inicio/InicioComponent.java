package Proy_Twitter.client.components.Inicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author lenovo
 */
public class InicioComponent implements ActionListener {

    private InicioTemplate iniciotemplate;
    private Timer timer;
    private int direccion, posinicial;

    public InicioComponent() {
        timer = new Timer(1, this);
        iniciotemplate = new InicioTemplate(this);
    }

    public InicioTemplate getInicioTemplate() {
        return iniciotemplate;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            if (e.getSource() == iniciotemplate.getbAbajo()) {
                this.direccion = -1;
            }
            if (e.getSource() == iniciotemplate.getbArriba()) {
                this.direccion = 1;
            }
            posinicial = iniciotemplate.getpTarjetas().getY();
            timer.start();
        }
        moverTarjetas2();
    }

    public void moverTarjetas1() {
        if (iniciotemplate.getpTarjetas().getY() == 0 && direccion == 1
                || iniciotemplate.getpTarjetas().getY() == -520 && direccion == -1) 
            timer.stop();
         else 
            iniciotemplate.getpTarjetas().setLocation(iniciotemplate.getpTarjetas().getX(), iniciotemplate.getpTarjetas().getY() + direccion);
        
        iniciotemplate.repaint();
    }

    public void moverTarjetas2() {
        if (iniciotemplate.getpTarjetas().getY() == 0 && direccion == 1
                || iniciotemplate.getpTarjetas().getY() == -520 && direccion == -1) {
            assert true;
        } else {
            if (iniciotemplate.getpTarjetas().getY() == posinicial + 50
                    || iniciotemplate.getpTarjetas().getY() == posinicial - 50) 
                timer.stop();
             else 
                iniciotemplate.getpTarjetas().setLocation(iniciotemplate.getpTarjetas().getX(), iniciotemplate.getpTarjetas().getY() + direccion);           
        }
        iniciotemplate.repaint();
    }
}
