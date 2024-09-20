public class Main{
	public static void main(String[] args){
	
	Artist a1 = new Artist("Berry");
	System.out.println("                  Artist Name");
	a1.display();

	Artwork ar1 = new Artwork("Lust Stories" , 2020, a1);
	
	System.out.println("                  Before Changing");
	ar1.display();

	Artwork shallowCopy = ar1.shallowCopy();
	Artwork deepCopy = ar1.deepCopy();

	ar1.getArtist().setName("Sherry");
	System.out.println("                  After Changing");
	ar1.display();

	System.out.println("                  Shallow Copy");
	shallowCopy.display();
	System.out.println("                  Deep Copy");
	deepCopy.display();
	}
}