package Dominio;

public class Principal {

	public static void main(String[] args) {
		
		/*ArticuloGim as = new ArticuloGim();
		as.setNombre("arti1");
		as.setPeso(56);
		ArticuloGim as2 = new ArticuloGim("BOCA",202020);
		System.out.println(as.toString());
		System.out.println(as2.toString());*/
		
		ArticuloGim as = new ArticuloGim("Mancuerna", 185);
		System.out.println(as.toString());
		System.out.println(as.DevuelveGramos()+ " gramos ");
	}

}
