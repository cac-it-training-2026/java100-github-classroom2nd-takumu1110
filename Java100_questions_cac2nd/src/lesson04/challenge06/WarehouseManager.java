/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];
		ABKosanArray[0] = 1;
		ABKosanArray[1] = 2;
		ABKosanArray[2] = 3;
		ABKosanArray[3] = 4;
		ABKosanArray[4] = 5;

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {
			int j = (int) (Math.random() * ABKosanArray.length);

			int temp = ABKosanArray[i];
			ABKosanArray[i] = ABKosanArray[j];
			ABKosanArray[j] = temp;
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに値の入れ替え処理を記述する
		int[] changeIndexArray = new int[4];
		for (int i = 0; i < ABKosanArray.length; i++) {
			if (ABKosanArray[i] == 1) {
				changeIndexArray[0] = i;
				//changeIndexArray[0]にランダムなABKosanArray[i]が1になったときchangeIndexArray[0] = i;（i=何回目）を代入
				//やりたいことは、iが1になった時の回数を記録しながらchangeIndexArray[0］にiが1になった時の回数を代入
			} else if (ABKosanArray[i] == 2) {
				changeIndexArray[1] = i;
			} else if (ABKosanArray[i] == 3) {
				changeIndexArray[2] = i;
			} else if (ABKosanArray[i] == 4) {
				changeIndexArray[3] = i;
			}
		} //上のプログラミングでABKosanArray[i]からchangeIndexArray[ｘ]に代入している
		for (int i = 0; i < ABKosanArray.length; i++) {
			if (changeIndexArray[0] == i) {
				ABKosanArray[i] = 3;
				//もともとABKosanArray[i] == 1であったところにABKosanArray[i] == 3を代入
			} else if (changeIndexArray[1] == i) {
				ABKosanArray[i] = 4;
			} else if (changeIndexArray[2] == i) {
				ABKosanArray[i] = 1;
			} else if (changeIndexArray[3] == i) {
				ABKosanArray[i] = 2;
			}
		} //上のプログラミングでchangeIndexArray[ｘ]からiに代入している

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}