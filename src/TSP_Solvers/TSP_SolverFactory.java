package TSP_Solvers;

import Objects.HamiltonCycle;

/**
 * Created by xjlm on 9/15/15.
 */

public class TSP_SolverFactory{
    public TSP_Solver setAlgorithm(String type) {
        switch (type) {
            case "2opt":
                return new twoOptLocalSearch();
            case "EA":
            	return new EASolver();
            case "InverOver":
                return new InverOver();
        }
        return null;
    }
}
