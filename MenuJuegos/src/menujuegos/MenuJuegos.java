package menujuegos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alexj
 */
public class MenuJuegos extends JFrame {
    
    String[] juegos = new String[]{" JUEGOS", "  - YuGiOh (Contador de vidas)  ",
        "  - Adivina la Operación  "};
    
    JList jlJuegos;
    JButton btnSeleccionar;

    public MenuJuegos() {
        super("Menú");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,100,300,160);
        setResizable(false);
        setLayout(new FlowLayout());
        
        jlJuegos = new JList(juegos);
        jlJuegos.setFont(new java.awt.Font("Times New Roman", 1, 16));
        btnSeleccionar = new JButton("   Comenzar Juego   ");
        
        add(jlJuegos);
        add(btnSeleccionar);
        
        btnSeleccionar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(jlJuegos.getSelectedIndex()==1){
                        setVisible(false);
                        YuGiOh yugi = new YuGiOh(); 
                        yugi.setVisible(true);
                    }
                    if(jlJuegos.getSelectedIndex()==2){
                        setVisible(false);
                        AdivinaOp adivinaop = new AdivinaOp();
                        adivinaop.setVisible(true);
                    }
                }
            }
        );
    }
    
    public static void main(String[] args) {
        new MenuJuegos().setVisible(true);
    }
    
}
