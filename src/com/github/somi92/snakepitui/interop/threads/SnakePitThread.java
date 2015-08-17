/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.interop.threads;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import com.github.somi92.snakepitui.interop.SnakePitObject;
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
//        IFn run_snake_pit = Clojure.var("snake-pit.core", "-run_snakes_pit");
//        run_snake_pit.invoke(snakePit);
        System.out.println("Snake pit gp finished.");
    }
}
