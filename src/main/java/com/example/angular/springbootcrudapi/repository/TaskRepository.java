package com.example.angular.springbootcrudapi.repository;

import com.example.angular.springbootcrudapi.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
