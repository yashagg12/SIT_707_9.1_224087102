package com.ontrack.system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class TaskManagerTest {

    @Test
    void testAddTask() {
        TaskManager manager = new TaskManager();
        boolean result = manager.addTask("SIT707 Assignment", "Submitted");
        assertTrue(result, "Task should be added successfully");
    }

    @Test
    void testGetAllTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("SIT707 Assignment", "Submitted");
        manager.addTask("SIT737 Kubernetes", "Reviewed");

        List<TaskManager.Task> tasks = manager.getAllTasks();
        assertEquals(2, tasks.size(), "Should return 2 tasks");
    }

    @Test
    void testGetTasksByStatus() {
        TaskManager manager = new TaskManager();
        manager.addTask("SIT707 Assignment", "Submitted");
        manager.addTask("SIT737 Kubernetes", "Reviewed");
        manager.addTask("SIT764 ML Project", "Submitted");

        List<TaskManager.Task> submittedTasks = manager.getTasksByStatus("Submitted");
        assertEquals(2, submittedTasks.size(), "Should return 2 submitted tasks");
    }

    @Test
    void testEmptyTaskList() {
        TaskManager manager = new TaskManager();
        List<TaskManager.Task> tasks = manager.getAllTasks();
        assertTrue(tasks.isEmpty(), "Task list should be empty initially");
    }
}
