package org.mark;

import javax.servlet.AsyncContext;

/**
 *
 * @author Juneau
 */
public class ServletService implements Runnable {

    AsyncContext ac;

    public ServletService(AsyncContext ac) {
        this.ac = ac;
        System.out.println("Dispatched to " + "\"ServletService\"");
    }

    @Override
    public void run() {
        System.out.println("Some long running process in \"ServletService\"");
        ac.complete();
    }
}
