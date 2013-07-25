package visitor;

public class FlyingVisitor implements Visitor {
	
	public FlyingVisitor() {}
		
	public String visit(Bird cuteBird) {
		return "The bird flies " + cuteBird.getAdjective() + "!";
	}
	
	public String visit(Plane bigPlane) {
		return "The plane flies " + bigPlane.getAdjective() + "!";
	}
	
	public String visit(Superman clarkKent) {
		return "Superman flies " + clarkKent.getAdjective() + "!";
		
	}
			

}
