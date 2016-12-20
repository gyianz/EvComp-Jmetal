# EvComp_Assignment3
Repository for Assignment 3

## Algorithm Runners
Runs the Evolutionary algorithm to maximise **_p<sub>i,j</sub>_** and **_p<sub>i,k</sub>_**

## How-To-Run
Compile the program by running (from `/src` directory)
```
javac -cp ".:../lib/*" Driver/Main.java
```

To run any of the 54 situational experiments, run
```
java -cp ".:../lib/*" Driver/Main <Ex#> <Cities> <MOEARunner> <Algorithm_i>
```

## Parameters
`Ex#`   | Description
:----: | ---
`Ex1` | Runs Excercise 1: Cities in a Fixed [20,20] space
`Ex2` | Runs Excercise 2: Cities in a Continuous [20,20] space
`Ex3` | Runs Excercise 3: MOEA Outer loop running MOEA Inner loop

`Cities`   | Description
:----: | ---
`50` | Runs on 50 Cities in Total (Outer Loop 5; Inner Loop 10)
`100` | Runs on 100 Cities in Total (Outer Loop 10; Inner Loop 10)

`MOEARunner`   | Description
:----: | ---
`NSGAII` | Runs MOEA using NSGAII
`SPEA2` | Runs MOEA using SPEA2
`IBEA` | Runs MOEA using IBEA

`Algorithm_i` | Description
:-----------: | ---
`2opt` | uses 2opt local search as algorithm i
`InverOver` | uses the Inver-Over algorithm as algorithm i
`EA` | uses the EA from Assignment 1 as algorithm i

When selecting `Algorithm_i`, `Algorithm_j` and `Algorithm_k` are automatically selected in running order of the above list (table). That is, if `Algorithm_i = InverOver`, then `Algorithm_j = 2opt` and `Algorithm_k = EA`.

## For Reference
- **_f<sub>A<sub>i</sub></sub>(I)_** <- fitness of `Algorithm_i` on instance **_I_**

**_p<sub>i,j</sub>_** = **_f<sub>A<sub>i</sub></sub>(I)_** - **_f<sub>A<sub>j</sub></sub>(I)_**

### jMetal Documentation
https://github.com/jMetal/jMetalDocumentation
