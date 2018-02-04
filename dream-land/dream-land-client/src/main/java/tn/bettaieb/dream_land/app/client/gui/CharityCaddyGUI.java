package tn.bettaieb.dream_land.app.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import training.Product;
import training.singleton.CharityCaddyRemote;

public class CharityCaddyGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1095293529459280405L;
	private JPanel contentPane;
	private List<Product> products = new ArrayList<>();
	private Context context;
	private CharityCaddyRemote charityCaddyRemote;
	private String name = "dream-land-ear/dream-land-service/CharityCaddy!training.singleton.CharityCaddyRemote";

	/**
	 * Create the frame.
	 */
	public CharityCaddyGUI() {
		try {
			context = new InitialContext();
			charityCaddyRemote = (CharityCaddyRemote) context.lookup(name);

		} catch (NamingException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblProduct = new JLabel("Product 1");

		JRadioButton rdbtnSelect = new JRadioButton("select");

		JLabel lblProduct_1 = new JLabel("Product 2");

		JRadioButton rdbtnSelect_1 = new JRadioButton("select");

		JLabel lblProduct_2 = new JLabel("Product 3");

		JRadioButton rdbtnSelect_2 = new JRadioButton("select");

		JButton btnValidate = new JButton("validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSelect.isSelected()) {
					Product product = new Product("P1", 10D);
					charityCaddyRemote.addProduct(product);
				}
				if (rdbtnSelect_1.isSelected()) {
					Product product = new Product("P2", 20D);
					charityCaddyRemote.addProduct(product);
				} else if (rdbtnSelect_2.isSelected()) {
					Product product = new Product("P3", 30D);
					charityCaddyRemote.addProduct(product);
				}
				Map<Double, Double> map = charityCaddyRemote.validate();

				for (Map.Entry<Double, Double> d : map.entrySet()) {
					System.out.println(d);
				}
			}
		});
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblProduct)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnSelect))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblProduct_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnSelect_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblProduct_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnSelect_2)))
					.addGap(263))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnValidate)
					.addGap(42)
					.addComponent(btnExit)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduct)
						.addComponent(rdbtnSelect))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduct_1)
						.addComponent(rdbtnSelect_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduct_2)
						.addComponent(rdbtnSelect_2))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValidate)
						.addComponent(btnExit))
					.addGap(86))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
