package my.fird.app.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import my.fird.app.injection.component.ApplicationComponent;
import my.fird.app.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
