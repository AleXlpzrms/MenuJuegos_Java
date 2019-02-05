package menujuegos;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

/**
 *
 * @author alexj
 */
public class YuGiOh extends JFrame {
    
    // Componentes
    JPanel panel1, panel2;
    JLabel lblnombre1, lblnombre2, lblLP1, lblLP2, lblturno;
    JTextField txtnombre1, txtnombre2, txtLP1, txtLP2, txtturno;
    JButton btnsuma1, btnresta1, btnsuma2, btnresta2, btnfint1, btnfint2;
    static int turno=0;
    
    // Jugadores
    Jugador jugador1 = new Jugador("", 8000);
    Jugador jugador2 = new Jugador("", 8000);
    
    public YuGiOh(){
        super();
        initComponents();
    }
    
    private void jugador1(){
        // Panel
            panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 18)));
            
            javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addComponent(lblLP1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLP1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnfint1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(btnsuma1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnresta1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addComponent(lblnombre1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(34, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnombre1)
                        .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLP1)
                        .addComponent(txtLP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnsuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnresta1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnfint1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        
        // Nombre
            lblnombre1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtnombre1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jugador1.setNombre(txtnombre1.getText());
         
        // LP
            lblLP1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtLP1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtLP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            
        // Sumar
            btnsuma1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            
        // Restar
            btnresta1.setFont(new java.awt.Font("Times New Roman", 1, 24));
            
        // Fin Turno
            btnfint1.setFont(new java.awt.Font("Arial", 1, 14));
    }
    
    private void jugador2(){
        // Panel
            panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 18)));
            
            javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addComponent(lblLP2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLP2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnfint2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(btnsuma2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnresta2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addComponent(lblnombre2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(34, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnombre2)
                        .addComponent(txtnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLP2)
                        .addComponent(txtLP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnsuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnresta2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnfint2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        
        // Nombre
            lblnombre2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtnombre2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtnombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jugador2.setNombre(txtnombre2.getText());
         
        // LP
            lblLP2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtLP2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            txtLP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            
        // Sumar
            btnsuma2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            
        // Restar
            btnresta2.setFont(new java.awt.Font("Times New Roman", 1, 24));
            
        // Fin Turno
            btnfint2.setFont(new java.awt.Font("Arial", 1, 14));
    }
    
    private void initComponents(){
        
        setLayout(new FlowLayout());
        setBounds(200,100,630,345);
        setResizable(false);
        setTitle("Contador YuGiOh"); 
        setDefaultCloseOperation(YuGiOh.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        lblnombre1 = new JLabel("Nombre:");
        lblnombre2 = new JLabel("Nombre:");
        lblLP1 = new JLabel("LP:");
        lblLP2 = new JLabel("LP:");
        lblturno = new JLabel("Turno:"); lblturno.setFont(new java.awt.Font("Times New Roman", 1, 24));
        txtnombre1 = new JTextField();
        txtnombre2 = new JTextField();
        txtLP1 = new JTextField(Integer.toString(jugador1.getLP()));
        txtLP1.setEditable(false);
        txtLP2 = new JTextField(Integer.toString(jugador1.getLP()));
        txtLP2.setEditable(false);
        txtturno = new JTextField(" "+Integer.toString(turno)+" ");
        txtturno.setEditable(false); txtturno.setFont(new java.awt.Font("Times New Roman", 1, 24));
        btnsuma1 = new JButton("+");
        btnresta1 = new JButton("-");
        btnsuma2 = new JButton("+");
        btnresta2 = new JButton("-");
        btnfint1 = new JButton("Fin Turno");
        btnfint2 = new JButton("Fin Turno");
        
        add(panel1);
        add(panel2);
        add(lblturno);
        add(txtturno);
        
        ActionListener manejador = 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    manejar(e);
                }
            };
        
        btnsuma1.addActionListener(manejador);
        btnsuma2.addActionListener(manejador);
        btnresta1.addActionListener(manejador);
        btnresta2.addActionListener(manejador);
        btnfint1.addActionListener(manejador);
        btnfint2.addActionListener(manejador);
        
        
        
        jugador2.setNombre(txtnombre2.getText());
        jugador2.setLP(8000);
        
        jugador1();
        jugador2();
    }
    
    public void manejar(ActionEvent e){ 
        
        // Jugador 1
        
            // Sumar
            if(e.getSource() == btnsuma1){
                if(jugador1.getLP()<=0)
                    JOptionPane.showMessageDialog(null,"Has perdido Jugador 1","Fin de Partida",JOptionPane.WARNING_MESSAGE);
                else{
                    jugador1.sumar();
                    txtLP1.setText(Integer.toString(jugador1.getLP()));
                }
            }
            
            // Restar
            if(e.getSource() == btnresta1){
                if(jugador1.getLP()<=0)
                    JOptionPane.showMessageDialog(null,"Has perdido Jugador 2","Fin de Partida",JOptionPane.WARNING_MESSAGE);
                else{
                    jugador1.restar();
                    txtLP1.setText(Integer.toString(jugador1.getLP()));
                }
            }
            
            // Fin Turno
            if(e.getSource() == btnfint1){
                jugador1.finTurno();
                txtturno.setText(Integer.toString(turno));
            }
            
        // Jugador 2
        
            // Sumar
            if(e.getSource() == btnsuma2){
                if(jugador2.getLP()<=0)
                    JOptionPane.showMessageDialog(null,"Has perdido "+jugador2.getNombre(),"Fin de Partida",JOptionPane.WARNING_MESSAGE);
                else{
                    jugador2.sumar();
                    txtLP2.setText(Integer.toString(jugador2.getLP()));
                }
            }
            
            // Restar
            if(e.getSource() == btnresta2){
                if(jugador2.getLP()<=0)
                    JOptionPane.showMessageDialog(null,"Has perdido "+jugador2.getNombre(),"Fin de Partida",JOptionPane.WARNING_MESSAGE);
                else{
                    jugador2.restar();
                    txtLP2.setText(Integer.toString(jugador2.getLP()));
                }
            }
            
            // Fin Turno
            if(e.getSource() == btnfint2){
                jugador2.finTurno();
                txtturno.setText(Integer.toString(turno));
            }
            
    }
}
