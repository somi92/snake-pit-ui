/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.interfaces;

/**
 *
 * @author milos
 */
public interface SnakePitReport {
    
    public void onRunStarted(String message);
    public void onResult(String message);
    public void onRunFinished(String message);
    public void onRunStopped(String message);
}
