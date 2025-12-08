enum Status{
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    FAILED
}
public class Demo08_Enum {
    public static void main(String[] args) {
        Status currentStatus = Status.IN_PROGRESS;
        System.out.println("Index : " + currentStatus.ordinal()); // Outputs: 1

        Status[] allStatuses = Status.values();
        for(Status status : allStatuses){
            System.out.println(status + " at index " + status.ordinal());
        }

        Status s = Status.COMPLETED;
        System.out.println(s.getClass().getSuperclass().getName()); // Outputs: java.lang.Enum

        switch(s){
            case PENDING:
                System.out.println("Task is pending.");
                break;
            case IN_PROGRESS:
                System.out.println("Task is in progress.");
                break;
            case COMPLETED:
                System.out.println("Task is completed.");
                break;
            case FAILED:
                System.out.println("Task has failed.");
                break;
        }

        if(s == Status.COMPLETED){
            System.out.println("The task status is COMPLETED.");
        }else if(s == Status.FAILED){
            System.out.println("The task status is FAILED.");
        }else if(s == Status.IN_PROGRESS){
            System.out.println("The task status is IN_PROGRESS.");
        }else{
            System.out.println("The task status is PENDING.");
        }
    }
}
