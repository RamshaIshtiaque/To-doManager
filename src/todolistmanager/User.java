package todolistmanager;

public class User {
    private final String name;
    private final TaskList toDoList;

    public User(String name) {
        this.name = name;
        this.toDoList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        toDoList.addTask(description);
    }

    public void markTaskAsCompleted(String description) {
        toDoList.markTaskAsCompleted(description);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        toDoList.printTasks();
    }
}

