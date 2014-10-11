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
        if(front == maxSize-1)
        {
            front = 0;
        }
        else
        {
            front++;
        }
        return values[nElements--];
    }
    
    @Override
    public String toString()
    {
        String output = "maxSize: " + maxSize + " nElements: " + nElements + " Queue: ";
        for(int i = front; front < back + 1; i++)
        {
            output += values[i] + " ";
        }
        output += "\n";
        return output;
    }
}
