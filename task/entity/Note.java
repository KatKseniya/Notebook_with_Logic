package com.epam.hw.task.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Note implements Serializable {
    private int id;

    private String title;

    private String content;

    private Date dateCreated;

    public Note(int id, String title, String content, Date dateCreated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Note note = (Note) o;
        return id == note.id &&
                title.equals(note.title) &&
                content.equals(note.content) &&
                dateCreated.equals(note.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, dateCreated);
    }

    @Override
    public String toString() {
        return "com.epam.hw.task.entity.Note{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dateCreated=" + dateCreated +
                '}' + System.lineSeparator();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
