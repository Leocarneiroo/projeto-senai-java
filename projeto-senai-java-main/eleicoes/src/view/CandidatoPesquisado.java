package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class CandidatoPesquisado extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandidatoPesquisado frame = new CandidatoPesquisado();
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
	public CandidatoPesquisado() {
		setTitle("Candidato Pesquisado");
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Candidado Pesquisado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBounds(100, 100, 450, 216);
		
		JPanel panel = new JPanel();
		
		JLabel jlNome = new JLabel("Nome: ");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel jlPartido = new JLabel("Partido: ");
		
		txtPartido = new JTextField();
		txtPartido.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(jlPartido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(jlNome, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(jlPartido)
						.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton jbCancelar = new JButton("Cancelar");
		
		JButton jbSalvar = new JButton("Salvar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(291, Short.MAX_VALUE)
					.addComponent(jbSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jbCancelar)
					.addGap(3))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbSalvar)
						.addComponent(jbCancelar))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}
