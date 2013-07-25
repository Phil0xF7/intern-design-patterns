package visitor;

public class Plane implements Visitable {
	
	private String adjective;
	
	public Plane(String adj){
		adjective = adj;
	}
	
	public String accept(Visitor visitor){ 
		return visitor.visit(this);
	}
	
	public String getAdjective() { 
		return adjective;
	}

}
