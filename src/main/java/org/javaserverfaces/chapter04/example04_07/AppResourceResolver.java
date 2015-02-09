
package org.javaserverfaces.chapter04.example04_07;

import java.net.URL;
import javax.faces.view.facelets.FaceletsResourceResolver;
import javax.faces.view.facelets.ResourceResolver;

/**
 * @author juneau
 */

@FaceletsResourceResolver
public class AppResourceResolver extends ResourceResolver {
    private ResourceResolver parent;
    public AppResourceResolver(ResourceResolver parent) {
        this.parent = parent;
    }
    
    public URL resolveUrl(String path) {
        System.out.println("Using Custom Resource Resolver");
        URL url = parent.resolveUrl(path);
        if (url == null) {

            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            url = parent.resolveUrl(path);
        }
        return url;
    }

   

}