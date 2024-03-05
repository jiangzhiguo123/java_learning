import java.util.Random;
//练习要求：生成一个五个的验证码 前四个为英文字符 最后一个为数字
public class Test3 {
    public static void main(String[] args) {
        char [] chs =new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                //添加小写字母，运用ASCII表然后进行强制转换
                chs[i] = (char)(97+i);
            }else {
                //添加大写字母
                chs[i] = (char)(65 + i -26);
            }
        }
        //建立一个空的字符串数组来接收生成的随机字符
        String result = "";

        for (int i = 0; i < 4; i++) {
            //随机抽取4个
            Random r =new Random();
            int RandomIndex = r.nextInt(chs.length);
            result = result + chs[RandomIndex];
        }
        //生成随机数字
        Random num = new Random() ;
        int res_num = num.nextInt(10);
        result = result + res_num;
        
        System.out.print(result);




    }



}
