package br.com.sta.crud.todo.view.utils;

import br.com.sta.crud.todo.utils.Constants;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
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
        super.setIconImage(getImageLogo());
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
        super.setIconImage(getImageLogo());
    }
    
    /**
     * Método responsável por carregar o logotipo.
     * @return Image - Logotipo.
     * @author Jonathan H. Medeiros
     */
    private Image getImageLogo() {
        URL url = this.getClass().getClassLoader().getResource(Constants.ICON);
        Image logo = Toolkit.getDefaultToolkit().getImage(url);
        
        return logo;
    }
    
}
