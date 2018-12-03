package fr.leghtas.universite.note.controller;

import java.util.List;

import fr.leghtas.universite.note.domain.Note;

public interface INoteController {
	public List<Note> getNotes();

	public Note getNoteById(Integer idEtudiant, Integer idMatiere);

}
