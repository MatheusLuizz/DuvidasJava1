package javaCEV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Equacao2Grau extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSpinner btnA;
	private JLabel lblNewLabel_3;
	private JSpinner btnB;
	private JLabel lblNewLabel_4;
	private JSpinner btnC;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblB;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblA;
	private JLabel lblC;
	private JLabel lblNewLabel_12;
	private JButton btnNewButton;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JPanel panRes;
	private JLabel lblDelta;
	private JLabel lblTipo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equacao2Grau frame = new Equacao2Grau();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Equacao2Grau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panRes.setVisible(false);
		
		lblNewLabel = new JLabel("x");
		lblNewLabel.setBounds(83, 75, 22, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(101, 63, 10, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(111, 77, 10, 13);
		contentPane.add(lblNewLabel_2);
		
		btnA = new JSpinner();
		btnA.addChangeListener(this);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnA.setBounds(33, 69, 54, 33);
		contentPane.add(btnA);
		
		lblNewLabel_3 = new JLabel("x");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(184, 77, 10, 13);
		contentPane.add(lblNewLabel_3);
		
		btnB = new JSpinner();
		btnB.addChangeListener(this);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnB.setBounds(121, 69, 53, 33);
		contentPane.add(btnB);
		
		lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(197, 77, 16, 13);
		contentPane.add(lblNewLabel_4);
		
		btnC = new JSpinner();
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.setBounds(223, 69, 54, 33);
		contentPane.add(btnC);
		
		lblNewLabel_5 = new JLabel("= 0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(287, 77, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Δ = ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(60, 121, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblB.setBounds(101, 119, 16, 17);
		contentPane.add(lblB);
		
		lblNewLabel_8 = new JLabel("2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(110, 106, 10, 13);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("-4 .");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(121, 114, 45, 26);
		contentPane.add(lblNewLabel_9);
		
		lblA = new JLabel("A ");
		lblA.setForeground(Color.RED);
		lblA.setBackground(Color.BLACK);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(163, 115, 22, 24);
		contentPane.add(lblA);
		
		lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblC.setBounds(207, 119, 22, 17);
		contentPane.add(lblC);
		
		lblNewLabel_12 = new JLabel(".");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(184, 111, 22, 33);
		contentPane.add(lblNewLabel_12);
		
		btnNewButton = new JButton("Calcular Δ");
		btnNewButton.addActionListener(this);
		
		panRes = new JPanel();
		panRes.setBounds(33, 180, 299, 86);
		contentPane.add(panRes);
		panRes.setLayout(null);
		
		lblNewLabel_14 = new JLabel("Tipo =");
		lblNewLabel_14.setBounds(10, 55, 50, 21);
		panRes.add(lblNewLabel_14);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		lblNewLabel_13 = new JLabel("Δ = ");
		lblNewLabel_13.setBounds(10, 10, 34, 21);
		panRes.add(lblNewLabel_13);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		lblDelta = new JLabel("0");
		lblDelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelta.setForeground(new Color(0, 0, 255));
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDelta.setBounds(84, 17, 173, 13);
		panRes.add(lblDelta);
		
		lblTipo = new JLabel("0");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setForeground(new Color(0, 0, 255));
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTipo.setBounds(84, 62, 173, 13);
		panRes.add(lblTipo);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(109, 150, 120, 21);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent e) {
		panRes.setVisible(true);
		int a = (int) btnA.getValue();
		int b = (int) btnB.getValue();
		int c = (int) btnC.getValue();
		
		double delta = (b * b) -4 * a * c;
		
		if (delta > 0) {
			lblDelta.setText(String.format("%.1f", delta));
			lblTipo.setText("Possui 2 raízes reais");
		} else if (delta < 0) {
			lblDelta.setText(Double.toString(delta));
			lblTipo.setText("Não possui raízes reais");
		} else {
			lblDelta.setText(Double.toString(delta));
			lblTipo.setText("Possui 1 raíz");
		}
	}
	public void stateChanged(ChangeEvent e) {
		lblA.setText(btnA.getValue().toString());
		lblB.setText(btnB.getValue().toString());
		lblC.setText(btnC.getValue().toString());		
	}
}
