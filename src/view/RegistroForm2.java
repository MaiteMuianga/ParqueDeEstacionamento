/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Controller.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import model.UniversalModel.*;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Jaime Rungo
 */
public class RegistroForm2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroForm
     */
    
    
    Color defaultColor;
    Color clickedColor;
    DefaultListModel Modelo  = new DefaultListModel();
    int Enter=0;
    CarroDao carroBd = new CarroDao();
            Carro car = new Carro();
            NoPatio np = new NoPatio();
            MostrarTodos mt = new MostrarTodos();
            Saida sd = new Saida();
            
    
    public RegistroForm2() {
        initComponents();
        
        
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df2 = new SimpleDateFormat("HH:mm");
        dataEntrada.setText(df.format(date));
        horaEntrada.setText(df2.format(date));
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        defaultColor = new Color(28,175,154);
        clickedColor = new Color(255,255,255);
        
        lista.setVisible(false);
        
        lista.setModel(Modelo);
    }
    
    public double Valor(int min,int horas, int dias){
        
        if(dias==0){
            if(horas==0){
                
                if(min<=15){
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig15();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto15();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes15();
                    } 
                }
                
                
            }
            
            if(min>16 && min<=30){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig30();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto30();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes30();
                    } 
                }
                
            }
            
            if(min>30 && min<=45){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig45();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto45();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes45();
                    } 
                }
                
            }
            
            if(min>45 &&min<60){
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig59();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto59();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes59();
                    } 
                }
            }
                
            }
            
            
            if(horas>0){
                
                if(min<=15){
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig15()+e.getLig59();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto15()+e.getMoto59();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes15()+e.getPes59();
                    } 
                }
                
                
            }
            
            if(min>16 && min<=30){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig30()+e.getLig59();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto30()+e.getMoto59();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes30()+e.getPes59();
                    } 
                }
                
            }
            
            if(min>30 && min<=45){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig45()+e.getLig59();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto45()+e.getMoto59();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes45()+e.getPes59();
                    } 
                }
                
            }
            
            if(min>45 &&min<60){
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLig59()+e.getLig59();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMoto59()+e.getMoto59();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPes59()+e.getPes59();
                    } 
                }
            }
                
            }
           
        }
        else{
            if(dias<15 && dias!=0){
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLigDiario();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMotoDiario();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPesDiario();
                    } 
                }
            }
            if(dias==15){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLigDiario();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMotoDiario();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPesDiario();
                     
                    } 
                }
                
            }
            
            if(dias>=25 &&dias <=31){
                
                if(car.getTipo().equalsIgnoreCase("Ligeiro")){
                    for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
                     return e.getLigMensal();
                    }
                }
                if(car.getTipo().equalsIgnoreCase("Moto")){
                   for (PrecoMoto e : PrecoMotoDao.lista()) {
                     return e.getMotoMensal();
                    } 
                }
                if(car.getTipo().equalsIgnoreCase("Pesado")){
                   for (PrecoPesado e : PrecoPesadoDao.lista()) {
                     return e.getPesMensal();
                    } 
                }
                
            }
        }
        
        
        return 1;
    }
    
    public void CalculaDatas(String dateStart,String dateEnd){
        try{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        Date d1=null;
        Date d2= null;
        
        d1 = format.parse(dateStart);
        d2 = format.parse(dateEnd);
        
        
        long diff = d2.getTime()-d1.getTime();
        
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);
        
        int dias = (int)diffDays;
        int horas = (int)diffHours;
        int min = (int)diffMinutes;
             int disPh = dias*24;
            System.out.println("Intervalo: "+horas+" e "+min+" Minutos");
            System.out.println("Dias: "+dias);
            car.setDias(dias);
            car.setMinutos(min);
            car.setHoras(horas);
            
        
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Problema com as datas","", JOptionPane.DEFAULT_OPTION, 1); 
        }
    }
    
    public void ListaDePesquisa(String mat){
        int v=0;
        
        Modelo.removeAllElements();
        for (Carro e : CarroDaoDelete.search(mat.substring(v))){
            
            while(v<4){
                Modelo.add(v, e.getMatricula());
                 //Modelo.addElement(e.getMatricula());  
                 
                 v++;
            }
           
        }
    }
    
    public void SetarDados(String mat){
        for (Carro e : CarroDaoDelete.lista()){
            if(mat.equalsIgnoreCase(e.getMatricula())){
                matricula.setText(e.getMatricula());
                marca.setText(e.getMarca());
                modelo.setText(e.getModelo());
                ano.setText(String.valueOf(e.getAno()));
                cor.setText(e.getCor());
                proprietario.setText(e.getProprietario());
                contacto.setText(e.getContacto());
                endereco.setText(e.getEndereco());
                
                
                
                
            }
            
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        proprietario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dataEntrada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        horaEntrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        horaSaida = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        obs = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dataSaidaChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tipoCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        contacto = new javax.swing.JTextField();
        lista = new javax.swing.JList<>();

        setMinimumSize(new java.awt.Dimension(850, 620));

        jPanel2.setBackground(new java.awt.Color(228, 231, 234));

        jPanel1.setBackground(new java.awt.Color(228, 231, 234));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel3.setText("Marca");

        marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel6.setText("Cor");

        cor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel7.setText("Nome Do Proprietario");

        proprietario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel9.setText("Endereco");

        endereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel8.setText("Data de Entrada");

        dataEntrada.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel10.setText("Hora de Entrada");

        horaEntrada.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel11.setText("Hora de Saida");

        horaSaida.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel14.setText("Data de Saida");

        jButton1.setBackground(new java.awt.Color(28, 175, 154));
        jButton1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/save_close_32px.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(28, 175, 154));
        jButton2.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/broom_32px.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        obs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(247, 77, 96));
        jLabel15.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(247, 77, 96));
        jLabel15.setText("Obseravacao");

        dataSaidaChooser.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(cor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(marca, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataSaidaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataSaidaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addGap(229, 229, 229))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/car_100px.png"))); // NOI18N
        jLabel12.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel1.setText("Matricula");

        matricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matriculaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matriculaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel2.setText("Tipo de Veiculo");

        tipoCombo.setEditable(true);
        tipoCombo.setForeground(new java.awt.Color(1, 1, 1));
        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ligeiro", "Pesado", "Moto", " " }));
        tipoCombo.setBorder(null);
        tipoCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipoCombo.setFocusCycleRoot(true);

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel5.setText("Ano");

        ano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel4.setText("Modelo");

        modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel13.setText("Contacto");

        contacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AAL-232-MC", "ABC-726-MC", "AJD-497-MC", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoCombo, 0, 311, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(modelo))))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(contacto))
                .addGap(233, 233, 233))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             dataEntrada.setText(" ");
             marca.setText(" ");
             modelo.setText(" ");
             ano.setText(" ");
             cor.setText(" ");
             proprietario.setText(" ");
             contacto.setText(" ");
             matricula.setText(" ");
             endereco.setText(" ");
             horaEntrada.setText(" ");
             horaSaida.setText(" ");
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            
            
            try{
            if(!matricula.getText().trim().equals("")||!marca.getText().trim().equals("")){
                car.setMatricula(matricula.getText().toUpperCase());
                car.setMarca(marca.getText().toUpperCase());
                car.setModelo(modelo.getText().toUpperCase());
                car.setAno(Integer.parseInt(ano.getText().toUpperCase()));
                car.setTipo(tipoCombo.getSelectedItem().toString());
                car.setContacto(contacto.getText().toUpperCase());
                car.setCor(cor.getText().toUpperCase());
                car.setProprietario(proprietario.getText().toUpperCase());
                car.setEndereco(endereco.getText().toUpperCase());
                car.setDataEntrada(dataEntrada.getText().toUpperCase());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String dataSaida = sdf.format(dataSaidaChooser.getDate());
                car.setDataSaida(dataSaida);
                
                //car.setDataSaida(dataSaidaChooser.getText().toUpperCase());
                car.setHoraEntrada(horaEntrada.getText().toUpperCase());
                car.setHoraSaida(horaSaida.getText().toUpperCase());
                car.setObs(obs.getText().toUpperCase());
                
                String dateStart = dataEntrada.getText()+" "+horaEntrada.getText();
                String dateEnd  = dataSaida+" "+horaSaida.getText();
                CalculaDatas(dateStart, dateEnd);
                System.out.println("getetet: "+car.getHoras()+" e "+car.getMinutos());
                car.setHoras(car.getHoras());
                car.setMinutos(car.getMinutos());
                car.setDias(car.getDias());
                car.setValor(Valor(car.getMinutos(), car.getHoras(), car.getDias()));
                System.out.println("valor: "+car.getValor());
                carroBd.create(car);
                JOptionPane.showConfirmDialog(null, "Salvo com sucesso","", JOptionPane.DEFAULT_OPTION, 1);
                JOptionPane.showConfirmDialog(null, "O Cliente Vai Pagar "+car.getValor()+"0 MT","", JOptionPane.DEFAULT_OPTION, 1);
            }
            else {
                JOptionPane.showMessageDialog(null, "Algum Campo *Obrigatorio* Esta Vazio","Alerta",JOptionPane.WARNING_MESSAGE);
            }
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Falha ao salvar","", JOptionPane.DEFAULT_OPTION, 1); 
            }
            np.readJTable();
            mt.readJTable();
            sd.readJTable();
    }//GEN-LAST:event_jButton1MouseClicked

    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactoActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void matriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaKeyPressed
           
           if(matricula.getText().toUpperCase().equals("")){
             lista.setVisible(false);  
           }
           else{
               lista.setVisible(true);
               ListaDePesquisa(matricula.getText().toUpperCase());
           }
    }//GEN-LAST:event_matriculaKeyPressed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
        lista.setVisible(false);
        Enter =1;
    }//GEN-LAST:event_matriculaActionPerformed

    private void matriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaKeyReleased
      if(Enter ==0){
          ListaDePesquisa(matricula.getText().toUpperCase());
      }
      else{
          Enter =0;
      }
    }//GEN-LAST:event_matriculaKeyReleased

    private void listaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMousePressed
        String mat = (String) lista.getSelectedValue();
        System.out.println(mat);
        lista.setVisible(false);
        SetarDados(mat);
    }//GEN-LAST:event_listaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JTextField contacto;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField dataEntrada;
    private com.toedter.calendar.JDateChooser dataSaidaChooser;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField horaEntrada;
    private javax.swing.JTextField horaSaida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField obs;
    private javax.swing.JTextField proprietario;
    private javax.swing.JComboBox<String> tipoCombo;
    // End of variables declaration//GEN-END:variables
}
