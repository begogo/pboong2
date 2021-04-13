import java.util.Arrays;
import java.util.Random;

public class Lotto {

    static void run(){

        Random rand = new Random();
        final int MAX_SIZE = 45;
        int gameCount;
        int gameType;

        System.out.println("┌───────────────────────────────────┐");
        System.out.println("│         L   O   T   T   O         │");
        System.out.println("└───────────────────────────────────┘");

        //게임횟수 입력받기
        while(true){
            System.out.println("  진행할 게임 횟수 입력 (1~5 입력 후 엔터)");
            System.out.print("  >>>>>");
            gameCount = Menu.scan.nextInt();
            if (gameCount != 1 && gameCount != 2 && gameCount != 3 && gameCount != 4 && gameCount != 5) {
                System.out.println("잘못 입력하셨습니다. 1~5까지 숫자만 입력");
            } else {
                break;
            }
        }
        //게임비용 지출
        if (gameCount*1000 > Menu.money) {
            System.out.println("자금이 부족합니다.");
            Menu.day--;
            return;
        } else {
            Menu.money -= gameCount*1000;
        }
        //게임 실행
        for(int c = 1; c <= gameCount; c++) {

            int count = 0; // 적중한 번호의 개수
            int[] hitNum = {0, 0, 0, 0, 0, 0}; //적중번호 배열 초기화

            //자동or수동 입력받기
            while(true){
                System.out.printf("%n  게임%d. 게임유형 선택: 자동(1)/수동(2)%n", c);
                System.out.print("  >>>>>");
                gameType = Menu.scan.nextInt(); //게임유형
                if (gameType != 1 && gameType != 2){
                    System.out.println("잘못 입력하셨습니다. 1~2까지 숫자만 입력");
                } else {
                    break;
                }
            }

            //당첨번호 추출
            int[] winNum = new int[6];
            for(int i=0; i<winNum.length; i++) {
                winNum[i] = rand.nextInt(MAX_SIZE)+1; //랜덤추출
                //중복검사
                for(int j=i-1; j>=0; j--) {
                    if(winNum[i] == winNum[j]) {
                        i--;
                        break;
                    }
                }
            }

            //자동or수동 분기
            switch(gameType) {

                case 1: //자동게임
                    //자동번호 추출
                    int[] autoNum = new int[6];
                    for(int i=0; i<autoNum.length; i++) {
                        autoNum[i] = rand.nextInt(MAX_SIZE)+1; //랜덤추출
                        //중복검사
                        for(int j=i-1; j>=0; j--) {
                            if(autoNum[i] == autoNum[j]) {
                                i--;
                                break;
                            }
                        }
                    }
                    //자동번호 오름차순 출력
                    Arrays.sort(autoNum);
                    System.out.printf("%n  자동추출: %d, %d, %d, %d, %d, %d", autoNum[0], autoNum[1], autoNum[2], autoNum[3], autoNum[4], autoNum[5]);
                    System.out.printf("%n  당첨여부 확인 (숫자1 입력)");
                    int keyCode = Menu.scan.nextInt();
                    //				while(keyCode != 13 && keyCode != 10) 엔터 입력받는거 안돼서 일단 스킵
                    //					System.out.printf("  Enter 키를 누르세요.%n");
                    //당첨번호 오름차순 출력
                    Arrays.sort(winNum);
                    System.out.printf("%n  당첨번호: %d, %d, %d, %d, %d, %d", winNum[0], winNum[1], winNum[2], winNum[3], winNum[4], winNum[5]);
                    //당첨 검증 후 적중번호 배열에 저장
                    for(int i=0; i<autoNum.length; i++)
                        for(int j=0; j<winNum.length; j++)
                            if(autoNum[i] == winNum[j]) {
                                hitNum[i] = autoNum[i];
                                count++;
                            }
                    //적중번호 배열에서 0 빼고 출력
                    System.out.printf("%n  적중번호: ");
                    for(int i=0; i<hitNum.length; i++) {
                        if(hitNum[0] == 0 && hitNum[1] == 0 && hitNum[2] == 0 && hitNum[3] == 0 && hitNum[4] == 0 && hitNum[5] == 0) {
                            System.out.print("없음");
                            break;
                        }
                        if(hitNum[i] == 0)
                            continue;
                        //					else if (i == hitNum.length-1) {
                        //						System.out.printf("%d", hitNum[i]);
                        //						break;
                        //					}
                        System.out.printf("%d ", hitNum[i]);
                    }
                    // 등수 출력
                    switch(count) {
                        case 0:
                        case 1:
                            System.out.printf("%n    등 수: 낙첨");
                            break;
                        case 2:
                            System.out.printf("%n    등 수: 5등 축하드립니다~ +150,000원");
                            Menu.money += 150000;
                            break;
                        case 3:
                            System.out.printf("%n    등 수: 4등 축하드립니다~ +400,000원");
                            Menu.money += 400000;
                            break;
                        case 4:
                            System.out.printf("%n    등 수: 3등 축하드립니다~ +5,000,000원");
                            Menu.money += 5000000;
                            break;
                        case 5:
                            System.out.printf("%n    등 수: 2등 축하드립니다~ +100,000,000원");
                            Menu.money += 100000000;
                            break;
                        case 6:
                            System.out.printf("%n    등 수: 1등 축하드립니다~ +2,000,000,000원");
                            Menu.money += 2000000000;
                            break;
                    }
                    System.out.printf("%n%n  당첨기준: 1등-6개적중, 2등-5개, 3등-4개, 4등-3개, 5등-2개%n==================================================%n");

                    break;
                case 2: //수동게임
                    //수동번호 추출
                    int[] manualNum = new int[6];
                    for(int i=0; i<manualNum.length; i++) {
                        do {
                            System.out.printf("  1~45 사이 숫자 입력(번호%d):", i+1);
                            manualNum[i] = Menu.scan.nextInt();
                            if (manualNum[i] > MAX_SIZE || manualNum[i] < 1)
                                System.out.printf("%n  범위초과. 1~45 사이의 숫자만 입력해주세요.");
                        } while(manualNum[i] > MAX_SIZE || manualNum[i] < 1);
                        //중복검사
                        for(int j=i-1; j>=0; j--) {
                            if(manualNum[i] == manualNum[j]) {
                                i--;
                                System.out.printf("%n  번호중복. 앞 번호와 중복되지 않는 숫자를 입력해주세요.");
                                break;
                            }
                        }
                    }
                    //수동번호 오름차순 출력
                    Arrays.sort(manualNum);
                    System.out.printf("%n  수동추출: %d, %d, %d, %d, %d, %d", manualNum[0], manualNum[1], manualNum[2], manualNum[3], manualNum[4], manualNum[5]);
                    System.out.printf("%n  당첨여부 확인 (숫자1 입력)");
                    keyCode = Menu.scan.nextInt();
                    //				while(keyCode != 13 && keyCode != 10) 엔터 입력받는거 안돼서 일단 스킵
                    //					System.out.printf("  Enter 키를 누르세요.%n");
                    //당첨번호 오름차순 출력
                    Arrays.sort(winNum);
                    System.out.printf("%n  당첨번호: %d, %d, %d, %d, %d, %d", winNum[0], winNum[1], winNum[2], winNum[3], winNum[4], winNum[5]);
                    //당첨 검증 후 적중번호 배열에 저장
                    count = 0; // 적중개수
                    for(int i=0; i<manualNum.length; i++)
                        for(int j=0; j<winNum.length; j++)
                            if(manualNum[i] == winNum[j]) {
                                hitNum[i] = manualNum[i];
                                count++;
                            }
                    //적중번호 배열에서 0빼고 출력
                    System.out.printf("%n  적중번호: ");
                    for(int i=0; i<hitNum.length; i++) {
                        if(hitNum[0] == 0 && hitNum[1] == 0 && hitNum[2] == 0 && hitNum[3] == 0 && hitNum[4] == 0 && hitNum[5] == 0) {
                            System.out.print("없음");
                            break;
                        }
                        if(hitNum[i] == 0)
                            continue;
                        //					else if (i == hitNum.length-1) {
                        //						System.out.printf("%d", hitNum[i]);
                        //						break;
                        //					}
                        System.out.printf("%d ", hitNum[i]);
                    }
                    //등수 출력
                    switch(count) {
                        case 0:
                        case 1:
                            System.out.printf("%n    등 수: 낙첨");
                            break;
                        case 2:
                            System.out.printf("%n    등 수: 5등 축하드립니다~ +150,000원");
                            Menu.money += 150000;
                            break;
                        case 3:
                            System.out.printf("%n    등 수: 4등 축하드립니다~ +400,000원");
                            Menu.money += 400000;
                            break;
                        case 4:
                            System.out.printf("%n    등 수: 3등 축하드립니다~ +5,000,000원");
                            Menu.money += 5000000;
                            break;
                        case 5:
                            System.out.printf("%n    등 수: 2등 축하드립니다~ +100,000,000원");
                            Menu.money += 100000000;
                            break;
                        case 6:
                            System.out.printf("%n    등 수: 1등 축하드립니다~ +2,000,000,000원");
                            Menu.money += 2000000000;
                            break;
                    }
                    System.out.printf("%n%n  당첨기준: 1등-6개적중, 2등-5개, 3등-4개, 4등-3개, 5등-2개%n==================================================%n");
                    break;
            }

        }

    }

}