package com.epam.hw.task.main;

import com.epam.hw.task.entity.Note;
import com.epam.hw.task.entity.NoteBook;
import com.epam.hw.task.logic.NoteBookLogic;
import com.epam.hw.task.view.NoteBookConsoleView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static NoteBookLogic test;

    public static void main(String[] args) {
        List<Note> db = new ArrayList<Note>();
        NoteBook noteBook = new NoteBook("1", db);

        NoteBookLogic test = new NoteBookLogic();

        db.add(new Note(4, "Text1", "Desc content 1", new Date("11/05/2021")));
        db.add(new Note(2, "Text2", "Qwerty content 2 ", new Date("09/06/2021") ));
        db.add(new Note(3, "Text3", "Abcd content 3", new Date() ));

        List <Note> db1 =  test.findByDate(db, new Date("09/06/2021"));
       NoteBookConsoleView.print(db1);

    }
}
