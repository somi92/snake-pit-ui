/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.interop.threads;

import com.github.somi92.snakepitui.interfaces.SnakePitReport;
import com.github.somi92.snakepitui.interop.SnakePitObject;
import java.util.Date;
import snake_pit.core;

/**
 *
 * @author milos
 */
public class SnakePitThread extends Thread {

    private SnakePitReport snakePit;
    
    public SnakePitThread() {
    }
    
    public SnakePitThread(SnakePitObject snakePit) {
        this.snakePit = snakePit;
    }
    
    @Override
    public void run() {
        System.out.println("Starting snake pit gp engine...");
        snakePit.onRunStarted("GP started at "+(new Date()).toString()+'\n');
        try {
            core.run_snakes_pit(snakePit);
            System.out.println("Snake pit gp finished.");
            snakePit.onRunFinished("GP finished at "+(new Date()).toString()+'\n');
        } catch (Exception e) {
            e.printStackTrace();
            if(e instanceof InterruptedException) {
                System.out.println("Snake pit gp stopped.");
                snakePit.onRunStopped("GP stopped at "+(new Date()).toString()+'\n');
            } else {
                System.out.println("Snake pit gp error: "+e.getMessage());
                snakePit.onResult("GP error at "+(new Date()).toString()+'\n');
                snakePit.onResult("Error message: "+e.getMessage()+'\n');
                snakePit.onRunStopped("GP stopped at "+(new Date()).toString()+'\n');
            }
        }
    }
}
