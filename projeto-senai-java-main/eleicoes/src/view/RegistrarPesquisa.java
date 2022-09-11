package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class RegistrarPesquisa extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtFichaLimpa;
	private JTextField txtPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarPesquisa frame = new RegistrarPesquisa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrarPesquisa() {
		setBorder(new TitledBorder(null, "Registrar Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setTitle("Registro de Pesquisa");
		setBounds(100, 100, 450, 269);
		
		JPanel panel = new JPanel();
		
		JButton jbCancelar = new JButton("Cancelar");
		
		JButton jbEnviar = new JButton("Enviar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(jbEnviar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jbCancelar)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbCancelar)
						.addComponent(jbEnviar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel JLNome = new JLabel("Nome: ");
		
		txtNome = new JTextField();
		txtNome.setText("");
		txtNome.setColumns(10);
		
		JLabel jlFichaLimpa = new JLabel("Ficha Limpa? ");
		
		txtFichaLimpa = new JTextField();
		txtFichaLimpa.setColumns(10);
		
		JLabel jlPartido = new JLabel("Partido: ");
		
		txtPartido = new JTextField();
		txtPartido.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(JLNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(jlFichaLimpa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFichaLimpa, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(jlPartido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(JLNome))
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlFichaLimpa)
						.addComponent(txtFichaLimpa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPartido)
						.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

	}

}
