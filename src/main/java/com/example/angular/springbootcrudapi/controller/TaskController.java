package com.example.angular.springbootcrudapi.controller;

import com.example.angular.springbootcrudapi.model.Task;
import com.example.angular.springbootcrudapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;



    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }






}
