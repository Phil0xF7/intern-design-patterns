package visitor;

public class Bird implements Visitable {
	
	private String adjective;
	
	public Bird(String adj){
		adjective = adj;
	}
	
	public String accept(Visitor visitor){ 
		return visitor.visit(this);
	}
	
	public String getAdjective() { 
		return adjective;
	}

}
