/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("大変お待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいま開店です\n");
		System.out.println("本日のおすすめ商品です\n");

		System.out.println("シトロン      \\250");
		System.out.println("ショコラ      \\280");
		System.out.println("ピスターシュ  \\320");
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

	}

}
