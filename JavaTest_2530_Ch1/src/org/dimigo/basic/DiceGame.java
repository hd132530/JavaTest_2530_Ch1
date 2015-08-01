package org.dimigo.basic;
import java.util.Scanner;
public class DiceGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hito_1 = 0;
		int hito_2 = 0;
		int same = 0;
		
		System.out.println("게임 횟수를 입력 하세요 => ");
		int menu = scanner.nextInt();
		if(menu <= 0){
			System.out.println("1이상인 수를 입력 하세요");
		}
		for(int i=1; i<=menu; i++){
			System.out.printf("%d번째 게임 시작 \n", i);
			int random_1 = (int)(Math.random() * 6) +1; //1~6
			System.out.printf("주사위 1 : %d ,", random_1);
			int random_2 = (int)(Math.random() * 6) +1;
			System.out.printf("주사위 2 : %d", random_2);
			if(random_1 > random_2){
				System.out.println("=> 플레이어 1 승리");
				hito_1++;
			}
			else if(random_1 < random_2){
				System.out.println("=> 플레이어 2 승리");
				hito_2++;
			}
			else if(random_1 == random_2){
				System.out.println("무승부");
				same++;
			}
			System.out.println("\n");
		}
		System.out.println("<<게임 결과 출력>>");
		System.out.printf("플레이어 1 이긴 횟수 : %d \n", hito_1);
		System.out.printf("플레이어 2 이긴 횟수 : %d \n", hito_2);
		System.out.printf("무승부 횟수 : %d \n", same);
		if(hito_1 > hito_2){
		System.out.println("최종 결과 => 플레이어 1 승리");
		}
		else if (hito_1 < hito_2){
			System.out.println("최종 결과 => 플레이어 2 승리");
		}
		else{
			System.out.println("최종결과 => 무승부");
		}
		scanner.close();
	}

}
