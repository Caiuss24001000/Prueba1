public  class Candado{
  
  private []int combinacion;
  private []int aux;
  private int dato;
  private GUI gui;
  
  public Candado(){
	
	this(0, "", 0.0f, 0);
	combinacion = new combinacion[3];
	this.combinacion[0] = 1;
	this.combinacion[1] = 2;
	this.combinacion[2] = 3;
	aux = new aux[3];
	gui = new Gui();
  }
  
  public void getDato(){
	
	return dato;
  }
  
  public int setDato(int i){
	
	if(i < 10 && i > 0){
	  
	  this.dato = i;
	}else {
	  
	  this.dato = -1;
	  gui.ventanaDeAviso("Error!!", "Este no es un numero valido");
	}
  }
  
  public boolean Abrir(){
	
	gui.ventanaDatoEntero("Ingrese el primer numero de la combinacion");
	setDato(gui.getIValor());
	aux[0] = getDato();
	
	gui.ventanaDatoEntero("Ingrese el segundo numero de la combinacion");
	setDato(gui.getIValor());
	aux[1] = getDato();
	
	gui.ventanaDatoEntero("Ingrese el tercer numero de la combinacion");
	setDato(gui.getIValor());
	aux[2] = getDato();
	
	if(combinacion[0] == aux[0] && combinacion[1] == aux[1] && combinacion[2] == aux[2]){
	  
	  gui.ventanaDeAviso("Candado", "Combinacion acertada!! El candado esta abierto");
	  return true;
	}else {
	  
	  gui.ventanaDeAviso("Error!!", "Combinacion incorrecta X.X intente con otra combinacion");
	  return false;
	}
  }
  
  public void Cambiar(){
	
	boolean salida = Abrir();
	
	if(salida){
	  
	  gui.ventanaDeAviso("Cambio de Combinacion", "Excelente!! Ahora puede cambiar la combinacion :)");
	  
	  gui.ventanaDatoEntero("Ingrese el primer numero de la combinacion");
	  setDato(gui.getIValor());
	  combinacion[0] = getDato();
	  
	  gui.ventanaDatoEntero("Ingrese el segundo numero de la combinacion");
	  setDato(gui.getIValor());
	  combinacion[1] = getDato();
	  
	  gui.ventanaDatoEntero("Ingrese el tercer numero de la combinacion");
	  setDato(gui.getIValor());
	  combinacion[2] = getDato();
	}
  }
}