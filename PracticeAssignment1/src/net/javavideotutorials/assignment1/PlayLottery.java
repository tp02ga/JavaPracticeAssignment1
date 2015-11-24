package net.javavideotutorials.assignment1;

import java.io.IOException;
import java.util.Set;

import org.junit.Test;

/**
 * To play the lottery, just run the test in this class.  
 * 
 * In order to run the test just highlight the "play_lottery" method
 * name below, right click on it, then select "Run As", and "JUnit Test"
 * 
 * @author Trevor Page
 *
 */
public class PlayLottery 
{

  @Test
  public void play_lottery () throws IOException
  {
    PlayLottery play = new PlayLottery();
    play.setupLottery();
  }
  
  public void setupLottery() throws IOException
  {
    LotteryNumberGenerator generator = new LotteryNumberGenerator();
    LotteryNumberPicker picker = new LotteryNumberPicker();
    Set<Integer> generatedLotteryNumbers = generator.generateLotteryNumbers();
    Set<Integer> userLotteryNumbers = picker.promptUserForLotteryNumbers();
    
    System.out.print("Here are the lottery numbers: ");
    for (Integer generatedNumber : generatedLotteryNumbers)
    {
      System.out.print(generatedNumber + " ");
    }
    System.out.println();
    
    Set<Integer> matchedNumbers = playLottery(generatedLotteryNumbers, userLotteryNumbers);
    System.out.println("You matched " + matchedNumbers.size() + " number(s)");
    if (matchedNumbers.size() > 0)
    {
      System.out.print("Your matched numbers were: ");
      for (Integer matchedNumber : matchedNumbers)
      {
        System.out.print(matchedNumber + " ");
      }
    }
  }
  
  /**
   * This method should compare two Sets of Integers and return a new 
   * Set of Integers that represent all of the matching numbers.
   * 
   * For example, if the lotteryNumbers are (4, 6, 23, 34, 44, 45) and
   * the userNumbers are (4, 18, 22, 24, 35, 45) then the returned Set
   * of Integers should be (4, 45)
   * 
   * @param lotteryNumbers the lottery nubmers that were randomly generated
   * @param userNumbers the user picked numbers that were picked in the console
   * @return Set of matched numbers
   */
  public Set<Integer> playLottery (Set<Integer> lotteryNumbers, Set<Integer> userNumbers)
  {
    return null;
  }
}
