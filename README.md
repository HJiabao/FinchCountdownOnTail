# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |       A corn hole      |
|    ✅     | Develop Code |    A Timer that would be displayed on the tail of the finch robot    |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

A fun mingame for friends to play but also adding in a competitive nature to it with 5 different distances that is farther than the previous.Each distance would give the player 60 seconds to score as much points as possible.

</details>

---

### Design Cycle
<img src="cycle.png" alt="cycle" width="300" height="300">

###### We created a prototype of the corn hole to see if it turned out well and tested if it could fit perfectly into the finch robot.But it was a little hard to insert of we made it a little bit smalled and also decided to make the corn hole bigger so it would be easier to score point.After the changes, the corn hole fitted perfectly into the finch robot.

---

### Code to Highlight

```java
public void numbers(int num){
  int[] display= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  switch(num){
    case 1:
      display={0,0,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,1,1,1,1};
      bird.setDisplay(display);
      break;
```
---

### Final Thoughts
- What was your motivation?
  - Creating a cool and orginal project and challenged myself but adding unnecessary feature of having a countdown to tell the player the time left.
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
  - We built this magnificent and spectacular because Shakib thought of it and because many other people are making a sport related project.
- What makes your project stand out?
  - It stands out because its 1 of a kind and its multi-purpose.
