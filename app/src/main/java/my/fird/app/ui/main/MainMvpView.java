package my.fird.app.ui.main;

import java.util.List;

import my.fird.app.data.model.Ribot;
import my.fird.app.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
