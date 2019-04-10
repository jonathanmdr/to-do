package br.com.sta.crud.todo.utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Classe responsável por modificar o renderer das linhas da jTable
 * @author Jonathan H. Medeiros
 */
public class TableRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(row % 2 == 0){
            comp.setForeground(Color.BLACK);
            comp.setBackground(Color.WHITE);
        } else {
            comp.setForeground(Color.BLACK);
            comp.setBackground(Color.LIGHT_GRAY);
        }
        
        if (isSelected) {
            comp.setForeground(table.getSelectionForeground());
            comp.setBackground(table.getSelectionBackground());
        }
        
        return comp;
    }
    
}
