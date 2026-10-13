package juancabria.seminario.imc.rmi.vistas;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import juancabria.seminario.imc.rmi.lib.*;

import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Client;

/**
 * @author Juan Cabria
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    CallHandler invocadorRemoto;
    String ipServidor = "localhost";
    int puerto = 9007;
    IRemotaCalculoImc calculoImcRemoto;
    Client cliente;

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoIPServidor = new javax.swing.JTextField();
        campoPuertoServidor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        btnIniciar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Calculo IMC - LipeRMI");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE IMC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DIRECCION IP:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PUERTO DE RED:");

        campoIPServidor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoIPServidor.setText("localhost");

        campoPuertoServidor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPuertoServidor.setText("9007");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ESTADO:");

        txtEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 0, 51));
        txtEstado.setText("Desconectado");

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 153, 51));
        btnIniciar.setText("Conectar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoIPServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(campoPuertoServidor))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoPuertoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstado))
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONEXION", jPanel1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PESO (kg):");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ALTURA (m):");

        campoPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        campoAltura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnIniciar1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(0, 153, 51));
        btnIniciar1.setText("CALCULAR");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("IMC:");

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 0, 51));
        txtResultado.setText("0.0");

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtMensaje.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(campoAltura))
                                .addGap(25, 25, 25)
                                .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIniciar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtResultado))
                .addGap(15, 15, 15)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CALCULAR IMC", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            if (btnIniciar.getText().equalsIgnoreCase("Conectar")) {
                puerto = Integer.parseInt(campoPuertoServidor.getText().trim());
                ipServidor = campoIPServidor.getText().trim();
                invocadorRemoto = new CallHandler();
                cliente = new Client(ipServidor, puerto, invocadorRemoto);
                calculoImcRemoto = (IRemotaCalculoImc) cliente.getGlobal(IRemotaCalculoImc.class);
                btnIniciar.setText("Desconectar");
                btnIniciar.setForeground(Color.RED);
                txtEstado.setText("Conectado");
                txtEstado.setForeground(Color.GREEN);
            } else if (btnIniciar.getText().equalsIgnoreCase("Desconectar")) {
                if (cliente != null) {
                    cliente.close();
                }
                btnIniciar.setText("Conectar");
                txtEstado.setText("Desconectado");
                btnIniciar.setForeground(Color.GREEN);
                txtEstado.setForeground(Color.RED);
            }
        } catch (IOException ex) {
            System.out.println("ERROR AL CONECTAR");
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "ERROR AL CONECTAR: " + ex.getMessage());
        }
    }                                          

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (calculoImcRemoto == null) {
            JOptionPane.showMessageDialog(this, "Debe conectarse al servidor primero.");
            return;
        }
        try {
            float peso = Float.parseFloat(campoPeso.getText().trim());
            float altura = Float.parseFloat(campoAltura.getText().trim());
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("Peso: " + peso);
                        System.out.println("Altura: " + altura);
                        DatosImc datos = new DatosImc();
                        datos.setAltura(altura);
                        datos.setPeso(peso);
                        System.out.println("Enviados los datos\nEsperando respuesta");
                        datos = calculoImcRemoto.calcularImc(datos);
                        System.out.println("IMC: " + datos.getResultado() + "\nMensaje: " + datos.getInterpretacion());
                        txtResultado.setText(String.format("%.2f", datos.getResultado()));
                        txtMensaje.setText(datos.getInterpretacion());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(VentanaPrincipal.this, "ERROR con el cliente: " + ex.getMessage());
                        System.out.println("ERROR con el cliente: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                }
            };
            hilo.start();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numericos validos.");
        }
    }                                           

    public JLabel getTxtEstado() {
        return txtEstado;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton btnIniciar;
    public javax.swing.JButton btnIniciar1;
    public javax.swing.JTextField campoAltura;
    public javax.swing.JTextField campoIPServidor;
    public javax.swing.JTextField campoPeso;
    public javax.swing.JTextField campoPuertoServidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel txtEstado;
    public javax.swing.JLabel txtMensaje;
    public javax.swing.JLabel txtResultado;
    // End of variables declaration                   
}
