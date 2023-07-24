package models;

public class Section {

    public final Long id;
    public final String title;
    public final String content;

    public Section(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
