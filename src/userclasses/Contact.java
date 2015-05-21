/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.ui.Image;

/**
 *
 * @author fmfuser
 */
public class Contact {
    private String name;
    private String email;
    private Image pic;
        public Contact(String name, String email, Image pic) {
            this.name = name;
            this.email = email;
            this.pic = pic;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public Image getPic() {
            return pic;
        }
}
