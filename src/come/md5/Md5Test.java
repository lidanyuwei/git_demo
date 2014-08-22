package come.md5;

import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class Md5Test {
	//md5加密
	private String StringToMd5(String pwd,String salt){
		return md5(md5(pwd + salt));
	}
	private String md5(String str){
		return DigestUtils.md5(str.getBytes()).toString();
	}
	
	//Base64加密解密
	private void StringBase64(String str){
		String b64result = new String(Base64.encodeBase64(str.getBytes()));
		System.out.println("base64加密后密文是：" + b64result);
		String orgStr = new String(Base64.decodeBase64(b64result.getBytes()));
		System.out.println("base64解密为明文是：" + orgStr);
     }
	
	//uuid生成字符串
	private String uuid(){
		return  UUID.randomUUID().toString(); 
	}
	public static void main(String[] args) {
	  Md5Test m=new Md5Test();
	  m.StringBase64("123");
	  String salt=m.uuid();
	  System.out.println(salt);
	  String str1=m.StringToMd5("张三",salt);
	  String str2=m.StringToMd5("张三",salt);
	  System.out.println(str1);
	  System.out.println(str2);
	  System.out.println(str1.equals(str2));
	  System.out.println("dvrfbtrfbt");
	  }
}
