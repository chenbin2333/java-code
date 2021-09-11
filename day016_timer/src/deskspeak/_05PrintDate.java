package deskspeak;

import java.util.Calendar;
import java.util.Date;

/**
 * 5. 现有一个Date对象【自己创建一个即可】，请将该对象中获取 年月日时分秒 分别打印输出。		【中级-选做】
	提示：用到Calendar和Calendar中方法
	Calendar c = getInstance();
 *
 */
public class _05PrintDate {

	public static void main(String[] args) {
		getTimeByCalendar(new Date());

	}
	public static void getTimeByCalendar(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
        int year = cal.get(Calendar.YEAR);// 获取年份
        int month = cal.get(Calendar.MONTH ) + 1;// 获取月份
        int day = cal.get(Calendar.DATE);// 获取日
        int hour = cal.get(Calendar.HOUR_OF_DAY);// 小时
        int minute = cal.get(Calendar.MINUTE);// 分           
        int second = cal.get(Calendar.SECOND);// 秒
        System.out.println("现在的时间是：公元"+year+"年"+month+"月"+day+"日      "+hour+"时"+minute+"分"+second+"秒");
    }

}
