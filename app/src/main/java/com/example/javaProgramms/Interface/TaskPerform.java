package Interface;

public class TaskPerform implements Task {
    @Override
    public int show() {
        return result;

            }
            int result;
    int Operation(int n1, int n2, int choice){
        switch (choice){
            case 1:return result=n1+n2;
            case 2:return result=n1-n2;
            case 3:return result=n1*n2;
            case 4:return result=n1/n2;
            default:
                System.out.println("Enter the wrong choice");
    }
        return result;
    }}
