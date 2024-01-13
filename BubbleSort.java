public class BubbleSort
{
    public static void bubbleSort (int [] unsortedArray)
    {
        int swapper; //Placeholder variable to help swap array elements
        int passCount = 0; //Variable keeping track of the number of passes

        for(int i = 0; i < unsortedArray.length; i++)
        {
            //Segment of code to show the array at the start of the pass
            passCount++;
            System.out.println("Pass " + passCount + " (starting array): ");
            for (int element : unsortedArray)
            {
                if(element != unsortedArray[unsortedArray.length -1]) System.out.print(element + ", ");
                else System.out.print(element + ".");
            }
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------");

            //Segment of code using for loop to swap elements
            int swapCount = 0;
            for(int j = 1; j < unsortedArray.length - i; j++)
            {
                //Elements are swapped if the current element is greater than the next element
                if(unsortedArray[j -1] > unsortedArray[j])
                {
                    swapper = unsortedArray[j - 1];
                    unsortedArray[j - 1] = unsortedArray[j];
                    unsortedArray[j] = swapper;
                    swapCount++;

                    //Segment of code to show the array at the time of the swap
                    System.out.print("Swap " + swapCount + ": ");
                    for (int element : unsortedArray)
                    {
                        if(element != unsortedArray[unsortedArray.length -1]) System.out.print(element + ", ");
                        else System.out.print(element + ". \n");
                    }
                }
            }

            //Segment of code to show the array at the end of the pass
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Pass " + passCount + " (ending array): ");
            for (int element : unsortedArray)
            {
                if(element != unsortedArray[unsortedArray.length -1]) System.out.print(element + ", ");
                else System.out.print(element + ". \n");
            }

            System.out.println();
            System.out.println();
        }
    }

    public static void main (String [] args)
    {
        //Following is an example test case (can modify the int array to your liking)
        int [] unsortedArray = {4591807, 345, 234, 567, 234, 1, 64, 4092, 34, 657, 86, 1231, 384, 0, -1};
        bubbleSort(unsortedArray);
    }
}