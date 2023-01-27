package com.example.angular.springbootcrudapi;

import com.example.angular.springbootcrudapi.model.Task;
import com.example.angular.springbootcrudapi.repository.TaskRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Log4j2
public class SpringbootCrudApiApplication implements CommandLineRunner {


    @Autowired
    private TaskRepository taskRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCrudApiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        saveTask();

    }


    //Generated method save task
    public void saveTask() {

        Task task = new Task();
        task.setName("name");
        task.setDescription("description");
        taskRepository.save(task);

       // log.info(" >>>>>>>> Task saved");


    }


}
