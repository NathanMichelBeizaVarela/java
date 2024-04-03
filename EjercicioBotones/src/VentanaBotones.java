import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


public class VentanaBotones extends JFrame {
    JButton boton1;
    
    public VentanaBotones(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension d= new Dimension (300, 300);
        this.setSize(d);
        this.setLocationRelativeTo(null);
        iniciarBotones();
    }
    
    protected void iniciarBotones(){
        boton1= new JButton("Click aqui");
        JPanel panelPrincipal = new JPanel();
        this.getContentPane().add(panelPrincipal);
        panelPrincipal.add(boton1);
        panelPrincipal.setLayout(null);
        boton1.setBounds(100,100,200,100);
        boton1.setText("click here");
        boton1.setEnabled(true);
        boton1.setMnemonic('h');
        boton1.setFont(new Font(Font.SERIF,Font.ITALIC,15));
        boton1.setOpaque(true);
        boton1.setBackground(Color.cyan);
        boton1.setIcon(new ImageIcon(new ImageIcon("imagenes/figaro.jpg").getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));
        
    }
}

