package ch09_class.quiz;

public class Movie {
	private String title;  /* 영화 제목 */
	private String quotes;  /* 명대사 */
	private String actors;  /* 배우 */
	private String words;  /* 초성 */
	public Movie() {
		// 1.기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String title, String quotes, String actors, String words) {
		super();
		this.title = title;
		this.quotes = quotes;
		this.actors = actors;
		this.words = words;
	}	
	// 2. setter, getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	// 3.toString
	@Override
	public String toString() {
		return "movie [title=" + title + ", quotes=" + quotes + ", actors=" + actors + ", words=" + words + "]";
	}
	
	
}
