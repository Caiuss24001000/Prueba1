public class Prueba{
  
  public static void main(String [] args){
	
	Candado c = new Candado();
	GUI gui = new Gui();
	
	String menu = "Ingrese la opcion que desee realizar \n"+
	              "1.-Abrir el candado\n"+
				  "2.-Cambiar combinacion\n"+
				  "3.-Salir";
	int opcion = 0;
	do{
	  
	  gui.ventanaDatoEntero(menu);
	  opcion = gui.getIValor();
	  
	  switch(opcion){
		
		case 1:
		  
		  c.Abrir();
		  opcion = 0;
		  break;
		case 2:
		  
		  c.Cambiar();
		  opcion = 0;
		  break;
		case 3:
		  
		  gui.ventanaDeAviso("Salida", "Gracias por su visita, vuelva pronto ;)");
		  break;
	  }
	}while(opcion < 1 || opcion > 3);
  }
}