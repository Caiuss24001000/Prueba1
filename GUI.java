import javax.swing.JOptionPane;

public class GUI{
  
  private String sValor;
  private float fValor;
  private int iValor;
  
  public GUI(){
	
	this("", 0.0f, 0);
  }
  
  public GUI(String sValor, float fValor, int iValor){
	
	this.sValor = sValor;
	this.fValor = fValor;
	this.iValor = iValor;
  }
  
  public float getFValor(){
	
	return fValor;
  }
  
  public int getIValor(){
	
	return iValor;
  }
  
  public void ventanaDeAviso(String titulo, String mensage){
	
	JOptionPane.showMessageDialog(null, mensage, titulo, 1);
  }
  
  public void ventanaPedirValor(String mensage){
	
	sValor = JOptionPane.showInputDialog(mensage);
  }
  
  public void ventanaDatoFlotante(String mensage){
	
	do{
	  
	  ventanaPedirValor(mensage);
	}while(sValor == null || sValor.equals(""));
	
	try{
	  
	  fValor = Float.parseFloat(sValor);
	}catch(Exception e){
	  
	  ventanaDeAviso("Error!!", "Ingrese un numero");
	  ventanaDatoFlotante(mensage);
	}
  }
  
  public void ventanaDatoEntero(String mensage){
	
	do{
	  
	  ventanaPedirValor(mensage);
	}while(sValor == null || sValor.equals(""));
	
	try{
	  
	  iValor = Integer.parseInt(sValor);
	}catch(Exception e){
	  
	  ventanaDeAviso("Error!!", "Ingrese un numero");
	  ventanaDatoEntero(mensage);
	}
  }
}