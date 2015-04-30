package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textField;
	private JLabel lblValuta;
	private JComboBox comboBoxValuta;
	private JLabel lblProdajniKurs;
	private JTextField textField_1;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JSlider slider;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBoxValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_1());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getSlider());
		
		
		
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(20, 28, 77, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 49, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(119, 28, 46, 14);
		}
		return lblValuta;
	}
	private JComboBox getComboBoxValuta() {
		if (comboBoxValuta == null) {
			comboBoxValuta = new JComboBox();
			comboBoxValuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBoxValuta.setBounds(119, 49, 63, 20);
		}
		return comboBoxValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(215, 28, 90, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(205, 49, 86, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(20, 97, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(10, 122, 144, 20);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(185, 97, 120, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setSelected(true);
			rdbtnKupovina.setBounds(207, 121, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(207, 147, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String selectedBtnTxt = null;
						if(getRdbtnKupovina().isSelected())
							selectedBtnTxt = rdbtnKupovina.getText();
						else 
							selectedBtnTxt = rdbtnProdaja.getText();
						
						String podaci = "Valuta: "+getComboBoxValuta().getSelectedItem()+" iznos: "+textFieldIznos.getText()+" vrsta transakcije: "+selectedBtnTxt;
								MenjacnicaGUI.ubaciTekst(podaci);
								
								dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			btnIzvrsiZamenu.setBounds(20, 227, 134, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(205, 227, 134, 23);
		}
		return btnOdustani;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText(""+slider.getValue());
					
				}
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(24, 171, 316, 45);
		}
		return slider;
	}
}
