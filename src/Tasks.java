import java.time.LocalDate;

public class Tasks {

    private String task;

    public Tasks(String task){
        this.task = task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public LocalDate date() {
        return LocalDate.now();
    }
}
