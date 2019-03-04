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
      
      Railway station1 = new Station("Glasgow",3);
      Railway station2 = new Station("Stirling", 2);
      Railway station3 = new Station("Perth", 2);
      Railway station4 = new Station("Inverness", 2);
      Railway track1 = new Track();
      Railway track2 = new Track();
      Railway track3 = new Track();
      
      ArrayList<Object> route = new ArrayList<Object>();
      route.add(station1);
      route.add(track1);
      route.add(station2);
      route.add(track2);
      route.add(station3);
      route.add(track3);
      route.add(station4);
      
      RandomTrainCreater rtc = new RandomTrainCreater();
      rtc.route = route;
      Thread tr = new Thread(rtc);
      tr.start();
      try
      {
         tr.join();
      }
      catch (InterruptedException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      //needs to have an object that creates trains randomly and randomly puts them
      //into the first bit of track/station
      //
      //an object that prints out the status of the railway
      //
      //create random delays
      
     
   }
   


}
