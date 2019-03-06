import java.util.ArrayList;

public class Runme implements Runnable
{

   @Override
   public void run()
   {
      // TODO Auto-generated method stub

   }

   public static void main(String[] args)
   {

      Segment station1 = new Station("Glasgow", 3);
      Segment station2 = new Station("Stirling", 2);
      Segment station3 = new Station("Perth", 2);
      Segment station4 = new Station("Inverness", 2);
      Segment track1 = new Track();
      Segment track2 = new Track();
      Segment track3 = new Track();

      ArrayList<Object> route = new ArrayList<Object>();
      route.add(station1);
      route.add(track1);
      route.add(station2);
      route.add(track2);
      route.add(station3);
      route.add(track3);
      route.add(station4);

      RandomTrainCreater rtc = new RandomTrainCreater();
      // rtc.route = route;
      Thread tr = new Thread(rtc);
      tr.start();
      try
      {
         tr.join();
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }

      // an object that prints out the status of the railway

   }

}
