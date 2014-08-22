package come.md5;

import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class Md5Test {
	//md5����
	private String StringToMd5(String pwd,String salt){
		return md5(md5(pwd + salt));
	}
	private String md5(String str){
		return DigestUtils.md5(str.getBytes()).toString();
	}
	
	//Base64���ܽ���
	private void StringBase64(String str){
		String b64result = new String(Base64.encodeBase64(str.getBytes()));
		System.out.println("base64���ܺ������ǣ�" + b64result);
		String orgStr = new String(Base64.decodeBase64(b64result.getBytes()));
		System.out.println("base64����Ϊ�����ǣ�" + orgStr);
     }
	
	//uuid�����ַ���
	private String uuid(){
		return  UUID.randomUUID().toString(); 
	}
	public static void main(String[] args) {
	  Md5Test m=new Md5Test();
	  m.StringBase64("123");
	  String salt=m.uuid();
	  System.out.println(salt);
	  String str1=m.StringToMd5("����",salt);
	  String str2=m.StringToMd5("����",salt);
	  System.out.println(str1);
	  System.out.println(str2);
	  System.out.println(str1.equals(str2));
	  System.out.println("dvrfbtrfbt");
	  }
}
