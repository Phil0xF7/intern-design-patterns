package visitor;

public class Test {
	
	public static void main(String[] args){
		
		FlyingVisitor flyingDescription = new FlyingVisitor();
		
		Bird blueBird = new Bird("gracefully");
		Plane airplane = new Plane("quickly");
		Superman clarkKent = new Superman("like a bird or a plane");
		
		System.out.println("How does the bird fly?");
		System.out.println(blueBird.accept(flyingDescription));
		
		System.out.println("How does the plane fly?");
		System.out.println(airplane.accept(flyingDescription));
		
		System.out.println("How does Superman fly?");
		System.out.println(clarkKent.accept(flyingDescription));
		
	}

}
