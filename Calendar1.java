							package cn.bdqn.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 3:ѧʿ���ҵ���Ե�������ÿ�µĵ����ڶ�������8�㿪ʼ�����2016��ѧʿ��ÿ�¿��Ե����ڡ�
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
			//��ȥ�ܵĵڼ����ټ�ȥһ������������������ǵ����ڶ���������
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
			String d = sdf.format(c.getTime());
			System.out.println(d+"8��");
			c.add(Calendar.MONTH, 1);
			c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE));//�����õ�һ�������һ�졣
			
					
		}
		
	}

}
