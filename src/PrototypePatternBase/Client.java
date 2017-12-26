package PrototypePatternBase;

import java.util.Random;

import utils.Utils;

public class Client {
	/*	发送账单的数量	*/
	private static int MAX_COUNT = 6;
	public static void main(String[] args){
		/*	模拟发送邮件	*/
		int i = 0;
		/*	把模板定义出来，从数据库中获得	*/
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx银行版权所有");
		while(i < MAX_COUNT){
			/*	以下是每封邮件不同的地方	*/
			mail.setAppelation(getRandSting(5) + "先生（女士）");
			mail.setReceiver(getRandSting(5) + "@" + getRandSting(8) + ".com");
			sendMail(mail);
			i++;
		}
	}
	
	/**
	 * 发送邮件
	 * @param mail
	 */
	private static void sendMail(Mail mail) {
		Utils.p("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t发送成功！");
	}

	/**
	 * 获得指定长度（i）的随机字符串
	 * @param i
	 * @return
	 */
	private static String getRandSting(int maxLength) {
		char[] chr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 
				'h', 'i', 'j', 'k', 'l', 'm', 'n', 
				'o', 'p', 'q', 'r', 's', 't', 'u', 
				'v', 'w', 'x', 'y', 'z', 'A', 'B', 
				'C', 'D', 'E', 'F', 'G', 'H', 'I', 
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 
				'X', 'Y', 'Z'};
		String source = String.valueOf(chr);
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for(int i=0; i <= maxLength; i++){
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		
		return sb.toString();
	}

}
