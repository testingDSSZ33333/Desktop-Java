/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFE.GUI;

import static PFE.GUI.rech_cmd_clt1.AffichIdCmdClt;
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
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
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
public class rech_cmd_clt3 extends javax.swing.JFrame {

    /**
     * Creates new form rech_cmd_clt2
     */
    
    private  static  CmdClt  cmdclt=new CmdClt() ;
    private  static DefaultTableModel    mode;
    private  static Object[] row4_2 = new Object[6];
    private  static   int  tr=0;
    
        
    private  String    IdCmdClt;
    private  String    IdClt;
    private  double    AvanceCmdClt;
    private  String    Prop1CmdClt;
    private  String    Prop2CmdClt;
    private  String    DateCmdClt;
    private  String    PhotoCmdClt;
    
    
    
    public rech_cmd_clt3() {
        initComponents();
        mode=(DefaultTableModel)  tab.getModel();
       txt_idclt.setBorder(BorderFactory.createLineBorder(new Color(45,118,223)));
       tab.addMouseListener(new MouseAdapter() {
    
    
    
    
    
    
 @Override
 public void mousePressed(MouseEvent e) {

      
      
      
 
      try {
          
          
        int row = tab.getSelectedRow();
        int col = tab.getSelectedColumn();
        
             
        
        Runtime     rt=Runtime.getRuntime();

        String  url=mode.getValueAt(row, col).toString();
    
        
        
        
        
     
      if(!url.isEmpty()){
      
        rt.exec("rundll32 url.dll,FileProtocolHandler " +url);
      }
        
        
     
         
     }catch(IOException ex) {
     }
        
   
    

        
        
        
      }
    });

       tab.getColumn("Photo").setCellRenderer(new DefaultTableCellRenderer(){
   @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          DefaultTableCellRenderer r =(DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
          if (column==5) {
              r.setForeground(Color.BLACK);
              String a =getText();
              setText("<html><u>"+a+"</u></html>");
          }
          
          
          
          
          return r;
      }      
   });

 
 
 
 
 
 
 
 tab.addMouseMotionListener(new MouseAdapter() {
    public void mouseMoved(MouseEvent e) 
    {
        int cModel = tab.columnAtPoint(e.getPoint());
        int cView = tab.convertColumnIndexToView(cModel);
        if (cView == 5)
        {
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        }
        else
        {
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }
});
 
  
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_idclt = new javax.swing.JLabel();
        txt_idclt = new javax.swing.JTextField();
        Rechercher = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Fermer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        pdf = new javax.swing.JButton();
        excel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_idclt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_idclt.setText("Identifiant du client : ");
        getContentPane().add(lb_idclt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));
        getContentPane().add(txt_idclt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 300, 30));

        Rechercher.setText("Rechercher");
        Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherActionPerformed(evt);
            }
        });
        getContentPane().add(Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, 30));

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, 30));

        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 130, 30));

        Fermer.setText("Fermer");
        Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermerActionPerformed(evt);
            }
        });
        getContentPane().add(Fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 130, 30));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant Cmd", "Avance Clt", "Propriété 1", "Propriété 2", "Date", "Photo"
            }
        ));
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 180, 840, 190));

        pdf.setText("PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        getContentPane().add(pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 70, 30));

        excel.setText("EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        getContentPane().add(excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PFE/GUI/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 996, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
        // TODO add your handling code here:
            if(txt_idclt.getText().isEmpty()){txt_idclt.setBorder(BorderFactory.createLineBorder(Color.red));}
    if(!txt_idclt.getText().isEmpty()){txt_idclt.setBorder(BorderFactory.createLineBorder(new Color(45,118,223)));
    AffichCmdClt(txt_idclt.getText()); }
        
        
        
        
        
    }//GEN-LAST:event_RechercherActionPerformed

    private void FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermerActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_FermerActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed




       int i = tab.getSelectedRow();

        
                 
        
        
                if(i >= 0){
                    // remove a row from jtable

                    IdCmdClt=mode.getValueAt(i,0).toString();
                    AvanceCmdClt=Double.parseDouble(mode.getValueAt(i,1).toString());
                    Prop1CmdClt=mode.getValueAt(i,2).toString();
                    Prop2CmdClt=mode.getValueAt(i,3).toString();
                    DateCmdClt=mode.getValueAt(i,4).toString();
                    PhotoCmdClt=mode.getValueAt(i,5).toString();

            new ajout_modif_cmd_clt(1, IdCmdClt, txt_idclt.getText(), AvanceCmdClt, Prop1CmdClt, Prop2CmdClt, DateCmdClt, PhotoCmdClt,"rech_cmd_clt3").setVisible(true);
            
           
                   
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                   
                     
                     
                     
                     
                }
                
        
        
        
        
        
        
        
        
        
        
        
          
        
        
        
        
        













    }//GEN-LAST:event_ModifierActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        
        
        
             int i = tab.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable

                   String IdCmdClt=mode.getValueAt(i,0).toString();

                    JLabel message = new JLabel("Veuillez Supprimer Cette  Commande    ");
                    JLabel title = new JLabel("Message Information !");
                    UIManager.put("OptionPane.buttonFont",new Font("Times New Roman ",0,12));
                    message.setFont(new Font("Times New Roman", 0, 14));
                    title.setFont(new Font("Times New Roman", 0, 14));

                    if( JOptionPane.showConfirmDialog(null, message,title.getText(),JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){

                        cmdclt.SuppCmdClt(IdCmdClt);
                        AffichCmdClt(IdClt);
                    }

                }
               
    }//GEN-LAST:event_SupprimerActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed


        
            
   
       
       
       
       
       
       
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
  float fntSize;
  Clt  clt = new Clt();
     
   fntSize = 10.0f;
  Image   image=Image.getInstance("C:\\Users\\HP\\Desktop\\Documents\\NetBeansProjects\\Acceuil\\src\\main\\images\\logo_4.png");
  image.setWidthPercentage(100);
  image.setAlignment(Element.ALIGN_LEFT);
  document.add(image);

  Paragraph   p3 =  new Paragraph("\n\nIdentifiant Du Client  :   "+txt_idclt.getText(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
  p3.setAlignment(Element.ALIGN_LEFT);
  document.add(p3);

  
  
  Paragraph   p4 =  new Paragraph("Nom  Du Client :    "+clt.RechIdClt(txt_idclt.getText()).getNomClt(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
  p4.setAlignment(Element.ALIGN_LEFT);
  document.add(p4);
  
    document.add( Chunk.NEWLINE );

  Paragraph   p5 =  new Paragraph("   La Liste Des Commandes  Effectué Par Le Client     ", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14));
  p5.setAlignment(Element.ALIGN_CENTER);
  document.add(p5);
  PdfPTable table =  new PdfPTable(6);
  table.setWidthPercentage(105);
  table.setHorizontalAlignment(Element.ALIGN_BOTTOM);
  PdfPCell cel1;
  table.setWidths(new float[] { 87,87,87,87,87,87 });
  com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD, BaseColor.WHITE);
  com.itextpdf.text.Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize);

       
  
  
  
  cel1 = new PdfPCell(new Phrase(" Identifiant CmdClt ", font));
            cel1.setFixedHeight(20);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
            cel1 = new PdfPCell(new Phrase(" Avance CmdClt ", font));
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
            cel1 = new PdfPCell(new Phrase(" Propriété 1 CmdClt   ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
        
            
            cel1 = new PdfPCell(new Phrase(" Propriété 2 CmdClt   ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
            cel1 = new PdfPCell(new Phrase("Date CmdClt  ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
    
            cel1 = new PdfPCell(new Phrase("Photo CmdClt   ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
    
            
            
                   
              
              
    ArrayList <CmdClt>  list =cmdclt.RechCmdClt(txt_idclt.getText());
    
    
    
    
    
    
  
    for(CmdClt  cmdclt :list){
        
        
            
     cel1 = new PdfPCell(new Phrase(cmdclt.getIdCmdClt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      
      
      cel1 = new PdfPCell(new Phrase(cmdclt.getAvanceCmdClt()+"", font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      cel1 = new PdfPCell(new Phrase(cmdclt.getProp1CmdClt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      
     cel1 = new PdfPCell(new Phrase(cmdclt.getProp2CmdClt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      cel1 = new PdfPCell(new Phrase(cmdclt.getDateCmdClt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
 
            
            
            
      if(!cmdclt.getTelecharger().equals("")){
      
           
  com.itextpdf.text.Image   images=com.itextpdf.text.Image.getInstance(cmdclt.getTelecharger());
  PdfPCell cell = new PdfPCell(images, true);




            cell.setFixedHeight(40);
            cel1.setBorder(2);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
            cell.setRotation(180);

            cell.setNoWrap(true);
            cell.setPadding(38f);
            table.addCell(cell);
     }else{
    PdfPCell cell = new PdfPCell();




            cell.setFixedHeight(40);
            cel1.setBorder(2);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            cell.setVerticalAlignment(com.itextpdf.text.Element.ALIGN_MIDDLE);
            cell.setRotation(180);

            cell.setNoWrap(true);
            cell.setPadding(38f);
            table.addCell(cell);
  }  
             
           
            
            
          
    }
   
             
              
                   
              
              
              
              
              
              
              
                 
            
         
                   
   JOptionPane.showMessageDialog(null, "PDF a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

   
   
   
   
    document.add( new Phrase("\n") );
    document.add(table);
    document.add( Chunk.NEWLINE );

 SimpleDateFormat simpleFormatter = new SimpleDateFormat("         dd/MM/yyyy  hh:mm:ss");
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
   times2.setWrap(true);
   
   times2.setAlignment(Alignment.CENTRE);
   times2.setVerticalAlignment(VerticalAlignment.CENTRE);
   WritableCellFormat cellFormat = new WritableCellFormat(times);
   cellFormat.setBackground(Colour.YELLOW);
   cellFormat.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN);
   // Lets automatically wrap the cells
   // Create create a bold font with unterlines
   WritableFont times10ptBoldUnderline = new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD, false,
   UnderlineStyle.SINGLE);
   // Lets automatically wrap the cells

  Label label;
   Clt clt = new Clt();
   label = new Label(2, 0, "           Stock  Super Marché  ", new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 16, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  
    label = new Label(0, 1, "Identifiant Du Client  :   "+txt_idclt.getText(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  
   label = new Label(0, 2, "Date Du Facture  :     "+clt.RechIdClt(txt_idclt.getText()).getNomClt(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  








   label = new Label(2, 3, "La Liste Des  Commandes  Effectué Par Le Client ", new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 14, WritableFont.BOLD)));
   writablesheet1.addCell(label);
    
   


   
   
   
   
   writablesheet1.setRowView(5, 26*24);
   
   
   writablesheet1.setColumnView(1,35);
   Label label1 = new Label(1,5,"Identifiant CmdClt",cellFormat);
   writablesheet1.setColumnView(2, 35);
   Label label2 = new Label(2,5,"Avance CmdClt",cellFormat);
   writablesheet1.setColumnView(3, 35);
   Label label3 = new Label(3,5," Propriété 1 CmdClt   ",cellFormat);
   writablesheet1.setColumnView(4, 35);
   Label label4 = new Label(4,5," Propriété 2 CmdClt    ",cellFormat);
   writablesheet1.setColumnView(5, 35);
   Label label5 = new Label(5,5,"Date CmdClt ",cellFormat);
   
   writablesheet1.setColumnView(6, 35);
   Label label6 = new Label(6,5,"Photo  CmdClt ",cellFormat);
     
   
   
     
   
   
    
   
   
  
    writablesheet1.addCell(label1);
    writablesheet1.addCell(label2);
    writablesheet1.addCell(label3);
    writablesheet1.addCell(label4);
    writablesheet1.addCell(label5);
    writablesheet1.addCell(label6);
    
    
    
    
    
    
    
     ArrayList   <CmdClt> list =cmdclt.RechCmdClt(txt_idclt.getText());


    for(CmdClt   cmdClt :  list){        

        
     writablesheet1.setColumnView(0,30); 
     writablesheet1.addCell(new Label(1,rows,cmdClt.getIdCmdClt(),times2));
     
     writablesheet1.setColumnView(1,30);
     writablesheet1.addCell(new Label(2,rows,cmdClt.getAvanceCmdClt()+"",times2));
     
     
     
     
     writablesheet1.setColumnView(2,30);
     writablesheet1.addCell(new Label(3,rows,cmdClt.getProp1CmdClt(),times2));        
    
     
       
     
     writablesheet1.setColumnView(4,30);
     writablesheet1.addCell(new Label(4,rows,cmdClt.getProp2CmdClt()+"",times2));        
     
     writablesheet1.setColumnView(5,30);
     writablesheet1.addCell(new Label(5,rows,cmdClt.getDateCmdClt(),times2));        
     
     writablesheet1.setColumnView(6,30);
     writablesheet1.addCell(new Label(6,rows,cmdClt.getTelecharger(),times2));        
     
                
        
        
      rows++;  
        
        
        
        
    }            
              
          
    
   
    
         JOptionPane.showMessageDialog(null, "Excel a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    workbook.write();
    workbook.close();
    
}}  
    
catch (WriteException e) {
    JOptionPane.showMessageDialog(null, e);}
catch (IOException ex) {}        
                         
                 
                 
                 
           }      
                 
                 
                 
                 




    }//GEN-LAST:event_excelActionPerformed

    /**
     * @param IdClt the command line arguments
     */
    
    
    
    
    
        public  static  void AffichCmdClt (String IdClt){
       
       
       
    if(tr==0){  
      
      if(cmdclt.RechCmdClt(IdClt)!=null){
  
 
  ArrayList <CmdClt>  list=cmdclt.RechCmdClt(IdClt);
  
 
    for(CmdClt   cmdclt : list){
     
        
     row4_2[0]=cmdclt.getIdCmdClt();
     row4_2[1]=cmdclt.getAvanceCmdClt();
     row4_2[2]=cmdclt.getProp1CmdClt();
     row4_2[3]=cmdclt.getProp2CmdClt();
     row4_2[4]=cmdclt.getDateCmdClt();
     row4_2[5]=cmdclt.getTelecharger();
     
     
     mode.addRow(row4_2);   
        
        
        
   
        }           
                  
          
          
          
          
          
          
   

            
     }else{
          
        mode.setRowCount(0);
    
    
     JLabel message = new JLabel("IdClt  inexistant ");
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
        AffichCmdClt(IdClt);
  
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
            java.util.logging.Logger.getLogger(rech_cmd_clt3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rech_cmd_clt3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rech_cmd_clt3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rech_cmd_clt3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rech_cmd_clt3().setVisible(true);
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
    private javax.swing.JLabel lb_idclt;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txt_idclt;
    // End of variables declaration//GEN-END:variables
}
