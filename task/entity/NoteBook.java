package com.epam.hw.task.entity;

import java.util.List;
import java.util.Objects;

public class NoteBook {
    private String owner;
    private List<Note> notes;

    public NoteBook() {
    }

    public NoteBook(List<Note> notes) {
        this.owner = owner;
        this.notes = notes;
    }

    public NoteBook(String owner, List<Note> notes) {
        this.owner = owner;
        this.notes = notes;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof NoteBook))
            return false;
        NoteBook noteBook = (NoteBook) o;
        return getOwner().equals(noteBook.getOwner()) &&
                getNotes().equals(noteBook.getNotes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOwner(), getNotes());
    }

    @Override
    public String toString() {
        return "NoteBook1{" +
                "userAccountId='" + owner + '\'' +
                ", notes=" + notes +
                '}';
    }
}
