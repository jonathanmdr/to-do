package br.com.sta.crud.todo.view.utils;

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
        super.setIconImage(ImageResource.getInstance().getImageLogo());
        super.removeNotify();
        super.setResizable(false);
    }        
    
}
