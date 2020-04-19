package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/*
    int level;
    String solution;
    String name;
    boolean isSolved;
    String message;

    public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }

 */

public class RiddleTest {
    Riddle riddle;
    int level;
    String solution;
    String name;
    boolean isSolved;
    String message;


    @Before
    public void setUp() throws Exception {
        level = 3;
        solution = "8" ;
        name = "Fibbonachi";
        message = "1,1,2,3,5,_,13";
        riddle = new Riddle(level,name);
        riddle.setMessage(message);
        riddle.setSolution(solution);
    }

    @Test
    public void solveRiddle() {
        try {
            boolean retVal = riddle.solveRiddle("9");
        } catch (AlreadySolvedException e) {
            System.out.println(e.getMessage());
        }
    }
}