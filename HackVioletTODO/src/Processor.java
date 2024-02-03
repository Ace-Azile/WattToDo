import java.util.Scanner;

public class Processor {
    LinkedList todo;
    public Processor() {
        Date newDate = new Date(1, 1, 1);
        Task placeholder = new Task(0, "placeholder", newDate);
        todo = new LinkedList(placeholder);
    }
    public void run() {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        todo.printList();
        while(input != 5) {
            System.out.println("enter 1 to add a task, enter 2 to do a task, enter 5 to quit");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("enter task name:");
                String taskName = scanner.next();
                System.out.println("enter task stamina cost:");
                int coat = scanner.nextInt();
                System.out.println("enter task due month:");
                int month = scanner.nextInt();
                System.out.println("enter task due day:");
                int day = scanner.nextInt();
                System.out.println("enter task due year:");
                int year = scanner.nextInt();
                Date newDate = new Date(day, month, year);
                Task newTask = new Task(coat, taskName, newDate);
                todo.add(newTask);
            }
            else if(input == 2) {
                
            }
            
        }
        scanner.close();
    }
}
