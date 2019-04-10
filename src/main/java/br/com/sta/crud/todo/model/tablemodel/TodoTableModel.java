package br.com.sta.crud.todo.model.tablemodel;

import br.com.sta.crud.todo.model.Todo;
import java.time.LocalDate;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe responsável por abstrair um TableModel para exibição de dados em uma jTable.
 * @author Jonathan H. Medeiros
 */
public class TodoTableModel extends AbstractTableModel {
    
    public static final int COL_ID = 0;
    public static final int COL_TITULO = 1;
    public static final int COL_DATA_CRIACAO = 2;
    public static final int COL_DATA_EDICAO = 3;
    public static final int COL_DATA_CONCLUSAO = 4;

    private List<Todo> todos;

    private final String[] colNames = {"Código", "Título", "Criação", "Alteração", "Conclusão"};

    private final Class<?>[] colTypes = {Long.class, String.class, LocalDate.class, LocalDate.class, LocalDate.class};

    public TodoTableModel() {
    }

    public void reload(List<Todo> todos) {
        this.todos = todos;
        fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return colTypes[coluna];
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return colNames[coluna];
    }

    @Override
    public int getRowCount() {
        if (todos == null) {
            return 0;
        }
        return todos.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Todo t = todos.get(linha);
        switch (coluna) {
            case COL_ID:
                return t.getId();
            case COL_TITULO:
                return t.getTitulo();
            case COL_DATA_CRIACAO:
                return t.getDataCriacao();
            case COL_DATA_EDICAO:
                return t.getDataEdicao();
            case COL_DATA_CONCLUSAO:
                return t.getDataConclusao();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Todo getTodoAt(int index) {
        return todos.get(index);
    }

}
