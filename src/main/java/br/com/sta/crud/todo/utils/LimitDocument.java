package br.com.sta.crud.todo.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Permite todos os tipos de caracteres, inclusive espaços
 * apenas limita a quantidade de dígitos por campo
 * @author jhenrique
 */
public class LimitDocument extends PlainDocument{
    private int tamanhoMax = 10;
    
    public LimitDocument(int tamanhoMax){
        this.tamanhoMax = tamanhoMax;
    }
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        String stringAntiga = getText(0, getLength());
        int tamanhoNovo = stringAntiga.trim().length() + str.trim().length();

        if (tamanhoNovo <= tamanhoMax) {
            super.insertString(offset, str.toUpperCase(), attr);
        } else {
            super.insertString(offset, "", attr);
        }
    }
}
