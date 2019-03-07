
public abstract class Segment
{ // abstract class that will have tracks and stations

   private Segment nextSegment;

   public Segment(Segment segment)
   {
      this.nextSegment = segment;
   }

   public abstract void addTrain(Train train);

   public abstract void removeTrain(Train train);

   public abstract int timeInSegment(int speed);

   public Segment getNextSegment()
   {
      return nextSegment;
   }

}
