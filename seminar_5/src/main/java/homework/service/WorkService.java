package homework.service;

import homework.model.ArtWork;
import homework.model.Process;

import java.util.ArrayList;
import java.util.List;

public class WorkService implements WorkInterface {
    List<ArtWork> scrumBoard = new ArrayList<>();

    @Override
    public void NewWork(int id, String style, String stage, Process process) {
        scrumBoard.add(new ArtWork(id, style, stage, process));
    }

    @Override
    public void WorkAssigned(int id) {
        //TODO вызов работы по id из списка и назначение ответственного

    }

    @Override
    public void WorkChangeStatus(int id) {
        //TODO вызов работы по id из списка и изменение статуса
    }

    @Override
    public List<ArtWork> showScrumBoard() {
        return scrumBoard;
    }
}
