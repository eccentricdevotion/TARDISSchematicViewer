/*
 * Copyright (C) 2015 eccentric_nz
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
package tardisschematicviewer;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author eccentric_nz
 */
public class UserInterface extends JPanel {

    private static final long serialVersionUID = -1098962567729971976L;
    private File lastDir = new File(".");
    private final TARDISSchematicViewer viewer;

    /**
     * Creates new form UserInterface
     *
     * @param viewer
     */
    public UserInterface(TARDISSchematicViewer viewer) {
        this.viewer = viewer;
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

        browseButton = new javax.swing.JButton();
        fileTextField = new javax.swing.JTextField();
        schematicLabel = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();
        editLayerButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(0, 0, 1024, 80));
        setMaximumSize(new java.awt.Dimension(1024, 80));
        setPreferredSize(new java.awt.Dimension(1024, 80));

        browseButton.setText("Browse");
        browseButton.setFocusPainted(false);
        browseButton.setFocusTraversalKeysEnabled(false);
        browseButton.setFocusable(false);
        browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                browseButtonMouseReleased(evt);
            }
        });

        fileTextField.setText("Select file");
        fileTextField.setFocusTraversalKeysEnabled(false);
        fileTextField.setFocusable(false);
        fileTextField.setRequestFocusEnabled(false);

        schematicLabel.setText("TARDIS Schematic:");
        schematicLabel.setFocusTraversalKeysEnabled(false);
        schematicLabel.setFocusable(false);

        loadButton.setText("Load");
        loadButton.setFocusPainted(false);
        loadButton.setFocusTraversalKeysEnabled(false);
        loadButton.setFocusable(false);
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadButtonMouseReleased(evt);
            }
        });

        editLayerButton.setText("Edit layer");
        editLayerButton.setFocusPainted(false);
        editLayerButton.setFocusTraversalKeysEnabled(false);
        editLayerButton.setFocusable(false);
        editLayerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLayerButtonMouseReleased(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setFocusPainted(false);
        saveButton.setFocusTraversalKeysEnabled(false);
        saveButton.setFocusable(false);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editLayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schematicLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schematicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(editLayerButton)
                    .addComponent(saveButton))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editLayerButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLayerButtonMouseReleased
        Editor editor = (Editor) TARDISSchematicViewer.editor;
        editor.loadLayer();
        editor.setVisible(true);
    }//GEN-LAST:event_editLayerButtonMouseReleased

    private void saveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonMouseReleased

    private void browseButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseButtonMouseReleased
        this.choose(fileTextField, "TARDIS Schematic", "tschm");
    }//GEN-LAST:event_browseButtonMouseReleased

    private void loadButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseReleased
        String path = fileTextField.getText();
        if (!path.isEmpty() && !path.equals("Select file")) {
            viewer.setPath(fileTextField.getText());
        }
    }//GEN-LAST:event_loadButtonMouseReleased

    /**
     * Opens a file chooser.
     *
     * @param box the text field to target
     * @param description a String describing the file type
     * @param extension the file extension
     */
    private void choose(JTextField box, String description, String extension) {
        JFileChooser chooser = new JFileChooser(lastDir);
        chooser.setFileFilter(new FileNameExtensionFilter(description, extension));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(this);

        if (chooser.getSelectedFile() != null) {
            box.setText(chooser.getSelectedFile().getPath());
            lastDir = chooser.getCurrentDirectory();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton editLayerButton;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel schematicLabel;
    // End of variables declaration//GEN-END:variables

}
