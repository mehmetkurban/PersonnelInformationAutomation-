package com.ulviyehocamizsençokyaþa;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Liste extends Pencere{
	JDialog dialog=new JDialog();
    public Liste(int sayi) {
    	if(sayi==0)
        initListe();
    }

    public void initListe() {
        dialog.setTitle("Liste");
        JPanel panel = initPanel();
        dialog.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);

        dialog.add(panel);
        dialog.setSize(400, 200);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    }
    public JPanel initPanel(){
        JPanel panel = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable listeJTable = new JTable(model);
        JScrollPane pane = new JScrollPane(listeJTable);

        model.addColumn("Adý");
        model.addColumn("Soyadý");
        model.addColumn("No");
        model.addColumn("Açýklama");
      
        String[] satir = new String[4];
            String[] isciDizisi = new String[4];
            
            for(Dto x:deyiskenler){        	
                isciDizisi[0]=x.getAd();
                isciDizisi[1]=x.getSoyAd();
                isciDizisi[2]=""+x.getNo();
                isciDizisi[3]=x.getAciklama();  
                model.addRow(isciDizisi);
             }
        panel.add(pane, BorderLayout.CENTER);

        return panel;
    } }

