import java.util.Objects;

public class Punto3D extends Punto2D implements Cloneable {
	

		private double z;
		private Punto2D origen;
		
		
		public Punto3D(double x, double y, double z) {
			super(x, y);
			this.setZ(z);
		}
		
		public Punto3D(Punto2D punto, double z) {
			super(punto.getX(), punto.getY());
			this.setZ(z);
		}

		
		public double getZ() {
			return z;
		}
		
		public void setZ(double z) {
			this.z = z;
		}
		
		public String toString() {
			return"("+this.getX()+"; "+this.getY()+"; "+this.getZ()+")";
		}
		
		public static double distancia(Punto3D q, Punto3D w){
	     return Math.sqrt(q.getX()- w.getX() + q.getY()- w.getY() + q.getZ() - w.getZ());       
	    }	

		public double distancia(Punto3D h){
	        return Punto3D.distancia(this,h);        
	    }
		

	  public Object clone(){
	        Punto3D obj=null;
	        obj=(Punto3D)super.clone();
	        obj.origen=(Punto2D)obj.origen.clone();
	        return obj;
	    }


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(z);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Punto3D other = (Punto3D) obj;
			return Double.doubleToLongBits(z) == Double.doubleToLongBits(other.z);
		}

	  

	}



