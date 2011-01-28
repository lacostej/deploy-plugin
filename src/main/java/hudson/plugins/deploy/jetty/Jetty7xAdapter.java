package hudson.plugins.deploy.jetty;

import hudson.Extension;
import hudson.plugins.deploy.ContainerAdapterDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Jetty 7.x.
 * 
 * @author Jerome Lacoste
 */
public class Jetty7xAdapter extends JettyAdapter {
    @DataBoundConstructor
    public Jetty7xAdapter(String url, String password, String userName) {
        super(url, password, userName);
    }

    public String getContainerId() {
        return "jetty7x";
    }

    @Extension
    public static final class DescriptorImpl extends ContainerAdapterDescriptor {
        public String getDisplayName() {
            return "Jetty 7.x";
        }
    }
}
