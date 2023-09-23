package homework.service;

import homework.model.ArtWork;
import homework.model.Process;
import homework.model.User;

import java.util.Arrays;
import java.util.List;

public interface WorkInterface {
    public void NewWork(int id, String style, String stage, Process process);
    public void WorkAssigned(int id);
    public void WorkChangeStatus(int id);
    public List<ArtWork> showScrumBoard();

}
