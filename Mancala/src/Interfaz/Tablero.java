package Interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Logica.Partida;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Tablero extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtColumna;
	public Partida mancala;
	public JTable table;
	public JLabel lbturno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Create the frame.
	 */
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 156);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new TitledBorder(null, "Mancala", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);

		JLabel lblColumna = new JLabel("Columna");

		txtColumna = new JTextField();
		txtColumna.setColumns(10);

		Partida partida = new Partida();
		JButton BtnJugar = new JButton("Jugar!");
		BtnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					int columna = Integer.parseInt(txtColumna.getText());
					partida.getReglas().setMancala(partida.getMancala());
					if (columna > 0 && columna < 7) {
						if (partida.getReglas().hayGanador() == false) {
							partida.inicializarTurno(partida.getJugadorActual(), columna);
							String p[] = new String[8];
							p[0] = "PJ 0";p[1] = "1";p[2] = "2";p[3] = "3";p[4] = "4";p[5] = "5";p[6] = "6";p[7] = "PJ 1";
							partida.comprobarReglas();
							DefaultTableModel dtm = new DefaultTableModel(partida.getTablero(), p);
							table.setModel(dtm);

							lbturno.setText("jugador " + partida.getJugadorActual());
						}
						if (partida.getReglas().hayGanador()) {
							lbturno.setText("Ganador :" + partida.getJugadorActual());
						}
					} else {
						txtColumna.setText("1-6");
					}
				} catch (java.lang.NumberFormatException e) {
					txtColumna.setText("1-6");
				}
			}
		});

		String[][] k = new String[2][8];
		for (int i = 0; i < partida.getMancala().getTablero().length; i++) {
			for (int j = 0; j < partida.getMancala().getTablero()[i].length; j++) {
				if (j != 0 && j != (partida.getMancala().getTablero()[0].length - 1)) {
					k[i][j] = 4 + "";
				}
			}
		}
		String p[] = new String[8];
		p[0] = "PJ 0";p[1] = "1";p[2] = "2";p[3] = "3";p[4] = "4";p[5] = "5";p[6] = "6";p[7] = "PJ 1";
		DefaultTableModel dtm = new DefaultTableModel(k, p);

		table = new JTable(dtm);
		table.setBackground(new Color(0, 204, 255));
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		table.setForeground(new Color(240, 255, 255));
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		lbturno = new JLabel("Jugador 0");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(32).addComponent(lblColumna).addGap(20)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtColumna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(BtnJugar)))
						.addGap(37).addComponent(table, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lbturno, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblColumna).addComponent(txtColumna, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(BtnJugar))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addComponent(table, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addGap(45)))
				.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(27).addComponent(lbturno)
						.addContainerGap(53, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
