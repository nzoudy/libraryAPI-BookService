/**
 * Created by urbain on 23/01/2015.
 */

public class BookNotFoundException extends Exception {

    private Long id;
    private String title;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}
}
