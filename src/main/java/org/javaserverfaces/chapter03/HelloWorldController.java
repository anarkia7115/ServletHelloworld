package org.javaserverfaces.chapter03;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * A Simple JSF Application
 * @author juneau
 */
@Named(value = "helloWorldController")
@SessionScoped
public class HelloWorldController implements Serializable {    
    private String hello;

    /**
     * Creates a new instance of HelloWorldController
     */
    public HelloWorldController() {
        hello = "Hello World";
    }

    /**
     * @return the hello
     */
    public String getHello() {
        return hello;
    }

    /**
     * @param hello the hello to set
     */
    public void setHello(String hello) {
        this.hello = hello;
    }
}
