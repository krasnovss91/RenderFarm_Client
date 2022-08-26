package com.service;

import com.dto.Status;
import com.dto.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    // @Autowired
   // private TaskRepository taskRepository;
    /*
    @Override
    public List<Task> findAll() {//получить результат запроса контроллера

          return (List<Task>) taskRepository.taskList();
    }
     */

    @Override
    public Task saveTask() {
        var task = new Task(1, Status.NEW);
        return task;
    }
}
