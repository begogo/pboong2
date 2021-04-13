public class Job {

    static void run(){

        while (true){

            System.out.println("어느 회사에 지원하시겠습니까?");
            System.out.println("1)네카라쿠배  2)보통의IT회사  3)경력3년뻥튀기보도방  4)이전메뉴로");
            int choice = Menu.scan.nextInt();

            switch (choice){

                case 1:
                    System.out.println("프붕이는 네카라쿠배에 도전했다.");
                    System.out.println("네카라쿠배의 커트라인은 최고수준");
                    System.out.println("결과는?!... [엔터]");
                    Pause.run();

                    if (Menu.java >= 90 && Menu.csKnowledge >= 90 && Menu.codingTest >= 80){
                        System.out.println("*******************************************");
                        System.out.println("!!!!!!!!!!!!!!!!! 합 격 !!!!!!!!!!!!!!!!!!!");
                        System.out.println("******************************************* [엔터]");
                        Pause.run();
                        System.out.print("프붕이는 네카라쿠배에 취업하여 제2의 인생을 시작했다.");
                        Pause.run();
                        System.out.print("프붕이의 네카라쿠배 취업 소식이 퍼지면서");
                        Pause.run();
                        System.out.print("어느날 예전에 같이 국비 들었던 프순이에게서 카톡이 왔다.");
                        Pause.run();
                        System.out.println("   ------------------------------------------------------");
                        System.out.print("    프순이: \"오빠, 잘 지내세요? 네카라쿠배 취업 축하드려요~\"");
                        Pause.run();
                        System.out.println("         \"혹시 이번 주말에 시간 되시나요?ㅠㅠ 취업때문에..\"");
                        System.out.print("   ------------------------------------------------------");
                        Pause.run();
                        System.out.print("'음? 이게 바로 초봉 6000 네카라쿠배의 삶인가.. 훗..'");
                        Pause.run();
                        System.out.println("프붕이는 오늘도 흐뭇한 마음으로 판교역에서 내려 발걸음을 옮긴다..");
                        Pause.run();
                        System.out.println("                                               - THE END -");
                        System.exit(0);
                    } else {
                        System.out.println("*****************************************");
                        System.out.println("응~ 탈락. 어림도 없지~");
                        System.out.println("네카라쿠배의 커트라인은 엄청났다.");
                        System.out.println("프붕이 따위가 감히 지원할 수준이 아니었다.");
                        System.out.println("멘탈 나가서 컨디션이 0이 되었다. [엔터]");
                        Pause.run();
                        Menu.condition = 0;
                        return;
                    }

                case 2:
                    System.out.println("프붕이는 보통의IT회사에 도전했다.");
                    System.out.println("보통의IT회사의 커트라인은 중간수준");
                    System.out.println("결과는?!... [엔터]");
                    Pause.run();

                    if (Menu.java >= 70 && Menu.csKnowledge >= 50 && Menu.codingTest >= 50){
                        System.out.println("*******************************************");
                        System.out.println("!!!!!!!!!!!!!!!!! 합 격 !!!!!!!!!!!!!!!!!!!");
                        System.out.println("******************************************* [엔터]");
                        Pause.run();
                        System.out.print("프붕이는 보통의IT회사에 취업했다.");
                        Pause.run();
                        System.out.print("이 정도가 어디냐고 만족하면서 열심히 회사생활하기로 했다.");
                        Pause.run();
                        System.out.println("                                     - THE END -");
                        System.exit(0);
                    } else {
                        System.out.println("*************************************************");
                        System.out.println("응~ 탈락. 어림도 없지~");
                        System.out.println("보통의IT회사의 커트라인을 넘지 못 했다.");
                        System.out.println("아무리 보통의 회사라도 프붕이 따위가 지원할 수준은 아니었다.");
                        System.out.println("멘탈 나가서 컨디션이 0이 되었다. [엔터]");
                        Pause.run();
                        Menu.condition = 0;
                        return;
                    }

                case 3:

                    System.out.println("프붕이는 경력3년뻥튀기보도방에 도전했다.");
                    System.out.println("경력3년뻥튀기보도방의 커트라인은 최하수준");
                    System.out.println("결과는?!... [엔터]");
                    Pause.run();

                    if (Menu.java >= 30 && Menu.csKnowledge >= 0 && Menu.codingTest >= 0){
                        System.out.println("*******************************************");
                        System.out.println("!!!!!!!!!!!!!!!!! 합 격 !!!!!!!!!!!!!!!!!!!");
                        System.out.println("******************************************* [엔터]");
                        Pause.run();
                        System.out.print("프붕이는 경력3년뻥튀기보도방에 취업했다.");
                        Pause.run();
                        System.out.print("연봉조건: 연봉 2200 퇴포, 수습 3개월 80%, 대기급여 없음");
                        Pause.run();
                        System.out.print("3주 동안 사내교육 후 고객사 면접, 합격 후 혼자 파견, 경력 3년 뻥튀기");
                        Pause.run();
                        System.out.print("--------------------파 견 첫 날-----------------------");
                        Pause.run();
                        System.out.print("프붕이는 긴장되는 마음으로 배정된 자리에 앉았다.");
                        Pause.run();
                        System.out.print("관리자로 보이는 사람이 SVN 접속해서 뭘 체크아웃하라는데 프붕이는 못 알아들었다.");
                        Pause.run();
                        System.out.print("더 심각한 것은 모니터를 보니 OS가 리눅스였다.");
                        Pause.run();
                        System.out.print("윈도우만 사용해본 프붕이는 갑자기 머릿속이 하얘졌다. 불길한 예감이 들었다.");
                        Pause.run();
                        System.out.print("관리자 \"리눅스 모르세요? CD로 이동해서 ~~ 폴더 들어가세요.\"");
                        Pause.run();
                        System.out.print("'CD? CD롬에 넣는 CD 말하나?' 프붕이는 갑자기 두리번거리며 CD를 찾기 시작했다.");
                        Pause.run();
                        System.out.print("프붕이 \"죄송한데 CD가 어디에 있죠?\"");
                        Pause.run();
                        System.out.print("프붕이가 이 말을 한 순간 주변 모든 시선이 집중되며 경멸의 시선이 느껴졌다.");
                        Pause.run();
                        System.out.print("관리자 \"하.. 프붕씨 잠시만요. 잠깐 나와보실래요?\"");
                        Pause.run();
                        System.out.print("프붕이는 관리자와 면담 후 그 자리에서 쫓겨났다.");
                        Pause.run();
                        System.out.print("(실제 있었던 일)");
                        Pause.run();
                        System.out.println("                                   - THE END -");
                        System.exit(0);
                    } else {
                        System.out.println("*************************************************");
                        System.out.println("응~ 탈락. 어림도 없지~");
                        System.out.println("경력3년뻥튀기보도방의 커트라인도 넘지 못 했다.");
                        System.out.println("프붕이는 그냥 노답이다. 다른 길을 찾는 게 나을 것이다.");
                        System.out.println("멘탈 나가서 컨디션이 0이 되었다. [엔터]");
                        Pause.run();
                        Menu.condition = 0;
                        return;
                    }

                case 4:
                    Menu.day--;
                    return;
                default:

            }

        }

    }

}