package empresa;

//Tres tipos de empleado
//empleado 1: trabajo/método picar piedra (mostrar por consola un mensaje)
//empleado 2: trabajo/método sacar arena (mostrar por consola un mensaje)
//empleado 3: trabajo/método echar agua (mostrar por consola un mensaje)

//Todos los empleados tienen el método cobrar nómina (mensaje "nómina cobrada")
//Todos los empleados tienen una variable entera con el nº de vacaciones que les quedan.


public abstract class Empleado {

   private int diasVacacionesRestantes;

   public Empleado(){
   }

   public Empleado(int diasVacacionesRestantes){
       this.diasVacacionesRestantes = diasVacacionesRestantes;
   }

   public abstract void trabajar();

   public void cobrarNomina(){
       System.out.println("Nómina cobrada.");
   }

   public void mostrarVacaciones() {
       StringBuilder sb = new StringBuilder();
       sb.append("Te quedan ");
       sb.append(diasVacacionesRestantes);
       sb.append(" días de vacaciones.");

       System.out.println(sb.toString());
   }
}
