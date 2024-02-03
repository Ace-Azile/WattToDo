import java.util.Scanner;

public class Processor {
    LinkedList todo;
    public Processor() {
        Task placeholder = new Task(0, "placeholder");
        todo = new LinkedList(placeholder);
    }
    public void run() {
        int input = 0;
        int total = 100;
        int current = 0;
        Scanner scanner = new Scanner(System.in);
        todo.printList();
        System.out.println("enter today's energy on a scale of 0-100:");
        current = scanner.nextInt();
        while(input != 5) {
            System.out.println("enter 1 to add a task, enter 2 to do a task, enter 5 to quit");
            input = scanner.nextInt();
            
            if (input == 1) {
                System.out.println("enter task name:");
                String taskName = scanner.next();
                System.out.println("enter task stamina cost:");
                int coat = scanner.nextInt();
                Task newTask = new Task(coat, taskName);
                todo.add(newTask);
            }
            else if(input == 2) {
                System.out.println("enter task name you want to do:");
                String taskName = scanner.next();
                int costRemove = todo.remove(taskName);
                current = current - costRemove;
            }
            todo.printList();
            
        }
        scanner.close();
    }
}
