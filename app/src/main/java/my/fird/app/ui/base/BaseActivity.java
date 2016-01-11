package my.fird.app.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import my.fird.app.BoilerplateApplication;
import my.fird.app.injection.component.ActivityComponent;
import my.fird.app.injection.component.DaggerActivityComponent;
import my.fird.app.injection.module.ActivityModule;

public class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(BoilerplateApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }

}
