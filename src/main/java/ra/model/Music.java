package ra.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Column(columnDefinition = "text")
    @Max(value = 800, message = "Không vượt quá 800 từ")
    @Pattern(regexp = "^[^@;,.=+-]*$", message = "Không được chứa ký tự đặc biệt")
    private String nameMusic;
    @NotEmpty
    @Column(columnDefinition = "text")
    @Max(value = 300, message = "Không vượt quá 300 từ")
    @Pattern(regexp = "^[^@;,.=+-]*$", message = "Không được chứa ký tự đặc biệt")
    private String author;
    @NotEmpty
    @Column(columnDefinition = "text")
    @Max(value = 1000, message = "Không vượt quá 1000 từ")
    @Pattern(regexp = "^[^@;.=+-]*$",message = "không chứa các kí tự đặc biệt ngoại trừ dấu ,")
    private String category;

    public Music() {
    }

    public Music(Long id, String nameMusic, String author, String category) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.author = author;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
