package com.epam.hw.task.repository;
import com.epam.hw.task.entity.NoteBook;

import java.util.ArrayList;
import java.util.List;

public class NoteBookProvider {
    private static final NoteBookProvider instance = new NoteBookProvider();
    private List<NoteBook> noteBooks = new ArrayList<NoteBook>();

    private NoteBookProvider() {
        noteBooks.add(new NoteBook());
    }

    public NoteBook getNoteBook(int index) {
        if (index >= noteBooks.size()) {
            throw new RuntimeException("Notebook with index " + index + "is not defined.");
        }
        return noteBooks.get(index);
    }

    public void addNewNoteBook(NoteBook notebook) {
        noteBooks.add(notebook);
    }

    public static NoteBookProvider getInstance() {
        return instance;
    }

    public int createNewNoteBook() {
        NoteBook noteBook = new NoteBook();
        noteBooks.add(noteBook);
        return noteBooks.size() - 1;
    }
}
