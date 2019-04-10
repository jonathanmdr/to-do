package br.com.sta.crud.todo.view.utils;

import br.com.sta.crud.todo.utils.Constants;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 * Classe responsável por carregar o ícone de logotipo.
 * @author Jonathan H. Medeiros
 */
public class ImageResource {
    
    private static ImageResource instance = null;
    
    /**
     * Método construtor da classe privado para impedir instância externa do 
     * objeto mantendo o padrão Singleton para uso.
     * @author Jonathan H. Medeiros
     */
    private ImageResource() {        
    }
    
    /**
     * Método fornece a instância única do objeto.     
     * @return ImageResource - instância do objeto
     * @author Jonathan H. Medeiros
     */
    public static ImageResource getInstance() {
        if (instance == null) {
            instance = new ImageResource();
        }        
        return instance;
    }
    
    /**
     * Método responsável por carregar o logotipo.
     * @return Image - Logotipo.
     * @author Jonathan H. Medeiros
     */
    public Image getImageLogo() {
        URL url = this.getClass().getClassLoader().getResource(Constants.ICON);      
        return Toolkit.getDefaultToolkit().getImage(url);
    }
    
}
