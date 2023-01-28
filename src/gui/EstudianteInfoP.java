package gui;

import com.github.sarxos.webcam.*;
import datos.*;
import domain.*;
import java.awt.Color;
import java.awt.Dimension;

public class EstudianteInfoP extends javax.swing.JPanel {

    private int estudianteId;
    
    private UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public EstudianteInfoP(int estudianteId) {
        initComponents();
        this.estudianteId = estudianteId;
        llenarDatos();
    }

    private void llenarDatos() {
        Usuario estudiante = usuarioDao.usuarioByUsuarioId(this.estudianteId);
        nombreFd.setText(estudiante.getNombre());
        apellidoFd.setText(estudiante.getApellido());
        direccionFd.setText(estudiante.getDireccion());
        emailFd.setText(estudiante.getEmail());
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo1 = new javax.swing.JPanel();
        infoTxt = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        nombreFd = new javax.swing.JTextField();
        nombreSp = new javax.swing.JSeparator();
        apellidoTxt = new javax.swing.JLabel();
        apellidoFd = new javax.swing.JTextField();
        apellidoSp = new javax.swing.JSeparator();
        direccionTxt = new javax.swing.JLabel();
        direccionFd = new javax.swing.JTextField();
        direccionSp = new javax.swing.JSeparator();
        emailTxt = new javax.swing.JLabel();
        emailFd = new javax.swing.JTextField();
        emailSp = new javax.swing.JSeparator();
        fotografiaTxt = new javax.swing.JLabel();
        fotografiaP = new javax.swing.JPanel();
        fotografiaBt = new javax.swing.JLabel();
        hacerBt = new javax.swing.JPanel();
        hacerTxt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo1.setBackground(new java.awt.Color(255, 255, 255));
        fondo1.setPreferredSize(new java.awt.Dimension(1280, 560));
        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoTxt.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        infoTxt.setForeground(new java.awt.Color(193, 18, 31));
        infoTxt.setText("Información Personal");
        fondo1.add(infoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        nombreTxt.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        nombreTxt.setText("Nombre");
        fondo1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        nombreFd.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        nombreFd.setBorder(null);
        nombreFd.setPreferredSize(new java.awt.Dimension(350, 20));
        fondo1.add(nombreFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        nombreSp.setPreferredSize(new java.awt.Dimension(350, 10));
        fondo1.add(nombreSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        apellidoTxt.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        apellidoTxt.setText("Apellido");
        fondo1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        apellidoFd.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        apellidoFd.setBorder(null);
        apellidoFd.setPreferredSize(new java.awt.Dimension(350, 20));
        fondo1.add(apellidoFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 20));

        apellidoSp.setPreferredSize(new java.awt.Dimension(350, 10));
        fondo1.add(apellidoSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        direccionTxt.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        direccionTxt.setText("Dirección");
        fondo1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        direccionFd.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        direccionFd.setBorder(null);
        direccionFd.setPreferredSize(new java.awt.Dimension(350, 20));
        fondo1.add(direccionFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 20));

        direccionSp.setPreferredSize(new java.awt.Dimension(350, 10));
        fondo1.add(direccionSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        emailTxt.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        emailTxt.setText("Correo");
        fondo1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        emailFd.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        emailFd.setBorder(null);
        emailFd.setPreferredSize(new java.awt.Dimension(350, 20));
        fondo1.add(emailFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, 20));

        emailSp.setPreferredSize(new java.awt.Dimension(350, 10));
        fondo1.add(emailSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        fotografiaTxt.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        fotografiaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotografiaTxt.setText("Fotografía");
        fondo1.add(fotografiaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 100, -1));

        fotografiaP.setBackground(new java.awt.Color(255, 255, 255));
        fotografiaP.setPreferredSize(new java.awt.Dimension(270, 280));

        fotografiaBt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fotografiaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fotografiaBt.setPreferredSize(new java.awt.Dimension(270, 280));
        fotografiaBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotografiaBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fotografiaPLayout = new javax.swing.GroupLayout(fotografiaP);
        fotografiaP.setLayout(fotografiaPLayout);
        fotografiaPLayout.setHorizontalGroup(
            fotografiaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotografiaPLayout.createSequentialGroup()
                .addComponent(fotografiaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fotografiaPLayout.setVerticalGroup(
            fotografiaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotografiaPLayout.createSequentialGroup()
                .addComponent(fotografiaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo1.add(fotografiaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 270, 280));

        hacerBt.setBackground(new java.awt.Color(253, 240, 213));
        hacerBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hacerBt.setPreferredSize(new java.awt.Dimension(150, 40));

        hacerTxt.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        hacerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hacerTxt.setText("Actualizar");
        hacerTxt.setPreferredSize(new java.awt.Dimension(150, 40));
        hacerTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hacerTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hacerTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hacerTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hacerBtLayout = new javax.swing.GroupLayout(hacerBt);
        hacerBt.setLayout(hacerBtLayout);
        hacerBtLayout.setHorizontalGroup(
            hacerBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hacerBtLayout.createSequentialGroup()
                .addComponent(hacerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        hacerBtLayout.setVerticalGroup(
            hacerBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hacerBtLayout.createSequentialGroup()
                .addComponent(hacerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo1.add(hacerBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, -1, -1));

        add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void hacerTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacerTxtMouseExited
        this.hacerBt.setBackground(new Color(253, 240, 213));
    }//GEN-LAST:event_hacerTxtMouseExited

    private void hacerTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacerTxtMouseEntered
        this.hacerBt.setBackground(new Color(252, 230, 182));
    }//GEN-LAST:event_hacerTxtMouseEntered

    private void hacerTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacerTxtMouseClicked
        /*
        String usuarioNombre = this.usuarioFd.getText().trim();
        String clave = this.claveFd.getText();
        String cedula = this.cedulaFd.getText().trim();
        String nombre = this.nombreFd.getText().trim();
        String apellido = this.apellidoFd.getText().trim();
        String email = this.emailFd.getText().trim();
        String rol = this.rolCb.getSelectedItem().toString();

        int rolId = 0;

        if (usuarioNombre.isEmpty() || clave.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            return;
        }
        if (usuarioNombre.length() > 60) {
            JOptionPane.showMessageDialog(null, "Longitud maxima de caracteres en usuario: 60");
            this.usuarioFd.requestFocus();
            return;
        }
        if (clave.length() > 60) {
            JOptionPane.showMessageDialog(null, "Longitud maxima de caracteres en clave: 60");
            this.claveFd.requestFocus();
            return;
        }
        if (nombre.length() > 100) {
            JOptionPane.showMessageDialog(null, "Longitud maxima de caracteres en nombre: 100");
            this.nombreFd.requestFocus();
            return;
        }
        if (apellido.length() > 100) {
            JOptionPane.showMessageDialog(null, "Longitud maxima de caracteres en apellido: 100");
            this.apellidoFd.requestFocus();
            return;
        }
        if (usuarioNombre.contains("\"") || usuarioNombre.contains("\'")) {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            this.usuarioFd.requestFocus();
            return;
        }
        if (!Utilidad.validarCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "Cedula incorrecta");
            this.cedulaFd.requestFocus();
            return;
        }
        if (!Utilidad.validarNombre(nombre)) {
            JOptionPane.showMessageDialog(null, "Nombre incorrecto");
            this.nombreFd.requestFocus();
            return;
        } else {
            nombre = Utilidad.toMayuscula(nombre).trim();
        }
        if (!Utilidad.validarNombre(apellido)) {
            JOptionPane.showMessageDialog(null, "Apellido incorrecto");
            this.apellidoFd.requestFocus();
            return;
        } else {
            apellido = Utilidad.toMayuscula(apellido).trim();
        }
        if (!Utilidad.validarEmail(email)) {
            JOptionPane.showMessageDialog(null, "Correo incorrecto");
            this.emailFd.requestFocus();
            return;
        }

        if (rol.equals("Estudiante")) {
            rolId = 1;
        } else if (rol.equals("Profesor")) {
            rolId = 2;
        }

        Usuario usuarioAux = this.edicion ? this.usuario : new Usuario();
        usuarioAux.setUsuario(usuarioNombre);
        usuarioAux.setClave(clave);
        usuarioAux.setCedula(cedula);
        usuarioAux.setNombre(nombre);
        usuarioAux.setApellido(apellido);
        usuarioAux.setEmail(email);

        UsuarioRol usuarioRol = new UsuarioRol();

        List<Usuario> usuarios = this.usuarioDao.seleccionar("");
        if (!this.edicion) {
            for (Usuario u : usuarios) {
                if (usuarioNombre.equals(u.getUsuario())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con este usuario");
                    this.usuarioFd.requestFocus();
                    return;
                }
                if (cedula.equals(u.getCedula())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con esta cedula");
                    this.cedulaFd.requestFocus();
                    return;
                }
                if (email.equals(u.getEmail())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con este correo");
                    this.emailFd.requestFocus();
                    return;
                }
            }
            this.usuarioDao.insertar(usuarioAux);

            usuarioRol.setUsuarioId(this.usuarioDao.obtenerUltimo());
            usuarioRol.setRolId(rolId);
            this.usuarioRolDao.insertar(usuarioRol);
        } else {
            for (Usuario u : usuarios) {
                if (u.getId() == usuarioAux.getId()) {
                    continue;
                }
                if (usuarioNombre.equals(u.getUsuario())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con este usuario");
                    this.usuarioFd.requestFocus();
                    return;
                }
                if (cedula.equals(u.getCedula())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con esta cedula");
                    this.cedulaFd.requestFocus();
                    return;
                }
                if (email.equals(u.getEmail())) {
                    JOptionPane.showMessageDialog(null, "Ya existe registro con este correo");
                    this.emailFd.requestFocus();
                    return;
                }
            }
            this.usuarioDao.actualizar(usuarioAux);

            usuarioRol.setUsuarioId(this.usuarioId);
            usuarioRol.setRolId(rolId);
            usuarioRol.setId(this.usuarioRolDao.obtenerId(usuarioRol.getUsuarioId(), this.verificarRol(this.usuarioId)));
            this.usuarioRolDao.actualizar(usuarioRol);
        }

        String mensaje = this.edicion ? "modificado" : "registrado";
        JOptionPane.showMessageDialog(null, "Usuario " + mensaje + " exitosamente");

        if (!this.edicion) {
            this.usuarioFd.setText("");
            this.claveFd.setText("");
            this.cedulaFd.setText("");
            this.nombreFd.setText("");
            this.apellidoFd.setText("");
            this.emailFd.setText("");
            this.usuarioFd.requestFocus();
        }
        */
    }//GEN-LAST:event_hacerTxtMouseClicked

    private void fotografiaBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaBtMouseClicked
       Dimension dimension = new Dimension(270, 280);
       Dimension dimensionCam = WebcamResolution.VGA.getSize();
       Webcam webcam = Webcam.getDefault();
       WebcamPanel cam = new WebcamPanel(webcam, dimension, true);
       cam.setFillArea(true);
       webcam.setViewSize(dimensionCam);
       fotografiaP.add(cam);
       
    }//GEN-LAST:event_fotografiaBtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoFd;
    private javax.swing.JSeparator apellidoSp;
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JTextField direccionFd;
    private javax.swing.JSeparator direccionSp;
    private javax.swing.JLabel direccionTxt;
    private javax.swing.JTextField emailFd;
    private javax.swing.JSeparator emailSp;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JPanel fondo1;
    private javax.swing.JLabel fotografiaBt;
    private javax.swing.JPanel fotografiaP;
    private javax.swing.JLabel fotografiaTxt;
    private javax.swing.JPanel hacerBt;
    private javax.swing.JLabel hacerTxt;
    private javax.swing.JLabel infoTxt;
    private javax.swing.JTextField nombreFd;
    private javax.swing.JSeparator nombreSp;
    private javax.swing.JLabel nombreTxt;
    // End of variables declaration//GEN-END:variables
}
