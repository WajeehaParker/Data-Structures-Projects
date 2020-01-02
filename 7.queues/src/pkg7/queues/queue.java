/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.queues;

/**
 *
 * @author Wajeeha Parker
 */
public class queue {
    int maxsize, front, rear;
    long[] queuearray;
    public queue(int n)
    {
        maxsize=n+1;
        queuearray=new long[maxsize];
        front=0;
        rear=-1;
    }
    public void enqueue(long j)
    {
        if (rear==maxsize-1)
            rear=-1;
        queuearray[++rear]=j;
    }
    public long dequeue()
    {
        long temp=queuearray[front++];
        if (front==maxsize)
            front=0;
        return temp;
    }
    public long peek()
    {
        return queuearray[front];
    }
    public boolean isempty()
    {
        return (rear+1==front || front+maxsize-1==rear);
    }
    public boolean isfull()
    {
        return (rear+2==front || front+maxsize-2==rear);
    }
    public int size()
    {
        if (rear>=front)
            return rear-front+1;
        else return (maxsize-front)+(rear+1);
    }
}
