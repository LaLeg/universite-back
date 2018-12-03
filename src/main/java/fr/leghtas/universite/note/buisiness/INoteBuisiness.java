package fr.leghtas.universite.note.buisiness;

import java.util.List;

import fr.leghtas.universite.note.domain.Note;
import fr.leghtas.universite.note.domain.NotePK;

public interface INoteBuisiness {
	public List<Note> getNotes();

	public Note getNote(NotePK id);

}
