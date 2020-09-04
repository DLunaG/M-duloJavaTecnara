package dia3.recursosHumanos.components;

import dia3.recursosHumanos.interfaces.IAutenticable;

public class AuthenticateComponent {

    public static void doAuthenticable(IAutenticable autenticable){
        System.out.println(autenticable.autenticarSuperusuario());
    }

}
