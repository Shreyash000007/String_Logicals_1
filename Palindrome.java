public class Palindrome
{
// prepare a Code to findout whether a String is Palindrome or not
public void pal(String word)
{
    String rev="";//Empty String

    String temp=word;
 
    
    for(int i=word.length()-1;i>=0;i--)
    {
       rev=rev+word.charAt(i);
    }
    if(temp.equals(rev))
    {
        System.out.println(temp+" is a Palindrome Number .");
    }
    else 
    {
        System.out.println(temp+" is not a Palindrome Number ,");
    }
}
public static void main(String[] args) 
{ 
   Palindrome aobj=new Palindrome();  
   aobj.pal("sos");
}

}
