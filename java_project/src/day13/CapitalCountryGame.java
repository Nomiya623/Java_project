package day13;

import java.util.*;

public class CapitalCountryGame {
	// 2. 나라와 수도 맞추기게임을 작성하라.
//	(1) 나라 이름(country)과 수도(capital)로 구성된 Nation 클래스를 작성하고 
//	Vector<Nation> 컬렉션을 이용하여 프로그램을 작성하라.
//	(2) 이 프로그램을 HashMap<String, String>을 이용하여 작성하라. '키'는 나라 이름이고 '값'은 수도이다.

	class Nation {
		private String country;
		private String capital;
		public ArrayList<Nation> list;

		Nation(String country, String capital) {
			this.country = country;
			this.capital = capital;
		}

		public String getCountry() {
			return country;
		}

		public String getCapital() {
			return capital;
		}

		class CapitalGame {
			Scanner s = new Scanner(System.in);// 0
			ArrayList<Nation> store = new ArrayList<>();// [N(스페인, 마드리다]
			
			CapitalGame() {
				s = new Scanner(System.in);
				store = new ArrayList<Nation>();
				// 나라정보 초기값으로 미리 추가
				store.add(new Nation("멕시코", "멕시코시티"));
				store.add(new Nation("스페인", "마드리드"));
				store.add(new Nation("프랑스", "파리"));
				store.add(new Nation("영국", "런던"));
				store.add(new Nation("그리스", "아테네"));
				store.add(new Nation("독일", "베를린"));
				store.add(new Nation("일본", "동경"));
				store.add(new Nation("중국", "베이징"));
				store.add(new Nation("러시아", "모스크바"));
			}// 생성자

			void input() {
				int n = store.size(); // 8
				System.out.println("현재" + n + "개의 나라와 수도가 입력되어 있습니다.");

				while (true) {
					n++;
					System.out.println("나라외 수도 입력" + n + ">>");
					String input = s.nextLine();
					if (input.equals("그만")) {
						break;// while true 종료
					}

					String[] split = input.split(" ");
					String country = split[0]; // 나라의이름
					String capital = split[1];// 수도
					// 나라가 존재하는지 체크-> 메서드
					if (isExists(country)) {// true 리턴을 받았을 경우
						// 있으면 예외 메세지
						System.out.println(country + "는 이미 있습니다.");
						n--;
					} else {// false 리턴받았을 경우 
						// 없으면 list 에 Nation 으로 객체 만들어 추가 
						ArrayList<Nation> list = null;
						list.add(new Nation(country, capital));
					}

				} // while

			}// input

			
			
			public boolean isExists(String country) {
				// TODO Auto-generated method stub
				boolean result =  false;// 마지막에 리턴해줄 결과 변수 미리 선언
				// 리스트 저장된 개수만큼 전체 돌면서 나라이름 같은지 결과 리턴  
				ArrayList<Nation> list = null;
				for(int i =0; i<list.size(); i++) {
					Nation nation = list.get(i);
					String ctr = nation.getCountry();// 이미 저장된 나라이름 하나 꺼냄 
					if(ctr.equals(country)) {
						result = true;
						break;// 한번 걸리면 나머지는 안돌아도 ok 
			
					}
				}
				
				
				return result;// 최종 boolean 변수에 남은 결과 리턴 
				
			}
				
			void quiz() {
				
				while(true) {
					int index = (int)(Math.random() * list.size());
					Nation nation = list.get(index);
					
				
			}	
				
				
				
				
			}
		}

	

	}// main
}// class
