int creepersX=200;
int creepersY=200;
int creepersX2=400;
int creepersY2=400;
int firstCreeperFound= 1;
 PImage creeper; 
void setup(){

 
  size(500,500);
  PImage minecraft = loadImage("creeperBack.jpeg");     
minecraft.resize(500,500);
noStroke();
background(minecraft);          
  
 creeper=loadImage("creeper1.png");   
  creeper.resize(5,5);
}


void draw(){
  image(creeper, creepersX, creepersY);  
  
if (mousePressed){
  fill(#FF0505);
ellipse(mouseX,mouseY,20,20); 
    
 if (isNear(mouseX, creepersX) && (isNear(mouseY, creepersY))){
  fill(#26D13B);
   ellipse(mouseX,mouseY,20,20); 
   textSize(30);
   fill(#000300);
    text("You have found the creeper!",40,40);
    text("Another creeper incoming!",40,80);
    image(creeper, creepersX2, creepersY2);
    firstCreeperFound=2;
}

  if (mousePressed && firstCreeperFound==2){
  fill(#FF0505);
ellipse(mouseX,mouseY,20,20); 
    
 if (isNear(mouseX, creepersX2) && (isNear(mouseY, creepersY2))){
  fill(#26D13B);
   ellipse(mouseX,mouseY,20,20); 
   textSize(30);
   fill(#000300);
    text("You have found the creeper!",40,400);
    text("You win!!!",40,180);
   
}
 

  
}}
}
boolean isNear(int a, int b) {
if (abs(a - b) < 50)
     return true;
else
     return false;
}