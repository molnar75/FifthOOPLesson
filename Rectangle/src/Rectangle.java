
public class Rectangle {

	private int aSide;
	private int bSide;

	//Konstruktor (kötelezően meg kell adni)
	public Rectangle(int aSide, int bSide) {
		this.aSide = aSide;
		this.bSide = bSide;
	}
	
	//Lehet több konstruktor, de más kell legyen a paraméter szignatúra
	public Rectangle(int sides){
		this.aSide = sides;
		this.bSide = sides;
	}
	
	public int getArea(){
		return aSide*bSide;
	}

	public String toString() {
		return aSide + ", " + bSide	+ ": " + getArea();
	}

	public int getaSide() {
		return aSide;
	}

	public int getbSide() {
		return bSide;
	}

	public void setSides(int aSide, int bSide) {
		this.aSide = aSide;
		this.bSide = bSide;
	}
	
	public void setBothSides(int sides) {
		this.aSide = sides;
		this.bSide = sides;
	}
	
	public boolean hasBiggerAreaThan(Rectangle rectangle){
		if(this.getArea() > rectangle.getArea()){
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean hasTheSameSidesAs(Rectangle rectangle){
		if((this.getaSide() == rectangle.getaSide()) && (this.getbSide() == rectangle.getbSide())){
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
