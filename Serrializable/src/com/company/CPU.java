package com.company;

import java.io.Serializable;

public class CPU  implements Serializable {
    String name;
    int frequency;
    int cores;
    String architecture;

    public CPU(String name, int frequency, int cores, String architecture) {
        this.name = name;
        this.frequency = frequency;
        this.cores = cores;
        this.architecture = architecture;
    }
}
