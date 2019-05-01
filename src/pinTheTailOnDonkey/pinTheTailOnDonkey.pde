 import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch


 
 
 
 
 PImage donkey;
  PImage tail;
  int boxX=0;
  int boxY=0;
void setup(){
  int x= mouseX;
  int y= mouseY;
  size(500,500);
 donkey = loadImage("donkey.jpeg");   
 donkey.resize(500,500);
tail = loadImage("mermaid-tail-transparent-image.png");     
  tail.resize(100,100);
  
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to



}
}

void draw(){
 
  rect(0, 0,100,100);
   
   rect(375,150, 100,100);
   if (dist(0, 0, mouseX, mouseY) < 99){
      background (donkey);
     image(tail, mouseX,mouseY);
   }
  else{
   background(#050000); 
  }
  if (dist(375,150, mouseX, mouseY) < 99){
      background (donkey);
      if(mousePressed){
    boxX=mouseX;
    boxY=mouseY;
    if (playSound) {
     woohooSound.trigger();
     playSound = false;
      }
    if(boxX==0){
        image(tail, mouseX,mouseY);
   
    
    }
  else{
   image(tail,boxX,boxY); 
  }
  
  }
  
  
  
  
  
  
  
  
}