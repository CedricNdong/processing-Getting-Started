import processing.core.PApplet;

public class SmaleyFace extends PApplet {
    public static void main(String[] args) {
        String[] appArgs = {"Smaley Face"};
        SmaleyFace smaleyFace= new SmaleyFace ();
        PApplet.runSketch(appArgs, smaleyFace);
    }

    int Grey = color(184, 178, 173);

    //  size of the window
    public void settings() {

        size(300,300);
    }
    public void setup() {
        background(Grey);

    }

    //draw the head
    void paintHead(){
        fill(217, 134, 65);
        ellipse(100, 100, 150, 150);
    }

    //draw the eyes
    void paintEyes(){

        //white
        fill(255);

        ellipse(75, 85, 30, 20);
        ellipse(125, 85, 30, 20);

        fill(0);  //black

        //draw the pupils
        ellipse(75, 85, 10, 10);
        ellipse(125, 85, 10, 10);

    }

    //draw the mouth
    void paintMouth(){

        fill(255, 0, 0); //red

        arc(100F, 125, 80, 50, 0, 3);
        line(60, 125, 140, 125);
    }
    public void draw(){
        paintHead();
        paintEyes();
        paintMouth();

    }



}
