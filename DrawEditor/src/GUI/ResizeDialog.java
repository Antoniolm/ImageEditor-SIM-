/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import sm.ALM.graficos.Canvas2DPanel;

/**
 * That class will create a dialog to resize our internal window
 * @author Antonio David López Machado antoniolm@correo.ugr.es
 */
public class ResizeDialog extends javax.swing.JDialog {
    /**
     * The current internal window. It will have image type
     */
    private InternalWindowImage currentIntWind;
    
    /**
     * 
     * Describe if the user push or not the confirm button
     */
    private boolean accepted;
    
    /**
     * Constructor for our ResizeDialog
     * @param parent
     * @param modal 
     * @param IntWind 
     */
    public ResizeDialog(java.awt.Frame parent, boolean modal,InternalWindowImage IntWind) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);       
        currentIntWind=IntWind;
        accepted=false;
        if(currentIntWind!=null){
            WidthField.setText(((int)currentIntWind.getCanvas().getWidthImage())+"");
            HeightField.setText(((int)currentIntWind.getCanvas().getHeightImage())+"");
        }
        else{
            WidthField.setText("300");
            HeightField.setText("300");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        WidthLabel = new javax.swing.JLabel();
        WidthField = new javax.swing.JTextField();
        HeightLabel = new javax.swing.JLabel();
        HeightField = new javax.swing.JTextField();

        setTitle("Resize image");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(SaveButton);

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(CancelButton);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.SOUTH);
        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);
        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);
        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        WidthLabel.setText("Width :");
        jPanel3.add(WidthLabel);
        jPanel3.add(WidthField);

        HeightLabel.setText("Height :");
        jPanel3.add(HeightLabel);
        jPanel3.add(HeightField);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        Canvas2DPanel.setSizeImage(Integer.parseInt(WidthField.getText()), Integer.parseInt(HeightField.getText()));
        if(currentIntWind!=null){
            currentIntWind.getCanvas().setClip(new Rectangle2D.Float(1,1,Canvas2DPanel.getWidthImage()-1,Canvas2DPanel.getHeightImage()-1));
            currentIntWind.getCanvas().ChangeSizeImage();
            currentIntWind.repaint();
        }
        accepted=true;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    /**
     * it return if the user push the confirm button or he didn't do
     * @return 
     */
    public boolean isAccepted(){
        return accepted;
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField HeightField;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField WidthField;
    private javax.swing.JLabel WidthLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
