package com.ulviyehocamizsençokyaþa;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.parsers.FactoryConfigurationError;
import java.util.ArrayList;
public class KategoriEkle extends Liste {
	
    public KategoriEkle(int sayi) {
		super(sayi);
		
	}

	protected KategoriEkle tcField;
  
    public void kategori(){
        JFrame KategoriPencere = new JFrame("Kategori Ekle");
        JPanel katJPanel = new JPanel();
        
        katJPanel.setBorder(BorderFactory.createTitledBorder("Kategori Ekle"));
        JPanel ekleJPanel = new JPanel(new GridLayout(2,1,3,3));
        ekleJPanel.setBorder(BorderFactory.createTitledBorder("Kayýt"));
        
        JLabel katAdiJLabel = new JLabel("Kategori Adý:",JLabel.RIGHT);
        final JTextField kat_adiField = new JTextField(15);
        JButton kat_ekleButton = new JButton("Ekle");
        
        katJPanel.add(katAdiJLabel);
        katJPanel.add(kat_adiField);
        katJPanel.add(kat_ekleButton);
        kat_ekleButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
               
                         
                                      String categoryyy=kat_adiField.getText();
                                      int i=0;
                                    categoryEkle[i]=categoryyy;                 
                    JOptionPane.showMessageDialog(null, "Kayýt Baþarýlý");
               i++;
        }
        });
          
        
        KategoriPencere.add(katJPanel);
        KategoriPencere.setVisible(true);
        KategoriPencere.setResizable(true);
        KategoriPencere.setSize(400, 100);
        KategoriPencere.setLocationRelativeTo(null);
        KategoriPencere.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        
    
    
  
    }}
    
