package Model;
public class Riddle {
    int level;
    String solution;
    String category;
    String name;
    boolean isSolved;
    String message;

    public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
    public void setSolution(String msg) {
        this.solution = msg;
    }

    public int getLevel() {
        return level;
    }

    public String getSolution() {
        return solution;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public String getMessage() {
        return message;
    }

    public boolean solveRiddle(String userGuess) throws AlreadySolvedException {
        boolean isSolved = false;
        if (!this.isSolved) {
            if (this.solution.equals(userGuess)) {
                isSolved = true;
                this.isSolved = true;
                return isSolved;
            } else {
                return isSolved;
            }
        } else throw new AlreadySolvedException("Riddle "+this.name + " has been solved");
    }
}

