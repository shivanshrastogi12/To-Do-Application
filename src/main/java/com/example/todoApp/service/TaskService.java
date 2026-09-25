package com.example.todoApp.service;

import com.example.todoApp.model.Task;
import com.example.todoApp.repository.TaskRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

  private final TaskRepository taskRepository;

  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  public void createTask(String title) {
    // Logic to create a new task and save it to the database
    Task task = new Task();
    task.setTitle(title);
    task.setCompleted(false);
    taskRepository.save(task);
  }

  public void deleteTask(Long id) {
    taskRepository.deleteById(id);
  }

  public void toggleTaskCompletion(Long id) {
    Task task = taskRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Task not found with id: " + id));
    task.setCompleted(!task.isCompleted());
    taskRepository.save(task);
  }
}