// *********************************************************************
// **
// ** Copyright (C) 2017 Antonio David López Machado
// **
// ** This program is free software: you can redistribute it and/or modify
// ** it under the terms of the GNU General Public License as published by
// ** the Free Software Foundation, either version 3 of the License, or
// ** (at your option) any later version.
// **
// ** This program is distributed in the hope that it will be useful,
// ** but WITHOUT ANY WARRANTY; without even the implied warranty of
// ** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// ** GNU General Public License for more details.
// **
// ** You should have received a copy of the GNU General Public License
// ** along with this program.  If not, see <http://www.gnu.org/licenses/>.
// **
// *********************************************************************

package GUI;

import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame {
    /**
     * Creates new form MainWindow
     */
    
    InternalWindow currentIntWind;
    
    
    
    public MainWindow() {
        setMinimumSize(new Dimension(800,700));
        initComponents();
        currentIntWind = new InternalWindow();
        mainDesktop.add(currentIntWind);
        currentIntWind.setVisible(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        DrawPanel = new javax.swing.JPanel();
        GeomToolBar = new javax.swing.JToolBar();
        PointButton = new javax.swing.JToggleButton();
        LineButton = new javax.swing.JToggleButton();
        RtgleButton = new javax.swing.JToggleButton();
        CircleButton = new javax.swing.JToggleButton();
        AttributePanel = new javax.swing.JPanel();
        StateBarPanel = new javax.swing.JPanel();
        StateBarLabel = new javax.swing.JLabel();
        AttributeToolBar = new javax.swing.JToolBar();
        ColorPanel = new javax.swing.JPanel();
        BlackButton = new javax.swing.JButton();
        RedButton = new javax.swing.JButton();
        BlueButton = new javax.swing.JButton();
        WhiteButton = new javax.swing.JButton();
        YellowButton = new javax.swing.JButton();
        GreenButton = new javax.swing.JButton();
        thicknessPanel = new javax.swing.JPanel();
        thickSpinner = new javax.swing.JSpinner();
        AttributePanel2 = new javax.swing.JPanel();
        filledCheckBox = new javax.swing.JCheckBox();
        transparencyCB = new javax.swing.JCheckBox();
        smoothCB = new javax.swing.JCheckBox();
        editCheckBox = new javax.swing.JCheckBox();
        mainDesktop = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        OpenMenu = new javax.swing.JMenuItem();
        SaveMenu = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        SeeSBMenu = new javax.swing.JCheckBoxMenuItem();
        SeeGeoMenu = new javax.swing.JCheckBoxMenuItem();
        SeeAttMenu = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DrawEditor");

        DrawPanel.setLayout(new java.awt.BorderLayout());

        GeomToolBar.setRollover(true);

        buttonGroup1.add(PointButton);
        PointButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        PointButton.setFocusable(false);
        PointButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PointButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointButtonActionPerformed(evt);
            }
        });
        GeomToolBar.add(PointButton);

        buttonGroup1.add(LineButton);
        LineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        LineButton.setFocusable(false);
        LineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });
        GeomToolBar.add(LineButton);

        buttonGroup1.add(RtgleButton);
        RtgleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        RtgleButton.setFocusable(false);
        RtgleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RtgleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RtgleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtgleButtonActionPerformed(evt);
            }
        });
        GeomToolBar.add(RtgleButton);

        buttonGroup1.add(CircleButton);
        CircleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        CircleButton.setFocusable(false);
        CircleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CircleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleButtonActionPerformed(evt);
            }
        });
        GeomToolBar.add(CircleButton);

        DrawPanel.add(GeomToolBar, java.awt.BorderLayout.CENTER);

        getContentPane().add(DrawPanel, java.awt.BorderLayout.NORTH);

        AttributePanel.setLayout(new java.awt.BorderLayout());

        StateBarPanel.setLayout(new java.awt.BorderLayout());

        StateBarLabel.setText("State bar");
        StateBarLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        StateBarPanel.add(StateBarLabel, java.awt.BorderLayout.CENTER);

        AttributePanel.add(StateBarPanel, java.awt.BorderLayout.SOUTH);

        AttributeToolBar.setRollover(true);

        ColorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));
        ColorPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        ColorPanel.setMinimumSize(new java.awt.Dimension(237, 35));
        ColorPanel.setPreferredSize(new java.awt.Dimension(140, 110));
        ColorPanel.setRequestFocusEnabled(false);

        BlackButton.setBackground(new java.awt.Color(0, 0, 0));
        BlackButton.setText(" ");
        BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(BlackButton);

        RedButton.setBackground(new java.awt.Color(204, 0, 0));
        RedButton.setText(" ");
        RedButton.setAlignmentY(0.0F);
        RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(RedButton);

        BlueButton.setBackground(new java.awt.Color(0, 0, 204));
        BlueButton.setText(" ");
        BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(BlueButton);

        WhiteButton.setBackground(new java.awt.Color(255, 255, 255));
        WhiteButton.setText(" ");
        WhiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(WhiteButton);

        YellowButton.setBackground(new java.awt.Color(255, 255, 51));
        YellowButton.setText(" ");
        YellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(YellowButton);

        GreenButton.setBackground(new java.awt.Color(0, 204, 0));
        GreenButton.setText(" ");
        GreenButton.setToolTipText("");
        GreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenButtonActionPerformed(evt);
            }
        });
        ColorPanel.add(GreenButton);

        AttributeToolBar.add(ColorPanel);

        thicknessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Thickness"));
        thicknessPanel.setPreferredSize(new java.awt.Dimension(80, 110));
        thicknessPanel.add(thickSpinner);

        AttributeToolBar.add(thicknessPanel);

        AttributePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        AttributePanel2.setPreferredSize(new java.awt.Dimension(200, 110));

        filledCheckBox.setText("Filled");
        AttributePanel2.add(filledCheckBox);

        transparencyCB.setText("Transparency");
        AttributePanel2.add(transparencyCB);

        smoothCB.setText("Smooth");
        AttributePanel2.add(smoothCB);

        editCheckBox.setText("Edit");
        AttributePanel2.add(editCheckBox);

        AttributeToolBar.add(AttributePanel2);

        AttributePanel.add(AttributeToolBar, java.awt.BorderLayout.LINE_START);

        getContentPane().add(AttributePanel, java.awt.BorderLayout.SOUTH);

        mainDesktop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mainDesktopFocusGained(evt);
            }
        });

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        getContentPane().add(mainDesktop, java.awt.BorderLayout.CENTER);

        FileMenu.setText("File");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        newMenu.setMnemonic('A');
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        FileMenu.add(newMenu);

        OpenMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        OpenMenu.setText("Open");
        OpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenu);

        SaveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        SaveMenu.setText("Save");
        SaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuActionPerformed(evt);
            }
        });
        FileMenu.add(SaveMenu);

        MenuBar.add(FileMenu);

        EditMenu.setText("Edit");

        SeeSBMenu.setSelected(true);
        SeeSBMenu.setText("See state bar");
        SeeSBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeSBMenuActionPerformed(evt);
            }
        });
        EditMenu.add(SeeSBMenu);

        SeeGeoMenu.setSelected(true);
        SeeGeoMenu.setText("See geometry bar");
        SeeGeoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeGeoMenuActionPerformed(evt);
            }
        });
        EditMenu.add(SeeGeoMenu);

        SeeAttMenu.setSelected(true);
        SeeAttMenu.setText("See attribute bar");
        SeeAttMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeAttMenuActionPerformed(evt);
            }
        });
        EditMenu.add(SeeAttMenu);

        MenuBar.add(EditMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeeSBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeSBMenuActionPerformed
      StateBarPanel.setVisible(SeeSBMenu.isSelected());
    }//GEN-LAST:event_SeeSBMenuActionPerformed

    //////////////////////////////////////////////////////////////////////////
    // Geometry buttons
    //////////////////////////////////////////////////////////////////////////
    private void PointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointButtonActionPerformed
        StateBarLabel.setText("Point");
        currentIntWind.setGeometry(GeometryType.POINT);
    }//GEN-LAST:event_PointButtonActionPerformed

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        StateBarLabel.setText("Line");
        currentIntWind.setGeometry(GeometryType.LINE);
    }//GEN-LAST:event_LineButtonActionPerformed

    private void RtgleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtgleButtonActionPerformed
        StateBarLabel.setText("Rectangle");
        currentIntWind.setGeometry(GeometryType.RECTANGLE);
    }//GEN-LAST:event_RtgleButtonActionPerformed

    private void CircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleButtonActionPerformed
        StateBarLabel.setText("Circle");
        currentIntWind.setGeometry(GeometryType.CIRCLE);
    }//GEN-LAST:event_CircleButtonActionPerformed

    //////////////////////////////////////////////////////////////////////////
    //  Menu events
    //////////////////////////////////////////////////////////////////////////
    private void OpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_OpenMenuActionPerformed

    private void SaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_SaveMenuActionPerformed

    //////////////////////////////////////////////////////////////////////////
    // Color buttons
    //////////////////////////////////////////////////////////////////////////
    private void BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackButtonActionPerformed
        //canvasPanel.setColor(Color.BLACK);
    }//GEN-LAST:event_BlackButtonActionPerformed

    private void RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedButtonActionPerformed
        //canvasPanel.setColor(Color.RED);
    }//GEN-LAST:event_RedButtonActionPerformed

    private void BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueButtonActionPerformed
        //canvasPanel.setColor(Color.BLUE);
    }//GEN-LAST:event_BlueButtonActionPerformed

    private void WhiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteButtonActionPerformed
        //canvasPanel.setColor(Color.WHITE);
    }//GEN-LAST:event_WhiteButtonActionPerformed

    private void YellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowButtonActionPerformed
        //canvasPanel.setColor(Color.YELLOW);
    }//GEN-LAST:event_YellowButtonActionPerformed

    private void GreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenButtonActionPerformed
        //canvasPanel.setColor(Color.GREEN);
    }//GEN-LAST:event_GreenButtonActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        currentIntWind = new InternalWindow();
        mainDesktop.add(currentIntWind);
        currentIntWind.setVisible(true);

    }//GEN-LAST:event_newMenuActionPerformed

    private void SeeGeoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeGeoMenuActionPerformed
        GeomToolBar.setVisible(SeeGeoMenu.isSelected());
    }//GEN-LAST:event_SeeGeoMenuActionPerformed

    private void SeeAttMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeAttMenuActionPerformed
        AttributeToolBar.setVisible(SeeAttMenu.isSelected());
    }//GEN-LAST:event_SeeAttMenuActionPerformed

    private void mainDesktopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainDesktopFocusGained
        currentIntWind = (InternalWindow)mainDesktop.getSelectedFrame();
    }//GEN-LAST:event_mainDesktopFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AttributePanel;
    private javax.swing.JPanel AttributePanel2;
    private javax.swing.JToolBar AttributeToolBar;
    private javax.swing.JButton BlackButton;
    private javax.swing.JButton BlueButton;
    private javax.swing.JToggleButton CircleButton;
    private javax.swing.JPanel ColorPanel;
    private javax.swing.JPanel DrawPanel;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JToolBar GeomToolBar;
    private javax.swing.JButton GreenButton;
    private javax.swing.JToggleButton LineButton;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem OpenMenu;
    private javax.swing.JToggleButton PointButton;
    private javax.swing.JButton RedButton;
    private javax.swing.JToggleButton RtgleButton;
    private javax.swing.JMenuItem SaveMenu;
    private javax.swing.JCheckBoxMenuItem SeeAttMenu;
    private javax.swing.JCheckBoxMenuItem SeeGeoMenu;
    private javax.swing.JCheckBoxMenuItem SeeSBMenu;
    private javax.swing.JLabel StateBarLabel;
    private javax.swing.JPanel StateBarPanel;
    private javax.swing.JButton WhiteButton;
    private javax.swing.JButton YellowButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox editCheckBox;
    private javax.swing.JCheckBox filledCheckBox;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JCheckBox smoothCB;
    private javax.swing.JSpinner thickSpinner;
    private javax.swing.JPanel thicknessPanel;
    private javax.swing.JCheckBox transparencyCB;
    // End of variables declaration//GEN-END:variables
}
