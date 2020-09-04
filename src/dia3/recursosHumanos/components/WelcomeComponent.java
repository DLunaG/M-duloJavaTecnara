package dia3.recursosHumanos.components;

import dia3.recursosHumanos.usuarios.Usuario;

public class WelcomeComponent {

    public static void showWelcomeMessage(Usuario user){
        System.out.println(user.welcomeMessage());
    }
}
