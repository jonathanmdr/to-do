package br.com.sta.crud.todo.view;

import br.com.sta.crud.todo.dao.TodoDAO;
import br.com.sta.crud.todo.model.Todo;
import br.com.sta.crud.todo.model.TodoTableModel;
import br.com.sta.crud.todo.utils.FormState;
import br.com.sta.crud.todo.utils.Messages;
import br.com.sta.crud.todo.utils.TableRenderer;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableColumn;

/**
 * Classe responsável por acionar as operações CRUD da classe DAO pertinente ao
 * model todo.
 * @author Jonathan H. Medeiros
 */
public class ListTodo extends javax.swing.JFrame {

    private TodoDAO todoDAO;
    private TodoTableModel tableModel;
    private JDateChooserCellEditor dateChooser;
    private TableRenderer renderer;
    private Messages messages;
    
    private static final boolean IGNORA_MSG_LISTA_VAZIA = false;
    private static final boolean EXIBE_MSG_LISTA_VAZIA = true;

    public ListTodo() {
        initComponents();
        initApp();
        formatJTable();
        listar(IGNORA_MSG_LISTA_VAZIA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTodos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista to-do");

        jPBotoes.setBackground(new java.awt.Color(204, 204, 204));

        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(75, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(75, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotoesLayout = new javax.swing.GroupLayout(jPBotoes);
        jPBotoes.setLayout(jPBotoesLayout);
        jPBotoesLayout.setHorizontalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPBotoesLayout.setVerticalGroup(
            jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtbTodos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtbTodos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbTodos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbTodos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar(EXIBE_MSG_LISTA_VAZIA);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    public static void main(String... args) {
        setLoonkAndFell();
        java.awt.EventQueue.invokeLater(() -> {
            new ListTodo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel jPBotoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbTodos;
    // End of variables declaration//GEN-END:variables

    /**
     * Método responsável por recuperar o LookAndFell padrão do sistema operacional
     * @author Jonathan H. Medeiros
     */
    private static void setLoonkAndFell() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Método responsável por injetar as dependências necessárias da classe.
     * @author Jonathan H. Medeiros
     */
    private void initApp() {
        todoDAO = new TodoDAO();
        tableModel = new TodoTableModel();
        dateChooser = new JDateChooserCellEditor();
        renderer = new TableRenderer();
        messages = Messages.getInstance(this);        
    }

    /**
     * Método responsável pela formatação da jTable de listagem de to-do's.
     * @author Jonathan H. Medeiros
     */
    private void formatJTable() {
        jtbTodos.setModel(tableModel);
        
        TableColumn colDataCriacao = jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_CRIACAO);
        TableColumn colDataEdicao = jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_EDICAO);
        TableColumn colDataConclusao = jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_CONCLUSAO);
        
        colDataCriacao.setCellEditor(dateChooser);
        colDataEdicao.setCellEditor(dateChooser);
        colDataConclusao.setCellEditor(dateChooser);

        jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_ID).setPreferredWidth(80);
        jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_TITULO).setPreferredWidth(275);
        jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_CRIACAO).setPreferredWidth(80);
        jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_EDICAO).setPreferredWidth(80);
        jtbTodos.getColumnModel().getColumn(TodoTableModel.COL_DATA_CONCLUSAO).setPreferredWidth(80);
        
        for (int collumn = 0; collumn < tableModel.getColumnCount(); collumn ++) {
            jtbTodos.setDefaultRenderer(jtbTodos.getColumnClass(collumn), renderer);
        }
    }

    /**
     * Método responsável por realizar a listagem de to-do's na jTable.
     * @param exibeMensagem - validação para exibir ou não a mensagem de que não
     * existem dados para listagem.
     * @author Jonathan H. Medeiros
     */
    private void listar(boolean exibeMensagem) {
        tableModel.reload(todoDAO.findAll());

        if (tableModel.getRowCount() == 0 && exibeMensagem) {
            messages.messageDialogInformation("Não existem dados para exibir!", "Lista vazia");
        }
    }

    /**
     * Método responsável por realizar a exclusão dos registros.
     * @author Jonathan H. Medeiros
     */
    private void excluir() {
        if (jtbTodos.getSelectedRow() > -1) {
            if (messages.confirmDialogYesNoOption("Confirma a exlusão do registro?", "Exclusão") == JOptionPane.YES_OPTION) {

                Todo todo = todoDAO.findById(getIdTodo());
                todoDAO.delete(todo);

                listar(IGNORA_MSG_LISTA_VAZIA);
                
                messages.messageDialogInformation("Registro excluído com sucesso!", "Sucesso");
            }
        } else {
            messages.messageDialogWarning("Selecione um registro para exclusão!", "Atenção");
        }
    }

    /**
     * Método responsável por salvar um novo registro.
     * @param todo - modelo todo é esperado devidamente preenchido para ser salvo.
     * @author Jonathan H. Medeiros
     */
    private void salvar(Todo todo) {
        if (validarCamposObrigatoriosVazios(todo)) {
            todoDAO.save(todo);
            listar(IGNORA_MSG_LISTA_VAZIA);
            messages.messageDialogInformation("Salvo com sucesso!", "Sucesso");
        }
    }

    /**
     * Método responsável por realizar a atualização de informaçoes em um registro.
     * @param todo - modelo todo é esperado devidamente preenchido para ser atualizado.
     * @author Jonathan H. Medeiros
     */
    private void atualizar(Todo todo) {
        if (validarCamposObrigatoriosVazios(todo)) {
            todoDAO.update(todo);
            listar(IGNORA_MSG_LISTA_VAZIA);
            messages.messageDialogInformation("Atualizado com sucesso!", "Sucesso");
        }
    }
    
    /**
     * Método responsável por verificar se os campos obrigatóriso estão
     * devidamente preenchidos para realizar as operações de savar e atualizar.
     * @param todo - Recebe o modelo para validação dos atributos que são obrigatórios.
     * @return true se todos os campos estivrerem devidamente preenchidos e false
     * caso algum campo obrigatório esteja nulo ou vazio.
     * @author Jonathan H. Medeiros
     */
    private boolean validarCamposObrigatoriosVazios(Todo todo) {
        if (todo.getTitulo() != null && !todo.getTitulo().trim().isEmpty()) {
            return true;
        }
        
        return false;
    }

    /**
     * Método responsável por acionar a tela de cadastro de novos registros.
     * @author Jonathan H. Medeiros
     */
    private void novo() {
        Todo todo = new Todo();
        EditTodo editTodo = new EditTodo(this, true, todo, FormState.INCLUSAO);
        editTodo.setVisible(true);

        editTodo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                if (!editTodo.BTN_CANCEL_PRESS) {
                    salvar(todo);
                }
            }
        });       
    }

    /**
     * Método responsável por acinar a tela de cadastro de registro devidamente
     * preenchido com o registro que foi previamente selecionado para editar.
     * @author Jonathan H. Medeiros
     */
    private void editar() {
        if (jtbTodos.getSelectedRow() > -1) {
            Todo todo = todoDAO.findById(getIdTodo());
            EditTodo editTodo = new EditTodo(this, true, todo, FormState.ALTERACAO);
            editTodo.setVisible(true);

            editTodo.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    if (!editTodo.BTN_CANCEL_PRESS) {
                        atualizar(todo);
                    }
                }
            });            
        } else {
            messages.messageDialogWarning("Selecione um registro para edição!", "Atenção");
        }
    }
    
    /**
     * Método responsável por retornar um ID da Todo selecionada pelo usuário.
     * @return Long - ID Todo
     * @author Jonathan H. Medeiros
     */
    private Long getIdTodo() {
        return (Long) tableModel.getValueAt(jtbTodos.getSelectedRow(), TodoTableModel.COL_ID);
    }

}
