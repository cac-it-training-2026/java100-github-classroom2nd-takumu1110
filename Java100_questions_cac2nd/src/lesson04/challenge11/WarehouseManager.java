/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] C = new int[5];
		int[] D = new int[5];
		int[] E = new int[5];

		boolean loopStopFlg = false;

		int[][] MQArrayAll = new int[3][5];
		MQArrayAll[0] = C;
		MQArrayAll[1] = D;
		MQArrayAll[2] = E;

		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayAll[0].length; j++) {
				int rand = (int) (Math.random() * 10) % 4;
				if (rand == 0) {
					MQArrayAll[i][j] = 0;
				} else {
					MQArrayAll[i][j] = (int) (Math.random() * 10) % 10 + 1;
				}
			}
		}

		//ここに配列に値を代入する処理を記述する。(要素はランダム)

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]);
			if (i != C.length - 1)
				System.out.print(",");
		}

		//ここに配列Cの要素をすべて出力する処理を記述する。

		System.out.print("\n\nD...");
		for (int i = 0; i < C.length; i++) {
			System.out.print(D[i]);
			if (i != D.length - 1)
				System.out.print(",");
		}

		//ここに配列Dの要素をすべて出力する処理を記述する。

		System.out.print("\n\nE...");
		for (int i = 0; i < E.length; i++) {
			System.out.print(C[i]);
			if (i != E.length - 1)
				System.out.print(",");
		}

		//ここに配列Eの要素をすべて出力する処理を記述する。

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		int[] isArray = new int[15];
		for (int i = 0; i < isArray.length; i++) {
			isArray[i] = -1;
		}

		int k = 0;
		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayAll[0].length; j++) {
				if (MQArrayAll[i][j] == 0) {
					continue;
					//ijが０の時やり直す
				} else {
					isArray[k] = MQArrayAll[i][j];
					MQArrayAll[i][j] = 0;
					k++;
					//k=ijの時ijを0にしてk++
				}
			}
		}
		k = 0;

		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayAll[0].length; j++) {
				MQArrayAll[i][j] = isArray[k];
				k++;
				//isArray[k]からMQArrayAll[i][j]へ値を入れてる
				if (isArray[k] == -1) {
					loopStopFlg = true;
					break;
				}
			}
			if (loopStopFlg) {
				break;
			}
		}
		//loopStopFlgをtrueだったらループが終わる
		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i]);
			if (i != C.length - 1)
				System.out.print(",");
		}

		//ここに配列Cの要素をすべて出力する処理を記述する。

		System.out.print("\n\nD...");
		for (int i = 0; i < D.length; i++) {
			System.out.print(D[i]);
			if (i != (D.length - 1)) {
				System.out.print(",");
			}
		}
		//ここに配列Dの要素をすべて出力する処理を記述する。

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。

		for (int i = 0; i < E.length; i++) {
			System.out.print(E[i]);
			if (i != (E.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}