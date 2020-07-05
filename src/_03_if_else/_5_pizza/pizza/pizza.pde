/* import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
*/

void setup() {
 size(500,500);
 fill(#F0D46F);
 ellipse(250,250,450,450);
 fill(#B70F12);
 ellipse(250,250,400,400);
 fill(#FAEA38);
 ellipse(250,250,375,375);
 
 /* minim = new Minim(this);      //in the setup method
 sound = minim.loadFile("ding.wav");      //in the setup method
*/
}
void draw() {
  if (mousePressed==true){
    fill(#F52326);
    ellipse(mouseX,mouseY,50,50);
   /* sound.play();
    sound.rewind();
*/
  }
  
}
