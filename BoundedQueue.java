/**
 * BoundedQueue.java
 * Implementation of an bounded queue for storing integers using arrays 
 *
 * 
 * @author John McDougall
 * @version 2014/10/11
 */

public class BoundedQueue
{
    private int maxSize;
    private int nElements;
    private int[] values;
    private int front;
    private int back;
    
    /**
     * Constructor
     * @param size - max size of bounded queue 
     */
    public BoundedQueue(int size)
    {
        maxSize = size;
        nElements = 0;
        front = 0;
        back = 0;
        values = new int[size]; 
    }
    
    /**
     * getNElements
     * @return - number of elements in the queue
     */
    public int getNElements()
    {
        return nElements;
    }
    
    /**
     * enqueue
     * @param newEntry - Value of integer to be added to the back of the queue
     * @return  Returns 0 if the queue is already at maximum size and 1 on success 
     */
    public int enqueue(int newEntry)
    {
        if(nElements == maxSize)
        {
            return 0;
        }
        else
        {
            values[back] = newEntry;
            
            if(back == maxSize - 1) 
            {
                back = 0;
            }
            else
            {
                back++;
            }
            
            nElements++;
            return 1;
        }
    }
    
    /**
     * dequeue
     * @return - The value of the removed entry. If there are no entries returns integer MIN_VALUE
     */
    public int dequeue()
    {
        if(nElements == 0)
        {
            return Integer.MIN_VALUE;
        }
        
        int num = values[front];
        
        if(front == maxSize-1)
        {
            front = 0;
        }
        else
        {
            front++;
        }
        
        nElements--;
        
        return num;
    }
    
    /**
     * to string 
     * @return - The queue as a string
     */
    public String toString()
    {
        String output = "maxSize: " + maxSize + " nElements: " + nElements + " Queue: ";
        if(nElements > 0)
        {
            int i = front;
            do
            {
                output += values[i] + " ";
                if(i == maxSize - 1)
                {
                    i = 0;
                }
                else
                {
                    i++;
                }
                
            }while(i != back);
        }

        return output;
    }
}
