package strategy;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:38
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
/*        try{

            String encodeString = URLEncoder.encode("http://shadowsockssr.tk/ 林","big5");
            System.out.println(encodeString);
            String decodeString = URLDecoder.decode(encodeString,"big5");
            System.out.println(decodeString);
        }catch (UnsupportedEncodingException e){

        }*/
    }
}
