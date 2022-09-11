package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Sistema de Eleições");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 453);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu jmCandidatosCadastrados = new JMenu("Candidatos Cadastrados");
		
		jbPrincipal.add(jmCandidatosCadastrados);
		
		JMenuItem mntmNewMenuItemCandidatos = new JMenuItem("Candidatos Elegíveis");
		mntmNewMenuItemCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						CadastroCandidatosUI cadCandidatoselegiveis =new CadastroCandidatosUI();
						cadCandidatoselegiveis.setVisible(true);
						contentPane.add(cadCandidatoselegiveis, 0);
						
						
				
			}
		});
		jmCandidatosCadastrados.add(mntmNewMenuItemCandidatos);
		
		JMenu jmCPesquisado = new JMenu("Candidato Pesquisado");
		jbPrincipal.add(jmCPesquisado);
		
		JMenuItem mntmNewMenuItemCPesquisado = new JMenuItem("Candidatos");
		mntmNewMenuItemCPesquisado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CandidatoPesquisado CandidatoPesquisado =new CandidatoPesquisado();
				jmCPesquisado.setVisible(true);
				contentPane.add(jmCPesquisado, 0);
				
			}
		});
		jmCPesquisado.add(mntmNewMenuItemCPesquisado);
		
		JMenu jmPesquisa = new JMenu("Pesquisa");
		jbPrincipal.add(jmPesquisa);
		
		JMenuItem jmRegistrarPesquisa = new JMenuItem("Registrar Pesquisa");
		jmPesquisa.add(jmRegistrarPesquisa);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 579, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 382, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
