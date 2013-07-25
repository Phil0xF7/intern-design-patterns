package visitor;

public interface Visitor {
	
	public String visit(Bird cuteBird);
	public String visit(Plane bigPlane);
	public String visit(Superman clarkKent);
}
