///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package userclasses;
//
//import com.codename1.ui.Component;
//import com.codename1.ui.Container;
//import com.codename1.ui.Form;
//import com.codename1.ui.Image;
//import com.codename1.ui.Label;
//import com.codename1.ui.List;
//import com.codename1.ui.events.DataChangedListener;
//import com.codename1.ui.events.SelectionListener;
//import com.codename1.ui.list.ListCellRenderer;
//import com.codename1.ui.list.ListModel;
//import com.codename1.ui.layouts.BorderLayout;
//import com.codename1.ui.layouts.BoxLayout;
//import com.codename1.ui.util.Resources;
//
//
///**
// *
// * @author fmfuser
// */
//public class ContactsRenderer extends Container implements ListCellRenderer{
//
//  
//    private Label name = new Label("");
//    private Label email = new Label("");
//    private Label pic = new Label("");
//    private Label focus = new Label("");
//    
//    public ContactsRenderer() {
//        setLayout(new BorderLayout());
//        addComponent(BorderLayout.WEST, pic);
//        Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
//        name.getStyle().setBgTransparency(0);
//        email.getStyle().setBgTransparency(0);
//        cnt.addComponent(name);
//        cnt.addComponent(email);
//        addComponent(BorderLayout.CENTER, cnt);
//    }
//    
//    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {
//        Contact person = (Contact) value;
//        name.setText(index + ": " + person.getName());
//        email.setText(person.getEmail());
//        pic.setIcon(person.getPic());
//        return this;
//    }
//
//    public Component getListFocusComponent(List list) {
//        return focus;
//    }
//
//    String[][] CONTACTS_INFO = {
//        {"Nir V.","Nir.V@Sun.COM"},
//        {"Tidhar G.","Tidhar.G@Sun.COM"},
//        {"Iddo A.","Iddo.A@Sun.COM"},
//        {"Ari S.","Ari.S@Sun.COM"},
//        {"Chen F.","Chen.F@Sun.COM"},
//        {"Yoav B.","Yoav.B@Sun.COM"},
//        {"Moshe S.","Moshe.S@Sun.COM"},
//        {"Keren S.","Keren.S@Sun.COM"},
//        {"Amit H.","Amit.H@Sun.COM"},
//        {"Arkady N.","Arcadi.N@Sun.COM"},
//        {"Shai A.","Shai.A@Sun.COM"},
//        {"Elina K.","Elina.K@Sun.COM"},
//        {"Yaniv V.","Yaniv.V@Sun.COM"},
//        {"Nadav B.","Nadav.B@Sun.COM"},
//        {"Martin L.","Martin.L@Sun.COM"},
//        {"Tamir S.","Tamir.S@Sun.COM"},
//        {"Nir S.","Nir.S@Sun.COM"},
//        {"Eran K.","Eran.K@Sun.COM"}
//    };
//    
//        int contactWidth= 36;
//        int contactHeight= 48;
//        int cols = 4;
//        Resources images = Resources.open("/images.res");
//        Image contacts = images.getImage("people.jpg");
//        Image[] persons = new Image[CONTACTS_INFO.length];
//
//            for(int i = 0; i < persons.length; i++){
//                persons[i] = contacts.subImage((i%cols)*contactWidth, (i/cols)*contactHeight, contactWidth, contactHeight, true);
//            }
//        final Contact[] contactArray = new Contact[persons.length];
//
//            for (int i = 0; i < contactArray.length; i++) {
//                int pos = i % CONTACTS_INFO.length;
//                contactArray[i] = new Contact(CONTACTS_INFO[pos][0], CONTACTS_INFO[pos]
//                [1], persons[pos]);
//            }
//
//        Form millionList = new Form("Million");
//            millionList.setScrollable(false);
//            List l = new List(new ListModel() {
//            private int selection;
//            public Object getItemAt(int index) {
//            return contactArray[index % contactArray.length];
//            }
//            public int getSize() {
//            return 1000000;
//            }
//            public int getSelectedIndex() {
//            return selection;
//            }
//            public void setSelectedIndex(int index) {
//            selection = index;
//            }
//            public void addDataChangedListener(DataChangedListener l) {
//            }
//            public void removeDataChangedListener(DataChangedListener l) {
//            }
//            public void addSelectionListener(SelectionListener l) {
//            }
//            public void removeSelectionListener(SelectionListener l) {
//            }
//            public void addItem(Object item) {
//            }
//            public void removeItem(int index) {
//            }
//        });
//    l.setListCellRenderer(new ContactsRenderer());
//    l.setFixedSelection(List.FIXED_NONE_CYCLIC);
//    millionList.setLayout(new BorderLayout());
//    millionList.addComponent(BorderLayout.CENTER, l);
//    millionList.show();
//        
//        
//        
//    }