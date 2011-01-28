package hudson.plugins.deploy.jetty;

import hudson.Extension;
import hudson.plugins.deploy.ContainerAdapterDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Jetty 4.x .
 * 
 * @author Jerome Lacoste
 */
public class Jetty4xAdapter extends JettyAdapter {
    @DataBoundConstructor
    public Jetty4xAdapter(String url, String password, String userName) {
        super(url, password, userName);
    }

    public String getContainerId() {
        return "jetty4x";
    }

    @Extension
    public static final class DescriptorImpl extends ContainerAdapterDescriptor {
        public String getDisplayName() {
            return "Jetty 4.x";
        }
    }
}
