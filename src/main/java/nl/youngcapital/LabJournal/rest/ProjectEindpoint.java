package nl.youngcapital.LabJournal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import nl.youngcapital.LabJournal.Project;
import nl.youngcapital.LabJournal.Controller.ProjectRepository;
import nl.youngcapital.LabJournal.Controller.ProjectService;

@RestController
public class ProjectEindpoint {
	@Autowired
	ProjectService projectService;
	@Autowired
	ProjectRepository projectRepository;
	@ResponseBody
	@RequestMapping(value = "/project2", method = RequestMethod.GET)
	public String getProject() {
		return "Hallo";
	}
	@ResponseBody
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public Project getProject2() {
		Project project = new Project();
		System.out.println(project);
		projectService.test(project);
		return project;
	}
	@ResponseBody
	@RequestMapping(value = "/projectpost", method = RequestMethod.POST)
	public void postEntity(@RequestBody Project project) {
		System.out.println("post request");
		System.out.println(project.getName());
		projectService.test(project);
	}
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public List<Project> findAll() {
	    return (List<Project>)projectRepository.findAll();
	  }
	 
	 
	 @ResponseBody
	 //@ResponseStatus(value = HttpStatus.OK)
	 @RequestMapping(value = "/project/{id}", method = RequestMethod.DELETE)
	 public void updateProject(@PathVariable long id) {
		System.out.println("delete request");
	    projectRepository.delete(id);
	  } 
}
