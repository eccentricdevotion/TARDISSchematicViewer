/*
 * Copyright (C) 2021 eccentric_nz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package me.eccentric_nz.tardisschematicviewer;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

/**
 * @author eccentric_nz
 */
public class Editor extends JPanel {

    @Serial
    private static final long serialVersionUID = 6012462642009590681L;

    private final TardisSchematicViewer viewer;
    private final List<SquareButton> buttons;
    private SquareButton selected;
    private JsonObject schematic;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JComboBox dataComboBox;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JInternalFrame layoutArea;
    private javax.swing.JLabel matLabel;
    private javax.swing.JComboBox materialComboBox;
    ActionListener actionListener = this::squareActionPerformed;

    /**
     * Creates new form Editor
     */
    public Editor(TardisSchematicViewer viewer) {
        this.viewer = viewer;
        this.buttons = new ArrayList<>();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        layoutArea = new javax.swing.JInternalFrame();
        matLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        materialComboBox = new javax.swing.JComboBox();
        dataComboBox = new javax.swing.JComboBox();

        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        close.addActionListener(this::closeActionPerformed);

        layoutArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layoutArea.setPreferredSize(new java.awt.Dimension(600, 600));
        layoutArea.setSize(new java.awt.Dimension(600, 600));
        layoutArea.setVisible(true);

        javax.swing.GroupLayout layoutAreaLayout = new javax.swing.GroupLayout(layoutArea.getContentPane());
        layoutArea.getContentPane().setLayout(layoutAreaLayout);
        layoutAreaLayout.setHorizontalGroup(layoutAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 598, Short.MAX_VALUE));
        layoutAreaLayout.setVerticalGroup(layoutAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 598, Short.MAX_VALUE));

        matLabel.setText("Material:");

        dataLabel.setText("Data:");

        materialComboBox.setModel(new javax.swing.DefaultComboBoxModel(Material.strings()));

        dataComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(close)).addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(layoutArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(34, 34, 34).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(matLabel).addComponent(dataLabel)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(materialComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(dataComboBox, 0, 280, Short.MAX_VALUE)))).addContainerGap(22, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(19, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(layoutArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(matLabel).addComponent(materialComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(dataLabel).addComponent(dataComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(close).addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO Add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        this.setVisible(false);
    }//GEN-LAST:event_closeMouseReleased

    public void loadLayer() {
        if (buttons.size() > 0) {
            buttons.forEach((q) -> layoutArea.remove(q));
            buttons.clear();
        }
        layoutArea.setLayout(null);
        schematic = viewer.getSchematic();
        if (schematic != null) {
            JsonObject d = (JsonObject) schematic.get("dimensions");
            int current = viewer.getHeight() - 1;
            JsonArray level = ((JsonArray) schematic.get("input")).getJSONArray(current);
            int xx = d.getInt("width");
            int w = layoutArea.getWidth() / xx;
            for (int i = 0; i < xx; i++) {
                JsonArray row = (JsonArray) level.get(i);
                for (int j = 0; j < xx; j++) {
                    JsonObject col = (JsonObject) row.get(j);
                    Material m = Material.valueOf(col.getString("type"));
                    SquareButton sb = new SquareButton(w, m.getColor());
                    sb.setText(col.getString("type").substring(0, 1));
                    sb.setPreferredSize(new Dimension(w, w));
                    sb.setBounds(i * w, j * w, w, w);
                    sb.setBorder(new LineBorder(Color.BLACK));
                    sb.setToolTipText(col.getString("type") + ":" + col.getByte("data"));
                    sb.addActionListener(actionListener);
                    layoutArea.add(sb);
                    buttons.add(sb);
                }
            }
        } else {
            System.out.println("schematic was null");
        }
    }

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {
        if (selected != null) {
            // remove selected border
            selected.setBorder(new LineBorder(Color.BLACK));
        }
        selected = (SquareButton) evt.getSource();
        int x = selected.getX() / 37;
        int z = selected.getY() / 37;
        System.out.println(x + "," + z);
        String[] split = selected.getToolTipText().split(":");
        selected.setBorder(new LineBorder(Color.RED));
        materialComboBox.setSelectedItem(split[0]);
        dataComboBox.setSelectedItem(split[1]);
    }
    // End of variables declaration//GEN-END:variables
}
