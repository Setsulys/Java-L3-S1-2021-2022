import java.util.Objects;

public record Book(String title, String author) {
	
	public Book(String title, String author){
		Objects.requireNonNull(title,"title is null");
		Objects.requireNonNull(author,"author is null");
		this.author=author;
		this.title=title;
	}
	@Override
	public String toString(){
		return title +" by "+ author;
	}
}
