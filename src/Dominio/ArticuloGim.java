package Dominio;

public class ArticuloGim extends Articulo{
 public int peso;
 private static final int gramos = 1000;
 
 
 public int DevuelveGramos() {
	
	 
	 return peso *gramos ;
	 
 }
 

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}
 
 public ArticuloGim(){
	 super();
	 
 } 
 public ArticuloGim(String nombre, int peso){
	 
	 super(nombre);
	 this.peso = peso;
 } 
 
 @Override
 public String toString() {
 	return super.toString() + " PESO " + peso + "]";
 }
}


