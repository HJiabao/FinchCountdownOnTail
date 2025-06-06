public void times(int time){
  for(int i=0;i<time;i++){
    for(int j=0;j<5;j++){
      numbers(j);
      bird.pause(1);
    }
  }
}

public void numbers(int num){
  int[] display= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  switch(num){
    case 1:
      display={0,0,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,1,1,1,1};
      bird.setDisplay(display);
      break;
    case 2:
      display={0,1,1,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,1};
      bird.setDisplay(display);
      break;
    case 3:
      display={0,1,1,1,0,1,0,0,0,1,0,0,1,1,0,1,0,0,0,1,0,1,1,1,0};
      bird.setDisplay(display);
      break;
    case 4:
      display={1,0,1,0,0,1,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,0};
      bird.setDisplay(display);
      break;
    case 5:
      display={1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0};
      bird.setDisplay(display);
      break;
    case 6:
      display={0,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1};
      bird.setDisplay(display);
      break;
    case 7:
      display={1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0};
      bird.setDisplay(display);
      break;
    case 8:
      display={1,1,1,1,1,1,0,0,0,1,0,1,1,1,0,1,0,0,0,1,1,1,1,1,1};
      bird.setDisplay(display);
      break;
    case 9:
      display={1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1};
      bird.setDisplay(display);
      break;
    case 10:
      display={1,0,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,0,1,0};
      bird.setDisplay(display);
      break;
  }
}
