package dia3.recursosHumanos;

import dia3.recursosHumanos.components.AuthenticateComponent;
import dia3.recursosHumanos.components.WelcomeComponent;
import dia3.recursosHumanos.usuarios.*;


public class Main {

    public static void main(String[] args) {

        Base usuarioBase = new Base("Paco", "Porras", "666666666", "Pacoelporras@memes.com");
        WelcomeComponent.showWelcomeMessage(usuarioBase);


        Administrador admin = new Administrador("Lucía", "del Castillo", "654321987",
                                                "rrhh_employees_and_squeeze@eands.com", "123456");
        WelcomeComponent.showWelcomeMessage(admin);
        AuthenticateComponent.doAuthenticable(admin);

        Externo trabajadorValorista = new Externo("Iker", "García", "655555555",
                                                      "iker@valor.es", "1234", "Valorista");
        WelcomeComponent.showWelcomeMessage(trabajadorValorista);

    }
}
