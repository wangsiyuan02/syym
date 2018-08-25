							package cn.bdqn.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 3:学士后结业考试的日期是每月的倒数第二个周六8点开始，输出2016年学士后每月考试的日期。
 * */

public class Calendar1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2016);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));
		//System.out.println(c);
		while (c.get(Calendar.YEAR)<2017) {
			c.add(Calendar.DATE, -c.get(Calendar.DAY_OF_WEEK)-c.getActualMaximum(Calendar.DAY_OF_WEEK));
			//减去周的第几天再减去一周最大天数。。。就是倒数第二个周六。
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			String d = sdf.format(c.getTime());
			System.out.println(d+"8点");
			c.add(Calendar.MONTH, 1);
			c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));//再设置到一个月最后一天。
			
					
		}
		
	}

}
