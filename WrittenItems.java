package library;
import java.util.Date;

public class WrittenItems extends Items{
	
	private String author;
	private Date publishDate;
	
	public WrittenItems(String name, int itemNum, int numOfCopies,
			String author, Date publishDate) {
		super(name, itemNum, numOfCopies);
		this.author = author;
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
	

}
