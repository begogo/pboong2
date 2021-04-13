public class MoneyMaking {

    static void run(){

        while (true){

            System.out.println("어떻게 돈을 버시겠습니까?");
            System.out.println("1)노가다(컨디션55소모)  2)로또  3)이전메뉴로");
            int choice = Menu.scan.nextInt();

            switch (choice){

                case 1:
                    if (Menu.condition >= 55){
                        Menu.money += 100000;
                        Menu.condition -= 55;
                        System.out.println("노가다로 100,000원을 벌었습니다. 컨디션 -55");
                        return;
                    } else {
                        System.out.println("컨디션이 부족합니다. 휴식하거나 로또를 하세요.");
                        break;
                    }
                case 2:
                    Lotto.run();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return;
                case 3:
                    Menu.day--;
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }

        }

    }

}