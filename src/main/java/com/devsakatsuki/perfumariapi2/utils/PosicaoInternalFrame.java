
package com.devsakatsuki.perfumariapi2.utils;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class PosicaoInternalFrame {
    
    //Centralizar jInternalFrame com um JPanel
    public void posicionarInternalFrame(JInternalFrame janela, JPanel desktop){
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lFrame = janela.getWidth();
        int aFrame = janela.getHeight();
        janela.setLocation(lDesk / 2 - lFrame / 2, aDesk / 2 - aFrame / 2);
        desktop.add(janela);
        janela.setVisible(true);        
    }
    
}



