/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stopwatch;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author salsa
 */
class Stopwatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;
    
    public Stopwatch(){
    }
        
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
}
