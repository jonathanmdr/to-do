package br.com.sta.crud.todo.utils;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.utils.TimingUtils;

/**
 * Classe responsável por validar campos vazios e aplicar uma borda de atenção
 * juntamente com uma mensagem informativa de campo obrigatório.
 * @author Jonathan H. Medeiros
 */
public class InputVerifyFieldEmpty extends InputVerifier {

    private final Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private final Border highlightBorder = BorderFactory.createLineBorder(java.awt.Color.RED);

    @Override
    public boolean verify(JComponent input) {
        
        if (input instanceof JTextField) {
            return isCampoVazio(((JTextField) input).getText().trim());
        }

        return true;
    }

    protected boolean isCampoVazio(String conteudo) {
        return !conteudo.isEmpty();
    }

    @Override
    public boolean shouldYieldFocus(JComponent input) {
        BalloonTip myBalloonTip = new BalloonTip(input, "Campo ".concat(input.getName()).concat(" não preenchido!"));
        myBalloonTip.setVisible(false);        
        
        if (!verify(input)) {
            myBalloonTip.setVisible(true);
            TimingUtils.showTimedBalloon(myBalloonTip, 4000);
            input.setBorder(highlightBorder);
        } else {
            input.setBorder(defaultBorder);
        }

        return true;
    }
}
