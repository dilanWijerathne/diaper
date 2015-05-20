/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.list.MultiList;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }


   
    protected void onGUI1_Button1Action(Component c, ActionEvent event) {

       //  findMyComponent(c)
        //Dialog.show("Dilan test", "Dilan test 2", "Dilan test 3", "Dilan test 4");
       
    }


    protected void beforeCart(Form f) {
    
    }

   
    protected void onCart_ButtonAction(Component c, ActionEvent event) {
        findLabel(c).setText("Dilan Wijerathne");
    
    }

    
    protected void onGUI1_Button2Action(Component c, ActionEvent event) {
           
    
    }

   // @Override
    protected boolean initListModelList(List cmp) {
        cmp.setModel(new com.codename1.ui.list.DefaultListModel(new String[] {"Item 1", "Item 2", "Item 3"}));
        return true;
    }
}
