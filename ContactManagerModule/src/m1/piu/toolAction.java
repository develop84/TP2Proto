/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Edit",
        id = "m1.piu.toolAction"
)
@ActionRegistration(
        iconBase = "m1/piu/the_customize_toolbar_icon.png",
        displayName = "#CTL_toolAction"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_toolAction=toolBar")
public final class toolAction extends AbstractAction implements Presenter.Toolbar {

    JFXPanel fxPanel;
            
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }

    @Override
    public Component getToolbarPresenter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        fxPanel = new JFXPanel();
        
        Platform.setImplicitExit(false); //Ensure JavaFX thread does not close application
        Platform.runLater(()-> { //Create FX scene outside Swing Thread
         createFXScene();
         });

         return fxPanel;
    }

    private void createFXScene() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
        try {
            Parent root = FXMLLoader.load(getClass().getResource("toolBarFXML.fxml"));
            Scene scene = new Scene(root, Color.LIGHTGREY);
            fxPanel.setScene(scene);
        } catch (IOException e) {
            Exceptions.printStackTrace(e);
        }

    }
}
