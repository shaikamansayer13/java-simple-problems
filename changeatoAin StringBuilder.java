public class Main
{
  public static void main (String args[])
  {
      StringBuilder sb = new StringBuilder ("shaik aman sayer");
    //Scanner sc = new Scanner (System.in);
   // String str = sc.nextLine ();
    // input
    for (int i = 0; i < sb.length(); i++)
      {
        if(sb.charAt (i) == 'a'){
         sb.setCharAt(i,'A');
        }
      }
     System.out.println(sb);
  }
}
