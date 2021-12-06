
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcoq2
 */
public class UserManagement 
{
public boolean logIn(ArrayList<Usuario>users,String user,String password){
   
    for (Usuario user1 : users) {
        if(user1.getUsuario().equalsIgnoreCase(user)){
            user1.getPassword();
            if(user1.getPassword().equalsIgnoreCase(password)){
                return true;
            }
        }
    }
    return false;
}    
public boolean checkUser(ArrayList<Usuario>users,String user){
    for(Usuario user1: users){
        if(user1.getUsuario().equalsIgnoreCase(user)){
            return false;
        }
    }
    return true;
}
}
