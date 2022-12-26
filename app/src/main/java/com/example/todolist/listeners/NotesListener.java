package com.example.todolist.listeners;

import com.example.todolist.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
