/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Main.ViewManager;

/**
 *
 * @author fede_
 */
public class TaTeTi extends javax.swing.JFrame {

    int turno, contp, contiemp;
    boolean gano = false;
    public JLabel[][] cuadros;
    public Color colorx = Color.BLACK;
    public Color coloro = Color.WHITE;

    /**
     * Creates new form Triki
     */
    public TaTeTi() {
        initComponents();
        this.setLocationRelativeTo(null);
        turno = contp = contiemp = 1;
        cuadros = new JLabel[][]{{c1, c2, c3}, {c4, c5, c6}, {c7, c8, c9}};

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        volver = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        c1.setBackground(new java.awt.Color(255, 153, 0));
        c1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c1.setOpaque(true);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        jPanel1.add(c1);

        c2.setBackground(new java.awt.Color(255, 153, 0));
        c2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c2.setOpaque(true);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        jPanel1.add(c2);

        c3.setBackground(new java.awt.Color(255, 153, 0));
        c3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c3.setOpaque(true);
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3MouseClicked(evt);
            }
        });
        jPanel1.add(c3);

        c4.setBackground(new java.awt.Color(255, 153, 0));
        c4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c4.setOpaque(true);
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c4MouseClicked(evt);
            }
        });
        jPanel1.add(c4);

        c5.setBackground(new java.awt.Color(255, 153, 0));
        c5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c5.setOpaque(true);
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c5MouseClicked(evt);
            }
        });
        jPanel1.add(c5);

        c6.setBackground(new java.awt.Color(255, 153, 0));
        c6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c6.setOpaque(true);
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c6MouseClicked(evt);
            }
        });
        jPanel1.add(c6);

        c7.setBackground(new java.awt.Color(255, 153, 0));
        c7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c7.setOpaque(true);
        c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c7MouseClicked(evt);
            }
        });
        jPanel1.add(c7);

        c8.setBackground(new java.awt.Color(255, 153, 0));
        c8.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c8.setOpaque(true);
        c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c8MouseClicked(evt);
            }
        });
        jPanel1.add(c8);

        c9.setBackground(new java.awt.Color(255, 153, 0));
        c9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        c9.setOpaque(true);
        c9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c9MouseClicked(evt);
            }
        });
        jPanel1.add(c9);

        jMenu1.setText("Nuevo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        jMenuBar1.add(volver);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        Dato(c1);
    }//GEN-LAST:event_c1MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        Dato(c2);
    }//GEN-LAST:event_c2MouseClicked

    private void c3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseClicked
        Dato(c3);
    }//GEN-LAST:event_c3MouseClicked

    private void c4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MouseClicked
        Dato(c4);
    }//GEN-LAST:event_c4MouseClicked

    private void c5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c5MouseClicked
        Dato(c5);
    }//GEN-LAST:event_c5MouseClicked

    private void c6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c6MouseClicked
        Dato(c6);
    }//GEN-LAST:event_c6MouseClicked

    private void c7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c7MouseClicked
        Dato(c7);
    }//GEN-LAST:event_c7MouseClicked

    private void c8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c8MouseClicked
        Dato(c8);
    }//GEN-LAST:event_c8MouseClicked

    private void c9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c9MouseClicked
        Dato(c9);
    }//GEN-LAST:event_c9MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        nuevo();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
       ViewManager.changeView(new Bienvenido());
    }//GEN-LAST:event_volverMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        dispose();
    }//GEN-LAST:event_SalirMouseClicked
    public void Dato(JLabel cuadro) {
        if (!gano) {

            if (cuadro.getText().equals("")) {

                if (turno % 2 == 1) {
                    cuadro.setText("x");
                    cuadro.setForeground(colorx);
                    if (contiemp >= 3) {
                        verificar("x");
                    }
                    contiemp++;
                } else {
                    cuadro.setText("o");
                    cuadro.setForeground(coloro);
                    if (contp >= 3) {
                        verificar("o");
                    }
                    contp++;
                }
                turno++;
            }
        }
    }

    public void verificar(String parametro) {
        int contador = 0;
        int a, b;
        boolean reinicio = false;
        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < cuadros.length; i++) {
                for (int j = 0; j < cuadros.length; j++) {
                    if (x == 0) {
                        a = i;
                        b = j;
                    } else {
                        a = j;
                        b = i;
                    }
                    if (cuadros[a][b].getText().equals(parametro)) {
                        contador++;
                    }
                }
                if (!gano && contador == 3) {
                    JOptionPane.showConfirmDialog(null, "Triky");
                    if (JOptionPane.showConfirmDialog(null, "¿Desea Iniciar un nuevo juego?") == 0) {
                        nuevo();
                        reinicio = true;
                    } else {
                        gano = false;
                    }
                    break;
                }
                contador++;
            }
        }
        if (!reinicio) {
            int pos;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < cuadros.length; j++) {
                    if (i == 0) {
                        pos = j;
                    } else {
                        pos = 2 - j;
                    }
                    if (cuadros[j][pos].getText().equals(parametro)) {
                        contador++;
                    }
                }
                if (contador == 3) {
                    JOptionPane.showConfirmDialog(null, "Triky");
                    if (JOptionPane.showConfirmDialog(null, "¿Desea Iniciar un nuevo juego?") == 0) {
                        nuevo();
                        break;
                    } else {
                        gano = false;
                        break;
                    }
                }
                contador++;
            }
        }
    }

    public void nuevo() {
        gano = false;
        turno = contp = contiemp = 2;
        Color colorx = Color.BLUE;
        Color coloro = Color.BLACK;
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu volver;
    // End of variables declaration//GEN-END:variables

}
