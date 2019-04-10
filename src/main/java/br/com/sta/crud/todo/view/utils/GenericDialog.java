package br.com.sta.crud.todo.view.utils;

import java.awt.Frame;
import javax.swing.JDialog;

/**
 * Classe responsável por personalizar os JDialogs.
 * @author Jonathan H. Medeiros
 */
public class GenericDialog extends JDialog {
    
    /**
     * Método responsável pela personalização, invocado no momento da instância 
     * da classe.
     * @author Jonathan H. Medeiros
     */
    public GenericDialog() {
        super.setIconImage(ImageResource.getInstance().getImageLogo());
    }
    
    /**
     * Método responsável pela personalização, invocado no momento da instância 
     * da classe.     
     * @param owner - Frame de origem da instância.
     * @param modal - Habilita modal da JDialog.
     * @author Jonathan H. Medeiros
     */
    public GenericDialog(Frame owner, boolean modal) {
        super(owner, modal);                       
        super.setIconImage(ImageResource.getInstance().getImageLogo());
    }
    
}
