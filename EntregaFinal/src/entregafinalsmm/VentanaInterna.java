/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package entregafinalsmm;

import java.awt.Color;

/**
 *
 * @author carlos
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaInterna
     */
     public VentanaInterna() {
        initComponents();
    }

     public void setTool(Tool t){
        lienzo2D1.setTool(t);
    }
    
    public Tool getTool(){
        return lienzo2D1.getTool();
    }
    
    public void setColor(Color c){
        lienzo2D1.setColor(c);
        System.out.println("Cambio color efectuado en VI");
    }
    
    public Color getColor(){
        return lienzo2D1.getColor();
    }
    
    public void setRelleno(boolean r){
        lienzo2D1.setRelleno(r);
    }
    
    public boolean getRelleno(){
        return lienzo2D1.getRelleno();
    }
    
    public void setStroke(float grosor){
        lienzo2D1.setStroke(grosor);
    }
    
    public void setTransparencia(boolean t){
        lienzo2D1.setTransparencia(t);
    }
    
    public boolean getTransparencia(){
        return lienzo2D1.getTransparencia();
    }
    
    public void setSuavizado(boolean s){
        lienzo2D1.setSuavizado(s);
    }
    
    public boolean getSuavizado(){
        return lienzo2D1.getSuavizado();
    }
    
    public void setMover(boolean m){
        lienzo2D1.setMover(m);
    }
    
    public boolean getMover(){
        return lienzo2D1.getMover();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo2D1 = new entregafinalsmm.Lienzo2D();

        getContentPane().setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout lienzo2D1Layout = new javax.swing.GroupLayout(lienzo2D1);
        lienzo2D1.setLayout(lienzo2D1Layout);
        lienzo2D1Layout.setHorizontalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        lienzo2D1Layout.setVerticalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo2D1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private entregafinalsmm.Lienzo2D lienzo2D1;
    // End of variables declaration//GEN-END:variables
}
