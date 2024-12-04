import java.util.*;
public class FindShortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
                char dir=path.charAt(i);
            //south
                if(dir=='S') {
                y--;
                }
                //North
                if(dir=='N'){
                    y++;
                }
                if(dir=='E'){
                    x++;
                }
                if(dir=='W'){
                    x--;
                }

        }
        float X=x*x;
        float Y=y*y;
        return (float) Math.sqrt(X+Y);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.print(getShortestPath(path));

    }
}
