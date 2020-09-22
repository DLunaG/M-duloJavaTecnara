package dia15.sockets.aplicacionClienteServidor.server;

public class Checker {

    public String checkear(String mensaje){
        //{farolaNumero:1, valor:10}
        mensaje = mensaje.replace("{farolaNumero:", "");
        mensaje = mensaje.replace(" valor:", "");
        mensaje = mensaje.replace("}", "");
        //1,10
        String[] mensajeArrayed = mensaje.split(",");

        if (mensajeArrayed.length != 2){
            return "KO";
        }else{
            try {
                int primerNum = Integer.parseInt(mensajeArrayed[0]);
                int segundoNum = Integer.parseInt(mensajeArrayed[1]);
                //System.out.println(primerNum);
                //System.out.println(segundoNum);
            }catch(Exception e){
                System.out.println(e.toString());
                return "KO";
            }
        }
        return "OK";
    }
}

