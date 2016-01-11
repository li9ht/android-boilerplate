package my.fird.app.injection.component;

import dagger.Component;
import my.fird.app.injection.PerActivity;
import my.fird.app.injection.module.ActivityModule;
import my.fird.app.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
