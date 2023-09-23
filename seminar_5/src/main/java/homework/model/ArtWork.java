package homework.model;

public class ArtWork {
    private int id;
    private String style;
    private String stage;
    private Process process = Process.ToDo;
    private User executor;

    public ArtWork(int id, String style, String stage, Process process) {
        this.id = id;
        this.style = style;
        this.stage = stage;
        this.process = process;
    }

    public int getId() {
        return id;
    }

    public String getStyle() {
        return style;
    }

    public String getStage() {
        return stage;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }
    @Override
    public String toString() {
        return "ArtWork: " +
                "id - " + id +
                ", style - " + style +
                ", stage - " + stage +
                ", process - " + process +
                ", executor - " + executor;
    }
}
