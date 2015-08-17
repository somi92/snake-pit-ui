/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.snakepitui.interop;

import javax.swing.JTextArea;

/**
 *
 * @author milos
 */
public class SnakePitObject {
   
    private JTextArea txtArea;
    
    private int iterations;
    private int migrations;
    private int num_islands;
    private int tournament_size;
    private int population_size;
    private int max_depth;
    private double mutation_probability;
    private String functions;

    public SnakePitObject() {
    }

    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }
    
    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getMigrations() {
        return migrations;
    }

    public void setMigrations(int migrations) {
        this.migrations = migrations;
    }

    public int getNum_islands() {
        return num_islands;
    }

    public void setNum_islands(int num_islands) {
        this.num_islands = num_islands;
    }

    public int getTournament_size() {
        return tournament_size;
    }

    public void setTournament_size(int tournament_size) {
        this.tournament_size = tournament_size;
    }

    public int getPopulation_size() {
        return population_size;
    }

    public void setPopulation_size(int population_size) {
        this.population_size = population_size;
    }

    public int getMax_depth() {
        return max_depth;
    }

    public void setMax_depth(int max_depth) {
        this.max_depth = max_depth;
    }

    public double getMutation_probability() {
        return mutation_probability;
    }

    public void setMutation_probability(double mutation_probability) {
        this.mutation_probability = mutation_probability;
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }
    
    public void report(String res) {
        txtArea.append(res+'\n');
    }
}
