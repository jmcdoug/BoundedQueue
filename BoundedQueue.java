package array.bounded.queue;

public class BoundedQueue
{
    int maxSize;
    int nElements;
    int[] values;
    int front;
    int back;
    
    public BoundedQueue(int size)
    {
        maxSize = size;
        nElements = 0;
        front = 0;
        back = 0;
        values = new int[size]; 
    }
    
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
    
    public int dequeue()
    {
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

        output += "\n";
        return output;
    }
}
