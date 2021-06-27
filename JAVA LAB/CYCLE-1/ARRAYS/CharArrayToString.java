class CharArrayToString
{
   public static void main(String args[])
   {
      
      char[] ch = {'j', 'a', 'v', 'a', ' ', 'p','r','o','g','r','a','m','m','i','n','g'};
      String str = new String(ch);
      System.out.println(str);
 
      
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}