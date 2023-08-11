package com.excellence.springbootcrudapisecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excellence.springbootcrudapisecurity.models.Task;
import com.excellence.springbootcrudapisecurity.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	@Autowired
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	// Create a new task
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	// Get all tasks
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	// Get a specific task by ID
	public Optional<Task> getTaskById(Long taskId) {
		return taskRepository.findById(taskId);
	}

	// Update a task
	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}

	// Delete a task by ID
	public void deleteTaskById(Long taskId) {
		taskRepository.deleteById(taskId);
	}
}