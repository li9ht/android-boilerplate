package my.fird.app.injection.component;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import my.fird.app.data.DataManager;
import my.fird.app.data.SyncService;
import my.fird.app.data.local.DatabaseHelper;
import my.fird.app.data.local.PreferencesHelper;
import my.fird.app.data.remote.RibotsService;
import my.fird.app.injection.ApplicationContext;
import my.fird.app.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    Bus eventBus();

}
