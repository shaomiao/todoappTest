package com.project.todoapptest.tasks;

import android.support.annotation.NonNull;

import com.project.todoapptest.BasePresenter;
import com.project.todoapptest.BaseView;
import com.project.todoapptest.data.Task;

import java.util.List;

/**
 * @author shaomiao
 * @Date 2017/3/10
 * @Time 13:44
 */

public interface TasksContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

//        void showTasks(List<Task>);
    }

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadTasks(boolean forceUpdate);

        void addNewTask();

        void openTaskDetails(@NonNull Task requestedTask);

        void completeTask(@NonNull Task completedTask);

        void activateTask(@NonNull Task activeTask);

        void clearCompletedTasks();

    }

}
