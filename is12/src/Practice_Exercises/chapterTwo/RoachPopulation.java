package Practice_Exercises.chapterTwo;

/**
 *Task 10
 */
public class RoachPopulation
{
    private double populationSize;

    // Constructors
    /**
     * Constructs a RoachPopulation object with a given initial population
     * @param initialPop initial population
     */
    public RoachPopulation(int initialPop)
    {
        populationSize = initialPop;
    }

    // Methods
    /**
     * Breeds the population of roaches and doubles
     * population size
     */
    public void breed()
    {
        populationSize = populationSize * 2;
    }

    /**
     * Kills off the population by a certain percentage
     * @param byPercent percent to kill off
     */
    public void spray(double byPercent)
    {
        double percent = byPercent / 100.0;
        populationSize = populationSize - (populationSize * percent);
    }

    /**
     * Gets the roach population
     * @return roach population
     */
    public double getRoachPopulation()
    {
        return populationSize;
    }


}
