/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.codename1.ui.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




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
    ArrayList<Map<String, Object>> a = new ArrayList<Map<String, Object>>();
             HashMap<String, Object> m = new HashMap<String, Object>();
             m.put("Line1", "Dilan Wijerathne");
             m.put("Line2", "Image of mine");
             m.put("Line3", "Dilan Amal");
             m.put("Line4", "Image of mine");
             a.add(m);
         //    ... etc for every row
             cmp.setModel(new com.codename1.ui.list.DefaultListModel(a));
        return true;
    }

    @Override
    protected boolean initListModelMultiList(List cmp) {
        Image img=null;
        try {
            img = Image.createImage("/images.cart.jpg");
        } catch (IOException ex) {
            
        }
        
            ArrayList<Map<String, Object>> a = new ArrayList<Map<String, Object>>();
            HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("Line1", "Dilan Wijerathne");
                m.put("Line2", fetchResourceFile().getImage("cart.jpg"));
                m.put("Line3", "Dilan Amal");
             
             HashMap<String, Object> c = new HashMap<String, Object>();
                c.put("Line1", "Dilan Wijerathne");
                c.put("Line2", "Dilan Wijerathne");
                c.put("Line3", "Dilan Wijerathne");
             a.add(m);
             a.add(c);
         //    ... etc for every row
             cmp.setModel(new com.codename1.ui.list.DefaultListModel(a));
     //   cmp.setModel(new com.codename1.ui.list.DefaultListModel(CONTACTS_INFO));
        return true;
    }
}
