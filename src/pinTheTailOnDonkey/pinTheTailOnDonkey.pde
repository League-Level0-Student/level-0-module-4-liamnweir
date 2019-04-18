 PImage donkey;
  PImage tail;
void setup(){
  size(500,500);
 donkey = loadImage("donkey.jpeg");   
 donkey.resize(500,500);
tail = loadImage("mermaid-tail-transparent-image.png");     
  tail.resize(100,100);
  
}

void draw(){
 
  rect(0, 0, 100,100);
   
   rect(375,150, 100,100);
   if (dist(0, 0, mouseX, mouseY) < 99){
      background (donkey);
     image(tail, 1,1);
   }
  else{
   background(#050000); 
  }
  if (dist(375,150, mouseX, mouseY) < 99){
    
    background (donkey);
    
    
    
  }
}