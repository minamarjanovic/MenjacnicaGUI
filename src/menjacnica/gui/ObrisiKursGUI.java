package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovni;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednji;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceniNaziv;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private MenjacnicaGUI prozor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 319, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(20, 35, 76, 14);
		}
		return lblSifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 58, 102, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(182, 35, 76, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(170, 58, 102, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(20, 89, 76, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(10, 112, 102, 20);
		}
		return textFieldProdajni;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(182, 89, 76, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(170, 112, 102, 20);
		}
		return textFieldKupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(20, 150, 76, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 173, 102, 20);
		}
		return textFieldSrednji;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("SkraceniNaziv");
			lblSkraceniNaziv.setBounds(182, 150, 76, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setColumns(10);
			textFieldSkraceniNaziv.setBounds(170, 173, 102, 20);
		}
		return textFieldSkraceniNaziv;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						if (chckbxZaistaObrisiKurs.isSelected())
							btnObrisi.setEnabled(true);
						else
							btnObrisi.setEnabled(false);
					
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 209, 149, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String podaci = "Sifra: "+textFieldSifra.getText()+" naziv: "+textFieldNaziv.getText()+
							" prodajni kurs: "+textFieldProdajni.getText()+" kupovni kurs :"
							+textFieldKupovni.getText()+ " srednji kurs: "+textFieldSrednji.getText()+
							" skraceni naziv :"+textFieldSkraceniNaziv.getText();
							
					prozor.ubaciTekst(podaci);
					dispose();
				}
			});
			btnObrisi.setBounds(7, 238, 102, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(169, 238, 102, 23);
		}
		return btnOdustani;
	}
	
	
}
