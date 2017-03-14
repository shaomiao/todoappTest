package com.project.todoapptest.data.source;

import com.project.todoapptest.data.Task;

import java.util.List;

/**
 * @author shaomiao
 * @Date 2017/3/13
 * @Time 14:32
 */

public interface TasksDataSource {

    interface LoadTasksCallback {

        void onTasksLoaded(List<Task> tasks);

        void onDataNotAvailable();
    }

    interface GetTaskCallback {

        void onTaskLoaded(Task task);

        void onDataNotAvailable();
    }

    void getTasks();

    void getTask();

    void saveTask();
}
