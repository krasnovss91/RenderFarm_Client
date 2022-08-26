package com.controller;

import com.dto.Task;
import com.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "renderFarmClient")
public class TaskController {
    @Autowired
    private TaskService taskService;
/*
    @GetMapping("/tasks")//поймать коллекцию и передать её сервису
    public List<Task> getAllTasks() {

        return taskService.findAll();
    }
 */
    @GetMapping("/saveTask")
    public void saveTask() {
        taskService.saveTask();
    }
}
