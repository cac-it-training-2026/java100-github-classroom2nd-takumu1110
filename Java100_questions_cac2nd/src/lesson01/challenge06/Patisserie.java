/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int max1 = 30;
		int max2 = 30;
		int max3 = 30;
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン     \\250 ・・・ 残り" + max1 + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + max2 + "個");
		System.out.println("ピスターシュ \\320 ・・・ 残り" + max3 + "個");

		System.out.println("それぞれ何個買いますか?（最大30個まで）\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン");
		String str1 = reader.readLine();
		System.out.println("ショコラ");
		String str2 = reader.readLine();
		System.out.println("ピスターシュ");
		String str3 = reader.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		System.out.println("シトロン       " + num1 + "個");
		System.out.println("ショコラ       " + num2 + "個");
		System.out.println("ピスターシュ   " + num3 + "個");
		int sum = num1 + num2 + num3;
		int sum2 = num1 * 250 + num2 * 280 + num3 * 320;
		System.out.println("合計個数   " + sum + "個");
		System.out.println("合計金額 " + sum2 + "個\n");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。\n");
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン       " + (max1 - num1) + "個");
		System.out.println("ショコラ       " + (max2 - num2) + "個");
		System.out.println("ピスターシュ   " + (max3 - num3) + "個");

	}

}
