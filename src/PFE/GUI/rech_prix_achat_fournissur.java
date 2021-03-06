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
import jxl.format.UnderlineStyle;
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
public class rech_prix_achat_fournissur extends javax.swing.JFrame {

    /**
     * Creates new form rech_prix_achat_fournissur
     */
    
    private DefaultTableModel   model ;
    private FactFrPdt  factfrpdt = new FactFrPdt();
     private    Object[] row3_2 = new Object[1];
     private  int  tr=0;
    public rech_prix_achat_fournissur() {
        initComponents();
        model=(DefaultTableModel)  tab.getModel();

       JTableHeader   header = tab.getTableHeader();
        header.setForeground(new Color(0,0,0));
        tab.setFont(new Font("Times New Roman",0,15));
        tab.setRowHeight(18);
        header.setFont(new Font("Times New Roman",0, 16));
        header.setBackground(Color.white);
         txt_lb_idpdt_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));
         txt_lb_idfr_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));
        
         this.setSize(900,580);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_idfr_btn3_2 = new javax.swing.JLabel();
        lb_idpdt_btn3_2 = new javax.swing.JLabel();
        txt_lb_idfr_btn3_2 = new javax.swing.JTextField();
        txt_lb_idpdt_btn3_2 = new javax.swing.JTextField();
        Rechercher_btn3_2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        pdf = new javax.swing.JButton();
        excel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lb_idfr_btn3_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_idfr_btn3_2.setText("Identifiant du fournisseur : ");
        getContentPane().add(lb_idfr_btn3_2);
        lb_idfr_btn3_2.setBounds(110, 37, 164, 30);

        lb_idpdt_btn3_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_idpdt_btn3_2.setText("Identifiant du produit : ");
        getContentPane().add(lb_idpdt_btn3_2);
        lb_idpdt_btn3_2.setBounds(110, 100, 141, 30);
        getContentPane().add(txt_lb_idfr_btn3_2);
        txt_lb_idfr_btn3_2.setBounds(310, 40, 310, 30);
        getContentPane().add(txt_lb_idpdt_btn3_2);
        txt_lb_idpdt_btn3_2.setBounds(310, 100, 310, 30);

        Rechercher_btn3_2.setText("Rechercher");
        Rechercher_btn3_2.setAutoscrolls(true);
        Rechercher_btn3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rechercher_btn3_2ActionPerformed(evt);
            }
        });
        getContentPane().add(Rechercher_btn3_2);
        Rechercher_btn3_2.setBounds(310, 150, 110, 30);

        jPanel1.setBackground(new java.awt.Color(209, 209, 243));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 410, 130, 30);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                   Prix d'achat"
            }
        ));
        jScrollPane2.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setMinWidth(300);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 250, 370, 150);

        pdf.setText("PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        jPanel1.add(pdf);
        pdf.setBounds(720, 260, 80, 30);

        excel.setText("EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        jPanel1.add(excel);
        excel.setBounds(720, 310, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        // TODO add your handling code here:

        if(model.getRowCount()>=1){
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
                    int  rows =7;
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
                        WritableFont.TIMES, 13, WritableFont.BOLD, false,
                        UnderlineStyle.NO_UNDERLINE);
                    WritableCellFormat	timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
                    // Lets automatically wrap the cells

                    Label label;
                    Produit  pdt  = new Produit();
                    Fournisseur  fr = new Fournisseur();
                    label = new Label(2, 0, "           Stock  Super Marché  ", new WritableCellFormat(new WritableFont(
                        WritableFont.TIMES, 16, WritableFont.BOLD)));
            writablesheet1.addCell(label);

            label = new Label(0, 1, "  Identifiant  Fournisseur  :  "+txt_lb_idfr_btn3_2.getText(), new WritableCellFormat(new WritableFont(
                WritableFont.TIMES, 12, WritableFont.BOLD)));
    writablesheet1.addCell(label);

    label = new Label(0, 2, "  Identifiant  Produit :   "+txt_lb_idpdt_btn3_2.getText(), new WritableCellFormat(new WritableFont(
        WritableFont.TIMES, 12, WritableFont.BOLD)));
        writablesheet1.addCell(label);

        label = new Label(1, 4,"Les Prix d'achat Du Produit "+pdt.RechIdPdt(txt_lb_idpdt_btn3_2.getText()).getDesigPdt()+" Auprés  Du Fournisseur "+fr.RechIdFr(txt_lb_idfr_btn3_2.getText()).getNomFr(),new WritableCellFormat(new WritableFont(
            WritableFont.TIMES, 14, WritableFont.BOLD)));
writablesheet1.addCell(label);

writablesheet1.setRowView(6, 30*24);
writablesheet1.setColumnView(2,50);
Label label1 = new Label(2,6,"Prix  D'achat",cellFormat);
writablesheet1.addCell(label1);

ArrayList<Double>  list=factfrpdt.RechPrxAchatPdtFr(txt_lb_idpdt_btn3_2.getText(), txt_lb_idfr_btn3_2.getText());
for(Double    prix :  list){

    writablesheet1.setColumnView(0,40);
    writablesheet1.addCell(new Label(2,rows,prix+"",times2));

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

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:

        if(model.getRowCount()>=1){
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
                fntSize = 10.0f;
                lineSpacing = 20.8f;
                Produit  pdt  = new Produit();
                Image   image=Image.getInstance("C:\\Users\\HP\\Desktop\\Documents\\NetBeansProjects\\Acceuil\\src\\main\\images\\logo_4.png");
                image.setWidthPercentage(100);
                image.setAlignment(Element.ALIGN_LEFT);
                document.add(image);

                Paragraph   p1 =  new Paragraph("\n\nIdentifiant Fournisseur :   "+txt_lb_idfr_btn3_2.getText()+"                                            "
                    +"                              Identifiant Produit  : "+txt_lb_idpdt_btn3_2.getText(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
                p1.setAlignment(Element.ALIGN_LEFT);
                document.add(p1);

                document.add( Chunk.NEWLINE );

                Paragraph   p5 =  new Paragraph("     Les Prix D'achat auprés D'un Produit  ", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14));
                p5.setAlignment(Element.ALIGN_CENTER);
                document.add(p5);

                PdfPTable table =  new PdfPTable(1);

                table.setWidthPercentage(50);
                table.setHorizontalAlignment(Element.ALIGN_CENTER);

                PdfPCell cel1;
                table.setWidths(new float[] { 262 });
                com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD, BaseColor.WHITE);
                com.itextpdf.text.Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize);

                cel1 = new PdfPCell(new Phrase("Les   Prix D'achat ", font));
                cel1.setFixedHeight(20);
                cel1.setBackgroundColor(BaseColor.GRAY);
                cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cel1);

                ArrayList<Double>  list=factfrpdt.RechPrxAchatPdtFr(txt_lb_idpdt_btn3_2.getText(), txt_lb_idfr_btn3_2.getText());
                for(Double    prix :  list){

                    cel1 = new PdfPCell(new Phrase(prix+"", font2));
                    cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cel1);

                }

                JOptionPane.showMessageDialog(null, "PDF a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);

                document.add( new Phrase("\n") );
                document.add(table);
                document.add( Chunk.NEWLINE );

                SimpleDateFormat simpleFormatter = new SimpleDateFormat("      dd/MM/yyyy  hh:mm:ss  ");
                String date=simpleFormatter.format(new Date());
                Paragraph  p2 = new Paragraph(date,FontFactory.getFont(FontFactory.TIMES_ROMAN,12));
                p2.setAlignment(Element.ALIGN_RIGHT);
                document.add(p2);

                document.close();

            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_pdfActionPerformed

    private void Rechercher_btn3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rechercher_btn3_2ActionPerformed
        // TODO add your handling code here:

        if(txt_lb_idfr_btn3_2.getText().isEmpty() ){txt_lb_idfr_btn3_2.setBorder(BorderFactory.createLineBorder(Color.RED));}
        if(txt_lb_idpdt_btn3_2.getText().isEmpty() ){txt_lb_idpdt_btn3_2.setBorder(BorderFactory.createLineBorder(Color.RED));}
        if(!txt_lb_idfr_btn3_2.getText().isEmpty() ){ txt_lb_idfr_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));}
        if(!txt_lb_idpdt_btn3_2.getText().isEmpty() ){ txt_lb_idpdt_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));}

        if(!txt_lb_idfr_btn3_2.getText().isEmpty() && !txt_lb_idpdt_btn3_2.getText().isEmpty() ){
            txt_lb_idfr_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));
            txt_lb_idpdt_btn3_2.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));

            AffichPrxAchatPdtFr(txt_lb_idpdt_btn3_2.getText(), txt_lb_idfr_btn3_2.getText());}

    }//GEN-LAST:event_Rechercher_btn3_2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param IdPdt the command line arguments
     * @param IdFr the command line arguments
     */
    
    
    
    
    
    
    
           public  void AffichPrxAchatPdtFr (String IdPdt, String IdFr) {
  
             
    if(tr==0){  
      
      if(factfrpdt.RechPrxAchatPdtFr (IdPdt,IdFr)!=null){
       ArrayList<Double>   l = factfrpdt.RechPrxAchatPdtFr (IdPdt,IdFr);
          
for(Double  prix :  l){
 
    row3_2[0]=prix;
    
   model.addRow(row3_2);
     
       
       
      }
          
          
          
          
 
   

            
     }else{
          
    model.setRowCount(0);
    
    
     JLabel message = new JLabel("  IdPdt et IdFr inexistants ");
     JLabel title = new JLabel("Message Information !");
     UIManager.put("OptionPane.okButtonText", " Oui");
     UIManager.put("OptionPane.buttonFont", new Font("Times New Roman ",0,12)); 
     JOptionPane.showMessageDialog(null, message,title.getText(),JOptionPane.INFORMATION_MESSAGE);
          
      }
      tr=1;    
     return ;
           
 

            
            
            
        }else if(tr==1){
        tr=0;
        model.setRowCount(0);
       AffichPrxAchatPdtFr(IdPdt,IdFr)  ; 
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
            java.util.logging.Logger.getLogger(rech_prix_achat_fournissur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rech_prix_achat_fournissur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rech_prix_achat_fournissur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rech_prix_achat_fournissur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rech_prix_achat_fournissur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rechercher_btn3_2;
    private javax.swing.JButton excel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_idfr_btn3_2;
    private javax.swing.JLabel lb_idpdt_btn3_2;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txt_lb_idfr_btn3_2;
    private javax.swing.JTextField txt_lb_idpdt_btn3_2;
    // End of variables declaration//GEN-END:variables
}
