package nl.youngcapital.LabJournal.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.youngcapital.LabJournal.Amount;
import nl.youngcapital.LabJournal.Project;

@Service
@Transactional
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	
	public Project test(Project project) {
		projectRepository.save(project);
		return project;
	}

}
