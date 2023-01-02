package com.example.demo.controllers;

import com.example.demo.services.Iservices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("controller")
@RestController
@AllArgsConstructor
public class Controller {
    Iservices services;


    /*
    @PostMapping("/addProject")
    @ResponseBody
    public Project addProject(@RequestBody Project project){
        return services.addProject(project);
    }
    @PutMapping("/assignProjectToDevelopper/{projectId}/{devId}")
    public void assignProjectToDevelopper(@PathVariable int projectId, @PathVariable int devId){
        services.assignProjectToDevelopper(projectId,devId);
    }
    @PutMapping("/assignProjectToScrumMaster/{projectId}/{fName}/{IName}")
    public void assignProjectToScrumMaster(@PathVariable int projectId, @PathVariable String fName,@PathVariable String IName){
        services.assignProjectToScrumMaster(projectId,fName,IName);
    }
@GetMapping("/getProjectsByscrumMaster/{fName}/{IName}")
    public List<Project> getProjectsByscrumMaster(@PathVariable String fName,@PathVariable String IName){
        return services.getProjectsByscrumMaster(fName,IName);
}
    @PutMapping("/addSprintAndAssignToProject/isProject")
    @ResponseBody
    public void addSprintAndAssignToProject(@RequestBody Sprint sprint,@PathVariable int isProject){
        services.addSprintAndAssignToProject(sprint,isProject);
    }


    //public void getProjectsCurrentSprint();

     */
}
