package dropWizard;

import dropWizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropWizardApplication extends Application<dropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropWizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropWizard";
    }

    @Override
    public void initialize(final Bootstrap<dropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropWizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}
