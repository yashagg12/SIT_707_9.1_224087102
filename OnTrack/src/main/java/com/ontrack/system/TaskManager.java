package com.ontrack.system;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    // Inner class to represent a Task
    public static class Task {
        private final String taskName;
        private final String status;

        public Task(String taskName, String status) {
            this.taskName = taskName;
            this.status = status;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "Task: " + taskName + " | Status: " + status;
        }
    }

    // List to hold all tasks
    private final List<Task> taskList = new ArrayList<>();

    // 🔴 THIS METHOD WAS MISSING
    // Method to add tasks
    public boolean addTask(String taskName, String status) {
        return taskList.add(new Task(taskName, status));
    }

    // Method to retrieve all tasks for a given status
    public List<Task> getTasksByStatus(String status) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    // Method to retrieve all tasks
    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList);
    }
}
