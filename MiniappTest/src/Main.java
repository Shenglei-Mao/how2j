import java.util.*;
//import utils.DateUtil;
//import utils.FileUtil;
//import com.alibaba.fastjson.JSONObject;

public class Main {

    public static void main(String[] args) {
//        //��������������һ0��0��0���Լ�����7��ǰʱ��
//        System.out.println("Hello World!");
//        Date weekStartDate = DateUtil.getWeekStartDate();
//        String weekStartDateStr = DateUtil.format("yyyy-MM-dd HH:mm:ss", weekStartDate);
//        Date lastWeekBeginDate = DateUtil.geLastWeekMonday(new Date());
//        String lastWeekBeginDateStr = DateUtil.format(DateUtil.YYYY_MM_DD_HH_MM_SS, lastWeekBeginDate);
//        System.out.println(weekStartDate);
//        System.out.println(weekStartDateStr);
//        System.out.println(lastWeekBeginDate);
//        System.out.println(lastWeekBeginDateStr);
//
//
//        //��1970��1��1����㵽�������������ĺ�����
//        long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
//
//        //���ر�������
//        System.out.println(DateUtil.getWeekOfDate(new Date()));
//
//
//
//
//
//        Map<String, Object> sampleInput = new LinkedHashMap<String, Object>();
//        sampleInput.put("Name", "Shenglei Mao");
//        sampleInput.put("Age", "23");
//        sampleInput.put("DOB", "1996-01-08");
//        sampleInput.put("Major", "Computer Engineering");
//        String jsonString = JSONObject.toJSON(sampleInput).toString();
//
//        FileUtil.stringToFile(jsonString);

        /*
        10�ڼ�������
         */
        System.out.println("Start the sorting algorithm");
        float[] arr= new float[100000000*10];

        for (int i = 0; i < 100000000*10; i++){
            Random random=new Random();
            float v = random.nextFloat() * 50f;
            arr[i]=v;
        }
        System.out.println();
//        for (int i = 0; i < 1000000; i++){
//            System.out.println(arr[i]);
//        }
        float sizeOfArr = (float)100000000*10 * 4 / 1024 / 1024 / 1024; //unit is GB
        System.out.println("10�ڼ���float�ܹ������ڴ�Ϊ�� " + sizeOfArr + "GB");

        long sortStartTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long sortEndTIme = System.currentTimeMillis();
        System.out.println("10�ڼ�������ʱ�䣺 " + (sortEndTIme - sortStartTime));

    }





}
