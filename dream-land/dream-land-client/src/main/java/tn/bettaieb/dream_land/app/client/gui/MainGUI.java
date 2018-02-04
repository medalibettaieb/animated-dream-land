package tn.bettaieb.dream_land.app.client.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2389371172873386784L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("MAIN GUI GOES HERE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setForeground(Color.BLUE);

		JButton btnClassicCaddy = new JButton("classic caddy");
		btnClassicCaddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Launch the application.
				 */
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ClassicCaddyGUI frame = new ClassicCaddyGUI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}
		});

		JButton btnSmartCaddy = new JButton("smart caddy");
		btnSmartCaddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Launch the application.
				 */
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SmartCaddyGUI frame = new SmartCaddyGUI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}
		});

		JButton btnCharityCaddy = new JButton("charity caddy");
		btnCharityCaddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Launch the application.
				 */
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CharityCaddyGUI frame = new CharityCaddyGUI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(89).addComponent(lblNewLabel,
								GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(btnClassicCaddy)
								.addGap(55).addComponent(btnSmartCaddy).addGap(73).addComponent(btnCharityCaddy)))
				.addContainerGap(76, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(69)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGap(48)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnClassicCaddy)
								.addComponent(btnSmartCaddy).addComponent(btnCharityCaddy))
						.addContainerGap(47, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
