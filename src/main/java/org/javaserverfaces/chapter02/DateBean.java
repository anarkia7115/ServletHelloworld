
package org.javaserverfaces.chapter02;

import java.time.LocalDateTime;

/**
 * Creating a Simple JSP
 * @author juneau
 */
public class DateBean {
    
    private LocalDateTime currentDate = LocalDateTime.now();

    /**
     * @return the currentDate
     */
    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    /**
     * @param currentDate the currentDate to set
     */
    public void setCurrentDate(LocalDateTime currentDate) {
        this.currentDate = currentDate;
    }
    
}

