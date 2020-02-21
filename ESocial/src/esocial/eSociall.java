package esocial;


import Connection.ConnectionFactory;
import DAO.FuncionarioDAO;
import Listas.Lista_Fun;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class eSociall extends javax.swing.JFrame {
    public eSociall() {
        initComponents();
        
    }
FuncionarioDAO dao=new FuncionarioDAO();
Funcionario fun;

Lista_Fun listaFun = new Lista_Fun();
/*
Este código demonstra exemplos da utilização de listas para armazanamento, tabelas de informação no jframe e 
conexão e armazenamento com banco de dados
*/
    @SuppressWarnings("ConvertToTryWithResources")
    


public void bd_atualizaTable() throws SQLException{
        Connection con = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM funcionários";
        
     @SuppressWarnings("UnusedAssignment")
        PreparedStatement stmt = null;
        ResultSet rs = null;
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        
        while(rs.next()){
                    fun = new Funcionario(
                    Integer.parseInt(rs.getString("idFuncionários")),
                    Float.parseFloat(rs.getString("Salário")),
                    rs.getString("Nome"),
                    rs.getString("CPF"),
                    rs.getString("Email"),
                    rs.getString("Telefone"),
                    rs.getString("Admissão"),
                    rs.getString("Nascimento"),
                    rs.getString("Cor"),
                    rs.getString("Escolaridade"),
                    rs.getString("Sexo"),
                    rs.getString("NumNIS"),
                    rs.getString("NumCT")
              
            );
            DefaultTableModel dtmfuns = (DefaultTableModel) TabFun.getModel();
            Object [] dados = {fun.getNome(),fun.getCpf(),fun.getEmail()};
            dtmfuns.addRow(dados);
            
  }}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        sexo = new javax.swing.ButtonGroup();
        cor = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        CunjuntoGuias = new javax.swing.JTabbedPane();
        CadastroFuncionário = new javax.swing.JPanel();
        tituloFuncionario = new javax.swing.JLabel();
        NomeFuncionario = new javax.swing.JLabel();
        cpfFuncionario = new javax.swing.JLabel();
        numNis = new javax.swing.JLabel();
        numeroCarteiraTrabalho = new javax.swing.JLabel();
        telefoneFuncionario = new javax.swing.JLabel();
        emailFuncionario = new javax.swing.JLabel();
        nomeFun = new javax.swing.JTextField();
        cpfFun = new javax.swing.JTextField();
        numeroNIS = new javax.swing.JTextField();
        numeroCT = new javax.swing.JTextField();
        telefoneFun = new javax.swing.JTextField();
        emailFun = new javax.swing.JTextField();
        salario = new javax.swing.JLabel();
        escolaridade = new javax.swing.JLabel();
        TipoCor = new javax.swing.JLabel();
        sexoFuncionario = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        negro = new javax.swing.JRadioButton();
        amarelo = new javax.swing.JRadioButton();
        branco = new javax.swing.JRadioButton();
        pardo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDataNas = new javax.swing.JFormattedTextField();
        txtDataAdm = new javax.swing.JFormattedTextField();
        INCLUIR_FUN = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        Fundamental = new javax.swing.JRadioButton();
        Medio = new javax.swing.JRadioButton();
        Superior = new javax.swing.JRadioButton();
        salarioFun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabFun = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloFuncionario.setText(" Cadastro de Funcinários");
        tituloFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeFuncionario.setText("Nome:");

        cpfFuncionario.setText("CPF:");

        numNis.setText("Número NIS:");

        numeroCarteiraTrabalho.setText("Número CT:");

        telefoneFuncionario.setText("Telefone:");

        emailFuncionario.setText("E-mail:");

        cpfFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFunActionPerformed(evt);
            }
        });

        numeroNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroNISActionPerformed(evt);
            }
        });

        numeroCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCTActionPerformed(evt);
            }
        });

        salario.setText("Salário:");

        escolaridade.setText("Escolaridade:");

        TipoCor.setText("Cor:");

        sexoFuncionario.setText("Sexo:");

        sexo.add(masculino);
        masculino.setText("Masculino");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });

        sexo.add(feminino);
        feminino.setText("Feminino");

        cor.add(negro);
        negro.setText("Negro");
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActionPerformed(evt);
            }
        });

        cor.add(amarelo);
        amarelo.setText("Amarelo");

        cor.add(branco);
        branco.setText("Branco");

        cor.add(pardo);
        pardo.setText("Pardo");
        pardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pardoActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de nascimento:");

        jLabel6.setText("Data de admissão:");

        try {
            txtDataNas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataAdm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        INCLUIR_FUN.setText("Incluir");
        INCLUIR_FUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INCLUIR_FUNActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        buttonGroup6.add(Fundamental);
        Fundamental.setText("Fundamental");

        buttonGroup6.add(Medio);
        Medio.setText("Médio");

        buttonGroup6.add(Superior);
        Superior.setText("Superior");

        salarioFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioFunActionPerformed(evt);
            }
        });

        TabFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CPF", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(TabFun);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroFuncionárioLayout = new javax.swing.GroupLayout(CadastroFuncionário);
        CadastroFuncionário.setLayout(CadastroFuncionárioLayout);
        CadastroFuncionárioLayout.setHorizontalGroup(
            CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                        .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(INCLUIR_FUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                        .addComponent(telefoneFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(emailFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailFun, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                        .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                .addComponent(NomeFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sexoFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(feminino))
                            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                .addComponent(cpfFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfFun, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(escolaridade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fundamental)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Medio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Superior))
                            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                        .addComponent(numNis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numeroNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                        .addComponent(salario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salarioFun, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                        .addComponent(numeroCarteiraTrabalho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numeroCT))))
                            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                                .addComponent(TipoCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(negro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amarelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(branco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pardo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CadastroFuncionárioLayout.setVerticalGroup(
            CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                .addComponent(tituloFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeFuncionario)
                    .addComponent(nomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoFuncionario)
                    .addComponent(masculino)
                    .addComponent(feminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolaridade)
                    .addComponent(Fundamental)
                    .addComponent(Medio)
                    .addComponent(Superior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCor)
                    .addComponent(negro)
                    .addComponent(amarelo)
                    .addComponent(branco)
                    .addComponent(pardo)
                    .addComponent(jLabel5)
                    .addComponent(txtDataNas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numNis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCarteiraTrabalho)
                    .addComponent(numeroCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salario)
                    .addComponent(salarioFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneFuncionario)
                    .addComponent(telefoneFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailFuncionario)
                    .addComponent(emailFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroFuncionárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroFuncionárioLayout.createSequentialGroup()
                        .addComponent(INCLUIR_FUN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CunjuntoGuias.addTab("Cad-Funcionário", CadastroFuncionário);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CunjuntoGuias)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CunjuntoGuias)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salarioFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioFunActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

        try {
            
            listaFun = dao.bd_lista();
        } catch (SQLException ex) {
            System.err.println("#Erro ao atualizar lista!!!");
        }
        fun = listaFun.retorna(nomeFun.getText());
        nomeFun.setText(fun.getNome());
        cpfFun.setText(fun.getCpf());
        telefoneFun.setText(fun.getTelefone());
        emailFun.setText(fun.getEmail());
        switch (fun.getCor()) {
            case "Branca":
            branco.setSelected(true);
            break;
            case "Negro":
            negro.setSelected(true);
            break;
            case "Pardo":
            pardo.setSelected(true);
            break;
            case "Amarelo":
            amarelo.setSelected(true);
            break;
            default:
            break;
        }

        if(fun.getSexo().equals("Masculino")){
            masculino.setSelected(true);
        }
        else{
            feminino.setSelected(true);
        }
        switch (fun.getEscolaridade()) {
            case "Fundamental":
            Fundamental.setSelected(true);
            break;
            case "Medio":
            Medio.setSelected(true);
            break;
            case "Superior":
            Superior.setSelected(true);
            break;
            default:
            break;
        }

        numeroNIS.setText(fun.getNumNis());
        numeroCT.setText(fun.getNumCT());
        txtDataNas.setText(fun.getDataNascimento());      
        txtDataAdm.setText(fun.getDataAdmissão());
        salarioFun.setText(Float.toString(fun.getSalario()));
    }//GEN-LAST:event_pesquisarActionPerformed

//GEN-FIRST:event_excluirActionPerformed

//GEN-LAST:event_excluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
       
        fun = null;
        listaFun.del(nomeFun.getText());
        //del
        DefaultTableModel dtmfuns = (DefaultTableModel) TabFun.getModel();
        int x=0;
        while(!dtmfuns.getValueAt(x, 0).equals(nomeFun.getText())){
              x++;
        }
        dtmfuns.removeRow(x);
        
        float sal;int ID;
        ID = Integer.parseInt(cpfFun.getText());
        sal = Float.parseFloat(salarioFun.getText());
        fun = new Funcionario(ID,sal,nomeFun.getText(),cpfFun.getText(),emailFun.getText(),telefoneFun.getText(),
            txtDataAdm.getText(),txtDataNas.getName(),TipoCor(),TipoEscolaridade(),TipoSexo(),numeroNIS.getText(),
            numeroCT.getText()
           );

        try {
            
            listaFun.add(fun);
            dao.bd_update(fun);
            listaFun = dao.bd_lista();
     
            //Add
            //DefaultTableModel dtmfuns = (DefaultTableModel) TabFun.getModel();
            Object [] dados = {nomeFun.getText(),cpfFun.getText(),emailFun.getText()};
            dtmfuns.addRow(dados);
            //bd_atualizaTable();
            
        } catch (SQLException ex) {
            System.err.println("# Erro ao adicionar na lista!!"+ex);
        }
        
        cor.clearSelection();
        sexo.clearSelection();
        buttonGroup6.clearSelection();
        masculino.setSelected(false);
        feminino.setSelected(false);
        numeroNIS.setText("");
        numeroCT.setText("");
        txtDataNas.setText("");
        txtDataAdm.setText("");
        salarioFun.setText("");
        nomeFun.setText("");
        cpfFun.setText("");
        emailFun.setText("");
        telefoneFun.setText("");
    }//GEN-LAST:event_alterarActionPerformed

    private void INCLUIR_FUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INCLUIR_FUNActionPerformed

        if( nomeFun.getText().equals("") ||
            cpfFun.getText().equals("") ||
            telefoneFun.getText().equals("") ||
            emailFun.getText().equals("") ||
            salarioFun.getText().equals("") ||
            txtDataNas.getText().equals("") ||
            txtDataAdm.getText().equals("") ||          
            numNis.getText().equals("") ||
            numeroCT.getText().equals("") ||
            !amarelo.isSelected() &&
            !negro.isSelected()  &&
            !branco.isSelected() &&
            !pardo.isSelected() ||
            !masculino.isSelected() &&
            !feminino.isSelected() ||
            !Fundamental.isSelected()  &&
            !Medio.isSelected()  &&
            !Superior.isSelected()
        ){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        } else {

           float sal = Float.parseFloat(salarioFun.getText());
           int id = Integer.parseInt(cpfFun.getText());
           fun = new Funcionario(id,sal,nomeFun.getText(),cpfFun.getText(),emailFun.getText(),telefoneFun.getText(),
            txtDataAdm.getText(),txtDataNas.getText(),TipoCor(),TipoEscolaridade(),TipoSexo(),numeroNIS.getText(),
            numeroCT.getText()
           );

            DefaultTableModel dtmfuns = (DefaultTableModel) TabFun.getModel();
            Object [] dados = {nomeFun.getText(),cpfFun.getText(),emailFun.getText()};
            dtmfuns.addRow(dados);

            try {
                listaFun.add(fun);
                dao.db_save(fun);
                listaFun = dao.bd_lista();
                
            } catch (SQLException ex) {
                 System.err.println("#Erro ao adicionar na lista!!"+ex);
            }
            cor.clearSelection();
            sexo.clearSelection();
            buttonGroup6.clearSelection();
            masculino.setSelected(false);
            feminino.setSelected(false);
            numeroNIS.setText("");
            numeroCT.setText("");
            txtDataNas.setText("");
            txtDataAdm.setText("");
            salarioFun.setText("");
            nomeFun.setText("");
            cpfFun.setText("");
            emailFun.setText("");
            telefoneFun.setText("");
            //TABELA

        }
    }//GEN-LAST:event_INCLUIR_FUNActionPerformed

    private void pardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pardoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pardoActionPerformed

    private void negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_negroActionPerformed

    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masculinoActionPerformed

    private void numeroCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCTActionPerformed

    private void numeroNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroNISActionPerformed

    private void cpfFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFunActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       if( nomeFun.getText().equals("") ||
            cpfFun.getText().equals("") ){
           JOptionPane.showMessageDialog(this, "Insira o nome e cpf.");
       
       }else{
            try {
                dao.bd_deleta(listaFun.retorna(nomeFun.getText()));
                listaFun = dao.bd_lista();
                bd_atualizaTable();
            
            } catch (SQLException ex) {
                System.err.println("#Erro na funcao bd_deleta"+ex);
            }
           listaFun.del(nomeFun.getText());
       }
        DefaultTableModel dtmfuns = (DefaultTableModel) TabFun.getModel();
        int x=0;
        while(!dtmfuns.getValueAt(x, 0).equals(nomeFun.getText())){
              x++;
        }
        dtmfuns.removeRow(x);
        

        
        cor.clearSelection();
        sexo.clearSelection();
        buttonGroup6.clearSelection();
        masculino.setSelected(false);
        feminino.setSelected(false);
        numeroNIS.setText("");
        numeroCT.setText("");
        txtDataNas.setText("");
        txtDataAdm.setText("");
        salarioFun.setText("");
        nomeFun.setText("");
        cpfFun.setText("");
        emailFun.setText("");
        telefoneFun.setText("");
    }//GEN-LAST:event_btExcluirActionPerformed

  
        
    public String TipoSexo(){
        String Sexo = null;
        if(masculino.isSelected()){
            Sexo = "Masculino";
        }
        if(feminino.isSelected()){
            Sexo = "Feminino";
        }
        return Sexo;
    }
    
    public String TipoEscolaridade(){
        String nivel = null;
        if(Fundamental.isSelected()){
            nivel = "Fundamental";
        }
        if(Medio.isSelected()){
            nivel = "Medio";
        }
        if(Superior.isSelected()){
            nivel = "Superior";
        }
        return nivel;
    }
    
    public String TipoCor(){
        String corr = null;
        
            if(pardo.isSelected()){
                corr = "Pardo";
            }
            if(negro.isSelected()){
                corr = "Negro";
            }
            if(amarelo.isSelected()){
                corr = "Amarelo";
            }
            if(branco.isSelected()){
                corr = "Branca";
            }
            return corr ;
        }

    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(eSociall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eSociall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eSociall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eSociall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new eSociall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroFuncionário;
    private javax.swing.JTabbedPane CunjuntoGuias;
    private javax.swing.JRadioButton Fundamental;
    private javax.swing.JButton INCLUIR_FUN;
    private javax.swing.JRadioButton Medio;
    private javax.swing.JLabel NomeFuncionario;
    private javax.swing.JRadioButton Superior;
    private javax.swing.JTable TabFun;
    private javax.swing.JLabel TipoCor;
    private javax.swing.JButton alterar;
    private javax.swing.JRadioButton amarelo;
    private javax.swing.JRadioButton branco;
    private javax.swing.JButton btExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.ButtonGroup cor;
    private javax.swing.JTextField cpfFun;
    private javax.swing.JLabel cpfFuncionario;
    private javax.swing.JTextField emailFun;
    private javax.swing.JLabel emailFuncionario;
    private javax.swing.JLabel escolaridade;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton negro;
    private javax.swing.JTextField nomeFun;
    private javax.swing.JLabel numNis;
    private javax.swing.JTextField numeroCT;
    private javax.swing.JLabel numeroCarteiraTrabalho;
    private javax.swing.JTextField numeroNIS;
    private javax.swing.JRadioButton pardo;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel salario;
    private javax.swing.JTextField salarioFun;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JLabel sexoFuncionario;
    private javax.swing.JTextField telefoneFun;
    private javax.swing.JLabel telefoneFuncionario;
    private javax.swing.JLabel tituloFuncionario;
    private javax.swing.JFormattedTextField txtDataAdm;
    private javax.swing.JFormattedTextField txtDataNas;
    // End of variables declaration//GEN-END:variables
}
