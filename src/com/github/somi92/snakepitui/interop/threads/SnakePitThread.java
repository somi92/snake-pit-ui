/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.interop.threads;

import com.github.somi92.snakepitui.interop.SnakePitObject;
import java.util.Date;
import snake_pit.core;

/**
 *
 * @author milos
 */
public class SnakePitThread extends Thread {

    private SnakePitObject snakePit;
    
    public SnakePitThread() {
    }
    
    public SnakePitThread(SnakePitObject snakePit) {
        this.snakePit = snakePit;
    }
    
    @Override
    public void run() {
        System.out.println("Starting snake pit gp engine...");
        core.run_snakes_pit(snakePit);
        System.out.println("Snake pit gp finished.");
        snakePit.report("GP finished at "+(new Date()).toString()+'\n');
    }
}
