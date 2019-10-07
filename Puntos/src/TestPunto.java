
public class TestPunto {
	public static void main(String[] args) {
		Punto2D p12D=new Punto2D(2,6);
		Punto2D p22D=new Punto2D(8,6);
		
		
	System.out.println(p12D.distancia(p22D));	
	
	System.out.println(p12D.equals(p22D));
	
	
	
	System.out.println(p22D.clone());
		
	}

}
