package readinglist;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName Book
 * @Description TODO
 * @Author zhangguoxian
 * @Date 2019/7/22 20:23
 * @Version 1.0
 */

@Entity
@Table(name="book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getReader() {
        return reader;
    }
    public void setReader(String reader) {
        this.reader = reader;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
