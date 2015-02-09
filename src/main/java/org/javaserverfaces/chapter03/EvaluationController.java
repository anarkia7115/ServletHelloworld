/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaserverfaces.chapter03;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "evaluationController")
@RequestScoped
public class EvaluationController {
    
    private boolean field1 = true;

    /**
     * Creates a new instance of EvaluationController
     */
    public EvaluationController() {
    }
    
    public boolean expr1(){
        return true;
    }
    
    public boolean expr2(){
        return false;
    }

    /**
     * @return the field1
     */
    public boolean isField1() {
        return field1;
    }

    /**
     * @param field1 the field1 to set
     */
    public void setField1(boolean field1) {
        this.field1 = field1;
    }
}

