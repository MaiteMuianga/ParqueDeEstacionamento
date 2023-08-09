/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import view.*;

/**
 *
 * @author Jaime Rungo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    Color defaultColor;
    Color clickedColor;
    
    
    public Menu() {
        initComponents();
        defaultColor = new Color(29,41,57);
        clickedColor = new Color(28,175,154);
        paneclick1.setBackground(defaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        paneclick2 = new javax.swing.JPanel();
        miniSidepanel2 = new javax.swing.JPanel();
        cliLabel = new javax.swing.JLabel();
        paneclick1 = new javax.swing.JPanel();
        regLabel = new javax.swing.JLabel();
        minisidePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        paneClick5 = new javax.swing.JPanel();
        miniSidepanel3 = new javax.swing.JPanel();
        preLabel = new javax.swing.JLabel();
        paneclick4 = new javax.swing.JPanel();
        miniSidepanel4 = new javax.swing.JPanel();
        ClienteLabel = new javax.swing.JLabel();
        paneclick3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        listarLabel = new javax.swing.JLabel();
        paneClick6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        relaLabel = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(100, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel.setBackground(new java.awt.Color(29, 41, 57));
        exitPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitPanelMouseDragged(evt);
            }
        });
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitPanelMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/remove.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/macos_minimize_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 1018, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 40));

        jPanel1.setBackground(new java.awt.Color(29, 41, 57));

        paneclick2.setBackground(new java.awt.Color(29, 41, 57));
        paneclick2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        miniSidepanel2.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout miniSidepanel2Layout = new javax.swing.GroupLayout(miniSidepanel2);
        miniSidepanel2.setLayout(miniSidepanel2Layout);
        miniSidepanel2Layout.setHorizontalGroup(
            miniSidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        miniSidepanel2Layout.setVerticalGroup(
            miniSidepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cliLabel.setBackground(new java.awt.Color(29, 41, 57));
        cliLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        cliLabel.setForeground(new java.awt.Color(255, 255, 255));
        cliLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/car.png"))); // NOI18N
        cliLabel.setText("  Marcar Saidas");
        cliLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cliLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneclick2Layout = new javax.swing.GroupLayout(paneclick2);
        paneclick2.setLayout(paneclick2Layout);
        paneclick2Layout.setHorizontalGroup(
            paneclick2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneclick2Layout.createSequentialGroup()
                .addComponent(miniSidepanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneclick2Layout.setVerticalGroup(
            paneclick2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneclick2Layout.createSequentialGroup()
                .addGroup(paneclick2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(miniSidepanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        paneclick1.setBackground(new java.awt.Color(29, 41, 57));
        paneclick1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneclick1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneclick1MousePressed(evt);
            }
        });

        regLabel.setBackground(new java.awt.Color(29, 41, 57));
        regLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        regLabel.setForeground(new java.awt.Color(255, 255, 255));
        regLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add.png"))); // NOI18N
        regLabel.setText("   Registrar Entradas");
        regLabel.setToolTipText("");
        regLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                regLabelMouseDragged(evt);
            }
        });
        regLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regLabelMousePressed(evt);
            }
        });

        minisidePanel.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout minisidePanelLayout = new javax.swing.GroupLayout(minisidePanel);
        minisidePanel.setLayout(minisidePanelLayout);
        minisidePanelLayout.setHorizontalGroup(
            minisidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        minisidePanelLayout.setVerticalGroup(
            minisidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneclick1Layout = new javax.swing.GroupLayout(paneclick1);
        paneclick1.setLayout(paneclick1Layout);
        paneclick1Layout.setHorizontalGroup(
            paneclick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneclick1Layout.createSequentialGroup()
                .addComponent(minisidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        paneclick1Layout.setVerticalGroup(
            paneclick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(minisidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/park.PNG"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        paneClick5.setBackground(new java.awt.Color(29, 41, 57));
        paneClick5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        miniSidepanel3.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout miniSidepanel3Layout = new javax.swing.GroupLayout(miniSidepanel3);
        miniSidepanel3.setLayout(miniSidepanel3Layout);
        miniSidepanel3Layout.setHorizontalGroup(
            miniSidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        miniSidepanel3Layout.setVerticalGroup(
            miniSidepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        preLabel.setBackground(new java.awt.Color(29, 41, 57));
        preLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        preLabel.setForeground(new java.awt.Color(255, 255, 255));
        preLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/time-is-money.png"))); // NOI18N
        preLabel.setText("  Preços e Horarios");
        preLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                preLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneClick5Layout = new javax.swing.GroupLayout(paneClick5);
        paneClick5.setLayout(paneClick5Layout);
        paneClick5Layout.setHorizontalGroup(
            paneClick5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneClick5Layout.createSequentialGroup()
                .addComponent(miniSidepanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        paneClick5Layout.setVerticalGroup(
            paneClick5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miniSidepanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(preLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        paneclick4.setBackground(new java.awt.Color(29, 41, 57));
        paneclick4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        miniSidepanel4.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout miniSidepanel4Layout = new javax.swing.GroupLayout(miniSidepanel4);
        miniSidepanel4.setLayout(miniSidepanel4Layout);
        miniSidepanel4Layout.setHorizontalGroup(
            miniSidepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        miniSidepanel4Layout.setVerticalGroup(
            miniSidepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        ClienteLabel.setBackground(new java.awt.Color(29, 41, 57));
        ClienteLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        ClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClienteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user.png"))); // NOI18N
        ClienteLabel.setText("   Clientes");
        ClienteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClienteLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneclick4Layout = new javax.swing.GroupLayout(paneclick4);
        paneclick4.setLayout(paneclick4Layout);
        paneclick4Layout.setHorizontalGroup(
            paneclick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneclick4Layout.createSequentialGroup()
                .addComponent(miniSidepanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneclick4Layout.setVerticalGroup(
            paneclick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miniSidepanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ClienteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        paneclick3.setBackground(new java.awt.Color(29, 41, 57));
        paneclick3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        listarLabel.setBackground(new java.awt.Color(29, 41, 57));
        listarLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        listarLabel.setForeground(new java.awt.Color(255, 255, 255));
        listarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/note.png"))); // NOI18N
        listarLabel.setText("Listar Veiculos");
        listarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listarLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneclick3Layout = new javax.swing.GroupLayout(paneclick3);
        paneclick3.setLayout(paneclick3Layout);
        paneclick3Layout.setHorizontalGroup(
            paneclick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneclick3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneclick3Layout.setVerticalGroup(
            paneclick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneclick3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(paneclick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        paneClick6.setBackground(new java.awt.Color(29, 41, 57));
        paneClick6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel7.setBackground(new java.awt.Color(29, 41, 57));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        relaLabel.setBackground(new java.awt.Color(29, 41, 57));
        relaLabel.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        relaLabel.setForeground(new java.awt.Color(255, 255, 255));
        relaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/send_hot_list_30px.png"))); // NOI18N
        relaLabel.setText("Listar Clientes");
        relaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relaLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                relaLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneClick6Layout = new javax.swing.GroupLayout(paneClick6);
        paneClick6.setLayout(paneClick6Layout);
        paneClick6Layout.setHorizontalGroup(
            paneClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneClick6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneClick6Layout.setVerticalGroup(
            paneClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneClick6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(paneClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(relaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneclick2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneclick1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneclick4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneClick5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneclick3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneClick6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneclick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paneclick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(paneclick3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneclick4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paneClick5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paneClick6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 620));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 850, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 850, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int x,y;
    private void exitPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_exitPanelMousePressed

    private void exitPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_exitPanelMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void paneclick1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneclick1MousePressed
            paneclick1.setBackground(clickedColor);
            paneclick2.setBackground(defaultColor);
    }//GEN-LAST:event_paneclick1MousePressed

    private void regLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLabelMousePressed
         paneclick1.setBackground(clickedColor);
         paneclick2.setBackground(defaultColor);
         paneclick4.setBackground(defaultColor);
         paneClick5.setBackground(defaultColor);
         paneClick6.setBackground(defaultColor);
         paneclick3.setBackground(defaultColor);
         
    }//GEN-LAST:event_regLabelMousePressed

    private void cliLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliLabelMousePressed
            paneclick2.setBackground(clickedColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(defaultColor);
            paneClick5.setBackground(defaultColor);
            paneClick6.setBackground(defaultColor);
            paneclick3.setBackground(defaultColor);
            
    }//GEN-LAST:event_cliLabelMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
            paneclick2.setBackground(defaultColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(defaultColor);
            paneClick5.setBackground(defaultColor);
            paneClick6.setBackground(defaultColor);
            paneclick3.setBackground(defaultColor);
    }//GEN-LAST:event_jLabel2MousePressed

    private void regLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLabelMouseDragged
                  
    }//GEN-LAST:event_regLabelMouseDragged

    private void listarLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarLabelMousePressed
            paneclick2.setBackground(defaultColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(defaultColor);
            paneClick5.setBackground(defaultColor);
            paneClick6.setBackground(defaultColor);
            paneclick3.setBackground(clickedColor);
            
    }//GEN-LAST:event_listarLabelMousePressed

    private void ClienteLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteLabelMousePressed
            paneclick2.setBackground(defaultColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(clickedColor);
            paneClick5.setBackground(defaultColor);
            paneClick6.setBackground(defaultColor);
            paneclick3.setBackground(defaultColor);
    }//GEN-LAST:event_ClienteLabelMousePressed

    private void preLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preLabelMousePressed
            paneclick2.setBackground(defaultColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(defaultColor);
            paneClick5.setBackground(clickedColor);
            paneClick6.setBackground(defaultColor);
            paneclick3.setBackground(defaultColor);
    }//GEN-LAST:event_preLabelMousePressed

    private void relaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relaLabelMousePressed
             paneclick2.setBackground(defaultColor);
            paneclick1.setBackground(defaultColor);
            paneclick4.setBackground(defaultColor);
            paneClick5.setBackground(defaultColor);
            paneClick6.setBackground(clickedColor);
            paneclick3.setBackground(defaultColor);
    }//GEN-LAST:event_relaLabelMousePressed

    private void regLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLabelMouseClicked
        jDesktopPane1.removeAll();
        RegistroForm2 rf = new RegistroForm2();
        jDesktopPane1.add(rf).setVisible(true); 
    }//GEN-LAST:event_regLabelMouseClicked

    private void ClienteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteLabelMouseClicked
        jDesktopPane1.removeAll();
        ClienteForm cf = new ClienteForm();
        jDesktopPane1.add(cf).setVisible(true);
    }//GEN-LAST:event_ClienteLabelMouseClicked

    private void preLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preLabelMouseClicked
           jDesktopPane1.removeAll();
           PrecosForm pf = new PrecosForm();
           jDesktopPane1.add(pf).setVisible(true);
           
    }//GEN-LAST:event_preLabelMouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
            setState(ICONIFIED);
          
    }//GEN-LAST:event_jLabel3MousePressed

    private void listarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarLabelMouseClicked
        jDesktopPane1.removeAll();
        ListarVeiculos lv = new ListarVeiculos();
        
        jDesktopPane1.add(lv).setVisible(true);
    }//GEN-LAST:event_listarLabelMouseClicked

    private void cliLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliLabelMouseClicked
        jDesktopPane1.removeAll();
        Saida sa = new Saida();
        jDesktopPane1.add(sa).setVisible(true);
    }//GEN-LAST:event_cliLabelMouseClicked

    private void relaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relaLabelMouseClicked
         jDesktopPane1.removeAll();
        //ListarVeiculos lv = new ListarVeiculos();
        ListarClientes lv = new ListarClientes();
        jDesktopPane1.add(lv).setVisible(true);
    }//GEN-LAST:event_relaLabelMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClienteLabel;
    private javax.swing.JLabel cliLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel listarLabel;
    private javax.swing.JPanel miniSidepanel2;
    private javax.swing.JPanel miniSidepanel3;
    private javax.swing.JPanel miniSidepanel4;
    private javax.swing.JPanel minisidePanel;
    private javax.swing.JPanel paneClick5;
    private javax.swing.JPanel paneClick6;
    private javax.swing.JPanel paneclick1;
    private javax.swing.JPanel paneclick2;
    private javax.swing.JPanel paneclick3;
    private javax.swing.JPanel paneclick4;
    private javax.swing.JLabel preLabel;
    private javax.swing.JLabel regLabel;
    private javax.swing.JLabel relaLabel;
    // End of variables declaration//GEN-END:variables
}
