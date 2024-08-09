public class PrintingEven
{  
// Write the Code to printEven Length Words With  their Length
   public void even(String s)
   {
     String[] word=s.split(" ");

     int[] wordLength=new int [word.length];

     for(int i=0;i<=word.length-1;i++)
     {
        wordLength[i]=word[i].length();
        
    }
    for(int i=0;i<=word.length-1;i++)
    {
        if(wordLength[i]%2==0)
        {
            System.out.println(word[i] +" : "+wordLength[i]);
        }
    }
   }
   public static void main(String[] args) 
   {
     PrintingEven aobj=new PrintingEven();
     String s="Christopher Nolan is the director of Oppenheimer";
     aobj.even(s); 
   }
}
