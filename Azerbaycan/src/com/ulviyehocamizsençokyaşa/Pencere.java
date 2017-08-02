package com.ulviyehocamizsen�okya�a;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale.Category;

import javax.security.auth.Refreshable;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pencere {
    
    
    static ArrayList<Dto> deyiskenler=new ArrayList<Dto>();
    static String[] categoryEkle=new String[100];
    public void hazirla(){
        JFrame anaPencere = new JFrame("CIA SABIKALILAR OTOMASYONU");
        JMenuBar bar = new JMenuBar();
        
        
        JMenu dosyaJMenu = new JMenu("Dosya");
        JMenuItem kaydetItem = new JMenuItem("Kaydet");
        dosyaJMenu.add(kaydetItem);
        
        
        
        JMenuItem silItem = new JMenuItem("Sil");
        dosyaJMenu.add(silItem);
        dosyaJMenu.addSeparator();
        JMenuItem cikisItem = new JMenuItem("��k��");
        dosyaJMenu.add(cikisItem);
        
        
       
        
        
        JMenu kayitJMenu = new JMenu("Kay�t");
        
        JMenuItem listeItem = new JMenuItem("Liste");
        JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
        kayitJMenu.add(kategoriEkleItem);
        kategoriEkleItem.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent arg0) {
                KategoriEkle kat  = new KategoriEkle(1);
                kat.kategori();
                
            }
        });
       
        kayitJMenu.add(listeItem);
        
        
        JPanel anaJPanel = new JPanel();
        
        anaJPanel.setBorder(BorderFactory.createTitledBorder("CIA Sab�kal�lar Paneli"));
        
        JPanel kayitPanel =new JPanel(new GridLayout(11,5,1,1));
        
        kayitPanel.setBorder(BorderFactory.createTitledBorder("Sab�ka Kay�t"));
        
                
        JLabel adiJLabel = new JLabel("Ad�: ",JLabel.RIGHT);
        kayitPanel.add(adiJLabel);
        
        final JTextField adiField = new JTextField(15);

        kayitPanel.add(adiField);
        JLabel soyadiJLabel = new JLabel("Soyad�: ",JLabel.RIGHT);
        kayitPanel.add(soyadiJLabel);
        final JTextField soyadiField = new JTextField(15);
        kayitPanel.add(soyadiField);
        JLabel imeinoLabel = new JLabel(" No: ",JLabel.RIGHT);
        kayitPanel.add(imeinoLabel);
        final JTextField imeinoField = new JTextField(15);
        kayitPanel.add(imeinoField);
        JLabel uruNo = new JLabel("D�� G�r�n��: ",JLabel.RIGHT);
        kayitPanel.add(uruNo);
        final JTextField uruNoField = new JTextField(15);
        kayitPanel.add(uruNoField);
        JLabel adresLabel = new JLabel("Enselendi�i Adres: ",JLabel.RIGHT);
        kayitPanel.add(adresLabel);
        final JTextField adresField = new JTextField(15);
        kayitPanel.add(adresField);
        JLabel irtibatLabel = new JLabel(" Yerel No: ",JLabel.RIGHT);
        kayitPanel.add(irtibatLabel);
        final JTextField irtibatField = new JTextField(15);
        kayitPanel.add(irtibatField);
        
        JLabel a��klamaLabel = new JLabel(" A��klama: ",JLabel.RIGHT);
        kayitPanel.add(a��klamaLabel);
        final JTextField a��klamaField = new JTextField(15);
        kayitPanel.add(a��klamaField);
        
        JLabel kategoriJLabel = new JLabel("Su� Kategorisi: ", JLabel.RIGHT);
        kayitPanel.add(kategoriJLabel); 
  
         
         JComboBox kategoriBox = new JComboBox();
          kayitPanel.add(kategoriBox);
        JButton yenileButton = new JButton("Yenile");
        kayitPanel.add(yenileButton);
        yenileButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
			 kategoriBox.addItem(categoryEkle[i]);
				i++;
				
			}
		});
      
       
        
        
        
        
        
        JButton kayitButton = new JButton("Kaydet");
        kayitPanel.add(kayitButton);
        JButton silButton = new JButton("Sil");
        kayitPanel.add(silButton);
       
        
        silButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame KategoriPencere = new JFrame("Silme");
                JPanel katJPanel = new JPanel();
                
                katJPanel.setBorder(BorderFactory.createTitledBorder("Silme"));
                JPanel ekleJPanel = new JPanel(new GridLayout(2,1,3,3));
                ekleJPanel.setBorder(BorderFactory.createTitledBorder("Sil"));
                
                JLabel katAdiJLabel = new JLabel("Numaras�:",JLabel.RIGHT);
                final JTextField kat_adiField = new JTextField(15);
                JButton kat_ekleButton = new JButton("Sil");
                
                katJPanel.add(katAdiJLabel);
                katJPanel.add(kat_adiField);
                katJPanel.add(kat_ekleButton);
                kat_ekleButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                		   String noo=kat_adiField.getText();
                	       int no=Integer.parseInt(noo);
                	       int say=0;
                       for(Dto x:deyiskenler){
                    	   if(x.getNo()==no){
                    		   deyiskenler.remove(say);
                    		   JOptionPane.showMessageDialog(null,"silindi");
                    	   } else{
                    		   JOptionPane.showMessageDialog(null,"B�yle Bir Numara Yok.");
                    	   } 
                    	   say++;
                       }
                       
                                 
                     
                }
                });
                  
                
                KategoriPencere.add(katJPanel);
                KategoriPencere.setVisible(true);
                KategoriPencere.setResizable(true);
                KategoriPencere.setSize(400, 100);
                KategoriPencere.setLocationRelativeTo(null);
                KategoriPencere.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

               
         
                
            }
        });
        
        
        kayitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	int imei=Integer.parseInt(imeinoField.getText());
            	int irtibat=Integer.parseInt(irtibatField.getText());
            	
            	deyiskenler.add(new Dto(imei,irtibat,adiField.getText(),soyadiField.getText(),uruNoField.getText(),adresField.getText(),a��klamaField.getText(),""));
      
                    JOptionPane.showMessageDialog(null, "Kay�t Ba�ar�l�");
                
            }});
        JButton iptalButton = new JButton("��k��");
        kayitPanel.add(iptalButton);
        
        
    iptalButton.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
        
            int secim;
            secim = JOptionPane.showConfirmDialog(null,"Programdan ��k�ls�n m�?");
        if(secim==0)
            System.exit(0);
        }
        
    });
        
        cikisItem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                int secim;
                secim = JOptionPane.showConfirmDialog(null, "Ger�ekten ��k�ls�n m� ?");
                
                
                if(secim==0){
                   System.exit(0);
                }
            }
        });
        
  
        listeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                new Liste(0);
            }
        });

        anaJPanel.add(kayitPanel);
        bar.add(dosyaJMenu);
       
        bar.add(kayitJMenu);
        
        anaPencere.add(anaJPanel);
        anaPencere.setJMenuBar(bar);
        anaPencere.setSize(500,500);
        anaPencere.setLocationRelativeTo(null);
        anaPencere.setVisible(true);
        anaPencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } }
