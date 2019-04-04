package br.com.sta.crud.todo.view.utils;

import br.com.sta.crud.todo.utils.Constants;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;

/**
 * Classe responsável por personalizar os JFrames.
 * @author Jonathan H. Medeiros
 */
public class GenericFrame extends JFrame {
    
    /**
     * Método responsável pela personalização, invocado no momento da instância 
     * da classe.
     * @author Jonathan H. Medeiros
     */
    public GenericFrame() {
        super.setIconImage(getImageLogo());
        super.removeNotify();
        super.setResizable(false);
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
