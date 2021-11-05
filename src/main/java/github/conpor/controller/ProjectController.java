package github.conpor.controller;


import github.conpor.model.projection.ProjectWriteModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping
    String showProjects(Model model) {
        model.addAllAttributes("project", new ProjectWriteModel())
        return "projects";
    }
}