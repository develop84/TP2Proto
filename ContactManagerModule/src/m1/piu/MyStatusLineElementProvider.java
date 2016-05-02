/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author pvl-vpl
 */
@ServiceProvider (service=StatusLineElementProvider.class)
public class MyStatusLineElementProvider implements StatusLineElementProvider{

    @Override
    public Component getStatusLineElement() {
        MyStatusBar msb = new MyStatusBar();
        return msb ;
    }
    
}
