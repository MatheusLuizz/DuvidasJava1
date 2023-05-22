import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;

public class TelaContador extends JFrame implements ChangeListener, ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel labelInicial;
	private JLabel labelFinal;
	private JLabel labelPasso;
	private JButton btnContar;
	private JList listaContagem;
	private JSlider sliderInicial;
	private JSlider sliderFinal;
	private JSlider sliderPasso;
	private JPanel panel;
	private JList list;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador frame = new TelaContador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("unchecked")
	public TelaContador() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(50, 64, 45, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setBounds(50, 99, 45, 13);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setBounds(50, 133, 45, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		labelInicial = new JLabel("0");
		labelInicial.setBounds(341, 60, 45, 20);
		labelInicial.setHorizontalAlignment(SwingConstants.CENTER);
		labelInicial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(labelInicial);
		labelInicial.setVisible(true);
		
		labelFinal = new JLabel("6");
		labelFinal.setBounds(341, 99, 45, 13);
		labelFinal.setHorizontalAlignment(SwingConstants.CENTER);
		labelFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(labelFinal);
		
		labelPasso = new JLabel("1");
		labelPasso.setBounds(341, 133, 45, 13);
		labelPasso.setHorizontalAlignment(SwingConstants.CENTER);
		labelPasso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(labelPasso);
		
		btnContar = new JButton("Contar");
		btnContar.setBounds(135, 172, 85, 21);
		btnContar.addActionListener(this);
		btnContar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnContar);
		
		listaContagem = new JList();
		listaContagem.setBounds(521, 309, -97, -167);
		contentPane.add(listaContagem);
		
		sliderInicial = new JSlider();
		sliderInicial.setBounds(105, 64, 200, 22);
		sliderInicial.setValue(0);
		sliderInicial.setMaximum(5);
		contentPane.add(sliderInicial);
		sliderInicial.addChangeListener(this);
		
		sliderFinal = new JSlider();
		sliderFinal.setBounds(105, 101, 200, 22);
		sliderFinal.setMinimum(6);
		sliderFinal.setMaximum(50);
		sliderFinal.setValue(6);
		contentPane.add(sliderFinal);
		sliderFinal.addChangeListener(this);

		sliderPasso = new JSlider();
		sliderPasso.setBounds(105, 133, 200, 22);
		sliderPasso.setValue(1);
		sliderPasso.setMaximum(4);
		sliderPasso.setMinimum(1);
		contentPane.add(sliderPasso);
		sliderPasso.addChangeListener(this);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(471, 10, 107, 319);
		contentPane.add(panel);
		
		list = new JList();
		panel.add(list);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		labelInicial.setText(Integer.toString(sliderInicial.getValue()));
		labelFinal.setText(Integer.toString(sliderFinal.getValue()));
		labelPasso.setText(Integer.toString(sliderPasso.getValue()));

	}
	public void actionPerformed(ActionEvent e) {
		DefaultListModel model = new DefaultListModel<>();
		
		int i, f, p;
		i = sliderInicial.getValue();
		f = sliderFinal.getValue();
		p = sliderPasso.getValue();
		
		model.clear();
				
		for (int x = i; x <= f; x += p) {
			model.addElement(x);
		}
		list.setModel(model);
	}
}
