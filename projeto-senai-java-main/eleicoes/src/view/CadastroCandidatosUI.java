package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CandidatoController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CadastroCandidatosUI extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtFichaLimpa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCandidatosUI frame = new CadastroCandidatosUI();
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
	public CadastroCandidatosUI() {
		setClosable(true);
		setTitle("Cadastro Candidatos");
		setBounds(100, 100, 449, 276);
		
		JPanel jpCadastroCandidatos = new JPanel();
		jpCadastroCandidatos.setBorder(new TitledBorder(null, "Candidatos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbCancelar = new JButton("Cancelar");
		
		JButton jbSalvar = new JButton("Salvar");
		jbSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				CadastroCandidatosUI cadastrocandidatos = new CadastroCandidatosUI();
				CadastroCandidatosUI.setCandidatos(txtNome.getText());
				CadastroCandidatosUI.setFichaLimpa(txtFichaLimpa.getText());
				
				new CandidatoController().salvar(cadastrocandidatos);
				JOptionPane.showMessageDialog(null,"Salvo com sucesso");
				dispose();
				
			}catch (Exception exe) {
				JOptionPane.showMessageDialog(null, "Erro ao salvar Candidado" );
			}
			}});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpCadastroCandidatos, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(jbSalvar)
							.addGap(33)
							.addComponent(jbCancelar)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpCadastroCandidatos, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbCancelar)
						.addComponent(jbSalvar))
					.addContainerGap())
		);
		
		JLabel jlNome = new JLabel("Nome: ");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel jlFichaLimpa = new JLabel("Ficha Limpa? ");
		
		txtFichaLimpa = new JTextField();
		txtFichaLimpa.setColumns(10);
		GroupLayout gl_jpCadastroCandidatos = new GroupLayout(jpCadastroCandidatos);
		gl_jpCadastroCandidatos.setHorizontalGroup(
			gl_jpCadastroCandidatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCandidatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroCandidatos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroCandidatos.createSequentialGroup()
							.addComponent(jlNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroCandidatos.createSequentialGroup()
							.addComponent(jlFichaLimpa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFichaLimpa, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		gl_jpCadastroCandidatos.setVerticalGroup(
			gl_jpCadastroCandidatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCandidatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroCandidatos.createParallelGroup(Alignment.LEADING)
						.addComponent(jlNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_jpCadastroCandidatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlFichaLimpa)
						.addComponent(txtFichaLimpa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(109, Short.MAX_VALUE))
		);
		jpCadastroCandidatos.setLayout(gl_jpCadastroCandidatos);
		getContentPane().setLayout(groupLayout);

	}

	protected static void setFichaLimpa(String string) {
		// TODO Auto-generated method stub
		
	}

	protected static void setCandidatos(String text) {
		// TODO Auto-generated method stub
		
	}

	protected static void setcadastroCandidatosUI(String text) {
		// TODO Auto-generated method stub
		
	}
}
