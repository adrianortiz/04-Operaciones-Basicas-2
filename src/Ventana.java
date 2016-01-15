import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * 
 * @author Adrian
 *
 */
public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = -7247033007555581826L;
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Primer número");
	private JLabel lbN2 = new JLabel("Segundo número");
	private JLabel lbResultado = new JLabel("Resultado", SwingConstants.CENTER);
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMul = new JButton("x");
	private JButton btnDiv = new JButton("/");
	
	private Container c = getContentPane();
	private OperacionDao op = new OperacionDaoImp();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public Ventana()
	{
		super.setTitle("Operaciones 2");
		super.setSize(340, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}

	/**
	 * Controles principales de la UI
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		
		lbN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 300, 30);
		
		btnSuma.setBounds(10, 150, 74, 30);
		btnResta.setBounds(87, 150, 74, 30);
		btnMul.setBounds(164, 150, 74, 30);
		btnDiv.setBounds(241, 150, 74, 30);
		
		lbResultado.setBounds(10, 190, 300, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		
		c.add(lbN2);
		c.add(txtN2);
		
		c.add(btnSuma);
		
		c.add(lbResultado);
		c.add(btnResta);
		c.add(btnMul);
		c.add(btnDiv);
		
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
	}

	/**
	 * Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double result = 0;
		char tipo = '0';
		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());
		
		if (e.getActionCommand().equals("+")) {
			result = op.doSuma(n1, n2);
			tipo = '+';
		}
		
		if (e.getActionCommand().equals("-")){
			result = op.doResta(n1, n2);
			tipo = '-';
		}
		
		if (e.getActionCommand().equals("x")){
			result = op.doMulti(n1, n2);
			tipo = 'x';
		}
		
		if (e.getActionCommand().equals("/")){
			result = op.doDiv(n1, n2);
			tipo = '/';
		}
		
		lbResultado.setText(String.format("%s %s %s = %s", txtN1.getText(), tipo, txtN2.getText(), result));
	}
	
}
