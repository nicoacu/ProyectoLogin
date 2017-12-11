/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author fede_
 */
public class ServicioUsuarioImpl implements ServicioUsuario {

    @Override
    public Boolean ValidarUsuario(String txtUsuario, String txtContraseña) {
        if (txtUsuario.equals("usuario") && txtContraseña.equals("123")) {
            //ViewManager.changeViem(new ViewManager());
            return true;
        } else {
           
            return false;
        }

    }
}
