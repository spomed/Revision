package encapsulation;

public class Main {

	public static void main(String[] args) {
		Personne p1=new Personne("Aoun","Mohamed");
		
		// TODO Auto-generated method stub
		System.out.println("hi im "+p1.getNom()+" "+p1.getPrenom());
		p1.setNom("bakir");
		System.out.println("hi im "+p1.getNom()+" "+p1.getPrenom());
		

	}

}
