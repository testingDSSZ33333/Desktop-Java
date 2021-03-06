/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFE.GUI;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author MOHAMED
 */
public class rech_facture_in_pdt extends javax.swing.JFrame {

    /**
     * Creates new form rech_facture_in_pdt
     */
    
    private static FactFrPdt  factfrpdt = new FactFrPdt();
    private static DefaultTableModel    mode;
    private  static Object[] row1_2 = new Object[3];
    private static int  tr=0;
    public rech_facture_in_pdt() {
        
        initComponents();
        mode=(DefaultTableModel)  tab.getModel();
        JTableHeader   header = tab.getTableHeader();
        header.setForeground(new Color(0,0,0));
        tab.setFont(new Font("Times New Roman",0,15));
        tab.setRowHeight(18);
        header.setFont(new Font("Times New Roman",0, 16));
        header.setBackground(Color.white);
         txt_lb_idpdt_btn1_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_idpdt_btn1_2 = new javax.swing.JLabel();
        txt_lb_idpdt_btn1_2 = new javax.swing.JTextField();
        Rechercher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        pdf = new javax.swing.JButton();
        excel = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Fermer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_idpdt_btn1_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_idpdt_btn1_2.setText("Identifiant du produit : ");
        getContentPane().add(lb_idpdt_btn1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 20, 180, 40));
        getContentPane().add(txt_lb_idpdt_btn1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 350, 30));

        Rechercher.setText("Rechercher");
        Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherActionPerformed(evt);
            }
        });
        getContentPane().add(Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, 30));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                                 Identifiant de la facture"
            }
        ));
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 560, 180));

        pdf.setText("PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        getContentPane().add(pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 70, 30));

        excel.setText("EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        getContentPane().add(excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 70, 30));

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, 30));

        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 100, 30));

        Fermer.setText("Fermer");
        Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermerActionPerformed(evt);
            }
        });
        getContentPane().add(Fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PFE/GUI/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 515));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_FermerActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed


                // i = the index of the selected row
                int i = tab.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable

                  String   IdFactFr=mode.getValueAt(i,0).toString();
                  
                
 
                     FactFrPdt    factfrpdte =factfrpdt.RechIdPdtIdFactFr(IdFactFr, txt_lb_idpdt_btn1_2.getText());
                                         
                     
                     new ajout_modif_produit_in_facture(1, IdFactFr,factfrpdte.getIdPdt(), factfrpdte.getQteAchatPdt(),factfrpdte.getPrxAchatPdt(),"rech_facture_in_pdt").setVisible(true);
                                       
                }



    }//GEN-LAST:event_ModifierActionPerformed

    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
   if(txt_lb_idpdt_btn1_2.getText().isEmpty() ){txt_lb_idpdt_btn1_2.setBorder(BorderFactory.createLineBorder(Color.RED));} 
                     
                     
                     
if(!txt_lb_idpdt_btn1_2.getText().isEmpty() ){
 txt_lb_idpdt_btn1_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));




    AffichPrxAchatPdt(txt_lb_idpdt_btn1_2.getText());





}      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_RechercherActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        
        
        
        
          int i = tab.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable


                    JLabel message = new JLabel("Veuillez Supprimer Cette Facture ?     ");
                    JLabel title = new JLabel("Message Information !");
                    UIManager.put("OptionPane.buttonFont",new Font("Times New Roman ",0,12));
                    message.setFont(new Font("Times New Roman", 0, 14));
                    title.setFont(new Font("Times New Roman", 0, 14));

                    if( JOptionPane.showConfirmDialog(null, message,title.getText(),JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){

   

                       factfrpdt.SuppFactFrPdt(mode.getValueAt(i, 0).toString(),txt_lb_idpdt_btn1_2.getText() );
                       mode.removeRow(i);

                    }

                }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_SupprimerActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:
        
                 
            
     if(mode.getRowCount()>=1){             
         try {
  Document document = new Document();
  
  
JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
fileChooser.showOpenDialog(null);
File selectedFile = fileChooser.getSelectedFile();
String  file=selectedFile.getAbsolutePath();
if(!selectedFile.getAbsolutePath().endsWith(".pdf")){
 file=selectedFile.getAbsolutePath()+".pdf";  
}
  
  
 
  PdfWriter.getInstance(document, new FileOutputStream(file));
  document.open();
   float fntSize, lineSpacing;
   fntSize = 8.7f;
  lineSpacing = 20.8f;
  Produit  pdt = new Produit();
  Image   image=Image.getInstance("C:\\Users\\HP\\Desktop\\Documents\\NetBeansProjects\\Acceuil\\src\\main\\images\\logo_4.png");
  image.setWidthPercentage(100);
  image.setAlignment(Element.ALIGN_LEFT);
  document.add(image);

  Paragraph   p1 =  new Paragraph("\n\nIdentifiant du Produit  :   "+txt_lb_idpdt_btn1_2.getText()+"                                                "
          + "                                          Designation  :   "+pdt.RechIdPdt(txt_lb_idpdt_btn1_2.getText()).getDesigPdt(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
  p1.setAlignment(Element.ALIGN_LEFT);
  document.add(p1);

 
  document.add( Chunk.NEWLINE );

  Paragraph   p5 =  new Paragraph("   La List Des  Factures Qui Contient  Le Poduit  ", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14));
  p5.setAlignment(Element.ALIGN_CENTER);
  document.add(p5);
          
    
  

  PdfPTable table =  new PdfPTable(1);
  
  table.setWidthPercentage(50);
  table.setHorizontalAlignment(Element.ALIGN_CENTER);
  PdfPCell cel1;
  table.setWidths(new float[] { 261});
  com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD, BaseColor.WHITE);
  com.itextpdf.text.Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize);

            cel1 = new PdfPCell(new Phrase("Identifiant  Facture ", font));
            cel1.setFixedHeight(20);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
    
    
            
ArrayList<FactFrPdt>  list =factfrpdt.RechIdPdtFrPdt (txt_lb_idpdt_btn1_2.getText());
 for( FactFrPdt   str :   list){   
        
        
       
            cel1 = new PdfPCell(new Phrase(str.getIdFactFr(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
     
      
      
      
       
    }
                   
          JOptionPane.showMessageDialog(null, "PDF a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);
        
            
            
            
            
            
            
            
            
            
        
   
   
   

   
   
   
   
    document.add( new Phrase("\n") );
    document.add(table);
    document.add( Chunk.NEWLINE );

 SimpleDateFormat simpleFormatter = new SimpleDateFormat("            dd/MM/yyyy  hh:mm:ss  ");
 String date=simpleFormatter.format(new Date());
 Paragraph  p2 = new Paragraph(date,FontFactory.getFont(FontFactory.TIMES_ROMAN,12));
 p2.setAlignment(Element.ALIGN_RIGHT);
 document.add(p2);

     
                    
                    
  
  
  
  
  
  
  
    document.close();

  
  
} catch (Exception e) {
}        
                 
                 
                 
     }              
            
    }//GEN-LAST:event_pdfActionPerformed

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        // TODO add your handling code here:
                
                 if(mode.getRowCount()>=1){
    try {

 File selectedFile=null;       
JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
fileChooser.showOpenDialog(null);
selectedFile = fileChooser.getSelectedFile();
if(selectedFile!=null){
    

 String  file=selectedFile.getAbsolutePath();
if(!selectedFile.getAbsolutePath().endsWith(".xls")){
 file=selectedFile.getAbsolutePath()+".xls";  
}
  
    WritableWorkbook workbook = Workbook.createWorkbook(new File(file));
    WritableSheet writablesheet1 = workbook.createSheet("Sheet1", 0);
    WritableFont times10pt = new WritableFont(WritableFont.TIMES, 12,WritableFont.BOLD);
    WritableFont times12pt = new WritableFont(WritableFont.TIMES, 11);
     int  rows =6;
   // Define the cell format
   WritableCellFormat  times = new WritableCellFormat(times10pt);
   WritableCellFormat  times2 = new WritableCellFormat(times12pt);
   times.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
   times2.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
   times.setBackground(Colour.WHITE);
   times.setAlignment(Alignment.CENTRE);
   times.setVerticalAlignment(VerticalAlignment.CENTRE);
   
    times2.setAlignment(Alignment.CENTRE);
    times2.setVerticalAlignment(VerticalAlignment.CENTRE);
   WritableCellFormat cellFormat = new WritableCellFormat(times);
   cellFormat.setBackground(Colour.YELLOW);
   cellFormat.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN);
   // Lets automatically wrap the cells
   // Create create a bold font with unterlines
   WritableFont times10ptBoldUnderline = new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD);
   WritableCellFormat	timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
   // Lets automatically wrap the cells
   Label label;
   Produit  pdt  = new Produit();
   label = new Label(2, 0, "       Stock  Super Marché  ", new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 16, WritableFont.BOLD)));
   writablesheet1.addCell(label);
   writablesheet1.setRowView(3, 30*24);
   writablesheet1.setColumnView(4,35);
   
   
   
   
   
   
   label = new Label(0, 1, " Identifiant Porduit  :       "+txt_lb_idpdt_btn1_2.getText(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
   writablesheet1.setRowView(3, 30*24);
   writablesheet1.setColumnView(4,35);
   
   
   
   label = new Label(0, 2, " Designation Porduit  :  "+pdt.RechIdPdt(txt_lb_idpdt_btn1_2.getText()).getDesigPdt(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
    
   writablesheet1.setColumnView(2,35);
   label = new Label(1, 3, "         La Liste  Des Factures Qui  Contient Le Produit ", timesBoldUnderline);
   writablesheet1.addCell(label);
    
   writablesheet1.setColumnView(4,35);
   Label label1 = new Label(2,5,"Identifiant De La  Facture",cellFormat);
  
   
   
   
    
    writablesheet1.addCell(label1);

    
        
        
  
          
 ArrayList<FactFrPdt>  list =factfrpdt.RechIdPdtFrPdt (txt_lb_idpdt_btn1_2.getText());
 for( FactFrPdt   str :   list){   
        
        
     writablesheet1.setColumnView(0,35); 
     writablesheet1.addCell(new Label(2,rows,str.getIdFactFr(),times2));
     
     
        
        
      rows++;  
        
        
        
        
    }
  
         JOptionPane.showMessageDialog(null, "Excel a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    workbook.write();
    workbook.close();
    
}}  
    
catch (WriteException e) {JOptionPane.showMessageDialog(null, e);}
catch (IOException ex) {}        
                         
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
             }
    }//GEN-LAST:event_excelActionPerformed

    /**
     * @param IdPdt the command line arguments
     */
    
           public static void AffichPrxAchatPdt (String IdPdt) {
      
           
    if(tr==0){  
      
      if(factfrpdt.RechIdPdtFrPdt(IdPdt)!=null){
  
          
    String   tab[][]=factfrpdt.RechPrxAchatPdt(IdPdt);      
     int  i;
     int  j;    
   for( i=0;i<tab.length;i++){
  
    for( j=0;j<3;j++){
          
     row1_2[j]=tab[i][j];  
       
       
       
       
      }    
   
    mode.addRow(row1_2);
    
       
       
      }
          
          
          
          
          
 
   

            
     }else{
          
    mode.setRowCount(0);
    
    
     JLabel message = new JLabel("IdPdt est inexistant ");
     JLabel title = new JLabel("Message Information !");
     UIManager.put("OptionPane.okButtonText", " Oui");
     UIManager.put("OptionPane.buttonFont", new Font("Times New Roman ",0,12)); 
     JOptionPane.showMessageDialog(null, message,title.getText(),JOptionPane.INFORMATION_MESSAGE);
          
      }
      tr=1;    
     return ;
           
 

            
            
            
        }else if(tr==1){
        tr=0;
        mode.setRowCount(0);
        AffichPrxAchatPdt(IdPdt);
  
 }      
       
       
       
   }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rech_facture_in_pdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rech_facture_in_pdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rech_facture_in_pdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rech_facture_in_pdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rech_facture_in_pdt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fermer;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Rechercher;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton excel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_idpdt_btn1_2;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txt_lb_idpdt_btn1_2;
    // End of variables declaration//GEN-END:variables
}
