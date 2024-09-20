public class Artwork{
	String title;
	int year;
	Artist artist;

	Artwork(){
		this.title = title;
		this.year = year;
		this.artist = artist;
	}

	Artwork(String title, int year, Artist artist){
		this.title = title;
		this.year = year;
		this.artist = artist;
	}
	Artwork(String title, int year){
		this.title = title;
		this.year = year;
		artist= new Artist("Unknown artist");
	
	}

	public void setTitle(String title){
		this.title = title;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}
	public String getTiltle(){
		return title;
	}
	public int getyear(){
		return year;
	}
	public Artist getArtist(){
		return artist;
	}

	public void display(){
		System.out.println("Book Title: " + title + "   Book Publised Year: " + year);
		artist.display();
	}

	public Artwork shallowCopy(){
		return new Artwork(this.title , this.year , this.artist);
	}
	public Artwork deepCopy(){
		Artist new_Artist = new Artist(this.artist.getName());
		return new Artwork(this.title , this.year , new_Artist);
	}
}