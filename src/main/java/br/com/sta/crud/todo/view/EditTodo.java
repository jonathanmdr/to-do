package br.com.sta.crud.todo.view;

import br.com.sta.crud.todo.model.Todo;
import br.com.sta.crud.todo.utils.FormState;
import br.com.sta.crud.todo.utils.LimitDocument;
import java.awt.Frame;
import java.util.Date;

/**
 * Classe responsável por recuperar as informações de cadastro e edição de um 
 * model todo.
 * @author Jonathan H. Medeiros
 */
public class EditTodo extends javax.swing.JDialog {
    
    private final Todo todo;
    private final int ESTADO_DO_FORM;
    public boolean BTN_CANCEL_PRESS;
    
    /**
     * Método construtor da classe
     * @param parent - frame que originou a instância desta classe
     * @param modal - informa se essa classe é uma modal
     * @param todo - modelo de todo
     * @param estado - true indica estado de esdição e false estados de cadastro
     * @author Jonathan H. Medeiros
     */
    public EditTodo(Frame parent, boolean modal, Todo todo, int estado) {
        super(parent, modal);
        initComponents();
        
        this.todo = todo;
        this.ESTADO_DO_FORM = estado;
        this.BTN_CANCEL_PRESS = false;
        initApp();
        setTodo(todo);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputVerifyFieldEmpty1 = new br.com.sta.crud.todo.utils.InputVerifyFieldEmpty();
        jPBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jCBStatus = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro to-do");

        jPBotoes.setBackground(new java.awt.Color(204, 204, 204));
        jPBotoes.setPreferredSize(new java.awt.Dimension(100, 45));

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(73, 23));
        btnSalvar.setMinimumSize(new java.awt.Dimension(73, 23));
        btnSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(73, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(73, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotoesLayout = new javax.swing.GroupLayout(jPBotoes);
        jPBotoes.setLayout(jPBotoesLayout);
        jPBotoesLayout.setHorizontalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBotoesLayout.setVerticalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("<html>Código<b>*</b></html>");

        jTFid.setEditable(false);
        jTFid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("<html>Título<b>*</b></html>");

        jTFTitulo.setInputVerifier(inputVerifyFieldEmpty1);
        jTFTitulo.setName("título"); // NOI18N

        jCBStatus.setText("<html>Concluído?<b>*</b></html>");

        jLabel3.setText("Descrição");

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("Campos obrigatórios marcados com *.");

        javax.swing.GroupLayout jPDadosLayout = new javax.swing.GroupLayout(jPDados);
        jPDados.setLayout(jPDadosLayout);
        jPDadosLayout.setHorizontalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTitulo)
                    .addGroup(jPDadosLayout.createSequentialGroup()
                        .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPDadosLayout.createSequentialGroup()
                        .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPDadosLayout.setVerticalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.BTN_CANCEL_PRESS = true;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        returnTodo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private br.com.sta.crud.todo.utils.InputVerifyFieldEmpty inputVerifyFieldEmpty1;
    private javax.swing.JCheckBox jCBStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPBotoes;
    private javax.swing.JPanel jPDados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTextField jTFid;
    // End of variables declaration//GEN-END:variables

    /**
     * Método responsável por montar o modelo de todo de acordo com as informações
     * digitadas no formulário de cadastro de to-do's.
     * @return model todo
     * @author Jonathan H. Medeiros
     */
    private Todo getTodo() {
        if (this.ESTADO_DO_FORM == FormState.ALTERACAO) {
            this.todo.setId(Long.parseLong(jTFid.getText()));
        }
        
        this.todo.setTitulo(jTFTitulo.getText());
        this.todo.setDescricao(jTADescricao.getText());
        this.todo.setStatus(jCBStatus.isSelected());
        
        if (this.ESTADO_DO_FORM == FormState.INCLUSAO) {
            this.todo.setDataCriacao(new Date());
        }
        
        this.todo.setDataEdicao(this.ESTADO_DO_FORM == FormState.INCLUSAO ? null : new Date());
        this.todo.setDataConclusao(retornaDataConclusao());
        
        return this.todo;
    }
    
    /**
     * Método responsável por apresentar as informações do modelo de todo 
     * recebido por parâmetro no formulário de cadastro.
     * @param todo - model todo
     * @author Jonathan H. Medeiros
     */
    private void setTodo(Todo todo) {
        if (todo.getId() != null ) {
            jTFid.setText(Long.toString(todo.getId()));
        }
        
        jTFTitulo.setText(todo.getTitulo());
        jTADescricao.setText(todo.getDescricao());
        
        if (todo.getStatus() != null) {
            jCBStatus.setSelected(todo.getStatus());
        }
    }
    
    /**
     * Método responsável por validar se os campos obrigatórios foram devidamente preenchidos.
     * @return true se campos obrigatórios estão vazios e false se estiverem preenchidos. 
     * @author Jonathan H. Medeiros
     */
    private boolean validaCamposObrigatorios() {
        return jTFTitulo.getText().trim().isEmpty();
    }
    
    /**
     * Método responsável por recuperar as informações através do getTodo() caso
     * a validação do método validaCamposObrigatorios() tenha retornado false.
     * O mesmo acionado sempre pelo evento click do botão salvar.
     * @author Jonathan H. Medeiros
     */
    public void returnTodo() {
        if (validaCamposObrigatorios()) {
            return;
        }
        
        getTodo();
        this.dispose();
    }

    /**
     * Método responsável por atribuir a data de conclusão quando a task estiver 
     * com o flag de conclusão selecionado.
     * @return data de conslusão da task.
     * @author Jonathan H. Medeiros
     */
    private Date retornaDataConclusao() {
        Date data = null;
        
        if (jCBStatus.isSelected()) {
            data = new Date();
        }
        
        return data;
    }

    /**
     * Método responsável por realizar as configurações iniciais da classe.
     * @author Jonathan H. Medeiros
     */
    private void initApp() {
        jTFTitulo.setDocument(new LimitDocument(100));
        jTADescricao.setDocument(new LimitDocument(300));
        
        jTFTitulo.grabFocus();
    }
    
}
