package com.up72.framework.generator;

/**
 * 
 * @author up72
 * @email up72@163.com
 */

public class GeneratorMain {
	/**
	 * 璇风洿鎺ヤ慨鏀逛互涓嬩唬鐮佽皟鐢ㄤ笉鍚岀殑鏂规硶浠ユ墽琛岀浉鍏崇敓鎴愪换鍔�
	 */
	public static void main(String[] args) throws Exception {
		GeneratorFacade g = new GeneratorFacade();

		g.deleteOutRootDir(); // 鍒犻櫎鐢熸垚鍣ㄧ殑杈撳嚭鐩綍

		// g.generateByTableStart("qmt_member_card", "template");
		// g.generateByTableStart("qmt_accumulate_points_rule", "template");
		// g.generateByTableStart("qmt_member_consume", "template");
		// g.generateByTableStart("qmt_ex_goods", "template");
		// g.generateByTableStart("yx_", "template");
		g.generateByTable("auth_permission", "template");

		// g.generateByTableStart("qmt_weixin_resource", "template");

		// 鎵撳紑鏂囦欢澶�
		Runtime.getRuntime().exec(
				"cmd.exe /c start "
						+ GeneratorProperties.getRequiredProperty("outRoot"));
	}
}
