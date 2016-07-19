/**
 * Created by yeshan on 7/12/2016.
 */
import java.lang.Math;
import java.util.ArrayList;

public class Ball {
        private double x;
        private double y;
        private double speed;
        private double angleOfSpeed;
        static ArrayList<Ball> detailBall=new ArrayList<Ball>();

        public Ball(double x, double y, double speed, double angleOfSpeed) {
            this.x=x;
            this.y=y;
            this.speed=speed;
            this.angleOfSpeed=angleOfSpeed;
            detailBall.add(this);     // add to the array list
        }


        public static void updateTime(double time) {
            for (Ball r : detailBall){
                r.newPosition(time);
            }
        }

        public static void showAll() {
            for(Ball p:detailBall){
                System.out.println("posX = " + p.x+ " posY = "+p.y);
            }
        }


        public void newPosition(double time){
            x=(time*speed*Math.cos(Math.toRadians(angleOfSpeed))+x);
            y=(time*speed*Math.sin(Math.toRadians(angleOfSpeed))+y);
        }

        public boolean willCollide(Ball ball) {
            if (this.x==ball.x&&this.y==ball.y){
                return true;
            }
            return false;
        }

        public static void main(String args[]){
            Ball b1 = new Ball(0.0, 0.0, 2.0, 0.0);
            Ball b2 = new Ball(10.0, 0.0, 1.0, 0.0);
            Ball b3 = new Ball(20.0, 0.0, 10.0, 0.0);
            Ball.updateTime(10.0);
            if(b2.willCollide(b1))
                System.out.println("B1 and B2 will collide");
            if(b3.willCollide(b1))
                System.out.println("B1 and B3 will collide");
            if(b3.willCollide(b2))
                System.out.println("B2 and B3 will collide");
        }
}

