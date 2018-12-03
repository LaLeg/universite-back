package fr.leghtas.universite.note.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.leghtas.universite.note.buisiness.INoteBuisiness;
import fr.leghtas.universite.note.controller.INoteController;
import fr.leghtas.universite.note.domain.Note;
import fr.leghtas.universite.note.domain.NotePK;

@RestController
public class NoteRestControllerImpl implements INoteController {

	@Autowired
	private INoteBuisiness noteBuisiness;

	@Override
	@GetMapping("/notes")
	public List<Note> getNotes() {
		List<Note> listeNotes = noteBuisiness.getNotes();
		return listeNotes;
	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note getNoteById(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		NotePK pk = new NotePK();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		return noteBuisiness.getNote(pk);
	}

}
