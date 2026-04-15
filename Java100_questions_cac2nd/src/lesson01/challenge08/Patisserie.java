/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double num1 = Double.parseDouble(str1);

		System.out.println("ショコラ");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.println("ピスターシュ");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("シトロン       " + num1 + "個");
		System.out.println("ショコラ       " + num2 + "個");
		System.out.println("ピスターシュ   " + num3 + "個");
		double sum = num1 + num2 + num3;
		int sum2 = (int) (num1 * 250 + num2 * 280 + num3 * 320);
		System.out.println("合計個数   " + sum + "個");
		System.out.println("合計金額 " + sum2 + "個\n");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン       " + (int) (max1 - num1) + "個");
		System.out.println("ショコラ       " + (int) (max2 - num2) + "個");
		System.out.println("ピスターシュ   " + (int) (max3 - num3) + "個");

		System.out.println("\n閉店時間になりました。");
		System.out.println("またのお越しをお待ちしております\n");

		System.out.println("売上の割合");
		System.out.println("売上合計\\" + sum2);

		System.out.println("\n内訳");
		System.out.println("シトロン     \\" + (int) (num1 * 250) + "・・・" + (int) ((250 * num1) / sum2 * 100) + "%");
		System.out.println("ショコラ     \\" + (int) (num2 * 280) + "・・・" + (int) ((280 * num2) / sum2 * 100) + "%");
		System.out.println("ピスターシュ \\" + (int) (num3 * 320) + "・・・" + (int) ((320 * num3) / sum2 * 100) + "%");

	}

}
