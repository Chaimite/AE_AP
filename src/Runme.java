

public class Runme
{

   public static void main(String[] args)
   {
      RandomTrainCreater rtc = new RandomTrainCreater();
      Thread tr = new Thread(rtc);
      tr.start();

   }

}
