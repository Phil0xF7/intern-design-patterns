package visitor;

public class Superman implements Visitable {
	
	private String adjective;
	
	public Superman(String adj){
		adjective = adj;
	}
	
	public String accept(Visitor visitor){ 
		return visitor.visit(this);
	}
	
	public String getAdjective() { 
		return adjective;
	}
	

}
