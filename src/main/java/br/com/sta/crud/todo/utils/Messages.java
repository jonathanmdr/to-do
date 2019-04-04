package br.com.sta.crud.todo.utils;

import java.awt.Component;
import javax.swing.JOptionPane;
import lombok.AccessLevel;
import lombok.Getter;

/**
 * Classe Singleton responsável pela criação de mensagens.
 * @author Jonathan H. Medeiros
 */
public class Messages {
    
    private static Messages instance = null;
    
    @Getter(AccessLevel.PRIVATE)
    private final Component component;

    /**
     * Método construtor responsável por injetar as dependências necessárias na classe.
     * @param component  - Classe de origem da chamada da instância.
     * @author Jonathan H. Medeiros
     */
    private Messages(Component component) {
        this.component = component;
    }        
    
    /**
     * Método responsável por recuperar a instância da classe.
     * @param component - Classe de origem da chamada da instância.
     * @return instance
     * @author Jonathan H. Medeiros
     */
    public static Messages getInstance(Component component) {
        if (instance == null) {
            Messages.instance = new Messages(component);
        }
        
        return Messages.instance;
    }
    
    /**
     * Método responsável por emitir mensagens do tipo INFORMATION_MESSAGE.
     * @param message - Mensagem a ser exibida.
     * @param title - Título da janela de mensagem.
     * @author Jonathan H. Medeiros
     */
    public void messageDialogInformation(String message, String title) {
        JOptionPane.showMessageDialog(getComponent(), message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Método responsável por emitir mensagens do tipo WARNING_MESSAGE.
     * @param message - Mensagem a ser exibida.
     * @param title - Título da janela de mensagem.
     * @author Jonathan H. Medeiros
     */
    public void messageDialogWarning(String message, String title) {
        JOptionPane.showMessageDialog(getComponent(), message, title, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Método responsável por emitir mensagens do tipo ERROR_MESSAGE.
     * @param message - Mensagem a ser exibida.
     * @param title - Título da janela de mensagem.
     * @author Jonathan H. Medeiros
     */
    public void messageDialogError(String message, String title) {
        JOptionPane.showMessageDialog(getComponent(), message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Método responsável por emitir mensagens do tipo YES_NO_OPTION.
     * @param message - Mensagem a ser exibida.
     * @param title - Título da janela de mensagem.
     * @return (int) resposta do usuário.
     * @author Jonathan H. Medeiros
     */
    public int confirmDialogYesNoOption(String message, String title) {
        return JOptionPane.showConfirmDialog(getComponent(), message, title, JOptionPane.YES_NO_OPTION);
    }
    
    /**
     * Método responsável por emitir mensagens do tipo YES_NO_CANCEL_OPTION.
     * @param message - Mensagem a ser exibida.
     * @param title - Título da janela de mensagem.
     * @return (int) resposta do usuário.
     * @author Jonathan H. Medeiros
     */
    public int confirmDialogYesNoCancelOption(String message, String title) {
        return JOptionPane.showConfirmDialog(getComponent(), message, title, JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
}
