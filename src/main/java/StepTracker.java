import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> daysWorked;
 private int activeNum;
 public StepTracker(int active){
  daysWorked = new ArrayList<Integer>();
  activeNum = active;
 }
 public void addDailySteps(int numSteps){
   daysWorked.add(numSteps);
 }
 public int activeDays(){
  int count = 0;
  if(daysWorked.size() == 0)
    return 0;
  for(int i = 0 ; i < daysWorked.size(); i++){
    if(daysWorked.get(i) >= activeNum)
      count++;
  }
  return count;
 }
 public double averageSteps(){
  int totalSteps = 0;
  if(daysWorked.size(0 == 0)
     return 0.0;
  for(int i = 0; i < daysWorked.size(); i++){
   totalSteps+=daysWorked.get(i);
  }
  double average = totalSteps/daysWorked.size();
  return average;
 }
} 
