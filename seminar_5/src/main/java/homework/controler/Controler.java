package homework.controler;

import homework.model.Process;
import homework.service.WorkInterface;
import homework.service.WorkService;
import homework.view.ArtistWorkView;
import homework.view.TeamLeadWorkView;

public class Controler {
    private WorkService workService = new WorkService();
    private ArtistWorkView artistWorkView = new ArtistWorkView();
    private TeamLeadWorkView teamLeadWorkView = new TeamLeadWorkView();

    public void go(){
        workService.NewWork(1, "2D", "Line", Process.ToDo);
    }
    public void showBoard(){
        System.out.println(workService.showScrumBoard());
    }
}
