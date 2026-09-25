package com.example.todoApp.controller;

import com.example.todoApp.model.Task;
import com.example.todoApp.service.TaskService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  // Handle GET requests to retrieve all tasks
  @GetMapping
  public String getAllTasks(Model model) {
    List<Task> tasks = taskService.getAllTasks();

    // Logic to return tasks to the view (e.g., model.addAttribute("tasks", tasks))
    model.addAttribute("tasks", tasks);

    // Return the name of the view template
    return "tasks";
  }

  // Handle POST requests to create a new task
  @PostMapping
  public String createTask(@RequestParam String title) {
    taskService.createTask(title);
    return "redirect:/";
  }

  // Handle GET requests to delete a task by ID
  @GetMapping("/{id}/delete")
  public String deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
    return "redirect:/";
  }

  // Handle GET requests to toggle the completion status of a task by ID
  @GetMapping("/{id}/toggle")
  public String toggleTaskCompletion(@PathVariable Long id) {
    taskService.toggleTaskCompletion(id);
    return "redirect:/";
  }
}