# FinchCountdownOnTail
THIS CODE CAN BE USED TO DISPLAY A COUNTDOWN ON THE FINCH 2.0's Tail

PLAN:
- Do a 0-9 for 10 seconds then repeat that 6 times for a total of 60 seconds
- 0-9 for 10 seconds intermission to take back the balls and restock the player

Method Signature: public void setDisplay(int[] ledValues)
Description: Sets the LED array of the micro:bit to display a pattern defined by an array. Each value in the array must be 0 (off) or 1 (on). The first five values in the array correspond to the five LEDs in the first row, the next five values to the second row, etc.
Example: int patternArray[] = {0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0};
bird.setDisplay(patternArray);
