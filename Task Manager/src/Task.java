/**
 * This is the task object that holds any information relevant to
 * a specific task.
 */
public class Task {
    private String name;
    private Priority priority;
    // need to add Date end
    private int est_time;

    /**
     * Task object constructor
     * @param name the name of the task
     * @param priority the priority level of the task
     * @param est_time the estimated time to complete the task
     */
    public Task(String name, Priority priority, int est_time){ // need to add Date end
        this.name = name;
        this.priority = priority;
        this.est_time = est_time;
        // this.end = date
    }

    /**
     * Getter method for the name
     * @return the name of the task
     */
    public String getName(){
        return name;
    }

    /**
     * getter method for the priority level
     * @return the priority level
     */
    public Priority getPriority(){
        return priority;
    }

    /**
     * calculates the estimated end date of the task
     */
    // public Date getEndDate(){ return end; }

    /**
     * getter method for the estimated time of the task
     */
    public int getEstTime(){
        return est_time;
    }


    /**
     * calculates estimated start date of the task
     */
    // public Date estStartDate() {}

}
