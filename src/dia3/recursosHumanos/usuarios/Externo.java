package dia3.recursosHumanos.usuarios;

import dia3.recursosHumanos.interfaces.IEmpresaAutenticable;

public class Externo extends Usuario implements IEmpresaAutenticable {

    private String companyId;
    private String companyName;

    public Externo(String nombre, String apellido, String telefono, String email, String companyId, String companyName){
        super(nombre, apellido, telefono, email, "Externo");
        this.companyId = companyId;
        this.companyName = companyName;
        autenticarSegunEmpresa(companyId);
        /*try {
            FileReader fr = new FileReader("src/dia3/recursosHumanos/EmpresasCualificadas.txt");
            StringBuffer sb = new StringBuffer();

        }catch (FileNotFoundException e){
            System.out.println("Archivo de texto no encontrado :" + e.toString());
        }
*/
    }

    @Override
    public boolean autenticarSegunEmpresa(String empresaId){
        if(empresaId == "1234" || empresaId == "1111" || empresaId == "4444"){
            System.out.println("Empresa permitida.");
            return true;
        }else{
            System.out.println("Los sentimos, su Id de empresa no está en nuestra base de datos.");
            return false;
        }
    }

    public String getCompanyId(){
        return companyId;
    }
    public String getCompanyName(){
        return companyName;
    }

}
