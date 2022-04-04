/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sql.projet;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author DerSon
 */
public class View_list_etudiant extends javax.swing.JPanel {

    Color color1 = new Color(130, 136, 155);

    /**
     * Creates new form view_list_etudiant
     */
    public View_list_etudiant() {
        initComponents();

        addEtudiant(BddHelper.selectallEtudiant());

    }

    public void addEtudiant(Etudiant[] etulist) {
        Object[][] listobj = new Object[etulist.length][7];
        for (int i = 0; i < etulist.length; i++) {
            Etudiant etu = etulist[i];
            listobj[i][0] = i + 1;
            listobj[i][1] = etu.getMatricule();
            listobj[i][2] = etu.getNom();
            listobj[i][3] = etu.getPrenom();
            listobj[i][4] = etu.getTelephone();
            listobj[i][5] = etu.getSexe();
            listobj[i][6] = etu.getDatenaiss();
        }
        table.setModel(
                new javax.swing.table.DefaultTableModel(
                        listobj,
                        new String[]{
                            "N°",
                            "Matricule", "Nom", "Prénom", "Téléphone", "Sexe", "Date de naissance"
                        }
                ));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 7; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
public Component prepareRenderer(TableCellRenderer renderer, 
         int row, int column) 
         {
            Component c = super.prepareRenderer(renderer, row, column);

            Color color2 = Color.WHITE;
            if(!c.getBackground().equals(getSelectionBackground())) {
               Color coleur = (row % 2 == 0 ? color1 : color2);
               c.setBackground(coleur);
c.setForeground((row % 2 == 0 ? color2 : color1));

c.setFont(new java.awt.Font("Segoe UI", 1, 14));
               coleur = null;
            }
            return c;
         }
};
        jLabel2 = new javax.swing.JLabel();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Matricule", "Nom", "Prénom", "Téléphone", "Sexe", "Date de naissance"
            }
        ));
        table.setEnabled(false);
        table.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(table);

        jLabel2.setBackground(new java.awt.Color(0, 136, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Liste des étudiants");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
