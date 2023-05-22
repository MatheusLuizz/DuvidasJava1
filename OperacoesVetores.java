import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.awt.event.MouseEvent;

public class ExVetor extends JFrame implements ActionListener, MouseListener {
	
	int vetor[] = new int[5];
	DefaultListModel<?> lista = new DefaultListModel<Object>();
	int selected = 0;

	private JPanel contentPane;
	private JSpinner spinner;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnOrdem;
	private JLabel lblNewLabel;
	private JLabel lblSelecionado;
	private JScrollPane scrollPane;
	private JList<Integer> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExVetor frame = new ExVetor();
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
	@SuppressWarnings("unchecked")
	public ExVetor() {
		int vetor[] = new int[5];
		DefaultListModel<Integer> model = new DefaultListModel<Integer>();
		int selected = 0;
	
		for (int i = 0; i < vetor.length; i++) {
			model.addElement(vetor[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinner.setBounds(10, 33, 47, 51);
		contentPane.add(spinner);
		
		btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(this);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(67, 32, 102, 21);
		contentPane.add(btnAdd);
		
		btnRemove = new JButton("Remover");
		btnRemove.addActionListener(this);
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemove.setBounds(67, 63, 102, 21);
		contentPane.add(btnRemove);
		
		btnOrdem = new JButton("Ordenar");
		btnOrdem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOrdem.setBounds(67, 94, 102, 21);
		contentPane.add(btnOrdem);
		
		lblNewLabel = new JLabel("Vetor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(202, 36, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblSelecionado = new JLabel("[0]");
		lblSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelecionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionado.setBounds(257, 33, 45, 20);
		contentPane.add(lblSelecionado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(213, 73, 93, 142);
		contentPane.add(scrollPane);
		
		list = new JList<Integer>(model);
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		list.addMouseListener(this);
		scrollPane.setViewportView(list);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		vetor[selected] = Integer.parseInt(spinner.getValue().toString()); //btnAdd
		DefaultListModel<Integer> model = new DefaultListModel<Integer>();
		model.removeAllElements();
		for (int i = 0; i < vetor.length; i++) {
			model.addElement(vetor[i]);	
		}
		// btnRemove:   vetor[selected] = 0; 
		
		// btnOrdena:   Arrays.sort(vetor);
		
		list.setModel(model);
	}
	
	public void mouseClicked(MouseEvent e) {
		selected = list.getSelectedIndex();
		lblSelecionado.setText("[" + selected + "]");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
	
	}
	
}
