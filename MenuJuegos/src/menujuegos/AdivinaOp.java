package menujuegos;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

/**
 *
 * @author alexj
 */
public class AdivinaOp extends JFrame implements ActionListener {
    
    JTextField num1, num2, res; 
    JButton bsuma, bresta, bmult, bdiv, sig; 
    JLabel interrog, igual, puntos, vidas; 
    Timer tm; 
    int op1, op2, sg, sl, pts, vds; 
    char[] operando = {'+' , '-' , '*' , '/'}; 
    public AdivinaOp(){ 
        setLayout(null);
        setTitle("Adivina la Operacion"); 
        setBounds(200,100,320,220); 
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Inicializar Puntos y Vidas
        pts = 0; vds=3; 

        //Operandos, operador y solucion 
        op1=random();
        op2=random();
        sg=random(4);
        sl=operacion(); 

        //Numero 1
        num1 = new JTextField();
        num1.setBounds(35, 30, 50, 40);
        num1.setText(String.valueOf(op1));
        num1.disable();
        add(num1);
        num1.setHorizontalAlignment(num1.CENTER); 
        num1.setFont(new Font("Arial",Font.BOLD,16));

        //Numero 2
        num2 = new JTextField();
        num2.setBounds(125, 30, 50, 40);
        num2.setText(String.valueOf(op2));
        num2.disable();
        add(num2);
        num2.setHorizontalAlignment(num2.CENTER); 
        num2.setFont(new Font("Arial",Font.BOLD,16));

        //Resultado
        res = new JTextField();
        res.setBounds(217, 30, 50, 40);
        res.setText(String.valueOf(sl));
        res.disable();
        add(res);
        res.setHorizontalAlignment(res.CENTER); 
        res.setFont(new Font("Arial",Font.BOLD,16)); 

        //Botones
        bsuma = new JButton("+"); 
        bsuma.setFont(new Font("Arial Black",Font.BOLD,18)); 
        bsuma.setBounds(30, 90, 50, 40);
        add(bsuma);
        bsuma.addActionListener(this);

        bresta = new JButton("-"); 
        bresta.setFont(new Font("Arial Black",Font.BOLD,18)); 
        bresta.setBounds(95, 90, 50, 40);
        add(bresta);
        bresta.addActionListener(this);

        bmult = new JButton();
        bmult.setText("*");
        bmult.setFont(new Font("Arial Black",Font.BOLD,18));
        bmult.setBounds(160, 90, 50, 40);
        add(bmult);
        bmult.addActionListener(this);

        bdiv = new JButton("/");
        bdiv.setFont(new Font("Arial Black",Font.BOLD,18));
        bdiv.setBounds(225, 90, 50, 40);
        add(bdiv);
        bdiv.addActionListener(this); 

        //Etiquetas 
        interrog = new JLabel("?");
        interrog.setFont(new Font("Arial Black",Font.BOLD,24));
        interrog.setBounds(85, 30, 40, 40);
        add(interrog);
        interrog.setHorizontalTextPosition(interrog.CENTER);

        igual = new JLabel("=");
        igual.setFont(new Font("Arial Black",Font.BOLD,24));
        igual.setBounds(175, 30, 40, 40);
        add(igual);
        igual.setHorizontalTextPosition(igual.CENTER);

        vidas = new JLabel("V V V");
        vidas.setFont(new Font("Arial Black",Font.BOLD,24));
        vidas.setBounds(200,150,90,30);
        add(vidas);
        vidas.setHorizontalAlignment(vidas.RIGHT); 

        puntos = new JLabel("Puntuación: ");
        puntos.setBounds(10, 150, 150, 30);
        puntos.setFont(new Font("Arial",Font.BOLD,15));
        add(puntos);

        //Inicializar timer 
        tm = new Timer(10000,new ActionListener(){ 
            public void actionPerformed(ActionEvent e){ 
                JOptionPane.showMessageDialog(null,"Sigue intentándolo","Tiempo agotado",JOptionPane.INFORMATION_MESSAGE); 
                tm.stop(); 
                restarVida(); 
                init(); 
            } 
        }); 

        tm.start(); 
    } 

    int random(){ 
        return (int)(Math.random()*100); 
    } 

    int random(int a){ 
        int aux = (int)(Math.random()*5); 
        if (aux < a) 
        return aux; 
        else 
        return random(a); 
    } 

    int operacion(){ 
        if(sg == 0) 
        return op1 + op2; 
        else if(sg == 1) 
        return op1 - op2; 
        else if(sg == 2) 
        return op1 * op2; 
        else 
        return op1 / op2; 
    } 

    void restarVida(){ 
        vds--; 
        if(vds == 2) 
        vidas.setText("V V"); 
        else if(vds == 1) 
        vidas.setText("V");
        else if(vds == 0){ 
            JOptionPane.showMessageDialog(null,"Puntación final: "+pts,"Fin de Partida",JOptionPane.PLAIN_MESSAGE); 
            System.exit(0); 
        } 
    } 

    void init(){ 
    op1 = random();
    op2 = random();
    sg = random(4); 
    sl = operacion(); 
    num1.setText(String.valueOf(op1));
    num2.setText(String.valueOf(op2));
    res.setText(String.valueOf(sl));
    tm.restart(); 
    } 

    public void actionPerformed(ActionEvent e){ 

        tm.stop(); 

        //Suma 
        if(e.getSource() == bsuma){ 
            if(sg == 0){ 
                JOptionPane.showMessageDialog(null,"+10 Puntos","Correcto",JOptionPane.INFORMATION_MESSAGE); 
               pts+=10; 
            }else{ 
                JOptionPane.showMessageDialog(null,"0 Puntos","Incorrecto",JOptionPane.ERROR_MESSAGE); 
                restarVida(); 
            } 
        } 

        //Resta
        if(e.getSource() == bresta){ 
            if(sg == 1){ 
                JOptionPane.showMessageDialog(null,"+10 Puntos","Correcto",JOptionPane.INFORMATION_MESSAGE); 
               pts+=10;
            }else{ 
                JOptionPane.showMessageDialog(null,"0 Puntos","Incorrecto",JOptionPane.ERROR_MESSAGE); 
                restarVida(); 
            } 
        } 

        //Multiplicacion
        if(e.getSource() == bmult){ 
            if(sg == 2){ 
                JOptionPane.showMessageDialog(null,"+10 Puntos","Correcto",JOptionPane.INFORMATION_MESSAGE); 
               pts+=10; 
            }else{ 
                JOptionPane.showMessageDialog(null,"0 Puntos","Incorrecto",JOptionPane.ERROR_MESSAGE); 
                restarVida(); 
            } 
        } 

        //Division
        if(e.getSource() == bdiv){ 
            if(sg == 3){ 
                JOptionPane.showMessageDialog(null,"+10 Puntos","Correcto",JOptionPane.INFORMATION_MESSAGE); 
               pts+=10; 
            }else{ 
                JOptionPane.showMessageDialog(null,"0 Puntos","Incorrecto",JOptionPane.ERROR_MESSAGE); 
                restarVida(); 
            } 
        } 

        puntos.setText("Puntuación: "+pts); 
        init(); 
    } 
}
