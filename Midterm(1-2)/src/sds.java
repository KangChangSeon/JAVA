void shuffle() {
		//cards 배열에 담긴 카드를 섞는 메소드
		class NewSutdaArr {
			//새로운 카드 객체 생성 메서드
			void copy() {
				int j=1;
				int newJ=1;
				for(int i=0; i<CARD_NUM; i++) {
					if(i>=10) {		
						copyCards[i]= new SutdaCard(newJ,false); newJ++;
						continue;
					}
					if(j==1||j==3||j==8) {
						copyCards[i]= new SutdaCard(j,true);
						j++;
					}else {
						copyCards[i]= new SutdaCard(j,false);
						j++;
					}
				}
			}
		};//내부 클래스 종료
		
		NewSutdaArr newArr = new NewSutdaArr();
		newArr.copy();
		
		int i=0;
		//index 검사용 배열
		int check [] = new int[cards.length];
		
		//카드 섞기 시작.
		A:while (i<cards.length) {
			
			//0~19 랜덤
			int index = (int)(Math.random()*cards.length)+0;
			
			//인덱스 체크용
//			System.out.println("인덱스:"+index);
			
			//한 번이상 나온 인덱스인지 검사.
			for(int j=0; j<i; j++) {
				if(i!=0&&check[j]==index) {
//					System.out.println("continue"); //테스트용
					continue A;
				}
			}//for문
			
			//cards에 새로운 데이터 넣기.
			cards[i] = copyCards[index];
			check[i] = index;
			i++;
		}// while문 끝
	}//shuffle 끝
SutdaCard pick(int index) {
	return cards[index];
}
SutdaCard pick() {
	return cards[(int)(Math.random()*cards.length)+0];
}
