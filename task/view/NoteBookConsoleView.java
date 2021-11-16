package com.epam.hw.task.view;

import com.epam.hw.task.entity.Note;
import com.epam.hw.task.entity.NoteBook;

import java.util.List;
import java.util.Scanner;

public class NoteBookConsoleView {
    int index;

   public static void print(NoteBook notes)
    {
        System.out.println(notes);
    }

    public static void print(List<Note> note)
    {
        System.out.println(note);
    }

    public static void print(List<Note> note, int index)
    {
        System.out.println(note.get(index));
    }



    public static void printSeveralItems(List<Note> note)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк, которые вы хотите распечатать");
        int index = sc.nextInt();

        for (int i = 0; i < index; i++)
        {

            System.out.println(note.get(index));
        }
    }
}
