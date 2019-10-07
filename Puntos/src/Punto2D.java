import java.util.Objects;

public class Punto2D implements Cloneable {
	
		
		private double x;
		private double y;
		
		public Punto2D(double x, double y) {
			this.setX(x);
			this.setY(y);
		}
		
		

		public Punto2D() {
			super();
		}



		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}
		
		public String toString() {
			return"("+this.getX()+" ;"+this.getY()+")";
		}
		
		public static double distancia(Punto2D q, Punto2D w){
	     return Math.hypot(q.getX()- w.getX(), q.getY()- w.getY());       
	    }	

		public double distancia(Punto2D h){
	        return Punto2D.distancia(this,h);        
	    } 

		public Object clone(){
	        Object obj=null;
	        try{
	            obj=super.clone();
	        }catch(CloneNotSupportedException ex){
	            System.out.println(" no se puede duplicar");
	        }
	        return obj;
	    }

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public boolean equals(Object obj) {
	    //
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Punto2D other = (Punto2D) obj;
			return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
					&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
		}
		
	  

	}


