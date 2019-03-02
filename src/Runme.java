import java.util.Random;

public class Runme implements Runnable
{

   public static void main(String[] args)
   {
      Train train1 = new Express(speed, time);
      Train train2 = new Local(speed, time);
      Station station1 = new Station("Glasgow", speed);
      Station station2 = new Station("Stirling", speed);
      Station station3 = new Station("Perth", speed);
      Station station4 = new Station("Inverness", speed);
      Track track1 = new Track(speed);
      Track track2 = new Track(speed);
      Track track3 = new Track(speed);
      
      //needs to have an object that creates trains randomly and randomly puts them
      //into the first bit of track/station
      //
      //an object that prints out the status of the railway
      //
      //create random delays
      
     
   }

   
   @Override
   public void run()
   {
      // TODO Auto-generated method stub
      
   }

}
