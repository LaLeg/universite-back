package fr.leghtas.universite.note.buisiness.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.note.buisiness.INoteBuisiness;
import fr.leghtas.universite.note.domain.Note;
import fr.leghtas.universite.note.domain.NotePK;
import fr.leghtas.universite.note.repository.INoteRepository;

@Service
public class NoteBuisinessImpl implements INoteBuisiness {

	@Autowired
	private INoteRepository notesRepository;

	@Override
	public List<Note> getNotes() {

		List<Note> listeNotes = notesRepository.findAll();

		return listeNotes;
	}

	@Override
	public Note getNote(NotePK id) {

		Note note = notesRepository.getOne(id);

		return note;
	}

}
