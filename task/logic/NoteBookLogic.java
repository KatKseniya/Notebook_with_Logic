package com.epam.hw.task.logic;
import com.epam.hw.task.entity.Note;
import com.epam.hw.task.entity.NoteBook;
import com.epam.hw.task.repository.NoteBookProvider;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class NoteBookLogic {

    private static final NoteBookProvider provider = NoteBookProvider.getInstance();

    private NoteBook noteBook;

    public NoteBookLogic() {
        this.noteBook = new NoteBook();
        provider.addNewNoteBook(noteBook);
    }

    public NoteBookLogic(int index) {
        this.noteBook = provider.getNoteBook(index);
    }

    public void setNb(int index) {
        this.noteBook = provider.getNoteBook(index);
    }

    List<Note> sortByDate(List<Note> notes)
    {
        Collections.sort(notes, new Comparator<Note>()
        {
            @Override
            public int compare(Note o1, Note o2)
            {
                return o1.getDateCreated().compareTo(o2.getDateCreated());
            }
        });

        return notes;
    }

    List<Note> sortByContent(List<Note> notes)
    {
        Collections.sort(notes, new Comparator<Note>()
        {
            @Override
            public int compare(Note o1, Note o2)
            {
                return o1.getContent().compareTo(o2.getContent());
            }
        });
        return notes;
    }


    List <Note> findByContent (List <Note> notes, String userContent)
    {
        List<Note> result = new ArrayList<Note>();

        for (Note note : notes)
        {
            if (note.getContent().contains(userContent))
            {
                result.add(note);
            }
        }
        return result;
    }


    public List<Note> findByDate(List<Note> notes, Date date)
    {
        List<Note> result = new ArrayList<Note>();

        for (Note note : notes)
        {
            if (note.getDateCreated().compareTo(date) == 0)
            {
                result.add(note);
            }
        }
        return result;
    }
}
