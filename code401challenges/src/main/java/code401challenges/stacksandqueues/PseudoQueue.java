package code401challenges.stacksandqueues;

public class PseudoQueue {
    Stack stackOne;
    Stack stackTwo;


    public PseudoQueue(){
        stackOne = new Stack();
        stackTwo = new Stack();
    }


    public void enqueue(int value) {
        while(stackOne.top != null){
            stackTwo.push(stackOne.pop());
            System.out.println("stackOne.top.value = " + stackOne.top.value);
            System.out.println("stackTwo.top.value = " + stackTwo.top.value);

        }
        stackOne.push(value);

        while(stackTwo.top != null){
            stackOne.push(stackTwo.pop());
        }
    }

    public int dequeue(){
        if (stackOne.top == null) {
            throw new NullPointerException("Failed to pop due to null value for top");
        }

        return stackOne.pop();
    }
}
